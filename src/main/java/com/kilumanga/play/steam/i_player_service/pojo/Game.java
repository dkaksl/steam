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
	private Integer playtimeForever;
	private Integer playtime2weeks;

	public Integer getAppid() {
		return appid;
	}

	public void setAppid(Integer appid) {
		this.appid = appid;
	}

	public Integer getPlaytimeForever() {
		return playtimeForever;
	}

	public void setPlaytimeForever(Integer playtimeForever) {
		this.playtimeForever = playtimeForever;
	}

	public Integer getPlaytime2weeks() {
		return playtime2weeks;
	}

	public void setPlaytime2weeks(Integer playtime2weeks) {
		this.playtime2weeks = playtime2weeks;
	}
}
