/**
 * Copyright (C) 2018 Amani
 * <p>
 * This software may be modified and distributed under the terms
 * of the MIT license.  See the LICENSE file for details.
 */
package com.kilumanga.play.steam.i_steam_user;

import java.util.List;

import lombok.NonNull;
import org.springframework.web.client.RestTemplate;

import com.kilumanga.play.steam.constant.ExceptionMessage;
import com.kilumanga.play.steam.constant.Uri;
import com.kilumanga.play.steam.i_steam_user.pojo.Friend;
import com.kilumanga.play.steam.i_steam_user.pojo.GetFriendListResponse;
import com.kilumanga.play.steam.i_steam_user.pojo.GetPlayerSummariesResponse;
import com.kilumanga.play.steam.i_steam_user.pojo.Player;
import com.kilumanga.play.steam.secret.ApiKey;

public class ISteamUser {

    private final ApiKey apiKey;

    private final String uriStub = Uri.SERVICE_STUB.getUri() + "ISteamUser/";

    public ISteamUser(@NonNull ApiKey apiKey) {
        this.apiKey = apiKey;
    }

    public List<Friend> getFriendList(String userId) {
        String uri = uriStub + "GetFriendList/v0001/?key={apiKey}&steamid={userId}&relationship=friend";
        RestTemplate template = new RestTemplate();

        GetFriendListResponse response = template.getForObject(uri, GetFriendListResponse.class, apiKey.getKey(),
                userId);
        return response.getFriendslist().getFriends();
    }

    public List<Player> getPlayerSummaries(String... steamIds) {
        if (steamIds.length > 100) {
            throw new IllegalArgumentException(ExceptionMessage.TOO_MANY_IDS.getExceptionMessage());
        }
        String uri = uriStub + "GetPlayerSummaries/v0002/?key={apiKey}&steamids={steamIds}";
        RestTemplate template = new RestTemplate();

        GetPlayerSummariesResponse response = template.getForObject(uri, GetPlayerSummariesResponse.class,
                apiKey.getKey(), steamIds);
        return response.getResponse().getPlayers();
    }

    public void getPlayerBans(String... steamIds) {
        // TODO
    }

}
