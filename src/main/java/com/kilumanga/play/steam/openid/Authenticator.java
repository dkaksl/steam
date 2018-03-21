/** 
 * 
 * Copyright (C) 2018 Amani
 *
 * This software may be modified and distributed under the terms
 * of the MIT license.  See the LICENSE file for details.
 */
package com.kilumanga.play.steam.openid;

import org.openid4java.consumer.ConsumerException;
import org.openid4java.consumer.ConsumerManager;
import org.openid4java.discovery.DiscoveryException;
import org.openid4java.discovery.DiscoveryInformation;
import org.openid4java.message.AuthRequest;
import org.openid4java.message.MessageException;

import com.kilumanga.play.steam.constant.ExceptionMessage;
import com.kilumanga.play.steam.constant.Uri;

/**
 * @author Amani
 *
 */
public class Authenticator {
	private final ConsumerManager consumerManager = new ConsumerManager();

	public Authenticator() {
		consumerManager.setMaxAssocAttempts(0);
	}

	public String getLoginUrl(String callbackUrl) throws DiscoveryException, MessageException, ConsumerException {
		if (callbackUrl == null) {
			throw new IllegalArgumentException(ExceptionMessage.NULL_PARAMETER.getExceptionMessage());
		}

		if (callbackUrl.isEmpty()) {
			throw new IllegalArgumentException(ExceptionMessage.INVALID_CALLBACK_URL.getExceptionMessage());
		}

		DiscoveryInformation discoveryInformation = consumerManager
				.associate(consumerManager.discover(Uri.STEAM_OPENID.getUri()));
		AuthRequest authRequest = consumerManager.authenticate(discoveryInformation, callbackUrl);
		return authRequest.getDestinationUrl(true);
	}
}
