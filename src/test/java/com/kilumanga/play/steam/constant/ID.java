/** 
 * 
 * Copyright (C) 2018 Amani
 *
 * This software may be modified and distributed under the terms
 * of the MIT license.  See the LICENSE file for details.
 */
package com.kilumanga.play.steam.constant;

/**
 * @author Amani
 *
 */
public enum ID {
	DEFAULT("76561197960435530"), //
	;

	private final String userId;

	private ID(String userId) {
		this.userId = userId;
	}

	public String getUserId() {
		return userId;
	}
}
