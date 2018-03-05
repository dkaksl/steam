/** 
 * 
 * Copyright (C) 2018 Amani
 *
 * This software may be modified and distributed under the terms
 * of the MIT license.  See the LICENSE file for details.
 */
package com.kilumanga.play.steam.i_steam_user.summaries;

/**
 * @author Amani
 *
 */
public class Player {
	private String steamid;
	private long communityvisibilitystate;
	private long profilestate;
	private String personaname;
	private long lastlogoff;
	private String profileurl;
	private String avatar;
	private String avatarmedium;
	private String avatarfull;
	private long personastate;
	private String realname;
	private String primaryclanid;
	private long timecreated;
	private long personastateflags;
	private String loccountrycode;
	private String locstatecode;
	private long loccityid;

	public String getSteamid() {
		return steamid;
	}

	public void setSteamid(String steamid) {
		this.steamid = steamid;
	}

	public long getCommunityvisibilitystate() {
		return communityvisibilitystate;
	}

	public void setCommunityvisibilitystate(long communityvisibilitystate) {
		this.communityvisibilitystate = communityvisibilitystate;
	}

	public long getProfilestate() {
		return profilestate;
	}

	public void setProfilestate(long profilestate) {
		this.profilestate = profilestate;
	}

	public String getPersonaname() {
		return personaname;
	}

	public void setPersonaname(String personaname) {
		this.personaname = personaname;
	}

	public long getLastlogoff() {
		return lastlogoff;
	}

	public void setLastlogoff(long lastlogoff) {
		this.lastlogoff = lastlogoff;
	}

	public String getProfileurl() {
		return profileurl;
	}

	public void setProfileurl(String profileurl) {
		this.profileurl = profileurl;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public String getAvatarmedium() {
		return avatarmedium;
	}

	public void setAvatarmedium(String avatarmedium) {
		this.avatarmedium = avatarmedium;
	}

	public String getAvatarfull() {
		return avatarfull;
	}

	public void setAvatarfull(String avatarfull) {
		this.avatarfull = avatarfull;
	}

	public long getPersonastate() {
		return personastate;
	}

	public void setPersonastate(long personastate) {
		this.personastate = personastate;
	}

	public String getRealname() {
		return realname;
	}

	public void setRealname(String realname) {
		this.realname = realname;
	}

	public String getPrimaryclanid() {
		return primaryclanid;
	}

	public void setPrimaryclanid(String primaryclanid) {
		this.primaryclanid = primaryclanid;
	}

	public long getTimecreated() {
		return timecreated;
	}

	public void setTimecreated(long timecreated) {
		this.timecreated = timecreated;
	}

	public long getPersonastateflags() {
		return personastateflags;
	}

	public void setPersonastateflags(long personastateflags) {
		this.personastateflags = personastateflags;
	}

	public String getLoccountrycode() {
		return loccountrycode;
	}

	public void setLoccountrycode(String loccountrycode) {
		this.loccountrycode = loccountrycode;
	}

	public String getLocstatecode() {
		return locstatecode;
	}

	public void setLocstatecode(String locstatecode) {
		this.locstatecode = locstatecode;
	}

	public long getLoccityid() {
		return loccityid;
	}

	public void setLoccityid(long loccityid) {
		this.loccityid = loccityid;
	}
}
