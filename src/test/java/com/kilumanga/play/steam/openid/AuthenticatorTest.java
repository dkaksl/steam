/** 
 * 
 * Copyright (C) 2018 Amani
 *
 * This software may be modified and distributed under the terms
 * of the MIT license.  See the LICENSE file for details.
 */
package com.kilumanga.play.steam.openid;

import java.util.HashMap;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.openid4java.association.AssociationException;
import org.openid4java.consumer.ConsumerException;
import org.openid4java.discovery.DiscoveryException;
import org.openid4java.message.MessageException;

import com.kilumanga.play.steam.constant.ExceptionMessage;

/**
 * @author Amani
 *
 */
public class AuthenticatorTest {
	private final String callbackUrl = "https://steam.kilumanga.com";

	@Rule
	public final ExpectedException exception = ExpectedException.none();

	@Test
	public void testRequestRedirect() throws DiscoveryException, MessageException, ConsumerException {
		Authenticator authenticator = new Authenticator();
		System.out.println(authenticator.getLoginUrl(callbackUrl));
	}

	@Test
	public void testNullLoginCallback() throws DiscoveryException, MessageException, ConsumerException {
		Authenticator authenticator = new Authenticator();
		exception.expect(IllegalArgumentException.class);
		exception.expectMessage(ExceptionMessage.NULL_PARAMETER.getExceptionMessage());
		authenticator.getLoginUrl(null);
	}

	@Test
	public void testBlankLoginCallback() throws DiscoveryException, MessageException, ConsumerException {
		Authenticator authenticator = new Authenticator();
		exception.expect(IllegalArgumentException.class);
		exception.expectMessage(ExceptionMessage.INVALID_CALLBACK_URL.getExceptionMessage());
		authenticator.getLoginUrl("");
	}

	@Test
	public void testNullVerifyCallback() throws DiscoveryException, MessageException, AssociationException {
		Authenticator authenticator = new Authenticator();
		exception.expect(IllegalArgumentException.class);
		exception.expectMessage(ExceptionMessage.NULL_PARAMETER.getExceptionMessage());
		authenticator.getVerifiedSteamId(null, new HashMap<String, String>());
	}

	@Test
	public void testNullVerifyResponseMap() throws DiscoveryException, MessageException, AssociationException {
		Authenticator authenticator = new Authenticator();
		exception.expect(IllegalArgumentException.class);
		exception.expectMessage(ExceptionMessage.NULL_PARAMETER.getExceptionMessage());
		authenticator.getVerifiedSteamId(callbackUrl, null);
	}

	@Test
	public void testBlankVerifyCallback() throws DiscoveryException, MessageException, AssociationException {
		Authenticator authenticator = new Authenticator();
		exception.expect(IllegalArgumentException.class);
		exception.expectMessage(ExceptionMessage.INVALID_CALLBACK_URL.getExceptionMessage());
		authenticator.getVerifiedSteamId("", new HashMap<String, String>());
	}

}
