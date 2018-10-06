/** 
 * 
 * Copyright (C) 2018 Amani
 *
 * This software may be modified and distributed under the terms
 * of the MIT license.  See the LICENSE file for details.
 */
package com.kilumanga.play.steam.i_player_service;

import lombok.NonNull;
import org.springframework.web.client.RestTemplate;

import com.kilumanga.play.steam.constant.ExceptionMessage;
import com.kilumanga.play.steam.constant.Uri;
import com.kilumanga.play.steam.i_player_service.pojo.GetOwnedGamesResponse;
import com.kilumanga.play.steam.secret.ApiKey;

/**
 * @author Amani
 *
 */
public class IPlayerService {
	private final ApiKey apiKey;

	private final String uriStub = Uri.SERVICE_STUB.getUri() + "IPlayerService/";

	public IPlayerService(@NonNull ApiKey apiKey) {
		this.apiKey = apiKey;
	}

	public GetOwnedGamesResponse getOwnedGames(String userId) {
		String uri = uriStub + "GetOwnedGames/v0001/?key={apiKey}&steamid={userId}";
		RestTemplate template = new RestTemplate();
		GetOwnedGamesResponse response = template.getForObject(uri, GetOwnedGamesResponse.class, apiKey.getKey(),
				userId);
		return response;
	}
}
