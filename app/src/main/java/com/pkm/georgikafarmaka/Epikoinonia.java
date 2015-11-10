package com.pkm.georgikafarmaka;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class Epikoinonia extends Activity implements OnClickListener {

	Button apostoli, callMobile;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.epikoinonia);
		apostoli = (Button) findViewById(R.id.bApostoli);
		callMobile = (Button) findViewById(R.id.bCallMobile);

		apostoli.setOnClickListener(new View.OnClickListener() {
			public void onClick(View view) {
				sendEmail();
			}

			private void sendEmail() {
				// TODO Auto-generated method stub
				Intent i = new Intent(Intent.ACTION_SEND);
				i.setType("message/rfc822");
				i.putExtra(Intent.EXTRA_EMAIL,
						new String[] { "info@kekpkm.gr" });
				i.putExtra(Intent.EXTRA_SUBJECT, "Θέμα");
				i.putExtra(Intent.EXTRA_TEXT, "Γράψτε Μήνυμα");
				try {
					startActivity(Intent.createChooser(i, "Send mail..."));
				} catch (android.content.ActivityNotFoundException ex) {
					Toast.makeText(Epikoinonia.this,
							"There are no email clients installed.",
							Toast.LENGTH_SHORT).show();
				}
			}
		});

		callMobile.setOnClickListener(new View.OnClickListener() {
			public void onClick(View view) {
				sendEmail();
			}

			private void sendEmail() {
				// TODO Auto-generated method stub
				Intent callIntent = new Intent(Intent.ACTION_CALL);
				callIntent.setData(Uri.parse("tel:2321023640"));
				startActivity(callIntent);
			}
		});

	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub

	}
}
