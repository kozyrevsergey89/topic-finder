package com.blundell.tut.ui.phone;

import com.callisto.bft.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends Activity /*implements OnClickListener*/ {
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        // Set the onClick listener for the second button
        //findViewById(R.id.buttonStartSlidingDrawer).setOnClickListener(this);
    }

	/*@Override
	public void onClick(View v) {
		switch(v.getId()){
		case R.id.buttonStartSlidingDrawer:
			startSlidingDrawerActivity();
			break;
		default:
			break;
		}
	}*/
	
	/**
	 * This method is referenced from your XML layout android:onClick="startSlidingDrawerFromXml"
	 * @param v
	 */
	public void startSlidingDrawerFromXml(View v){
		startSlidingDrawerActivity();
	}
	
	/**
	 * Start the new activity in the normal way with an intent
	 */
	private void startSlidingDrawerActivity(){
    	Intent intent = new Intent(this, SlidingDrawerActivity.class);
    	startActivity(intent);
    }
}