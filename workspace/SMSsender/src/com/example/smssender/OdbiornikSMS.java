package com.example.smssender;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsMessage;

public class OdbiornikSMS extends BroadcastReceiver{
	
	private String ostWiadomosc;
	
	public OdbiornikSMS()
	{
		super();
		ostWiadomosc = null;
	}

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
		ostWiadomosc = wiadomosc;
		MainActivity main = new MainActivity(ostWiadomosc);
	}

	public String getOstWiadomosc() {
		return ostWiadomosc;
	}

	public void setOstWiadomosc(String ostWiadomosc) {
		this.ostWiadomosc = ostWiadomosc;
	}

}
