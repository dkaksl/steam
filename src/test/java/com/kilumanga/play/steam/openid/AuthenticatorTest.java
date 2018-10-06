/**
 * Copyright (C) 2018 Amani
 * <p>
 * This software may be modified and distributed under the terms
 * of the MIT license.  See the LICENSE file for details.
 */
package com.kilumanga.play.steam.openid;

import com.kilumanga.play.steam.openid.data.CallbackUrl;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.openid4java.association.AssociationException;
import org.openid4java.consumer.ConsumerException;
import org.openid4java.discovery.DiscoveryException;
import org.openid4java.message.MessageException;

import static org.junit.Assert.assertEquals;

/**
 * @author Amani
 */
public class AuthenticatorTest {
    private static final CallbackUrl callbackUrl = new CallbackUrl("https://steam.kilumanga.com");
    private static Authenticator authenticator;

    @BeforeClass
    public static void setUp() throws DiscoveryException {
        authenticator = new Authenticator(callbackUrl);
    }

    @Rule
    public final ExpectedException exception = ExpectedException.none();

    @Test
    public void testGetLoginUrl() throws MessageException, ConsumerException {
        assertEquals("https://steamcommunity.com/openid/login?openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.return_to=https%3A%2F%2Fsteam.kilumanga.com&openid.realm=https%3A%2F%2Fsteam.kilumanga.com&openid.mode=checkid_setup", authenticator.getLoginUrl());
    }

    @Test
    public void testNullVerifyResponseMap() throws DiscoveryException, MessageException, AssociationException {
        exception.expect(NullPointerException.class);
        authenticator.getVerifiedSteamId(null);
    }

}
