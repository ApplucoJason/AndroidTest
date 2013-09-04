package com.itea.myfirstapp;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.v("MyFirstApp", "onCreate");
        
        
        	
        
        
    }
        
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        
        Log.v("MyFirstApp", "onCreateOptionsMenu");
        return true;
    }
    
    public void doCall(View view) {
    	
    	//must have "tel:"
    	String dialUri = "tel:0958030008";
    	Intent myIntent = new Intent(Intent.ACTION_CALL);
    	myIntent.setData(Uri.parse(dialUri));
    	startActivity(myIntent);
    	
    }
    
    public void doWeb(View view) {
    	
    	//must have "tel:"    	
    	Intent myIntent = new Intent(Intent.ACTION_VIEW);
    	myIntent.setData(Uri.parse("http://www.newtonstudio.com"));
    	startActivity(myIntent);
    	
    }
    
    public void doActivity(View view) {
    	    	
    	//We create a Bundle to Post Message
    	Bundle myBundle = new Bundle();
    	myBundle.putString("MainID", "Hello123");    	
    	
    	//New an Intent to transfer Message
    	Intent myIntent = new Intent();
    	
    	//put bundle to my intent
    	myIntent.putExtras(myBundle);    	
    	myIntent.setClass(this, Second.class);
    	startActivity(myIntent);
    	
    	Log.v("MyFirstApp", "doActivity");
    }

	@Override
	protected void onRestart() {
		// TODO Auto-generated method stub
		Log.v("MyFirstApp", "onRestart");
		super.onRestart();
	}


	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		Log.v("MyFirstApp", "onResume");
		super.onResume();
	}


	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		Log.v("MyFirstApp", "onPause");
		super.onPause();
	}


	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		Log.v("MyFirstApp", "onDestroy");
		super.onDestroy();
	}
    
    
    
}
