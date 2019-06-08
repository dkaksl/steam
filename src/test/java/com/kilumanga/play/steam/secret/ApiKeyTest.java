/** 
 * 
 * Copyright (C) 2018 Amani
 *
 * This software may be modified and distributed under the terms
 * of the MIT license.  See the LICENSE file for details.
 */
package com.kilumanga.play.steam.secret;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.kilumanga.play.steam.constant.ExceptionMessage;

public class ApiKeyTest {
	@Rule
	public final ExpectedException exception = ExpectedException.none();

	@Test
	public void testNullKey() {
		exception.expect(NullPointerException.class);
		new ApiKey(null);
	}

	@Test
	public void testBlankKey() {
		exception.expect(IllegalArgumentException.class);
		exception.expectMessage(ExceptionMessage.INVALID_API_KEY.getExceptionMessage());
		new ApiKey("");
	}
}
