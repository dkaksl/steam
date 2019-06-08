/**
 * Copyright (C) 2018 Amani
 * <p>
 * This software may be modified and distributed under the terms
 * of the MIT license.  See the LICENSE file for details.
 */
package com.kilumanga.play.steam.i_player_service.pojo;

import lombok.Data;

@Data
public class Game {
    private Integer appid;
    private Integer playtime_forever;
    private Integer playtime_2weeks;
}
