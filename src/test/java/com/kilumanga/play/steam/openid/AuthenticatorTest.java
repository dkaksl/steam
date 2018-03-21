/** 
 * 
 * Copyright (C) 2018 Amani
 *
 * This software may be modified and distributed under the terms
 * of the MIT license.  See the LICENSE file for details.
 */
package com.kilumanga.play.steam.openid;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
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
	public void testNullCallback() throws DiscoveryException, MessageException, ConsumerException {
		Authenticator authenticator = new Authenticator();
		exception.expect(IllegalArgumentException.class);
		exception.expectMessage(ExceptionMessage.NULL_PARAMETER.getExceptionMessage());
		authenticator.getLoginUrl(null);
	}

	@Test
	public void testBlankCallback() throws DiscoveryException, MessageException, ConsumerException {
		Authenticator authenticator = new Authenticator();
		exception.expect(IllegalArgumentException.class);
		exception.expectMessage(ExceptionMessage.INVALID_CALLBACK_URL.getExceptionMessage());
		authenticator.getLoginUrl("");
	}

}
