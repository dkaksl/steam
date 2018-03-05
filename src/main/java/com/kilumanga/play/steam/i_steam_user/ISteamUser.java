/** 
 * 
 * Copyright (C) 2018 Amani
 *
 * This software may be modified and distributed under the terms
 * of the MIT license.  See the LICENSE file for details.
 */
package com.kilumanga.play.steam.i_steam_user;

import java.util.List;

import org.springframework.web.client.RestTemplate;

import com.kilumanga.play.steam.constant.ExceptionMessage;
import com.kilumanga.play.steam.constant.Uri;
import com.kilumanga.play.steam.i_steam_user.data.Friend;
import com.kilumanga.play.steam.i_steam_user.data.GetFriendListResponse;
import com.kilumanga.play.steam.secret.ApiKey;

/**
 * @author Amani
 *
 */
public class ISteamUser {

	private final ApiKey apiKey;

	private final String uriStub = Uri.SERVICE_STUB.getUri() + "ISteamUser/";

	public ISteamUser(ApiKey apiKey) {
		if (apiKey == null) {
			throw new IllegalArgumentException(ExceptionMessage.NULL_PARAMETER.getExceptionMessage());
		}
		this.apiKey = apiKey;
	}

	public List<Friend> getFriendList(String userId) {
		String uri = uriStub + "GetFriendList/v0001/?key={apiKey}&steamid={userId}&relationship=friend";
		RestTemplate template = new RestTemplate();

		GetFriendListResponse response = template.getForObject(uri, GetFriendListResponse.class, apiKey.getKey(),
				userId);
		return response.getFriendslist().getFriends();
	}

	public void getPlayerBans(String... steamIds) {
		// TODO
	}

	public void getPlayerSummaries(String... steamIds) {
		// TODO
	}

}