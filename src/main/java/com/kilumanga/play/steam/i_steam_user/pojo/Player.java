/**
 * Copyright (C) 2018 Amani
 * <p>
 * This software may be modified and distributed under the terms
 * of the MIT license.  See the LICENSE file for details.
 */
package com.kilumanga.play.steam.i_steam_user.pojo;

import lombok.Data;

@Data
public class Player {
    private String steamid;
    private long communityvisibilitystate;
    private long profilestate;
    private String personaname;
    private long lastlogoff;
    private String profileurl;
    private String avatar;
    private String avatarmedium;
    private String avatarfull;
    private long personastate;
    private String realname;
    private String primaryclanid;
    private long timecreated;
    private long personastateflags;
    private String loccountrycode;
    private String locstatecode;
    private long loccityid;
}
