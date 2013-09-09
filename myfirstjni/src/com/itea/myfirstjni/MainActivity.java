package com.itea.myfirstjni;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TextView;

public class MainActivity extends Activity {
	
	public native String getContent();
	
	public native int mySummation();
	
	static {
		System.loadLibrary("demolib");
	}
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		TextView tv = (TextView) findViewById(R.id.textView1);
		//tv.setText(getContent());	
		
		StringBuilder sb = new StringBuilder();
		sb.append("");
		sb.append(mySummation());
		String strI = sb.toString();
		
		tv.setText(strI + " " + getContent());
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
