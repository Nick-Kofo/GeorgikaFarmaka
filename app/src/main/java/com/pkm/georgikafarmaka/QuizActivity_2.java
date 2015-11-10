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

public class QuizActivity_2 extends Activity {
	List<Question_2> quesList_2;
	int score_2 = 0;
	int qid_2 = 0;
	// SOSTA STATIC
	public static String[] sostesEr_2 = new String[40];
	public static String[] sostesAp_2 = new String[40];
	public static Boolean[] sostesB_2 = new Boolean[] { true, false, false,
			false, false, false, false, false, false, false, false, false,
			false, false, false, false, false, false, false, false, false,
			false, false, false, false, false, false, false, false, false,
			false, false, false, false, false, false, false, false, false,
			false, false, false, false, false, false, false, false, false,
			false, false, false };
	//LATHOS STATIC
	public static String[] lathosEr_2 = new String[40];
	public static String[] lathosAp_2 = new String[40];
	public static String[] lathosXr_2 = new String[40];
	public static Boolean[] lathosB_2 = new Boolean[] { true, false, false,
			false, false, false, false, false, false, false, false, false,
			false, false, false, false, false, false, false, false, false,
			false, false, false, false, false, false, false, false, false,
			false, false, false, false, false, false, false, false, false,
			false, false, false, false, false, false, false, false, false,
			false, false, false };

	Question_2 currentQ_2;
	TextView txtQuestion, txtErotisi;
	RadioButton rda, rdb, rdc, rdd;
	Button butNext;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_quiz);
		DbHelper db = new DbHelper(this);
		quesList_2 = db.getAllQuestions_2();
		currentQ_2 = quesList_2.get(qid_2);
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
				Log.d("yourans", currentQ_2.getANSWER_2() + " " + answer.getText());
				if (currentQ_2.getANSWER_2().equals(answer.getText())) {
					if (sostesB_2[0] == true) {
						sostesEr_2[0] = currentQ_2.getQUESTION_2();
						sostesAp_2[0] = (String) answer.getText();
						sostesB_2[0] = false;
						sostesB_2[1] = true;
					} else if (sostesB_2[1] == true) {
						sostesEr_2[1] = currentQ_2.getQUESTION_2();
						sostesAp_2[1] = (String) answer.getText();
						sostesB_2[1] = false;
						sostesB_2[2] = true;
					} else if (sostesB_2[2] == true) {
						sostesEr_2[2] = currentQ_2.getQUESTION_2();
						sostesAp_2[2] = (String) answer.getText();
						sostesB_2[2] = false;
						sostesB_2[3] = true;
					} else if (sostesB_2[3] == true) {
						sostesEr_2[3] = currentQ_2.getQUESTION_2();
						sostesAp_2[3] = (String) answer.getText();
						sostesB_2[3] = false;
						sostesB_2[4] = true;
					} else if (sostesB_2[4] == true) {
						sostesEr_2[4] = currentQ_2.getQUESTION_2();
						sostesAp_2[4] = (String) answer.getText();
						sostesB_2[4] = false;
						sostesB_2[5] = true;
					} else if (sostesB_2[5] == true) {
						sostesEr_2[5] = currentQ_2.getQUESTION_2();
						sostesAp_2[5] = (String) answer.getText();
						sostesB_2[5] = false;
						sostesB_2[6] = true;
					} else if (sostesB_2[6] == true) {
						sostesEr_2[6] = currentQ_2.getQUESTION_2();
						sostesAp_2[6] = (String) answer.getText();
						sostesB_2[6] = false;
						sostesB_2[7] = true;
					} else if (sostesB_2[7] == true) {
						sostesEr_2[7] = currentQ_2.getQUESTION_2();
						sostesAp_2[7] = (String) answer.getText();
						sostesB_2[7] = false;
						sostesB_2[8] = true;
					} else if (sostesB_2[8] == true) {
						sostesEr_2[8] = currentQ_2.getQUESTION_2();
						sostesAp_2[8] = (String) answer.getText();
						sostesB_2[8] = false;
						sostesB_2[9] = true;
					} else if (sostesB_2[9] == true) {
						sostesEr_2[9] = currentQ_2.getQUESTION_2();
						sostesAp_2[9] = (String) answer.getText();
						sostesB_2[9] = false;
						sostesB_2[10] = true;
					} else if (sostesB_2[10] == true) {
						sostesEr_2[10] = currentQ_2.getQUESTION_2();
						sostesAp_2[10] = (String) answer.getText();
						sostesB_2[10] = false;
						sostesB_2[11] = true;
					} else if (sostesB_2[11] == true) {
						sostesEr_2[11] = currentQ_2.getQUESTION_2();
						sostesAp_2[11] = (String) answer.getText();
						sostesB_2[11] = false;
						sostesB_2[12] = true;
					} else if (sostesB_2[12] == true) {
						sostesEr_2[12] = currentQ_2.getQUESTION_2();
						sostesAp_2[12] = (String) answer.getText();
						sostesB_2[12] = false;
						sostesB_2[13] = true;
					} else if (sostesB_2[13] == true) {
						sostesEr_2[13] = currentQ_2.getQUESTION_2();
						sostesAp_2[13] = (String) answer.getText();
						sostesB_2[13] = false;
						sostesB_2[14] = true;
					} else if (sostesB_2[14] == true) {
						sostesEr_2[14] = currentQ_2.getQUESTION_2();
						sostesAp_2[14] = (String) answer.getText();
						sostesB_2[14] = false;
						sostesB_2[15] = true;
					} else if (sostesB_2[15] == true) {
						sostesEr_2[15] = currentQ_2.getQUESTION_2();
						sostesAp_2[15] = (String) answer.getText();
						sostesB_2[15] = false;
						sostesB_2[16] = true;
					} else if (sostesB_2[16] == true) {
						sostesEr_2[16] = currentQ_2.getQUESTION_2();
						sostesAp_2[16] = (String) answer.getText();
						sostesB_2[16] = false;
						sostesB_2[17] = true;
					} else if (sostesB_2[17] == true) {
						sostesEr_2[17] = currentQ_2.getQUESTION_2();
						sostesAp_2[17] = (String) answer.getText();
						sostesB_2[17] = false;
						sostesB_2[18] = true;
					} else if (sostesB_2[18] == true) {
						sostesEr_2[18] = currentQ_2.getQUESTION_2();
						sostesAp_2[18] = (String) answer.getText();
						sostesB_2[18] = false;
						sostesB_2[19] = true;
					} else if (sostesB_2[19] == true) {
						sostesEr_2[19] = currentQ_2.getQUESTION_2();
						sostesAp_2[19] = (String) answer.getText();
						sostesB_2[19] = false;
						sostesB_2[20] = true;
					} else if (sostesB_2[20] == true) {
						sostesEr_2[20] = currentQ_2.getQUESTION_2();
						sostesAp_2[20] = (String) answer.getText();
						sostesB_2[20] = false;
						sostesB_2[21] = true;
					} else if (sostesB_2[21] == true) {
						sostesEr_2[21] = currentQ_2.getQUESTION_2();
						sostesAp_2[21] = (String) answer.getText();
						sostesB_2[21] = false;
						sostesB_2[22] = true;
					} else if (sostesB_2[22] == true) {
						sostesEr_2[22] = currentQ_2.getQUESTION_2();
						sostesAp_2[22] = (String) answer.getText();
						sostesB_2[22] = false;
						sostesB_2[23] = true;
					} else if (sostesB_2[23] == true) {
						sostesEr_2[23] = currentQ_2.getQUESTION_2();
						sostesAp_2[23] = (String) answer.getText();
						sostesB_2[23] = false;
						sostesB_2[24] = true;
					} else if (sostesB_2[24] == true) {
						sostesEr_2[24] = currentQ_2.getQUESTION_2();
						sostesAp_2[24] = (String) answer.getText();
						sostesB_2[24] = false;
						sostesB_2[25] = true;
					} else if (sostesB_2[25] == true) {
						sostesEr_2[25] = currentQ_2.getQUESTION_2();
						sostesAp_2[25] = (String) answer.getText();
						sostesB_2[25] = false;
						sostesB_2[26] = true;
					} else if (sostesB_2[26] == true) {
						sostesEr_2[26] = currentQ_2.getQUESTION_2();
						sostesAp_2[26] = (String) answer.getText();
						sostesB_2[26] = false;
						sostesB_2[27] = true;
					} else if (sostesB_2[27] == true) {
						sostesEr_2[27] = currentQ_2.getQUESTION_2();
						sostesAp_2[27] = (String) answer.getText();
						sostesB_2[27] = false;
						sostesB_2[28] = true;
					} else if (sostesB_2[28] == true) {
						sostesEr_2[28] = currentQ_2.getQUESTION_2();
						sostesAp_2[28] = (String) answer.getText();
						sostesB_2[28] = false;
						sostesB_2[29] = true;
					} else if (sostesB_2[29] == true) {
						sostesEr_2[29] = currentQ_2.getQUESTION_2();
						sostesAp_2[29] = (String) answer.getText();
						sostesB_2[29] = false;
						sostesB_2[30] = true;
					} else if (sostesB_2[30] == true) {
						sostesEr_2[30] = currentQ_2.getQUESTION_2();
						sostesAp_2[30] = (String) answer.getText();
						sostesB_2[30] = false;
						sostesB_2[31] = true;
					} else if (sostesB_2[31] == true) {
						sostesEr_2[31] = currentQ_2.getQUESTION_2();
						sostesAp_2[31] = (String) answer.getText();
						sostesB_2[31] = false;
						sostesB_2[32] = true;
					} else if (sostesB_2[32] == true) {
						sostesEr_2[32] = currentQ_2.getQUESTION_2();
						sostesAp_2[32] = (String) answer.getText();
						sostesB_2[32] = false;
						sostesB_2[33] = true;
					} else if (sostesB_2[33] == true) {
						sostesEr_2[33] = currentQ_2.getQUESTION_2();
						sostesAp_2[33] = (String) answer.getText();
						sostesB_2[33] = false;
						sostesB_2[34] = true;
					} else if (sostesB_2[34] == true) {
						sostesEr_2[34] = currentQ_2.getQUESTION_2();
						sostesAp_2[34] = (String) answer.getText();
						sostesB_2[34] = false;
						sostesB_2[35] = true;
					} else if (sostesB_2[35] == true) {
						sostesEr_2[35] = currentQ_2.getQUESTION_2();
						sostesAp_2[35] = (String) answer.getText();
						sostesB_2[35] = false;
						sostesB_2[36] = true;
					} else if (sostesB_2[36] == true) {
						sostesEr_2[36] = currentQ_2.getQUESTION_2();
						sostesAp_2[36] = (String) answer.getText();
						sostesB_2[36] = false;
						sostesB_2[37] = true;
					} else if (sostesB_2[37] == true) {
						sostesEr_2[37] = currentQ_2.getQUESTION_2();
						sostesAp_2[37] = (String) answer.getText();
						sostesB_2[37] = false;
						sostesB_2[38] = true;
					} else if (sostesB_2[38] == true) {
						sostesEr_2[38] = currentQ_2.getQUESTION_2();
						sostesAp_2[38] = (String) answer.getText();
						sostesB_2[38] = false;
						sostesB_2[39] = true;
					} else if (sostesB_2[39] == true) {
						sostesEr_2[39] = currentQ_2.getQUESTION_2();
						sostesAp_2[39] = (String) answer.getText();
						sostesB_2[39] = false;
						sostesB_2[40] = true;
					} else if (sostesB_2[40] == true) {
						sostesEr_2[40] = currentQ_2.getQUESTION_2();
						sostesAp_2[40] = (String) answer.getText();
						sostesB_2[40] = false;
					}
					score_2++;
					Log.d("score", "Your score" + score_2);
				} else {
					if (lathosB_2[0] == true) {
						lathosEr_2[0] = currentQ_2.getQUESTION_2();
						lathosXr_2[0] = (String) answer.getText();
						lathosAp_2[0] = currentQ_2.getANSWER_2();
						lathosB_2[0] = false;
						lathosB_2[1] = true;
					} else if (lathosB_2[1] == true) {
						lathosEr_2[1] = currentQ_2.getQUESTION_2();
						lathosXr_2[1] = (String) answer.getText();
						lathosAp_2[1] = currentQ_2.getANSWER_2();
						lathosB_2[1] = false;
						lathosB_2[2] = true;
					} else if (lathosB_2[2] == true) {
						lathosEr_2[2] = currentQ_2.getQUESTION_2();
						lathosXr_2[2] = (String) answer.getText();
						lathosAp_2[2] = currentQ_2.getANSWER_2();
						lathosB_2[2] = false;
						lathosB_2[3] = true;
					} else if (lathosB_2[3] == true) {
						lathosEr_2[3] = currentQ_2.getQUESTION_2();
						lathosXr_2[3] = (String) answer.getText();
						lathosAp_2[3] = currentQ_2.getANSWER_2();
						lathosB_2[3] = false;
						lathosB_2[4] = true;
					} else if (lathosB_2[4] == true) {
						lathosEr_2[4] = currentQ_2.getQUESTION_2();
						lathosXr_2[4] = (String) answer.getText();
						lathosAp_2[4] = currentQ_2.getANSWER_2();
						lathosB_2[4] = false;
						lathosB_2[5] = true;
					} else if (lathosB_2[5] == true) {
						lathosEr_2[5] = currentQ_2.getQUESTION_2();
						lathosXr_2[5] = (String) answer.getText();
						lathosAp_2[5] = currentQ_2.getANSWER_2();
						lathosB_2[5] = false;
						lathosB_2[6] = true;
					} else if (lathosB_2[6] == true) {
						lathosEr_2[6] = currentQ_2.getQUESTION_2();
						lathosXr_2[6] = (String) answer.getText();
						lathosAp_2[6] = currentQ_2.getANSWER_2();
						lathosB_2[6] = false;
						lathosB_2[7] = true;
					} else if (lathosB_2[7] == true) {
						lathosEr_2[7] = currentQ_2.getQUESTION_2();
						lathosXr_2[7] = (String) answer.getText();
						lathosAp_2[7] = currentQ_2.getANSWER_2();
						lathosB_2[7] = false;
						lathosB_2[8] = true;
					} else if (lathosB_2[8] == true) {
						lathosEr_2[8] = currentQ_2.getQUESTION_2();
						lathosXr_2[8] = (String) answer.getText();
						lathosAp_2[8] = currentQ_2.getANSWER_2();
						lathosB_2[8] = false;
						lathosB_2[9] = true;
					} else if (lathosB_2[9] == true) {
						lathosEr_2[9] = currentQ_2.getQUESTION_2();
						lathosXr_2[9] = (String) answer.getText();
						lathosAp_2[9] = currentQ_2.getANSWER_2();
						lathosB_2[9] = false;
						lathosB_2[10] = true;
					} else if (lathosB_2[10] == true) {
						lathosEr_2[10] = currentQ_2.getQUESTION_2();
						lathosXr_2[10] = (String) answer.getText();
						lathosAp_2[10] = currentQ_2.getANSWER_2();
						lathosB_2[10] = false;
						lathosB_2[11] = true;
					} else if (lathosB_2[11] == true) {
						lathosEr_2[11] = currentQ_2.getQUESTION_2();
						lathosXr_2[11] = (String) answer.getText();
						lathosAp_2[11] = currentQ_2.getANSWER_2();
						lathosB_2[11] = false;
						lathosB_2[12] = true;
					} else if (lathosB_2[12] == true) {
						lathosEr_2[12] = currentQ_2.getQUESTION_2();
						lathosXr_2[12] = (String) answer.getText();
						lathosAp_2[12] = currentQ_2.getANSWER_2();
						lathosB_2[12] = false;
						lathosB_2[13] = true;
					} else if (lathosB_2[13] == true) {
						lathosEr_2[13] = currentQ_2.getQUESTION_2();
						lathosXr_2[13] = (String) answer.getText();
						lathosAp_2[13] = currentQ_2.getANSWER_2();
						lathosB_2[13] = false;
						lathosB_2[14] = true;
					} else if (lathosB_2[14] == true) {
						lathosEr_2[14] = currentQ_2.getQUESTION_2();
						lathosXr_2[14] = (String) answer.getText();
						lathosAp_2[14] = currentQ_2.getANSWER_2();
						lathosB_2[14] = false;
						lathosB_2[15] = true;
					} else if (lathosB_2[15] == true) {
						lathosEr_2[15] = currentQ_2.getQUESTION_2();
						lathosXr_2[15] = (String) answer.getText();
						lathosAp_2[15] = currentQ_2.getANSWER_2();
						lathosB_2[15] = false;
						lathosB_2[16] = true;
					} else if (lathosB_2[16] == true) {
						lathosEr_2[16] = currentQ_2.getQUESTION_2();
						lathosXr_2[16] = (String) answer.getText();
						lathosAp_2[16] = currentQ_2.getANSWER_2();
						lathosB_2[16] = false;
						lathosB_2[17] = true;
					} else if (lathosB_2[17] == true) {
						lathosEr_2[17] = currentQ_2.getQUESTION_2();
						lathosXr_2[17] = (String) answer.getText();
						lathosAp_2[17] = currentQ_2.getANSWER_2();
						lathosB_2[17] = false;
						lathosB_2[18] = true;
					} else if (lathosB_2[18] == true) {
						lathosEr_2[18] = currentQ_2.getQUESTION_2();
						lathosXr_2[18] = (String) answer.getText();
						lathosAp_2[18] = currentQ_2.getANSWER_2();
						lathosB_2[18] = false;
						lathosB_2[19] = true;
					} else if (lathosB_2[19] == true) {
						lathosEr_2[19] = currentQ_2.getQUESTION_2();
						lathosXr_2[19] = (String) answer.getText();
						lathosAp_2[19] = currentQ_2.getANSWER_2();
						lathosB_2[19] = false;
						lathosB_2[20] = true;
					} else if (lathosB_2[20] == true) {
						lathosEr_2[20] = currentQ_2.getQUESTION_2();
						lathosXr_2[20] = (String) answer.getText();
						lathosAp_2[20] = currentQ_2.getANSWER_2();
						lathosB_2[20] = false;
						lathosB_2[21] = true;
					} else if (lathosB_2[21] == true) {
						lathosEr_2[21] = currentQ_2.getQUESTION_2();
						lathosXr_2[21] = (String) answer.getText();
						lathosAp_2[21] = currentQ_2.getANSWER_2();
						lathosB_2[21] = false;
						lathosB_2[22] = true;
					} else if (lathosB_2[22] == true) {
						lathosEr_2[22] = currentQ_2.getQUESTION_2();
						lathosXr_2[22] = (String) answer.getText();
						lathosAp_2[22] = currentQ_2.getANSWER_2();
						lathosB_2[22] = false;
						lathosB_2[23] = true;
					} else if (lathosB_2[23] == true) {
						lathosEr_2[23] = currentQ_2.getQUESTION_2();
						lathosXr_2[23] = (String) answer.getText();
						lathosAp_2[23] = currentQ_2.getANSWER_2();
						lathosB_2[23] = false;
						lathosB_2[24] = true;
					} else if (lathosB_2[24] == true) {
						lathosEr_2[24] = currentQ_2.getQUESTION_2();
						lathosXr_2[24] = (String) answer.getText();
						lathosAp_2[24] = currentQ_2.getANSWER_2();
						lathosB_2[24] = false;
						lathosB_2[25] = true;
					} else if (lathosB_2[25] == true) {
						lathosEr_2[25] = currentQ_2.getQUESTION_2();
						lathosXr_2[25] = (String) answer.getText();
						lathosAp_2[25] = currentQ_2.getANSWER_2();
						lathosB_2[25] = false;
						lathosB_2[26] = true;
					} else if (lathosB_2[26] == true) {
						lathosEr_2[26] = currentQ_2.getQUESTION_2();
						lathosXr_2[26] = (String) answer.getText();
						lathosAp_2[26] = currentQ_2.getANSWER_2();
						lathosB_2[26] = false;
						lathosB_2[27] = true;
					} else if (lathosB_2[27] == true) {
						lathosEr_2[27] = currentQ_2.getQUESTION_2();
						lathosXr_2[27] = (String) answer.getText();
						lathosAp_2[27] = currentQ_2.getANSWER_2();
						lathosB_2[27] = false;
						lathosB_2[28] = true;
					} else if (lathosB_2[28] == true) {
						lathosEr_2[28] = currentQ_2.getQUESTION_2();
						lathosXr_2[28] = (String) answer.getText();
						lathosAp_2[28] = currentQ_2.getANSWER_2();
						lathosB_2[28] = false;
						lathosB_2[29] = true;
					} else if (lathosB_2[29] == true) {
						lathosEr_2[29] = currentQ_2.getQUESTION_2();
						lathosXr_2[29] = (String) answer.getText();
						lathosAp_2[29] = currentQ_2.getANSWER_2();
						lathosB_2[29] = false;
						lathosB_2[30] = true;
					} else if (lathosB_2[30] == true) {
						lathosEr_2[30] = currentQ_2.getQUESTION_2();
						lathosXr_2[30] = (String) answer.getText();
						lathosAp_2[30] = currentQ_2.getANSWER_2();
						lathosB_2[30] = false;
						lathosB_2[31] = true;
					} else if (lathosB_2[31] == true) {
						lathosEr_2[31] = currentQ_2.getQUESTION_2();
						lathosXr_2[31] = (String) answer.getText();
						lathosAp_2[31] = currentQ_2.getANSWER_2();
						lathosB_2[31] = false;
						lathosB_2[32] = true;
					} else if (lathosB_2[32] == true) {
						lathosEr_2[32] = currentQ_2.getQUESTION_2();
						lathosXr_2[32] = (String) answer.getText();
						lathosAp_2[32] = currentQ_2.getANSWER_2();
						lathosB_2[32] = false;
						lathosB_2[33] = true;
					} else if (lathosB_2[33] == true) {
						lathosEr_2[33] = currentQ_2.getQUESTION_2();
						lathosXr_2[33] = (String) answer.getText();
						lathosAp_2[33] = currentQ_2.getANSWER_2();
						lathosB_2[33] = false;
						lathosB_2[34] = true;
					} else if (lathosB_2[34] == true) {
						lathosEr_2[34] = currentQ_2.getQUESTION_2();
						lathosXr_2[34] = (String) answer.getText();
						lathosAp_2[34] = currentQ_2.getANSWER_2();
						lathosB_2[34] = false;
						lathosB_2[35] = true;
					} else if (lathosB_2[35] == true) {
						lathosEr_2[35] = currentQ_2.getQUESTION_2();
						lathosXr_2[35] = (String) answer.getText();
						lathosAp_2[35] = currentQ_2.getANSWER_2();
						lathosB_2[35] = false;
						lathosB_2[36] = true;
					} else if (lathosB_2[36] == true) {
						lathosEr_2[36] = currentQ_2.getQUESTION_2();
						lathosXr_2[36] = (String) answer.getText();
						lathosAp_2[36] = currentQ_2.getANSWER_2();
						lathosB_2[36] = false;
						lathosB_2[37] = true;
					} else if (lathosB_2[37] == true) {
						lathosEr_2[37] = currentQ_2.getQUESTION_2();
						lathosXr_2[37] = (String) answer.getText();
						lathosAp_2[37] = currentQ_2.getANSWER_2();
						lathosB_2[37] = false;
						lathosB_2[38] = true;
					} else if (lathosB_2[38] == true) {
						lathosEr_2[38] = currentQ_2.getQUESTION_2();
						lathosXr_2[38] = (String) answer.getText();
						lathosAp_2[38] = currentQ_2.getANSWER_2();
						lathosB_2[38] = false;
						lathosB_2[39] = true;
					} else if (lathosB_2[39] == true) {
						lathosEr_2[39] = currentQ_2.getQUESTION_2();
						lathosXr_2[39] = (String) answer.getText();
						lathosAp_2[39] = currentQ_2.getANSWER_2();
						lathosB_2[39] = false;
						lathosB_2[40] = true;
					} else if (lathosB_2[40] == true) {
						lathosEr_2[40] = currentQ_2.getQUESTION_2();
						lathosXr_2[40] = (String) answer.getText();
						lathosAp_2[40] = currentQ_2.getANSWER_2();
						lathosB_2[40] = false;
					}

				}
				if (qid_2 < 40) {
					txtErotisi.setText("Ερώτηση: " + (qid_2 + 1));
					currentQ_2 = quesList_2.get(qid_2);
					setQuestionView();
				} else {
					Intent intent = new Intent(QuizActivity_2.this,
							ResultActivity_2.class);
					Bundle b = new Bundle();
					b.putInt("score", score_2); // Your score
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
		txtQuestion.setText(currentQ_2.getQUESTION_2());
		rda.setText(currentQ_2.getOPTA_2());
		rdb.setText(currentQ_2.getOPTB_2());
		rdc.setText(currentQ_2.getOPTC_2());
		rdd.setText(currentQ_2.getOPTD_2());
		qid_2++;
	}
}
