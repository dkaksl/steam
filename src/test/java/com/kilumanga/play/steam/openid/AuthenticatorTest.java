/** 
 * 
 * Copyright (C) 2018 Amani
 *
 * This software may be modified and distributed under the terms
 * of the MIT license.  See the LICENSE file for details.
 */
package com.kilumanga.play.steam.openid;

import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.openid4java.association.AssociationException;
import org.openid4java.consumer.ConsumerException;
import org.openid4java.discovery.DiscoveryException;
import org.openid4java.message.MessageException;

import com.kilumanga.play.steam.constant.ExceptionMessage;
import com.kilumanga.play.steam.openid.data.CallbackUrl;

/**
 * @author Amani
 *
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
	public void testRequestRedirect() throws MessageException, ConsumerException {
		System.out.println(authenticator.getLoginUrl(callbackUrl));
	}

	@Test
	public void testNullVerifyResponseMap() throws DiscoveryException, MessageException, AssociationException {
		exception.expect(IllegalArgumentException.class);
		exception.expectMessage(ExceptionMessage.NULL_PARAMETER.getExceptionMessage());
		authenticator.getVerifiedSteamId(null);
	}

}
