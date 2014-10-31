package com.example.smssender;

import java.util.ArrayList;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.telephony.SmsManager;
import android.view.Menu;
import android.widget.TextView;

public class MainActivity extends Activity {
	private SmsManager smsManager;
	private ArrayList<String> fragmenty;
	private String wiadomosc = null;
	private TextView tekstWiad;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		tekstWiad = (TextView) findViewById(R.id.textView1);
		Intent intent = getIntent();
		wiadomosc = intent.getStringExtra(OdbiornikSMS.MESSAGE);
		smsManager = SmsManager.getDefault();
		wiadomosc = "Ta wiadomosc generowana jest automatycznie, wys³a³eœ/aœ sms o treœci: " + wiadomosc;
		tekstWiad.setText(wiadomosc);
		fragmenty = smsManager.divideMessage(wiadomosc);
		smsManager.sendMultipartTextMessage("605301193", null, fragmenty, null, null);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
