/**
 * Copyright (C) 2018 Amani
 * <p>
 * This software may be modified and distributed under the terms
 * of the MIT license.  See the LICENSE file for details.
 */
package com.kilumanga.play.steam.i_steam_user.pojo;

import lombok.Data;

import java.util.List;

@Data
public class Response {
    private List<Player> players;
}
