/** 
 * 
 * Copyright (C) 2018 Amani
 *
 * This software may be modified and distributed under the terms
 * of the MIT license.  See the LICENSE file for details.
 */
package com.kilumanga.play.steam.openid.data;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.kilumanga.play.steam.constant.ExceptionMessage;

/**
 * @author Amani
 *
 */
public class CallbackUrlTest {
	@Rule
	public final ExpectedException exception = ExpectedException.none();

	@Test
	public void testNullUrl() {
		exception.expect(IllegalArgumentException.class);
		exception.expectMessage(ExceptionMessage.NULL_PARAMETER.getExceptionMessage());
		new CallbackUrl(null);
	}

	@Test
	public void testBlankUrl() {
		exception.expect(IllegalArgumentException.class);
		exception.expectMessage(ExceptionMessage.INVALID_CALLBACK_URL.getExceptionMessage());
		new CallbackUrl("");
	}
}
