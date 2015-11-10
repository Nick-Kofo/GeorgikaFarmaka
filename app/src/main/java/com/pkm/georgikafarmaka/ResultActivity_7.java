package com.pkm.georgikafarmaka;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class ResultActivity_7 extends Activity implements OnClickListener {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_result);
		//get text view
		TextView t=(TextView)findViewById(R.id.textResult);
		TextView ttisekato=(TextView)findViewById(R.id.textResulttisekato);
		TextView apotelesma=(TextView)findViewById(R.id.textApotelesma);
		Button sosta=(Button)findViewById(R.id.bSosta);
		sosta.setOnClickListener(this);
		Button lathos=(Button)findViewById(R.id.bLathos);
		lathos.setOnClickListener(this);
		//get score
		Bundle b = getIntent().getExtras();
		int score= b.getInt("score");



		switch (score)
		{
			case 0:
				t.setText("0/40");
				ttisekato.setText("0%");
				apotelesma.setText("Δυστυχώς Κοπήκατε");
				break;
			case 1:
				t.setText("1/40");
				ttisekato.setText("2.5%");
				apotelesma.setText("Δυστυχώς Κοπήκατε");
				break;
			case 2:
				t.setText("2/40");
				ttisekato.setText("5%");
				apotelesma.setText("Δυστυχώς Κοπήκατε");
				break;
			case 3:
				t.setText("3/40");
				ttisekato.setText("7.5%");
				apotelesma.setText("Δυστυχώς Κοπήκατε");
				break;
			case 4:
				t.setText("4/40");
				ttisekato.setText("10%");
				apotelesma.setText("Δυστυχώς Κοπήκατε");
				break;
			case 5:
				t.setText("5/40");
				ttisekato.setText("12.5%");
				apotelesma.setText("Δυστυχώς Κοπήκατε");
				break;
			case 6:
				t.setText("6/40");
				ttisekato.setText("15%");
				apotelesma.setText("Δυστυχώς Κοπήκατε");
				break;
			case 7:
				t.setText("7/40");
				ttisekato.setText("17.5%");
				apotelesma.setText("Δυστυχώς Κοπήκατε");
				break;
			case 8:
				t.setText("8/40");
				ttisekato.setText("20%");
				apotelesma.setText("Δυστυχώς Κοπήκατε");
				break;
			case 9:
				t.setText("9/40");
				ttisekato.setText("22.5%");
				apotelesma.setText("Δυστυχώς Κοπήκατε");
				break;
			case 10:
				t.setText("10/40");
				ttisekato.setText("25%");
				apotelesma.setText("Δυστυχώς Κοπήκατε");
				break;
			case 11:
				t.setText("11/40");
				ttisekato.setText("27.5%");
				apotelesma.setText("Δυστυχώς Κοπήκατε");
				break;
			case 12:
				t.setText("12/40");
				ttisekato.setText("30%");
				apotelesma.setText("Δυστυχώς Κοπήκατε");
				break;
			case 13:
				t.setText("13/40");
				ttisekato.setText("32.5%");
				apotelesma.setText("Δυστυχώς Κοπήκατε");
				break;
			case 14:
				t.setText("14/40");
				ttisekato.setText("35%");
				apotelesma.setText("Δυστυχώς Κοπήκατε");
				break;
			case 15:
				t.setText("15/40");
				ttisekato.setText("37.5%");
				apotelesma.setText("Δυστυχώς Κοπήκατε");
				break;
			case 16:
				t.setText("16/40");
				ttisekato.setText("40%");
				apotelesma.setText("Δυστυχώς Κοπήκατε");
				break;
			case 17:
				t.setText("17/50");
				ttisekato.setText("42.5%");
				apotelesma.setText("Δυστυχώς Κοπήκατε");
				break;
			case 18:
				t.setText("18/40");
				ttisekato.setText("45%");
				apotelesma.setText("Δυστυχώς Κοπήκατε");
				break;
			case 19:
				t.setText("19/40");
				ttisekato.setText("47.5%");
				apotelesma.setText("Δυστυχώς Κοπήκατε");
				break;
			case 20:
				t.setText("20/40");
				ttisekato.setText("50%");
				apotelesma.setText("Συγχαρητήρια Περάσατε");
				break;
			case 21:
				t.setText("21/50");
				ttisekato.setText("52.5%");
				apotelesma.setText("Συγχαρητήρια Περάσατε");
				break;
			case 22:
				t.setText("22/40");
				ttisekato.setText("55%");
				apotelesma.setText("Συγχαρητήρια Περάσατε");
				break;
			case 23:
				t.setText("23/40");
				ttisekato.setText("57.5%");
				apotelesma.setText("Συγχαρητήρια Περάσατε");
				break;
			case 24:
				t.setText("24/40");
				ttisekato.setText("60%");
				apotelesma.setText("Συγχαρητήρια Περάσατε");
				break;
			case 25:
				t.setText("25/40");
				ttisekato.setText("62.5%");
				apotelesma.setText("Συγχαρητήρια Περάσατε");
				break;
			case 26:
				t.setText("26/40");
				ttisekato.setText("65%");
				apotelesma.setText("Συγχαρητήρια Περάσατε");
				break;
			case 27:
				t.setText("27/40");
				ttisekato.setText("67.5%");
				apotelesma.setText("Συγχαρητήρια Περάσατε");
				break;
			case 28:
				t.setText("28/40");
				ttisekato.setText("70%");
				apotelesma.setText("Συγχαρητήρια Περάσατε");
				break;
			case 29:
				t.setText("29/40");
				ttisekato.setText("72.5%");
				apotelesma.setText("Συγχαρητήρια Περάσατε");
				break;
			case 30:
				t.setText("30/40");
				ttisekato.setText("75%");
				apotelesma.setText("Συγχαρητήρια Περάσατε");
				break;
			case 31:
				t.setText("31/40");
				ttisekato.setText("77.5%");
				apotelesma.setText("Συγχαρητήρια Περάσατε");
				break;
			case 32:
				t.setText("32/40");
				ttisekato.setText("80%");
				apotelesma.setText("Συγχαρητήρια Περάσατε");
				break;
			case 33:
				t.setText("33/40");
				ttisekato.setText("82.5%");
				apotelesma.setText("Συγχαρητήρια Περάσατε");
				break;
			case 34:
				t.setText("34/40");
				ttisekato.setText("85%");
				apotelesma.setText("Συγχαρητήρια Περάσατε");
				break;
			case 35:
				t.setText("35/40");
				ttisekato.setText("87.5%");
				apotelesma.setText("Συγχαρητήρια Περάσατε");
				break;
			case 36:
				t.setText("36/40");
				ttisekato.setText("90%");
				apotelesma.setText("Συγχαρητήρια Περάσατε");
				break;
			case 37:
				t.setText("37/40");
				ttisekato.setText("92.5%");
				apotelesma.setText("Συγχαρητήρια Περάσατε");
				break;
			case 38:
				t.setText("38/40");
				ttisekato.setText("95%");
				apotelesma.setText("Συγχαρητήρια Περάσατε");
				break;
			case 39:
				t.setText("39/40");
				ttisekato.setText("97.5%");
				apotelesma.setText("Συγχαρητήρια Περάσατε");
				break;
			case 40:
				t.setText("40/40");
				ttisekato.setText("100%");
				apotelesma.setText("Συγχαρητήρια Περάσατε");
				break;
			default:
				break;
		}
		
		
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_result, menu);
		return true;
	}
	
	private void sostaClick() {

		startActivity(new Intent("com.example.triviality.SostaResult_7"));
	}
	private void lathosClick() {

		startActivity(new Intent("com.example.triviality.LathosResult_7"));
	}
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.bSosta:
			sostaClick();
			break;
		case R.id.bLathos:
			lathosClick();
			break;
		default:
			break;
		
		}
	}
	
}


