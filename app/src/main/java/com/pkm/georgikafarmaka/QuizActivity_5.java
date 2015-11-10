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

public class QuizActivity_5 extends Activity {
	List<Question_5> quesList_5;
	int score_5 = 0;
	int qid_5 = 0;
	// SOSTA STATIC
	public static String[] sostesEr_5 = new String[40];
	public static String[] sostesAp_5 = new String[40];
	public static Boolean[] sostesB_5 = new Boolean[] { true, false, false,
			false, false, false, false, false, false, false, false, false,
			false, false, false, false, false, false, false, false, false,
			false, false, false, false, false, false, false, false, false,
			false, false, false, false, false, false, false, false, false,
			false, false, false, false, false, false, false, false, false,
			false, false, false };
	//LATHOS STATIC
	public static String[] lathosEr_5 = new String[40];
	public static String[] lathosAp_5 = new String[40];
	public static String[] lathosXr_5 = new String[40];
	public static Boolean[] lathosB_5 = new Boolean[] { true, false, false,
			false, false, false, false, false, false, false, false, false,
			false, false, false, false, false, false, false, false, false,
			false, false, false, false, false, false, false, false, false,
			false, false, false, false, false, false, false, false, false,
			false, false, false, false, false, false, false, false, false,
			false, false, false };

	Question_5 currentQ_5;
	TextView txtQuestion, txtErotisi;
	RadioButton rda, rdb, rdc, rdd;
	Button butNext;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_quiz);
		DbHelper db = new DbHelper(this);
		quesList_5 = db.getAllQuestions_5();
		currentQ_5 = quesList_5.get(qid_5);
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
				Log.d("yourans", currentQ_5.getANSWER_5() + " " + answer.getText());
				if (currentQ_5.getANSWER_5().equals(answer.getText())) {
					if (sostesB_5[0] == true) {
						sostesEr_5[0] = currentQ_5.getQUESTION_5();
						sostesAp_5[0] = (String) answer.getText();
						sostesB_5[0] = false;
						sostesB_5[1] = true;
					} else if (sostesB_5[1] == true) {
						sostesEr_5[1] = currentQ_5.getQUESTION_5();
						sostesAp_5[1] = (String) answer.getText();
						sostesB_5[1] = false;
						sostesB_5[2] = true;
					} else if (sostesB_5[2] == true) {
						sostesEr_5[2] = currentQ_5.getQUESTION_5();
						sostesAp_5[2] = (String) answer.getText();
						sostesB_5[2] = false;
						sostesB_5[3] = true;
					} else if (sostesB_5[3] == true) {
						sostesEr_5[3] = currentQ_5.getQUESTION_5();
						sostesAp_5[3] = (String) answer.getText();
						sostesB_5[3] = false;
						sostesB_5[4] = true;
					} else if (sostesB_5[4] == true) {
						sostesEr_5[4] = currentQ_5.getQUESTION_5();
						sostesAp_5[4] = (String) answer.getText();
						sostesB_5[4] = false;
						sostesB_5[5] = true;
					} else if (sostesB_5[5] == true) {
						sostesEr_5[5] = currentQ_5.getQUESTION_5();
						sostesAp_5[5] = (String) answer.getText();
						sostesB_5[5] = false;
						sostesB_5[6] = true;
					} else if (sostesB_5[6] == true) {
						sostesEr_5[6] = currentQ_5.getQUESTION_5();
						sostesAp_5[6] = (String) answer.getText();
						sostesB_5[6] = false;
						sostesB_5[7] = true;
					} else if (sostesB_5[7] == true) {
						sostesEr_5[7] = currentQ_5.getQUESTION_5();
						sostesAp_5[7] = (String) answer.getText();
						sostesB_5[7] = false;
						sostesB_5[8] = true;
					} else if (sostesB_5[8] == true) {
						sostesEr_5[8] = currentQ_5.getQUESTION_5();
						sostesAp_5[8] = (String) answer.getText();
						sostesB_5[8] = false;
						sostesB_5[9] = true;
					} else if (sostesB_5[9] == true) {
						sostesEr_5[9] = currentQ_5.getQUESTION_5();
						sostesAp_5[9] = (String) answer.getText();
						sostesB_5[9] = false;
						sostesB_5[10] = true;
					} else if (sostesB_5[10] == true) {
						sostesEr_5[10] = currentQ_5.getQUESTION_5();
						sostesAp_5[10] = (String) answer.getText();
						sostesB_5[10] = false;
						sostesB_5[11] = true;
					} else if (sostesB_5[11] == true) {
						sostesEr_5[11] = currentQ_5.getQUESTION_5();
						sostesAp_5[11] = (String) answer.getText();
						sostesB_5[11] = false;
						sostesB_5[12] = true;
					} else if (sostesB_5[12] == true) {
						sostesEr_5[12] = currentQ_5.getQUESTION_5();
						sostesAp_5[12] = (String) answer.getText();
						sostesB_5[12] = false;
						sostesB_5[13] = true;
					} else if (sostesB_5[13] == true) {
						sostesEr_5[13] = currentQ_5.getQUESTION_5();
						sostesAp_5[13] = (String) answer.getText();
						sostesB_5[13] = false;
						sostesB_5[14] = true;
					} else if (sostesB_5[14] == true) {
						sostesEr_5[14] = currentQ_5.getQUESTION_5();
						sostesAp_5[14] = (String) answer.getText();
						sostesB_5[14] = false;
						sostesB_5[15] = true;
					} else if (sostesB_5[15] == true) {
						sostesEr_5[15] = currentQ_5.getQUESTION_5();
						sostesAp_5[15] = (String) answer.getText();
						sostesB_5[15] = false;
						sostesB_5[16] = true;
					} else if (sostesB_5[16] == true) {
						sostesEr_5[16] = currentQ_5.getQUESTION_5();
						sostesAp_5[16] = (String) answer.getText();
						sostesB_5[16] = false;
						sostesB_5[17] = true;
					} else if (sostesB_5[17] == true) {
						sostesEr_5[17] = currentQ_5.getQUESTION_5();
						sostesAp_5[17] = (String) answer.getText();
						sostesB_5[17] = false;
						sostesB_5[18] = true;
					} else if (sostesB_5[18] == true) {
						sostesEr_5[18] = currentQ_5.getQUESTION_5();
						sostesAp_5[18] = (String) answer.getText();
						sostesB_5[18] = false;
						sostesB_5[19] = true;
					} else if (sostesB_5[19] == true) {
						sostesEr_5[19] = currentQ_5.getQUESTION_5();
						sostesAp_5[19] = (String) answer.getText();
						sostesB_5[19] = false;
						sostesB_5[20] = true;
					} else if (sostesB_5[20] == true) {
						sostesEr_5[20] = currentQ_5.getQUESTION_5();
						sostesAp_5[20] = (String) answer.getText();
						sostesB_5[20] = false;
						sostesB_5[21] = true;
					} else if (sostesB_5[21] == true) {
						sostesEr_5[21] = currentQ_5.getQUESTION_5();
						sostesAp_5[21] = (String) answer.getText();
						sostesB_5[21] = false;
						sostesB_5[22] = true;
					} else if (sostesB_5[22] == true) {
						sostesEr_5[22] = currentQ_5.getQUESTION_5();
						sostesAp_5[22] = (String) answer.getText();
						sostesB_5[22] = false;
						sostesB_5[23] = true;
					} else if (sostesB_5[23] == true) {
						sostesEr_5[23] = currentQ_5.getQUESTION_5();
						sostesAp_5[23] = (String) answer.getText();
						sostesB_5[23] = false;
						sostesB_5[24] = true;
					} else if (sostesB_5[24] == true) {
						sostesEr_5[24] = currentQ_5.getQUESTION_5();
						sostesAp_5[24] = (String) answer.getText();
						sostesB_5[24] = false;
						sostesB_5[25] = true;
					} else if (sostesB_5[25] == true) {
						sostesEr_5[25] = currentQ_5.getQUESTION_5();
						sostesAp_5[25] = (String) answer.getText();
						sostesB_5[25] = false;
						sostesB_5[26] = true;
					} else if (sostesB_5[26] == true) {
						sostesEr_5[26] = currentQ_5.getQUESTION_5();
						sostesAp_5[26] = (String) answer.getText();
						sostesB_5[26] = false;
						sostesB_5[27] = true;
					} else if (sostesB_5[27] == true) {
						sostesEr_5[27] = currentQ_5.getQUESTION_5();
						sostesAp_5[27] = (String) answer.getText();
						sostesB_5[27] = false;
						sostesB_5[28] = true;
					} else if (sostesB_5[28] == true) {
						sostesEr_5[28] = currentQ_5.getQUESTION_5();
						sostesAp_5[28] = (String) answer.getText();
						sostesB_5[28] = false;
						sostesB_5[29] = true;
					} else if (sostesB_5[29] == true) {
						sostesEr_5[29] = currentQ_5.getQUESTION_5();
						sostesAp_5[29] = (String) answer.getText();
						sostesB_5[29] = false;
						sostesB_5[30] = true;
					} else if (sostesB_5[30] == true) {
						sostesEr_5[30] = currentQ_5.getQUESTION_5();
						sostesAp_5[30] = (String) answer.getText();
						sostesB_5[30] = false;
						sostesB_5[31] = true;
					} else if (sostesB_5[31] == true) {
						sostesEr_5[31] = currentQ_5.getQUESTION_5();
						sostesAp_5[31] = (String) answer.getText();
						sostesB_5[31] = false;
						sostesB_5[32] = true;
					} else if (sostesB_5[32] == true) {
						sostesEr_5[32] = currentQ_5.getQUESTION_5();
						sostesAp_5[32] = (String) answer.getText();
						sostesB_5[32] = false;
						sostesB_5[33] = true;
					} else if (sostesB_5[33] == true) {
						sostesEr_5[33] = currentQ_5.getQUESTION_5();
						sostesAp_5[33] = (String) answer.getText();
						sostesB_5[33] = false;
						sostesB_5[34] = true;
					} else if (sostesB_5[34] == true) {
						sostesEr_5[34] = currentQ_5.getQUESTION_5();
						sostesAp_5[34] = (String) answer.getText();
						sostesB_5[34] = false;
						sostesB_5[35] = true;
					} else if (sostesB_5[35] == true) {
						sostesEr_5[35] = currentQ_5.getQUESTION_5();
						sostesAp_5[35] = (String) answer.getText();
						sostesB_5[35] = false;
						sostesB_5[36] = true;
					} else if (sostesB_5[36] == true) {
						sostesEr_5[36] = currentQ_5.getQUESTION_5();
						sostesAp_5[36] = (String) answer.getText();
						sostesB_5[36] = false;
						sostesB_5[37] = true;
					} else if (sostesB_5[37] == true) {
						sostesEr_5[37] = currentQ_5.getQUESTION_5();
						sostesAp_5[37] = (String) answer.getText();
						sostesB_5[37] = false;
						sostesB_5[38] = true;
					} else if (sostesB_5[38] == true) {
						sostesEr_5[38] = currentQ_5.getQUESTION_5();
						sostesAp_5[38] = (String) answer.getText();
						sostesB_5[38] = false;
						sostesB_5[39] = true;
					} else if (sostesB_5[39] == true) {
						sostesEr_5[39] = currentQ_5.getQUESTION_5();
						sostesAp_5[39] = (String) answer.getText();
						sostesB_5[39] = false;
						sostesB_5[40] = true;
					} else if (sostesB_5[40] == true) {
						sostesEr_5[40] = currentQ_5.getQUESTION_5();
						sostesAp_5[40] = (String) answer.getText();
						sostesB_5[40] = false;
					}
					score_5++;
					Log.d("score", "Your score" + score_5);
				} else {
					if (lathosB_5[0] == true) {
						lathosEr_5[0] = currentQ_5.getQUESTION_5();
						lathosXr_5[0] = (String) answer.getText();
						lathosAp_5[0] = currentQ_5.getANSWER_5();
						lathosB_5[0] = false;
						lathosB_5[1] = true;
					} else if (lathosB_5[1] == true) {
						lathosEr_5[1] = currentQ_5.getQUESTION_5();
						lathosXr_5[1] = (String) answer.getText();
						lathosAp_5[1] = currentQ_5.getANSWER_5();
						lathosB_5[1] = false;
						lathosB_5[2] = true;
					} else if (lathosB_5[2] == true) {
						lathosEr_5[2] = currentQ_5.getQUESTION_5();
						lathosXr_5[2] = (String) answer.getText();
						lathosAp_5[2] = currentQ_5.getANSWER_5();
						lathosB_5[2] = false;
						lathosB_5[3] = true;
					} else if (lathosB_5[3] == true) {
						lathosEr_5[3] = currentQ_5.getQUESTION_5();
						lathosXr_5[3] = (String) answer.getText();
						lathosAp_5[3] = currentQ_5.getANSWER_5();
						lathosB_5[3] = false;
						lathosB_5[4] = true;
					} else if (lathosB_5[4] == true) {
						lathosEr_5[4] = currentQ_5.getQUESTION_5();
						lathosXr_5[4] = (String) answer.getText();
						lathosAp_5[4] = currentQ_5.getANSWER_5();
						lathosB_5[4] = false;
						lathosB_5[5] = true;
					} else if (lathosB_5[5] == true) {
						lathosEr_5[5] = currentQ_5.getQUESTION_5();
						lathosXr_5[5] = (String) answer.getText();
						lathosAp_5[5] = currentQ_5.getANSWER_5();
						lathosB_5[5] = false;
						lathosB_5[6] = true;
					} else if (lathosB_5[6] == true) {
						lathosEr_5[6] = currentQ_5.getQUESTION_5();
						lathosXr_5[6] = (String) answer.getText();
						lathosAp_5[6] = currentQ_5.getANSWER_5();
						lathosB_5[6] = false;
						lathosB_5[7] = true;
					} else if (lathosB_5[7] == true) {
						lathosEr_5[7] = currentQ_5.getQUESTION_5();
						lathosXr_5[7] = (String) answer.getText();
						lathosAp_5[7] = currentQ_5.getANSWER_5();
						lathosB_5[7] = false;
						lathosB_5[8] = true;
					} else if (lathosB_5[8] == true) {
						lathosEr_5[8] = currentQ_5.getQUESTION_5();
						lathosXr_5[8] = (String) answer.getText();
						lathosAp_5[8] = currentQ_5.getANSWER_5();
						lathosB_5[8] = false;
						lathosB_5[9] = true;
					} else if (lathosB_5[9] == true) {
						lathosEr_5[9] = currentQ_5.getQUESTION_5();
						lathosXr_5[9] = (String) answer.getText();
						lathosAp_5[9] = currentQ_5.getANSWER_5();
						lathosB_5[9] = false;
						lathosB_5[10] = true;
					} else if (lathosB_5[10] == true) {
						lathosEr_5[10] = currentQ_5.getQUESTION_5();
						lathosXr_5[10] = (String) answer.getText();
						lathosAp_5[10] = currentQ_5.getANSWER_5();
						lathosB_5[10] = false;
						lathosB_5[11] = true;
					} else if (lathosB_5[11] == true) {
						lathosEr_5[11] = currentQ_5.getQUESTION_5();
						lathosXr_5[11] = (String) answer.getText();
						lathosAp_5[11] = currentQ_5.getANSWER_5();
						lathosB_5[11] = false;
						lathosB_5[12] = true;
					} else if (lathosB_5[12] == true) {
						lathosEr_5[12] = currentQ_5.getQUESTION_5();
						lathosXr_5[12] = (String) answer.getText();
						lathosAp_5[12] = currentQ_5.getANSWER_5();
						lathosB_5[12] = false;
						lathosB_5[13] = true;
					} else if (lathosB_5[13] == true) {
						lathosEr_5[13] = currentQ_5.getQUESTION_5();
						lathosXr_5[13] = (String) answer.getText();
						lathosAp_5[13] = currentQ_5.getANSWER_5();
						lathosB_5[13] = false;
						lathosB_5[14] = true;
					} else if (lathosB_5[14] == true) {
						lathosEr_5[14] = currentQ_5.getQUESTION_5();
						lathosXr_5[14] = (String) answer.getText();
						lathosAp_5[14] = currentQ_5.getANSWER_5();
						lathosB_5[14] = false;
						lathosB_5[15] = true;
					} else if (lathosB_5[15] == true) {
						lathosEr_5[15] = currentQ_5.getQUESTION_5();
						lathosXr_5[15] = (String) answer.getText();
						lathosAp_5[15] = currentQ_5.getANSWER_5();
						lathosB_5[15] = false;
						lathosB_5[16] = true;
					} else if (lathosB_5[16] == true) {
						lathosEr_5[16] = currentQ_5.getQUESTION_5();
						lathosXr_5[16] = (String) answer.getText();
						lathosAp_5[16] = currentQ_5.getANSWER_5();
						lathosB_5[16] = false;
						lathosB_5[17] = true;
					} else if (lathosB_5[17] == true) {
						lathosEr_5[17] = currentQ_5.getQUESTION_5();
						lathosXr_5[17] = (String) answer.getText();
						lathosAp_5[17] = currentQ_5.getANSWER_5();
						lathosB_5[17] = false;
						lathosB_5[18] = true;
					} else if (lathosB_5[18] == true) {
						lathosEr_5[18] = currentQ_5.getQUESTION_5();
						lathosXr_5[18] = (String) answer.getText();
						lathosAp_5[18] = currentQ_5.getANSWER_5();
						lathosB_5[18] = false;
						lathosB_5[19] = true;
					} else if (lathosB_5[19] == true) {
						lathosEr_5[19] = currentQ_5.getQUESTION_5();
						lathosXr_5[19] = (String) answer.getText();
						lathosAp_5[19] = currentQ_5.getANSWER_5();
						lathosB_5[19] = false;
						lathosB_5[20] = true;
					} else if (lathosB_5[20] == true) {
						lathosEr_5[20] = currentQ_5.getQUESTION_5();
						lathosXr_5[20] = (String) answer.getText();
						lathosAp_5[20] = currentQ_5.getANSWER_5();
						lathosB_5[20] = false;
						lathosB_5[21] = true;
					} else if (lathosB_5[21] == true) {
						lathosEr_5[21] = currentQ_5.getQUESTION_5();
						lathosXr_5[21] = (String) answer.getText();
						lathosAp_5[21] = currentQ_5.getANSWER_5();
						lathosB_5[21] = false;
						lathosB_5[22] = true;
					} else if (lathosB_5[22] == true) {
						lathosEr_5[22] = currentQ_5.getQUESTION_5();
						lathosXr_5[22] = (String) answer.getText();
						lathosAp_5[22] = currentQ_5.getANSWER_5();
						lathosB_5[22] = false;
						lathosB_5[23] = true;
					} else if (lathosB_5[23] == true) {
						lathosEr_5[23] = currentQ_5.getQUESTION_5();
						lathosXr_5[23] = (String) answer.getText();
						lathosAp_5[23] = currentQ_5.getANSWER_5();
						lathosB_5[23] = false;
						lathosB_5[24] = true;
					} else if (lathosB_5[24] == true) {
						lathosEr_5[24] = currentQ_5.getQUESTION_5();
						lathosXr_5[24] = (String) answer.getText();
						lathosAp_5[24] = currentQ_5.getANSWER_5();
						lathosB_5[24] = false;
						lathosB_5[25] = true;
					} else if (lathosB_5[25] == true) {
						lathosEr_5[25] = currentQ_5.getQUESTION_5();
						lathosXr_5[25] = (String) answer.getText();
						lathosAp_5[25] = currentQ_5.getANSWER_5();
						lathosB_5[25] = false;
						lathosB_5[26] = true;
					} else if (lathosB_5[26] == true) {
						lathosEr_5[26] = currentQ_5.getQUESTION_5();
						lathosXr_5[26] = (String) answer.getText();
						lathosAp_5[26] = currentQ_5.getANSWER_5();
						lathosB_5[26] = false;
						lathosB_5[27] = true;
					} else if (lathosB_5[27] == true) {
						lathosEr_5[27] = currentQ_5.getQUESTION_5();
						lathosXr_5[27] = (String) answer.getText();
						lathosAp_5[27] = currentQ_5.getANSWER_5();
						lathosB_5[27] = false;
						lathosB_5[28] = true;
					} else if (lathosB_5[28] == true) {
						lathosEr_5[28] = currentQ_5.getQUESTION_5();
						lathosXr_5[28] = (String) answer.getText();
						lathosAp_5[28] = currentQ_5.getANSWER_5();
						lathosB_5[28] = false;
						lathosB_5[29] = true;
					} else if (lathosB_5[29] == true) {
						lathosEr_5[29] = currentQ_5.getQUESTION_5();
						lathosXr_5[29] = (String) answer.getText();
						lathosAp_5[29] = currentQ_5.getANSWER_5();
						lathosB_5[29] = false;
						lathosB_5[30] = true;
					} else if (lathosB_5[30] == true) {
						lathosEr_5[30] = currentQ_5.getQUESTION_5();
						lathosXr_5[30] = (String) answer.getText();
						lathosAp_5[30] = currentQ_5.getANSWER_5();
						lathosB_5[30] = false;
						lathosB_5[31] = true;
					} else if (lathosB_5[31] == true) {
						lathosEr_5[31] = currentQ_5.getQUESTION_5();
						lathosXr_5[31] = (String) answer.getText();
						lathosAp_5[31] = currentQ_5.getANSWER_5();
						lathosB_5[31] = false;
						lathosB_5[32] = true;
					} else if (lathosB_5[32] == true) {
						lathosEr_5[32] = currentQ_5.getQUESTION_5();
						lathosXr_5[32] = (String) answer.getText();
						lathosAp_5[32] = currentQ_5.getANSWER_5();
						lathosB_5[32] = false;
						lathosB_5[33] = true;
					} else if (lathosB_5[33] == true) {
						lathosEr_5[33] = currentQ_5.getQUESTION_5();
						lathosXr_5[33] = (String) answer.getText();
						lathosAp_5[33] = currentQ_5.getANSWER_5();
						lathosB_5[33] = false;
						lathosB_5[34] = true;
					} else if (lathosB_5[34] == true) {
						lathosEr_5[34] = currentQ_5.getQUESTION_5();
						lathosXr_5[34] = (String) answer.getText();
						lathosAp_5[34] = currentQ_5.getANSWER_5();
						lathosB_5[34] = false;
						lathosB_5[35] = true;
					} else if (lathosB_5[35] == true) {
						lathosEr_5[35] = currentQ_5.getQUESTION_5();
						lathosXr_5[35] = (String) answer.getText();
						lathosAp_5[35] = currentQ_5.getANSWER_5();
						lathosB_5[35] = false;
						lathosB_5[36] = true;
					} else if (lathosB_5[36] == true) {
						lathosEr_5[36] = currentQ_5.getQUESTION_5();
						lathosXr_5[36] = (String) answer.getText();
						lathosAp_5[36] = currentQ_5.getANSWER_5();
						lathosB_5[36] = false;
						lathosB_5[37] = true;
					} else if (lathosB_5[37] == true) {
						lathosEr_5[37] = currentQ_5.getQUESTION_5();
						lathosXr_5[37] = (String) answer.getText();
						lathosAp_5[37] = currentQ_5.getANSWER_5();
						lathosB_5[37] = false;
						lathosB_5[38] = true;
					} else if (lathosB_5[38] == true) {
						lathosEr_5[38] = currentQ_5.getQUESTION_5();
						lathosXr_5[38] = (String) answer.getText();
						lathosAp_5[38] = currentQ_5.getANSWER_5();
						lathosB_5[38] = false;
						lathosB_5[39] = true;
					} else if (lathosB_5[39] == true) {
						lathosEr_5[39] = currentQ_5.getQUESTION_5();
						lathosXr_5[39] = (String) answer.getText();
						lathosAp_5[39] = currentQ_5.getANSWER_5();
						lathosB_5[39] = false;
						lathosB_5[40] = true;
					} else if (lathosB_5[40] == true) {
						lathosEr_5[40] = currentQ_5.getQUESTION_5();
						lathosXr_5[40] = (String) answer.getText();
						lathosAp_5[40] = currentQ_5.getANSWER_5();
						lathosB_5[40] = false;
					}

				}
				if (qid_5 < 40) {
					txtErotisi.setText("Ερώτηση: " + (qid_5 + 1));
					currentQ_5 = quesList_5.get(qid_5);
					setQuestionView();
				} else {
					Intent intent = new Intent(QuizActivity_5.this,
							ResultActivity_5.class);
					Bundle b = new Bundle();
					b.putInt("score", score_5); // Your score
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
		txtQuestion.setText(currentQ_5.getQUESTION_5());
		rda.setText(currentQ_5.getOPTA_5());
		rdb.setText(currentQ_5.getOPTB_5());
		rdc.setText(currentQ_5.getOPTC_5());
		rdd.setText(currentQ_5.getOPTD_5());
		qid_5++;
	}
}
