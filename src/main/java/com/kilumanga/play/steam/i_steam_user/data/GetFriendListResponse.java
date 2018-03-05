/** 
 * 
 * Copyright (C) 2018 Amani
 *
 * This software may be modified and distributed under the terms
 * of the MIT license.  See the LICENSE file for details.
 */
package com.kilumanga.play.steam.i_steam_user.data;

/**
 * @author Amani
 *
 */
public class GetFriendListResponse {
	private Friendslist friendslist;

	public Friendslist getFriendslist() {
		return friendslist;
	}

	public void setFriendslist(Friendslist friendslist) {
		this.friendslist = friendslist;
	}
}
