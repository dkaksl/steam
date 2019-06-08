/** 
 * 
 * Copyright (C) 2018 Amani
 *
 * This software may be modified and distributed under the terms
 * of the MIT license.  See the LICENSE file for details.
 */
package com.kilumanga.play.steam.constant;

public enum ID {
	DEFAULT("76561197960435530"), //
	;

	private final String userId;

	ID(String userId) {
		this.userId = userId;
	}

	public String getUserId() {
		return userId;
	}
}
