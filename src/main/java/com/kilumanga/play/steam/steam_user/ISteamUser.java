/** 
 * 
 * Copyright (C) 2018 Amani
 *
 * This software may be modified and distributed under the terms
 * of the MIT license.  See the LICENSE file for details.
 */
package com.kilumanga.play.steam.steam_user;

import java.util.List;

import org.springframework.web.client.RestTemplate;

import com.kilumanga.play.steam.steam_user.data.Friend;
import com.kilumanga.play.steam.steam_user.data.GetFriendListResponse;

/**
 * @author Amani
 *
 */
public class ISteamUser {

	private final String uriStub = "http://api.steampowered.com/";
	private final String iSteamUser = uriStub + "ISteamUser/";
	private final String iPlayerService = uriStub + "IPlayerService/";

	public void getPlayerSummaries() {

	}

	public List<Friend> getFriendList(String apiKey, String userId) {
		String uri = iSteamUser + "GetFriendList/v0001/?key={apiKey}&steamid={userId}&relationship=friend";
		RestTemplate template = new RestTemplate();

		GetFriendListResponse response = template.getForObject(uri, GetFriendListResponse.class, apiKey, userId);
		return response.getFriendslist().getFriends();
	}

	public void getPlayerBans() {

	}

}
