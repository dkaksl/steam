/** 
 * 
 * Copyright (C) 2018 Amani
 *
 * This software may be modified and distributed under the terms
 * of the MIT license.  See the LICENSE file for details.
 */
package com.kilumanga.play.steam.i_steam_user;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.regex.Matcher;

import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.kilumanga.play.steam.constant.ID;
import com.kilumanga.play.steam.i_steam_user.friends.Friend;
import com.kilumanga.play.steam.i_steam_user.summaries.Player;
import com.kilumanga.play.steam.secret.ApiKey;

/**
 * @author Amani
 *
 */
public class ISteamUserTest {
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
	public void testGetFriendList() {
		ISteamUser iSteamUser = new ISteamUser(apiKey);
		List<Friend> friends = iSteamUser.getFriendList(ID.DEFAULT.getUserId());
		for (Friend friend : friends) {
			System.out.println("friend steamid: " + friend.getSteamid());
		}
	}

	@Test
	public void testGetPlayerSummaries() {
		ISteamUser iSteamUser = new ISteamUser(apiKey);
		List<Player> players = iSteamUser.getPlayerSummaries("76561197960435530");
		for (Player player : players) {
			System.out.println("player steamid: " + player.getSteamid());
		}
	}
}
