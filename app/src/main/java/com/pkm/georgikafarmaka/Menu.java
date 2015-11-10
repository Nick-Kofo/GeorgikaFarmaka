package com.pkm.georgikafarmaka;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.content.Intent;

public class Menu extends Activity implements OnClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.menu);

		Button Erotimatologio = (Button) findViewById(R.id.bErotimatologio);
		Erotimatologio.setOnClickListener(this);
		Button Sxetika = (Button) findViewById(R.id.bSxetika);
		Sxetika.setOnClickListener(this);
		Button Epikoinonia = (Button) findViewById(R.id.bEpikoinonia);
		Epikoinonia.setOnClickListener(this);
	}

	private void ErotimatologioClick() {

		startActivity(new Intent("com.example.triviality.Erotimatologio"));
	}

	private void SxetikaClick() {

		startActivity(new Intent("com.example.triviality.Sxetika"));
	}

	private void EpikoinoniaClick() {

		startActivity(new Intent("com.example.triviality.Epikoinonia"));
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.bErotimatologio:
			ErotimatologioClick();
			break;
		case R.id.bSxetika:
			SxetikaClick();
			break;
		case R.id.bEpikoinonia:
			EpikoinoniaClick();
			break;
		default:
			break;
		}
	}
}
