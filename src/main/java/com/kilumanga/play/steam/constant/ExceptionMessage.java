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
public enum ExceptionMessage {
	NULL_PARAMETER(), //

	INVALID_API_KEY(), //
	;

	public String getExceptionMessage() {
		return name().toLowerCase().replaceAll("_", " ");
	}
}
