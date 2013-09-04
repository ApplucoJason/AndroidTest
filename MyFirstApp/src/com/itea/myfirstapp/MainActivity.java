package com.itea.myfirstapp;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);
        Log.v("MyFirstApp", "onCreate");
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        
        Log.v("MyFirstApp", "onCreateOptionsMenu");
        return true;
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
