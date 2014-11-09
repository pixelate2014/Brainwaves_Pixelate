package com.exmple.insta2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.RadioButton;

/**
 * 
 * @author Vaibhav
 *
 */

public class BankBranches extends ActionBarActivity {
	public void onRadioButtonClicked(View view) {
	    // Is the button now checked?
	    boolean checked = ((RadioButton) view).isChecked();
	    
	    // Check which radio button was clicked
	    switch(view.getId()) {
	        case R.id.radioButton1:
	            if (checked)
	            {
	             Intent intent = new Intent(this, KSLayoutActivity.class);
	            	  startActivity(intent);
	            }
	            break;
	        case R.id.radioButton2:
	            if (checked)
	            {
	             Intent intent = new Intent(this, HSRLayoutActivity.class);
	            	  startActivity(intent);
	            }
	            break;
	        case R.id.radioButton3:
	            if (checked)
	            {
	             Intent intent = new Intent(this, ISROLayoutActivity.class);
	            	  startActivity(intent);
	            }
	            break;
	        case R.id.radioButton4:
	            if (checked)
	            {
	             Intent intent = new Intent(this, BellandurActivity.class);
	            	  startActivity(intent);
	            }
	            break;
	    }
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_bank_branches);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.bank_branches, menu);
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
}
