/** 
 * 
 * Copyright (C) 2018 Amani
 *
 * This software may be modified and distributed under the terms
 * of the MIT license.  See the LICENSE file for details.
 */
package com.kilumanga.play.steam.i_player_service.pojo;

/**
 * @author Amani
 *
 */
public class Game {
	private Integer appid;
	private Integer playtime_forever;
	private Integer playtime_2weeks;

	public Integer getAppid() {
		return appid;
	}

	public void setAppid(Integer appid) {
		this.appid = appid;
	}

	public Integer getPlaytime_forever() {
		return playtime_forever;
	}

	public void setPlaytime_forever(Integer playtime_forever) {
		this.playtime_forever = playtime_forever;
	}

	public Integer getPlaytime_2weeks() {
		return playtime_2weeks;
	}

	public void setPlaytime_2weeks(Integer playtime_2weeks) {
		this.playtime_2weeks = playtime_2weeks;
	}

}
