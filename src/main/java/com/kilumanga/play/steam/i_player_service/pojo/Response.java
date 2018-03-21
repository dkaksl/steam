/** 
 * 
 * Copyright (C) 2018 Amani
 *
 * This software may be modified and distributed under the terms
 * of the MIT license.  See the LICENSE file for details.
 */
package com.kilumanga.play.steam.i_player_service.pojo;

import java.util.List;

/**
 * @author Amani
 *
 */
public class Response {
	private Integer gameCount;
	private List<Game> games;

	public Integer getGameCount() {
		return gameCount;
	}

	public void setGameCount(Integer gameCount) {
		this.gameCount = gameCount;
	}

	public List<Game> getGames() {
		return games;
	}

	public void setGames(List<Game> games) {
		this.games = games;
	}
}
