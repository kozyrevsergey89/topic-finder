package com.callisto.bft.service.model;

import java.io.Serializable;

import com.google.gson.annotations.SerializedName;

public class FacebookModel implements Serializable{

	private static final long serialVersionUID = 1141399466905954841L;
	
	@SerializedName("id")
	private String id;
	@SerializedName("name")
	private String name;
	@SerializedName("created_time")
	private String createdTime;
	@SerializedName("type")
	private String type;
	@SerializedName("story")
	private String story;
	@SerializedName("object_id")
	private String objectId;
	@SerializedName("namespace")
	private String nameSpace;
	@SerializedName("application")
	private FacebookModel application;
	@SerializedName("via")
	private String via;
	@SerializedName("coordinates")
	private Coordinates coords;
	
	
	public String getId() { return id; }
	
	public String getName() { return name; }
	
	public String getCreatedTime() { return createdTime; }
	
	public String getType() { return type; }
	
	public String getStory() { return story; }
	
	public String getObjectId() { return objectId; }
	
	public String getNameSpace() { return nameSpace; }
	
	public FacebookModel getApplication() { return application; }
	
	public String getVia() { return via; }
	
	public Coordinates getCoords() { return coords; }
	
}
