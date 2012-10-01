package com.callisto.bft.service;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

import com.callisto.bft.service.model.ParsedModel;
import com.google.gson.Gson;

import android.app.IntentService;
import android.content.Intent;

/**
 * Parsing facebook response service
 * {@link IntentService}
 * @author davidmayboroda
 */
public class ParseService extends IntentService {

	public ParseService(final String name) {
		super("FacebookParseService");
	}

	@Override
	protected void onHandleIntent(final Intent intent) {
		
	}
	
	public static ParsedModel parse(final String responseString) {
		InputStream source = new ByteArrayInputStream(responseString.getBytes());
		Gson gson = new Gson();
		Reader reader = new InputStreamReader(source);
		ParsedModel response = gson.fromJson(reader, ParsedModel.class);
		return response;
	}
}
