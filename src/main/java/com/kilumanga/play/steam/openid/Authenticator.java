/** 
 * 
 * Copyright (C) 2018 Amani
 *
 * This software may be modified and distributed under the terms
 * of the MIT license.  See the LICENSE file for details.
 */
package com.kilumanga.play.steam.openid;

import java.util.Map;

import lombok.NonNull;
import org.openid4java.association.AssociationException;
import org.openid4java.consumer.ConsumerException;
import org.openid4java.consumer.ConsumerManager;
import org.openid4java.consumer.VerificationResult;
import org.openid4java.discovery.DiscoveryException;
import org.openid4java.discovery.DiscoveryInformation;
import org.openid4java.discovery.Identifier;
import org.openid4java.message.AuthRequest;
import org.openid4java.message.MessageException;
import org.openid4java.message.ParameterList;

import com.kilumanga.play.steam.constant.ExceptionMessage;
import com.kilumanga.play.steam.constant.Uri;
import com.kilumanga.play.steam.openid.data.CallbackUrl;

/**
 * @author Amani
 *
 */
public class Authenticator {
    private final CallbackUrl callbackUrl;
    private final ConsumerManager consumerManager = new ConsumerManager();
    private final DiscoveryInformation discoveryInformation;

    public Authenticator(@NonNull CallbackUrl callbackUrl) throws DiscoveryException {
        this.callbackUrl = callbackUrl;
        consumerManager.setMaxAssocAttempts(0);
        discoveryInformation = consumerManager.associate(consumerManager.discover(Uri.STEAM_OPENID.getUri()));
    }

    public String getLoginUrl() throws MessageException, ConsumerException {
        AuthRequest authRequest = consumerManager.authenticate(discoveryInformation, this.callbackUrl.getUrl());
        return authRequest.getDestinationUrl(true);
    }

    public String getVerifiedSteamId(@NonNull Map<String, String> responseMap) throws MessageException, DiscoveryException, AssociationException {
        ParameterList parameterList = new ParameterList(responseMap);
        VerificationResult verificationResult = consumerManager.verify(this.callbackUrl.getUrl(), parameterList, this.discoveryInformation);
        Identifier verifiedId = verificationResult.getVerifiedId();
        if (verifiedId == null) {
            throw new IllegalArgumentException(ExceptionMessage.NULL_PARAMETER.getExceptionMessage());
        }
        return extractSteamId(verifiedId.getIdentifier());
    }

    private String extractSteamId(String identifier) {
        return identifier.replaceAll("https://steamcommunity.com/openid/id/", "");
    }
}
