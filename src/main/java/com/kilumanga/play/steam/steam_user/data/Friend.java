/** 
 * 
 * Copyright (C) 2018 Amani
 *
 * This software may be modified and distributed under the terms
 * of the MIT license.  See the LICENSE file for details.
 */
package com.kilumanga.play.steam.steam_user.data;

/**
 * @author Amani
 *
 */
public class FriendData {
	private String steamid;
	private String relationship;
	private String friend_since;

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

	public String getFriend_since() {
		return friend_since;
	}

	public void setFriend_since(String friend_since) {
		this.friend_since = friend_since;
	}
}
