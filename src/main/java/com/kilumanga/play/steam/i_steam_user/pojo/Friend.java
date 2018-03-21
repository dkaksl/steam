/** 
 * 
 * Copyright (C) 2018 Amani
 *
 * This software may be modified and distributed under the terms
 * of the MIT license.  See the LICENSE file for details.
 */
package com.kilumanga.play.steam.i_steam_user.pojo;

/**
 * @author Amani
 *
 */
public class Friend {
	private String steamid;
	private String relationship;
	private long friend_since;

	public String getSteamid() {
		return steamid;
	}

	public void setSteamid(String steamid) {
		this.steamid = steamid;
	}

	public String getRelationship() {
		return relationship;
	}

	public void setRelationship(String relationship) {
		this.relationship = relationship;
	}

	public long getFriend_since() {
		return friend_since;
	}

	public void setFriend_since(long friend_since) {
		this.friend_since = friend_since;
	}
}
