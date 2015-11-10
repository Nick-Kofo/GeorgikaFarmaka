package com.pkm.georgikafarmaka;


import java.util.List;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class QuizActivity extends Activity {
	List<Question> quesList;
	int score = 0;
	int qid = 0;
	// SOSTA STATIC
	public static String[] sostesEr = new String[40];
	public static String[] sostesAp = new String[40];
	public static Boolean[] sostesB = new Boolean[] { true, false, false,
			false, false, false, false, false, false, false, false, false,
			false, false, false, false, false, false, false, false, false,
			false, false, false, false, false, false, false, false, false,
			false, false, false, false, false, false, false, false, false,
			false, false, false, false, false, false, false, false, false,
			false, false, false };
	//LATHOS STATIC
	public static String[] lathosEr = new String[40];
	public static String[] lathosAp = new String[40];
	public static String[] lathosXr = new String[40];
	public static Boolean[] lathosB = new Boolean[] { true, false, false,
			false, false, false, false, false, false, false, false, false,
			false, false, false, false, false, false, false, false, false,
			false, false, false, false, false, false, false, false, false,
			false, false, false, false, false, false, false, false, false,
			false, false, false, false, false, false, false, false, false,
			false, false, false };

	Question currentQ;
	TextView txtQuestion, txtErotisi;
	RadioButton rda, rdb, rdc, rdd;
	Button butNext;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_quiz);
		DbHelper db = new DbHelper(this);
		quesList = db.getAllQuestions();
		currentQ = quesList.get(qid);
		txtQuestion = (TextView) findViewById(R.id.textView1);
		txtErotisi = (TextView) findViewById(R.id.textErotisi);
		rda = (RadioButton) findViewById(R.id.radio0);
		rdb = (RadioButton) findViewById(R.id.radio1);
		rdc = (RadioButton) findViewById(R.id.radio2);
		rdd = (RadioButton) findViewById(R.id.radio3);
		butNext = (Button) findViewById(R.id.button1);
		setQuestionView();
		butNext.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				RadioGroup grp = (RadioGroup) findViewById(R.id.radioGroup1);
				RadioButton answer = (RadioButton) findViewById(grp
						.getCheckedRadioButtonId());
				Log.d("yourans", currentQ.getANSWER() + " " + answer.getText());
				if (currentQ.getANSWER().equals(answer.getText())) {
					if (sostesB[0] == true) {
						sostesEr[0] = currentQ.getQUESTION();
						sostesAp[0] = (String) answer.getText();
						sostesB[0] = false;
						sostesB[1] = true;
					} else if (sostesB[1] == true) {
						sostesEr[1] = currentQ.getQUESTION();
						sostesAp[1] = (String) answer.getText();
						sostesB[1] = false;
						sostesB[2] = true;
					} else if (sostesB[2] == true) {
						sostesEr[2] = currentQ.getQUESTION();
						sostesAp[2] = (String) answer.getText();
						sostesB[2] = false;
						sostesB[3] = true;
					} else if (sostesB[3] == true) {
						sostesEr[3] = currentQ.getQUESTION();
						sostesAp[3] = (String) answer.getText();
						sostesB[3] = false;
						sostesB[4] = true;
					} else if (sostesB[4] == true) {
						sostesEr[4] = currentQ.getQUESTION();
						sostesAp[4] = (String) answer.getText();
						sostesB[4] = false;
						sostesB[5] = true;
					} else if (sostesB[5] == true) {
						sostesEr[5] = currentQ.getQUESTION();
						sostesAp[5] = (String) answer.getText();
						sostesB[5] = false;
						sostesB[6] = true;
					} else if (sostesB[6] == true) {
						sostesEr[6] = currentQ.getQUESTION();
						sostesAp[6] = (String) answer.getText();
						sostesB[6] = false;
						sostesB[7] = true;
					} else if (sostesB[7] == true) {
						sostesEr[7] = currentQ.getQUESTION();
						sostesAp[7] = (String) answer.getText();
						sostesB[7] = false;
						sostesB[8] = true;
					} else if (sostesB[8] == true) {
						sostesEr[8] = currentQ.getQUESTION();
						sostesAp[8] = (String) answer.getText();
						sostesB[8] = false;
						sostesB[9] = true;
					} else if (sostesB[9] == true) {
						sostesEr[9] = currentQ.getQUESTION();
						sostesAp[9] = (String) answer.getText();
						sostesB[9] = false;
						sostesB[10] = true;
					} else if (sostesB[10] == true) {
						sostesEr[10] = currentQ.getQUESTION();
						sostesAp[10] = (String) answer.getText();
						sostesB[10] = false;
						sostesB[11] = true;
					} else if (sostesB[11] == true) {
						sostesEr[11] = currentQ.getQUESTION();
						sostesAp[11] = (String) answer.getText();
						sostesB[11] = false;
						sostesB[12] = true;
					} else if (sostesB[12] == true) {
						sostesEr[12] = currentQ.getQUESTION();
						sostesAp[12] = (String) answer.getText();
						sostesB[12] = false;
						sostesB[13] = true;
					} else if (sostesB[13] == true) {
						sostesEr[13] = currentQ.getQUESTION();
						sostesAp[13] = (String) answer.getText();
						sostesB[13] = false;
						sostesB[14] = true;
					} else if (sostesB[14] == true) {
						sostesEr[14] = currentQ.getQUESTION();
						sostesAp[14] = (String) answer.getText();
						sostesB[14] = false;
						sostesB[15] = true;
					} else if (sostesB[15] == true) {
						sostesEr[15] = currentQ.getQUESTION();
						sostesAp[15] = (String) answer.getText();
						sostesB[15] = false;
						sostesB[16] = true;
					} else if (sostesB[16] == true) {
						sostesEr[16] = currentQ.getQUESTION();
						sostesAp[16] = (String) answer.getText();
						sostesB[16] = false;
						sostesB[17] = true;
					} else if (sostesB[17] == true) {
						sostesEr[17] = currentQ.getQUESTION();
						sostesAp[17] = (String) answer.getText();
						sostesB[17] = false;
						sostesB[18] = true;
					} else if (sostesB[18] == true) {
						sostesEr[18] = currentQ.getQUESTION();
						sostesAp[18] = (String) answer.getText();
						sostesB[18] = false;
						sostesB[19] = true;
					} else if (sostesB[19] == true) {
						sostesEr[19] = currentQ.getQUESTION();
						sostesAp[19] = (String) answer.getText();
						sostesB[19] = false;
						sostesB[20] = true;
					} else if (sostesB[20] == true) {
						sostesEr[20] = currentQ.getQUESTION();
						sostesAp[20] = (String) answer.getText();
						sostesB[20] = false;
						sostesB[21] = true;
					} else if (sostesB[21] == true) {
						sostesEr[21] = currentQ.getQUESTION();
						sostesAp[21] = (String) answer.getText();
						sostesB[21] = false;
						sostesB[22] = true;
					} else if (sostesB[22] == true) {
						sostesEr[22] = currentQ.getQUESTION();
						sostesAp[22] = (String) answer.getText();
						sostesB[22] = false;
						sostesB[23] = true;
					} else if (sostesB[23] == true) {
						sostesEr[23] = currentQ.getQUESTION();
						sostesAp[23] = (String) answer.getText();
						sostesB[23] = false;
						sostesB[24] = true;
					} else if (sostesB[24] == true) {
						sostesEr[24] = currentQ.getQUESTION();
						sostesAp[24] = (String) answer.getText();
						sostesB[24] = false;
						sostesB[25] = true;
					} else if (sostesB[25] == true) {
						sostesEr[25] = currentQ.getQUESTION();
						sostesAp[25] = (String) answer.getText();
						sostesB[25] = false;
						sostesB[26] = true;
					} else if (sostesB[26] == true) {
						sostesEr[26] = currentQ.getQUESTION();
						sostesAp[26] = (String) answer.getText();
						sostesB[26] = false;
						sostesB[27] = true;
					} else if (sostesB[27] == true) {
						sostesEr[27] = currentQ.getQUESTION();
						sostesAp[27] = (String) answer.getText();
						sostesB[27] = false;
						sostesB[28] = true;
					} else if (sostesB[28] == true) {
						sostesEr[28] = currentQ.getQUESTION();
						sostesAp[28] = (String) answer.getText();
						sostesB[28] = false;
						sostesB[29] = true;
					} else if (sostesB[29] == true) {
						sostesEr[29] = currentQ.getQUESTION();
						sostesAp[29] = (String) answer.getText();
						sostesB[29] = false;
						sostesB[30] = true;
					} else if (sostesB[30] == true) {
						sostesEr[30] = currentQ.getQUESTION();
						sostesAp[30] = (String) answer.getText();
						sostesB[30] = false;
						sostesB[31] = true;
					} else if (sostesB[31] == true) {
						sostesEr[31] = currentQ.getQUESTION();
						sostesAp[31] = (String) answer.getText();
						sostesB[31] = false;
						sostesB[32] = true;
					} else if (sostesB[32] == true) {
						sostesEr[32] = currentQ.getQUESTION();
						sostesAp[32] = (String) answer.getText();
						sostesB[32] = false;
						sostesB[33] = true;
					} else if (sostesB[33] == true) {
						sostesEr[33] = currentQ.getQUESTION();
						sostesAp[33] = (String) answer.getText();
						sostesB[33] = false;
						sostesB[34] = true;
					} else if (sostesB[34] == true) {
						sostesEr[34] = currentQ.getQUESTION();
						sostesAp[34] = (String) answer.getText();
						sostesB[34] = false;
						sostesB[35] = true;
					} else if (sostesB[35] == true) {
						sostesEr[35] = currentQ.getQUESTION();
						sostesAp[35] = (String) answer.getText();
						sostesB[35] = false;
						sostesB[36] = true;
					} else if (sostesB[36] == true) {
						sostesEr[36] = currentQ.getQUESTION();
						sostesAp[36] = (String) answer.getText();
						sostesB[36] = false;
						sostesB[37] = true;
					} else if (sostesB[37] == true) {
						sostesEr[37] = currentQ.getQUESTION();
						sostesAp[37] = (String) answer.getText();
						sostesB[37] = false;
						sostesB[38] = true;
					} else if (sostesB[38] == true) {
						sostesEr[38] = currentQ.getQUESTION();
						sostesAp[38] = (String) answer.getText();
						sostesB[38] = false;
						sostesB[39] = true;
					} else if (sostesB[39] == true) {
						sostesEr[39] = currentQ.getQUESTION();
						sostesAp[39] = (String) answer.getText();
						sostesB[39] = false;
						sostesB[40] = true;
					} else if (sostesB[40] == true) {
						sostesEr[40] = currentQ.getQUESTION();
						sostesAp[40] = (String) answer.getText();
						sostesB[40] = false;
						sostesB[41] = true;
					}
					score++;
					Log.d("score", "Your score" + score);
				} else {
					if (lathosB[0] == true) {
						lathosEr[0] = currentQ.getQUESTION();
						lathosXr[0] = (String) answer.getText();
						lathosAp[0] = currentQ.getANSWER();
						lathosB[0] = false;
						lathosB[1] = true;
					} else if (lathosB[1] == true) {
						lathosEr[1] = currentQ.getQUESTION();
						lathosXr[1] = (String) answer.getText();
						lathosAp[1] = currentQ.getANSWER();
						lathosB[1] = false;
						lathosB[2] = true;
					} else if (lathosB[2] == true) {
						lathosEr[2] = currentQ.getQUESTION();
						lathosXr[2] = (String) answer.getText();
						lathosAp[2] = currentQ.getANSWER();
						lathosB[2] = false;
						lathosB[3] = true;
					} else if (lathosB[3] == true) {
						lathosEr[3] = currentQ.getQUESTION();
						lathosXr[3] = (String) answer.getText();
						lathosAp[3] = currentQ.getANSWER();
						lathosB[3] = false;
						lathosB[4] = true;
					} else if (lathosB[4] == true) {
						lathosEr[4] = currentQ.getQUESTION();
						lathosXr[4] = (String) answer.getText();
						lathosAp[4] = currentQ.getANSWER();
						lathosB[4] = false;
						lathosB[5] = true;
					} else if (lathosB[5] == true) {
						lathosEr[5] = currentQ.getQUESTION();
						lathosXr[5] = (String) answer.getText();
						lathosAp[5] = currentQ.getANSWER();
						lathosB[5] = false;
						lathosB[6] = true;
					} else if (lathosB[6] == true) {
						lathosEr[6] = currentQ.getQUESTION();
						lathosXr[6] = (String) answer.getText();
						lathosAp[6] = currentQ.getANSWER();
						lathosB[6] = false;
						lathosB[7] = true;
					} else if (lathosB[7] == true) {
						lathosEr[7] = currentQ.getQUESTION();
						lathosXr[7] = (String) answer.getText();
						lathosAp[7] = currentQ.getANSWER();
						lathosB[7] = false;
						lathosB[8] = true;
					} else if (lathosB[8] == true) {
						lathosEr[8] = currentQ.getQUESTION();
						lathosXr[8] = (String) answer.getText();
						lathosAp[8] = currentQ.getANSWER();
						lathosB[8] = false;
						lathosB[9] = true;
					} else if (lathosB[9] == true) {
						lathosEr[9] = currentQ.getQUESTION();
						lathosXr[9] = (String) answer.getText();
						lathosAp[9] = currentQ.getANSWER();
						lathosB[9] = false;
						lathosB[10] = true;
					} else if (lathosB[10] == true) {
						lathosEr[10] = currentQ.getQUESTION();
						lathosXr[10] = (String) answer.getText();
						lathosAp[10] = currentQ.getANSWER();
						lathosB[10] = false;
						lathosB[11] = true;
					} else if (lathosB[11] == true) {
						lathosEr[11] = currentQ.getQUESTION();
						lathosXr[11] = (String) answer.getText();
						lathosAp[11] = currentQ.getANSWER();
						lathosB[11] = false;
						lathosB[12] = true;
					} else if (lathosB[12] == true) {
						lathosEr[12] = currentQ.getQUESTION();
						lathosXr[12] = (String) answer.getText();
						lathosAp[12] = currentQ.getANSWER();
						lathosB[12] = false;
						lathosB[13] = true;
					} else if (lathosB[13] == true) {
						lathosEr[13] = currentQ.getQUESTION();
						lathosXr[13] = (String) answer.getText();
						lathosAp[13] = currentQ.getANSWER();
						lathosB[13] = false;
						lathosB[14] = true;
					} else if (lathosB[14] == true) {
						lathosEr[14] = currentQ.getQUESTION();
						lathosXr[14] = (String) answer.getText();
						lathosAp[14] = currentQ.getANSWER();
						lathosB[14] = false;
						lathosB[15] = true;
					} else if (lathosB[15] == true) {
						lathosEr[15] = currentQ.getQUESTION();
						lathosXr[15] = (String) answer.getText();
						lathosAp[15] = currentQ.getANSWER();
						lathosB[15] = false;
						lathosB[16] = true;
					} else if (lathosB[16] == true) {
						lathosEr[16] = currentQ.getQUESTION();
						lathosXr[16] = (String) answer.getText();
						lathosAp[16] = currentQ.getANSWER();
						lathosB[16] = false;
						lathosB[17] = true;
					} else if (lathosB[17] == true) {
						lathosEr[17] = currentQ.getQUESTION();
						lathosXr[17] = (String) answer.getText();
						lathosAp[17] = currentQ.getANSWER();
						lathosB[17] = false;
						lathosB[18] = true;
					} else if (lathosB[18] == true) {
						lathosEr[18] = currentQ.getQUESTION();
						lathosXr[18] = (String) answer.getText();
						lathosAp[18] = currentQ.getANSWER();
						lathosB[18] = false;
						lathosB[19] = true;
					} else if (lathosB[19] == true) {
						lathosEr[19] = currentQ.getQUESTION();
						lathosXr[19] = (String) answer.getText();
						lathosAp[19] = currentQ.getANSWER();
						lathosB[19] = false;
						lathosB[20] = true;
					} else if (lathosB[20] == true) {
						lathosEr[20] = currentQ.getQUESTION();
						lathosXr[20] = (String) answer.getText();
						lathosAp[20] = currentQ.getANSWER();
						lathosB[20] = false;
						lathosB[21] = true;
					} else if (lathosB[21] == true) {
						lathosEr[21] = currentQ.getQUESTION();
						lathosXr[21] = (String) answer.getText();
						lathosAp[21] = currentQ.getANSWER();
						lathosB[21] = false;
						lathosB[22] = true;
					} else if (lathosB[22] == true) {
						lathosEr[22] = currentQ.getQUESTION();
						lathosXr[22] = (String) answer.getText();
						lathosAp[22] = currentQ.getANSWER();
						lathosB[22] = false;
						lathosB[23] = true;
					} else if (lathosB[23] == true) {
						lathosEr[23] = currentQ.getQUESTION();
						lathosXr[23] = (String) answer.getText();
						lathosAp[23] = currentQ.getANSWER();
						lathosB[23] = false;
						lathosB[24] = true;
					} else if (lathosB[24] == true) {
						lathosEr[24] = currentQ.getQUESTION();
						lathosXr[24] = (String) answer.getText();
						lathosAp[24] = currentQ.getANSWER();
						lathosB[24] = false;
						lathosB[25] = true;
					} else if (lathosB[25] == true) {
						lathosEr[25] = currentQ.getQUESTION();
						lathosXr[25] = (String) answer.getText();
						lathosAp[25] = currentQ.getANSWER();
						lathosB[25] = false;
						lathosB[26] = true;
					} else if (lathosB[26] == true) {
						lathosEr[26] = currentQ.getQUESTION();
						lathosXr[26] = (String) answer.getText();
						lathosAp[26] = currentQ.getANSWER();
						lathosB[26] = false;
						lathosB[27] = true;
					} else if (lathosB[27] == true) {
						lathosEr[27] = currentQ.getQUESTION();
						lathosXr[27] = (String) answer.getText();
						lathosAp[27] = currentQ.getANSWER();
						lathosB[27] = false;
						lathosB[28] = true;
					} else if (lathosB[28] == true) {
						lathosEr[28] = currentQ.getQUESTION();
						lathosXr[28] = (String) answer.getText();
						lathosAp[28] = currentQ.getANSWER();
						lathosB[28] = false;
						lathosB[29] = true;
					} else if (lathosB[29] == true) {
						lathosEr[29] = currentQ.getQUESTION();
						lathosXr[29] = (String) answer.getText();
						lathosAp[29] = currentQ.getANSWER();
						lathosB[29] = false;
						lathosB[30] = true;
					} else if (lathosB[30] == true) {
						lathosEr[30] = currentQ.getQUESTION();
						lathosXr[30] = (String) answer.getText();
						lathosAp[30] = currentQ.getANSWER();
						lathosB[30] = false;
						lathosB[31] = true;
					} else if (lathosB[31] == true) {
						lathosEr[31] = currentQ.getQUESTION();
						lathosXr[31] = (String) answer.getText();
						lathosAp[31] = currentQ.getANSWER();
						lathosB[31] = false;
						lathosB[32] = true;
					} else if (lathosB[32] == true) {
						lathosEr[32] = currentQ.getQUESTION();
						lathosXr[32] = (String) answer.getText();
						lathosAp[32] = currentQ.getANSWER();
						lathosB[32] = false;
						lathosB[33] = true;
					} else if (lathosB[33] == true) {
						lathosEr[33] = currentQ.getQUESTION();
						lathosXr[33] = (String) answer.getText();
						lathosAp[33] = currentQ.getANSWER();
						lathosB[33] = false;
						lathosB[34] = true;
					} else if (lathosB[34] == true) {
						lathosEr[34] = currentQ.getQUESTION();
						lathosXr[34] = (String) answer.getText();
						lathosAp[34] = currentQ.getANSWER();
						lathosB[34] = false;
						lathosB[35] = true;
					} else if (lathosB[35] == true) {
						lathosEr[35] = currentQ.getQUESTION();
						lathosXr[35] = (String) answer.getText();
						lathosAp[35] = currentQ.getANSWER();
						lathosB[35] = false;
						lathosB[36] = true;
					} else if (lathosB[36] == true) {
						lathosEr[36] = currentQ.getQUESTION();
						lathosXr[36] = (String) answer.getText();
						lathosAp[36] = currentQ.getANSWER();
						lathosB[36] = false;
						lathosB[37] = true;
					} else if (lathosB[37] == true) {
						lathosEr[37] = currentQ.getQUESTION();
						lathosXr[37] = (String) answer.getText();
						lathosAp[37] = currentQ.getANSWER();
						lathosB[37] = false;
						lathosB[38] = true;
					} else if (lathosB[38] == true) {
						lathosEr[38] = currentQ.getQUESTION();
						lathosXr[38] = (String) answer.getText();
						lathosAp[38] = currentQ.getANSWER();
						lathosB[38] = false;
						lathosB[39] = true;
					} else if (lathosB[39] == true) {
						lathosEr[39] = currentQ.getQUESTION();
						lathosXr[39] = (String) answer.getText();
						lathosAp[39] = currentQ.getANSWER();
						lathosB[39] = false;
						lathosB[40] = true;
					} else if (lathosB[40] == true) {
						lathosEr[40] = currentQ.getQUESTION();
						lathosXr[40] = (String) answer.getText();
						lathosAp[40] = currentQ.getANSWER();
						lathosB[40] = false;
					}

				}
				if (qid < 40) {
					txtErotisi.setText("Ερώτηση: " + (qid + 1));
					currentQ = quesList.get(qid);
					setQuestionView();
				} else {
					Intent intent = new Intent(QuizActivity.this,
							ResultActivity.class);
					Bundle b = new Bundle();
					b.putInt("score", score); // Your score
					intent.putExtras(b); // Put your score to your next Intent
					startActivity(intent);
					finish();
				}
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_quiz, menu);
		return true;
	}

	private void setQuestionView() {
		txtQuestion.setText(currentQ.getQUESTION());
		rda.setText(currentQ.getOPTA());
		rdb.setText(currentQ.getOPTB());
		rdc.setText(currentQ.getOPTC());
		rdd.setText(currentQ.getOPTD());
		qid++;
	}
}
