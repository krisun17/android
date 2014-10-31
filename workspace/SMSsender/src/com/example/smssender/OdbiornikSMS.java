package com.example.smssender;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsMessage;

public class OdbiornikSMS extends BroadcastReceiver{
	

	public static final String MESSAGE = null;

	@Override
	public void onReceive(Context arg0, Intent arg1) {
		Bundle bundle = arg1.getExtras();
		SmsMessage[] msgs = null;
		String wiadomosc = "";
		Object[] pdus = (Object[])bundle.get("pdus");
		msgs = new SmsMessage[pdus.length];
		for (int i=0; i<msgs.length; i++)
		{
			msgs[i] = SmsMessage.createFromPdu((byte[])pdus[i]);
			wiadomosc += msgs[i].getMessageBody();
		}
		Intent intent = new Intent(arg0, MainActivity.class);
		intent.putExtra(MESSAGE, wiadomosc);
		arg0.startActivity(intent);
	}
}
