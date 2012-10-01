package com.blundell.tut.ui.phone;

import com.callisto.bft.R;

import android.app.Activity;
import android.os.Bundle;



public class SlidingDrawerActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// Override how this activity is animated into view
		// The new activity is pulled in from the left and the current activity is kept still
		// This has to be called before onCreate
		overridePendingTransition(R.anim.pull_in_from_left, R.anim.hold);
		
		setContentView(R.layout.activity_sliding_drawer);
	}
	
	@Override
    protected void onPause() {
		// Whenever this activity is paused (i.e. looses focus because another activity is started etc)
		// Override how this activity is animated out of view
		// The new activity is kept still and this activity is pushed out to the left
        overridePendingTransition(R.anim.hold, R.anim.push_out_to_left);
        super.onPause();
    }
}