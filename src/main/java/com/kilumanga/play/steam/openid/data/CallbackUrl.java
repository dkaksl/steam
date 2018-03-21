/** 
 * 
 * Copyright (C) 2018 Amani
 *
 * This software may be modified and distributed under the terms
 * of the MIT license.  See the LICENSE file for details.
 */
package com.kilumanga.play.steam.openid.data;

import com.kilumanga.play.steam.constant.ExceptionMessage;

/**
 * @author Amani
 *
 */
public class CallbackUrl {
	private final String url;

	public CallbackUrl(String url) {
		if (url == null) {
			throw new IllegalArgumentException(ExceptionMessage.NULL_PARAMETER.getExceptionMessage());
		}

		if (url.isEmpty()) {
			throw new IllegalArgumentException(ExceptionMessage.INVALID_CALLBACK_URL.getExceptionMessage());
		}
		this.url = url;
	}

	public String getUrl() {
		return url;
	}
}
