/** 
 * 
 * Copyright (C) 2018 Amani
 *
 * This software may be modified and distributed under the terms
 * of the MIT license.  See the LICENSE file for details.
 */
package com.kilumanga.play.steam.secret;

import com.kilumanga.play.steam.constant.ExceptionMessage;
import lombok.NonNull;

/**
 * @author Amani
 *
 */
public class ApiKey {
	private final String key;

	public ApiKey(@NonNull String key) {
		if (key.isEmpty()) {
			throw new IllegalArgumentException(ExceptionMessage.INVALID_API_KEY.getExceptionMessage());
		}
		this.key = key;
	}

	public String getKey() {
		return key;
	}
}
