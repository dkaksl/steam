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

/**
 * @author Amani
 *
 */
public class AuthenticatorTest {
	@Rule
	public final ExpectedException exception = ExpectedException.none();

	@Test
	public void test() throws DiscoveryException, MessageException, ConsumerException {
		Authenticator authenticator = new Authenticator();
		System.out.println(authenticator.getLoginUrl("https://steam.kilumanga.com"));
	}

}
