/**
 * Copyright (C) 2018 Amani
 * <p>
 * This software may be modified and distributed under the terms
 * of the MIT license.  See the LICENSE file for details.
 */
package com.kilumanga.play.steam.i_player_service;

import com.kilumanga.play.steam.constant.ID;
import com.kilumanga.play.steam.i_player_service.pojo.Game;
import com.kilumanga.play.steam.i_player_service.pojo.GetOwnedGamesResponse;
import com.kilumanga.play.steam.i_steam_user.ISteamUserTest;
import com.kilumanga.play.steam.secret.ApiKey;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.io.*;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Optional;
import java.util.regex.Matcher;

/**
 * @author Amani
 *
 */
public class IPlayerServiceTest {
    private static ApiKey apiKey;

    @Rule
    public final ExpectedException exception = ExpectedException.none();

    @BeforeClass
    public static void setUp() throws IOException, URISyntaxException {
        try (BufferedReader apiKeyReader = new BufferedReader(new InputStreamReader(new FileInputStream(
                new File(ISteamUserTest.class.getProtectionDomain().getCodeSource().getLocation().toURI().getPath())
                        .getParentFile().getParentFile()
                        + "/secret/apikey".replaceAll("/", Matcher.quoteReplacement(File.separator))),
                StandardCharsets.UTF_8))) {
            apiKey = new ApiKey(apiKeyReader.readLine());
        }
    }

    @Test
    public void testGetOwnedGames() {
        IPlayerService iPlayerService = new IPlayerService(apiKey);
        GetOwnedGamesResponse getOwnedGamesResponse = iPlayerService.getOwnedGames(ID.DEFAULT.getUserId());
        Optional<Integer> gameCount = getOwnedGamesResponse.getResponse().getGameCount();
        if (gameCount.isPresent()) {
            System.out.println("game count: " + gameCount.get());
        }

        Optional<List<Game>> gameList = getOwnedGamesResponse.getResponse().getGames();
        if (gameList.isPresent()) {
            System.out.println("owned games:");
            for (Game game : gameList.get()) {
                System.out.println("appid: " + game.getAppid() + ", playtime_forever: " + game.getPlaytime_forever());
            }
        }
    }
}
