/**
 * Copyright (C) 2018 Amani
 * <p>
 * This software may be modified and distributed under the terms
 * of the MIT license.  See the LICENSE file for details.
 */
package com.kilumanga.play.steam.i_player_service.pojo;

import java.util.List;
import java.util.Optional;

/**
 * @author Amani
 */
public class Response {
    private Integer gameCount;
    private List<Game> games;

    public Optional<Integer> getGameCount() {
        return Optional.ofNullable(gameCount);
    }

    public void setGameCount(Integer gameCount) {
        this.gameCount = gameCount;
    }

    public Optional<List<Game>> getGames() {
        return Optional.ofNullable(games);
    }

    public void setGames(List<Game> games) {
        this.games = games;
    }
}
