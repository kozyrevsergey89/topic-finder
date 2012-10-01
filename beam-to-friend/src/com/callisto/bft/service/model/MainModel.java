package com.callisto.bft.service.model;

import java.io.Serializable;
import java.util.List;

public class MainModel implements Serializable {

	private static final long serialVersionUID = 5194277563414267060L;
	
	private List<FacebookModel> data;
	
	public List<FacebookModel> getData() { return data; }
}
