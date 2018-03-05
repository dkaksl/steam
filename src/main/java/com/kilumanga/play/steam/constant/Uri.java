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
public enum Uri {
	SERVICE_STUB("http://api.steampowered.com/"), //
	;

	private final String uri;

	private Uri(String uri) {
		this.uri = uri;
	}

	public String getUri() {
		return uri;
	}
}
