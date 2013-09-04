package com.itea.myfirstapp;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class Second extends Activity implements OnClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		//why we need to do after super?
		//just imagine we are building something
		//we build the foundation (super) first
		//then we write our own code base on this foundation
		
		Bundle mybundle  = getIntent().getExtras();
		String st = mybundle.getString("MainID");
		Log.v("MyFirstApp", st);
		
		
		
		this.setContentView(R.layout.second);
		
		Button bt1 = (Button) findViewById(R.id.button1);
		bt1.setText(st);		
		bt1.setOnClickListener(this);
		
		Button bt2 = (Button) findViewById(R.id.button2);			
		bt2.setOnClickListener(this);			
		
		
	}

	@Override
	public void onClick(View v) {
		switch(v.getId()){
			case R.id.button1:
				Toast.makeText(this, "button1 clicked", Toast.LENGTH_SHORT).show();
				Log.v("MyFirstApp", "button1 clicked");
				break;
			case R.id.button2:
				Toast.makeText(this, "button2 clicked", Toast.LENGTH_SHORT).show();
				Log.v("MyFirstApp", "button2 clicked");
				break;	
		
		}
		// TODO Auto-generated method stub
		
	}

}
