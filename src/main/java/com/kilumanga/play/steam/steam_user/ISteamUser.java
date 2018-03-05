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

import com.kilumanga.play.steam.constant.ExceptionMessage;
import com.kilumanga.play.steam.constant.Uri;
import com.kilumanga.play.steam.secret.ApiKey;
import com.kilumanga.play.steam.steam_user.data.Friend;
import com.kilumanga.play.steam.steam_user.data.GetFriendListResponse;

/**
 * @author Amani
 *
 */
public class ISteamUser {

	private final ApiKey apiKey;

	private final String iSteamUser = Uri.SERVICE_STUB.getUri() + "ISteamUser/";
	private final String iPlayerService = Uri.SERVICE_STUB.getUri() + "IPlayerService/";

	public ISteamUser(ApiKey apiKey) {
		if (apiKey == null) {
			throw new IllegalArgumentException(ExceptionMessage.NULL_PARAMETER.getExceptionMessage());
		}
		this.apiKey = apiKey;
	}

	public List<Friend> getFriendList(String userId) {
		String uri = iSteamUser + "GetFriendList/v0001/?key={apiKey}&steamid={userId}&relationship=friend";
		RestTemplate template = new RestTemplate();

		GetFriendListResponse response = template.getForObject(uri, GetFriendListResponse.class, apiKey.getKey(),
				userId);
		return response.getFriendslist().getFriends();
	}

	public void getPlayerBans() {

	}

}
