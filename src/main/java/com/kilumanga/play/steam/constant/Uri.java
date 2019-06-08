/**
 * Copyright (C) 2018 Amani
 * <p>
 * This software may be modified and distributed under the terms
 * of the MIT license.  See the LICENSE file for details.
 */
package com.kilumanga.play.steam.constant;

import lombok.Getter;

@Getter
public enum Uri {
    SERVICE_STUB("http://api.steampowered.com/"),
    STEAM_OPENID("http://steamcommunity.com/openid");

    private final String uri;

    Uri(String uri) {
        this.uri = uri;
    }
}
