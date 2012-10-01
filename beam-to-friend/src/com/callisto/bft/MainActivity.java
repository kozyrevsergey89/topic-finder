package com.callisto.bft;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;

import com.callisto.bft.service.ParseService;
import com.callisto.bft.service.model.ParsedModel;
import com.callisto.bft.utils.AppUtils;
import com.facebook.android.AsyncFacebookRunner;
import com.facebook.android.AsyncFacebookRunner.RequestListener;
import com.facebook.android.DialogError;
import com.facebook.android.Facebook;
import com.facebook.android.Facebook.DialogListener;
import com.facebook.android.FacebookError;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;

public class MainActivity extends Activity {

	public static final String APP_ID = "174304045944133";
	private AsyncFacebookRunner facebookRunner;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Facebook facebook = new Facebook(APP_ID);
        facebookRunner = new AsyncFacebookRunner(facebook);	
        AppUtils.restoreToken(facebook, this);
        final String[] permissions = getResources().getStringArray(R.array.permissions);
        facebook.authorize(this, permissions, 0, new DialogListener() {
			
			@Override
			public void onFacebookError(final FacebookError e) { 
				Log.e("123123", e.getMessage());
			}
			
			@Override
			public void onError(final DialogError e) {
				Log.e("123123", e.getMessage());
			}
			
			@Override
			public void onComplete(final Bundle values) {
				if (values != null && values.containsKey(Facebook.TOKEN)) {
					Log.i("123123", values.getString(Facebook.TOKEN));
				}
				
				Bundle params = new Bundle();
				params.putString("fields", getString(R.string.user_request));
				facebookRunner.request("me",params, new UserDataListener());
				finish();
 			}
			
			@Override
			public void onCancel() { finish(); }
		});
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) { return false; }
    
    private class UserDataListener implements RequestListener {

		@Override
		public void onComplete(final String response, final Object state) {
			ParsedModel model = ParseService.parse(response);
			//here our parsed model
		}

		@Override
		public void onIOException(final IOException e, final Object state) {
			Log.e("123123", e.getMessage());
		}

		@Override
		public void onFileNotFoundException(final FileNotFoundException e,
				final Object state) {
			Log.e("123123", e.getMessage());
		}

		@Override
		public void onMalformedURLException(final MalformedURLException e,
				final Object state) {
			Log.e("123123", "url exception");
		}

		@Override
		public void onFacebookError(final FacebookError e, final Object state) {
			Log.e("123123", e.getMessage());
		}
    	
    }
}
