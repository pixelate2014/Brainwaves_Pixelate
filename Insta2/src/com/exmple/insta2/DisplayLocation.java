package com.exmple.insta2;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class DisplayLocation extends ActionBarActivity {
	WebView myWebView;
	String mapPath = "https://www.google.co.in/maps/place/Aloft+Hotel/@12.990379,77.6957599,13z/data=!4m17!1m14!4m13!1m6!1m2!1s0x3bae16773e7dc413:0xc69742ae19c2262d!2sAloft+Hotel,+ITPL+Main+Rd,+Prasanth+Extension,+Whitefield,+Bengaluru,+Karnataka+560066!2m2!1d77.732668!2d12.990298!1m5!1m1!1s0x0:0xc69742ae19c2262d!2m2!1d77.732668!2d12.990298!3m1!1s0x3bae16773e7dc413:0xc69742ae19c2262d?hl=en";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_display_location);
		myWebView = (WebView)findViewById(R.id.mapview);
		  myWebView.getSettings().setJavaScriptEnabled(true);
		  myWebView.setWebViewClient(new WebViewClient());
		  myWebView.loadUrl(mapPath);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.display_location, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	 public void sendNextScreen(View view) {
	        // Do something in response to button
	    	Intent intent = new Intent(this, BankBranches.class);
	    	startActivity(intent);
	 }}
