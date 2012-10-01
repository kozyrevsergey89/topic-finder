package com.callisto.bft.service.model;

import com.google.gson.annotations.SerializedName;

public class ParsedModel {

	@SerializedName("id")
	private String id;
	@SerializedName("friends")
	private MainModel friends;
	@SerializedName("likes")
	private MainModel likes;
	@SerializedName("activities")
	private MainModel activities;
	@SerializedName("events")
	private MainModel events;
	@SerializedName("photoes")
	private MainModel photoes;
	@SerializedName("tagged")
	private MainModel tagged;
	@SerializedName("posts")
	private MainModel posts;
	@SerializedName("feed")
	private MainModel feed;
	@SerializedName("checkins")
	private MainModel checkins;
	
	public String getId() { return id; }
	
	public MainModel getFriends() { return friends; }
	
	public MainModel getLikes() { return likes; }
	
	public MainModel getActivities() { return activities; }
	
	public MainModel getEvents() { return events; }
	
	public MainModel getPhotoes() { return photoes; }
	
	public MainModel getTagged() { return tagged; }
	
	public MainModel getPosts() { return posts; }
	
	public MainModel getFeed() { return feed; }
	
	public MainModel getCheckins() { return checkins; }
}
