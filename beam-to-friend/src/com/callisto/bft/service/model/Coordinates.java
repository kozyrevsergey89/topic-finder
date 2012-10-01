package com.callisto.bft.service.model;

import com.google.gson.annotations.SerializedName;

public class Coordinates {

	@SerializedName("latitude")
	private double latitude;
	@SerializedName("longitude")
	private double longitude;
	
	public double getLatitude() {
		return latitude;
	}
	public double getLongitude() {
		return longitude;
	}
	
}
