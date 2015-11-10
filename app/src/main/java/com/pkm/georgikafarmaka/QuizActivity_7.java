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

public class QuizActivity_7 extends Activity {
	List<Question_7> quesList_7;
	int score_7 = 0;
	int qid_7 = 0;
	// SOSTA STATIC
	public static String[] sostesEr_7 = new String[40];
	public static String[] sostesAp_7 = new String[40];
	public static Boolean[] sostesB_7 = new Boolean[] { true, false, false,
			false, false, false, false, false, false, false, false, false,
			false, false, false, false, false, false, false, false, false,
			false, false, false, false, false, false, false, false, false,
			false, false, false, false, false, false, false, false, false,
			false, false, false, false, false, false, false, false, false,
			false, false, false };
	//LATHOS STATIC
	public static String[] lathosEr_7 = new String[40];
	public static String[] lathosAp_7 = new String[40];
	public static String[] lathosXr_7 = new String[40];
	public static Boolean[] lathosB_7 = new Boolean[] { true, false, false,
			false, false, false, false, false, false, false, false, false,
			false, false, false, false, false, false, false, false, false,
			false, false, false, false, false, false, false, false, false,
			false, false, false, false, false, false, false, false, false,
			false, false, false, false, false, false, false, false, false,
			false, false, false };

	Question_7 currentQ_7;
	TextView txtQuestion, txtErotisi;
	RadioButton rda, rdb, rdc, rdd;
	Button butNext;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_quiz);
		DbHelper db = new DbHelper(this);
		quesList_7 = db.getAllQuestions_7();
		currentQ_7 = quesList_7.get(qid_7);
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
				Log.d("yourans", currentQ_7.getANSWER_7() + " " + answer.getText());
				if (currentQ_7.getANSWER_7().equals(answer.getText())) {
					if (sostesB_7[0] == true) {
						sostesEr_7[0] = currentQ_7.getQUESTION_7();
						sostesAp_7[0] = (String) answer.getText();
						sostesB_7[0] = false;
						sostesB_7[1] = true;
					} else if (sostesB_7[1] == true) {
						sostesEr_7[1] = currentQ_7.getQUESTION_7();
						sostesAp_7[1] = (String) answer.getText();
						sostesB_7[1] = false;
						sostesB_7[2] = true;
					} else if (sostesB_7[2] == true) {
						sostesEr_7[2] = currentQ_7.getQUESTION_7();
						sostesAp_7[2] = (String) answer.getText();
						sostesB_7[2] = false;
						sostesB_7[3] = true;
					} else if (sostesB_7[3] == true) {
						sostesEr_7[3] = currentQ_7.getQUESTION_7();
						sostesAp_7[3] = (String) answer.getText();
						sostesB_7[3] = false;
						sostesB_7[4] = true;
					} else if (sostesB_7[4] == true) {
						sostesEr_7[4] = currentQ_7.getQUESTION_7();
						sostesAp_7[4] = (String) answer.getText();
						sostesB_7[4] = false;
						sostesB_7[5] = true;
					} else if (sostesB_7[5] == true) {
						sostesEr_7[5] = currentQ_7.getQUESTION_7();
						sostesAp_7[5] = (String) answer.getText();
						sostesB_7[5] = false;
						sostesB_7[6] = true;
					} else if (sostesB_7[6] == true) {
						sostesEr_7[6] = currentQ_7.getQUESTION_7();
						sostesAp_7[6] = (String) answer.getText();
						sostesB_7[6] = false;
						sostesB_7[7] = true;
					} else if (sostesB_7[7] == true) {
						sostesEr_7[7] = currentQ_7.getQUESTION_7();
						sostesAp_7[7] = (String) answer.getText();
						sostesB_7[7] = false;
						sostesB_7[8] = true;
					} else if (sostesB_7[8] == true) {
						sostesEr_7[8] = currentQ_7.getQUESTION_7();
						sostesAp_7[8] = (String) answer.getText();
						sostesB_7[8] = false;
						sostesB_7[9] = true;
					} else if (sostesB_7[9] == true) {
						sostesEr_7[9] = currentQ_7.getQUESTION_7();
						sostesAp_7[9] = (String) answer.getText();
						sostesB_7[9] = false;
						sostesB_7[10] = true;
					} else if (sostesB_7[10] == true) {
						sostesEr_7[10] = currentQ_7.getQUESTION_7();
						sostesAp_7[10] = (String) answer.getText();
						sostesB_7[10] = false;
						sostesB_7[11] = true;
					} else if (sostesB_7[11] == true) {
						sostesEr_7[11] = currentQ_7.getQUESTION_7();
						sostesAp_7[11] = (String) answer.getText();
						sostesB_7[11] = false;
						sostesB_7[12] = true;
					} else if (sostesB_7[12] == true) {
						sostesEr_7[12] = currentQ_7.getQUESTION_7();
						sostesAp_7[12] = (String) answer.getText();
						sostesB_7[12] = false;
						sostesB_7[13] = true;
					} else if (sostesB_7[13] == true) {
						sostesEr_7[13] = currentQ_7.getQUESTION_7();
						sostesAp_7[13] = (String) answer.getText();
						sostesB_7[13] = false;
						sostesB_7[14] = true;
					} else if (sostesB_7[14] == true) {
						sostesEr_7[14] = currentQ_7.getQUESTION_7();
						sostesAp_7[14] = (String) answer.getText();
						sostesB_7[14] = false;
						sostesB_7[15] = true;
					} else if (sostesB_7[15] == true) {
						sostesEr_7[15] = currentQ_7.getQUESTION_7();
						sostesAp_7[15] = (String) answer.getText();
						sostesB_7[15] = false;
						sostesB_7[16] = true;
					} else if (sostesB_7[16] == true) {
						sostesEr_7[16] = currentQ_7.getQUESTION_7();
						sostesAp_7[16] = (String) answer.getText();
						sostesB_7[16] = false;
						sostesB_7[17] = true;
					} else if (sostesB_7[17] == true) {
						sostesEr_7[17] = currentQ_7.getQUESTION_7();
						sostesAp_7[17] = (String) answer.getText();
						sostesB_7[17] = false;
						sostesB_7[18] = true;
					} else if (sostesB_7[18] == true) {
						sostesEr_7[18] = currentQ_7.getQUESTION_7();
						sostesAp_7[18] = (String) answer.getText();
						sostesB_7[18] = false;
						sostesB_7[19] = true;
					} else if (sostesB_7[19] == true) {
						sostesEr_7[19] = currentQ_7.getQUESTION_7();
						sostesAp_7[19] = (String) answer.getText();
						sostesB_7[19] = false;
						sostesB_7[20] = true;
					} else if (sostesB_7[20] == true) {
						sostesEr_7[20] = currentQ_7.getQUESTION_7();
						sostesAp_7[20] = (String) answer.getText();
						sostesB_7[20] = false;
						sostesB_7[21] = true;
					} else if (sostesB_7[21] == true) {
						sostesEr_7[21] = currentQ_7.getQUESTION_7();
						sostesAp_7[21] = (String) answer.getText();
						sostesB_7[21] = false;
						sostesB_7[22] = true;
					} else if (sostesB_7[22] == true) {
						sostesEr_7[22] = currentQ_7.getQUESTION_7();
						sostesAp_7[22] = (String) answer.getText();
						sostesB_7[22] = false;
						sostesB_7[23] = true;
					} else if (sostesB_7[23] == true) {
						sostesEr_7[23] = currentQ_7.getQUESTION_7();
						sostesAp_7[23] = (String) answer.getText();
						sostesB_7[23] = false;
						sostesB_7[24] = true;
					} else if (sostesB_7[24] == true) {
						sostesEr_7[24] = currentQ_7.getQUESTION_7();
						sostesAp_7[24] = (String) answer.getText();
						sostesB_7[24] = false;
						sostesB_7[25] = true;
					} else if (sostesB_7[25] == true) {
						sostesEr_7[25] = currentQ_7.getQUESTION_7();
						sostesAp_7[25] = (String) answer.getText();
						sostesB_7[25] = false;
						sostesB_7[26] = true;
					} else if (sostesB_7[26] == true) {
						sostesEr_7[26] = currentQ_7.getQUESTION_7();
						sostesAp_7[26] = (String) answer.getText();
						sostesB_7[26] = false;
						sostesB_7[27] = true;
					} else if (sostesB_7[27] == true) {
						sostesEr_7[27] = currentQ_7.getQUESTION_7();
						sostesAp_7[27] = (String) answer.getText();
						sostesB_7[27] = false;
						sostesB_7[28] = true;
					} else if (sostesB_7[28] == true) {
						sostesEr_7[28] = currentQ_7.getQUESTION_7();
						sostesAp_7[28] = (String) answer.getText();
						sostesB_7[28] = false;
						sostesB_7[29] = true;
					} else if (sostesB_7[29] == true) {
						sostesEr_7[29] = currentQ_7.getQUESTION_7();
						sostesAp_7[29] = (String) answer.getText();
						sostesB_7[29] = false;
						sostesB_7[30] = true;
					} else if (sostesB_7[30] == true) {
						sostesEr_7[30] = currentQ_7.getQUESTION_7();
						sostesAp_7[30] = (String) answer.getText();
						sostesB_7[30] = false;
						sostesB_7[31] = true;
					} else if (sostesB_7[31] == true) {
						sostesEr_7[31] = currentQ_7.getQUESTION_7();
						sostesAp_7[31] = (String) answer.getText();
						sostesB_7[31] = false;
						sostesB_7[32] = true;
					} else if (sostesB_7[32] == true) {
						sostesEr_7[32] = currentQ_7.getQUESTION_7();
						sostesAp_7[32] = (String) answer.getText();
						sostesB_7[32] = false;
						sostesB_7[33] = true;
					} else if (sostesB_7[33] == true) {
						sostesEr_7[33] = currentQ_7.getQUESTION_7();
						sostesAp_7[33] = (String) answer.getText();
						sostesB_7[33] = false;
						sostesB_7[34] = true;
					} else if (sostesB_7[34] == true) {
						sostesEr_7[34] = currentQ_7.getQUESTION_7();
						sostesAp_7[34] = (String) answer.getText();
						sostesB_7[34] = false;
						sostesB_7[35] = true;
					} else if (sostesB_7[35] == true) {
						sostesEr_7[35] = currentQ_7.getQUESTION_7();
						sostesAp_7[35] = (String) answer.getText();
						sostesB_7[35] = false;
						sostesB_7[36] = true;
					} else if (sostesB_7[36] == true) {
						sostesEr_7[36] = currentQ_7.getQUESTION_7();
						sostesAp_7[36] = (String) answer.getText();
						sostesB_7[36] = false;
						sostesB_7[37] = true;
					} else if (sostesB_7[37] == true) {
						sostesEr_7[37] = currentQ_7.getQUESTION_7();
						sostesAp_7[37] = (String) answer.getText();
						sostesB_7[37] = false;
						sostesB_7[38] = true;
					} else if (sostesB_7[38] == true) {
						sostesEr_7[38] = currentQ_7.getQUESTION_7();
						sostesAp_7[38] = (String) answer.getText();
						sostesB_7[38] = false;
						sostesB_7[39] = true;
					} else if (sostesB_7[39] == true) {
						sostesEr_7[39] = currentQ_7.getQUESTION_7();
						sostesAp_7[39] = (String) answer.getText();
						sostesB_7[39] = false;
						sostesB_7[40] = true;
					} else if (sostesB_7[40] == true) {
						sostesEr_7[40] = currentQ_7.getQUESTION_7();
						sostesAp_7[40] = (String) answer.getText();
						sostesB_7[40] = false;
					}
					score_7++;
					Log.d("score", "Your score" + score_7);
				} else {
					if (lathosB_7[0] == true) {
						lathosEr_7[0] = currentQ_7.getQUESTION_7();
						lathosXr_7[0] = (String) answer.getText();
						lathosAp_7[0] = currentQ_7.getANSWER_7();
						lathosB_7[0] = false;
						lathosB_7[1] = true;
					} else if (lathosB_7[1] == true) {
						lathosEr_7[1] = currentQ_7.getQUESTION_7();
						lathosXr_7[1] = (String) answer.getText();
						lathosAp_7[1] = currentQ_7.getANSWER_7();
						lathosB_7[1] = false;
						lathosB_7[2] = true;
					} else if (lathosB_7[2] == true) {
						lathosEr_7[2] = currentQ_7.getQUESTION_7();
						lathosXr_7[2] = (String) answer.getText();
						lathosAp_7[2] = currentQ_7.getANSWER_7();
						lathosB_7[2] = false;
						lathosB_7[3] = true;
					} else if (lathosB_7[3] == true) {
						lathosEr_7[3] = currentQ_7.getQUESTION_7();
						lathosXr_7[3] = (String) answer.getText();
						lathosAp_7[3] = currentQ_7.getANSWER_7();
						lathosB_7[3] = false;
						lathosB_7[4] = true;
					} else if (lathosB_7[4] == true) {
						lathosEr_7[4] = currentQ_7.getQUESTION_7();
						lathosXr_7[4] = (String) answer.getText();
						lathosAp_7[4] = currentQ_7.getANSWER_7();
						lathosB_7[4] = false;
						lathosB_7[5] = true;
					} else if (lathosB_7[5] == true) {
						lathosEr_7[5] = currentQ_7.getQUESTION_7();
						lathosXr_7[5] = (String) answer.getText();
						lathosAp_7[5] = currentQ_7.getANSWER_7();
						lathosB_7[5] = false;
						lathosB_7[6] = true;
					} else if (lathosB_7[6] == true) {
						lathosEr_7[6] = currentQ_7.getQUESTION_7();
						lathosXr_7[6] = (String) answer.getText();
						lathosAp_7[6] = currentQ_7.getANSWER_7();
						lathosB_7[6] = false;
						lathosB_7[7] = true;
					} else if (lathosB_7[7] == true) {
						lathosEr_7[7] = currentQ_7.getQUESTION_7();
						lathosXr_7[7] = (String) answer.getText();
						lathosAp_7[7] = currentQ_7.getANSWER_7();
						lathosB_7[7] = false;
						lathosB_7[8] = true;
					} else if (lathosB_7[8] == true) {
						lathosEr_7[8] = currentQ_7.getQUESTION_7();
						lathosXr_7[8] = (String) answer.getText();
						lathosAp_7[8] = currentQ_7.getANSWER_7();
						lathosB_7[8] = false;
						lathosB_7[9] = true;
					} else if (lathosB_7[9] == true) {
						lathosEr_7[9] = currentQ_7.getQUESTION_7();
						lathosXr_7[9] = (String) answer.getText();
						lathosAp_7[9] = currentQ_7.getANSWER_7();
						lathosB_7[9] = false;
						lathosB_7[10] = true;
					} else if (lathosB_7[10] == true) {
						lathosEr_7[10] = currentQ_7.getQUESTION_7();
						lathosXr_7[10] = (String) answer.getText();
						lathosAp_7[10] = currentQ_7.getANSWER_7();
						lathosB_7[10] = false;
						lathosB_7[11] = true;
					} else if (lathosB_7[11] == true) {
						lathosEr_7[11] = currentQ_7.getQUESTION_7();
						lathosXr_7[11] = (String) answer.getText();
						lathosAp_7[11] = currentQ_7.getANSWER_7();
						lathosB_7[11] = false;
						lathosB_7[12] = true;
					} else if (lathosB_7[12] == true) {
						lathosEr_7[12] = currentQ_7.getQUESTION_7();
						lathosXr_7[12] = (String) answer.getText();
						lathosAp_7[12] = currentQ_7.getANSWER_7();
						lathosB_7[12] = false;
						lathosB_7[13] = true;
					} else if (lathosB_7[13] == true) {
						lathosEr_7[13] = currentQ_7.getQUESTION_7();
						lathosXr_7[13] = (String) answer.getText();
						lathosAp_7[13] = currentQ_7.getANSWER_7();
						lathosB_7[13] = false;
						lathosB_7[14] = true;
					} else if (lathosB_7[14] == true) {
						lathosEr_7[14] = currentQ_7.getQUESTION_7();
						lathosXr_7[14] = (String) answer.getText();
						lathosAp_7[14] = currentQ_7.getANSWER_7();
						lathosB_7[14] = false;
						lathosB_7[15] = true;
					} else if (lathosB_7[15] == true) {
						lathosEr_7[15] = currentQ_7.getQUESTION_7();
						lathosXr_7[15] = (String) answer.getText();
						lathosAp_7[15] = currentQ_7.getANSWER_7();
						lathosB_7[15] = false;
						lathosB_7[16] = true;
					} else if (lathosB_7[16] == true) {
						lathosEr_7[16] = currentQ_7.getQUESTION_7();
						lathosXr_7[16] = (String) answer.getText();
						lathosAp_7[16] = currentQ_7.getANSWER_7();
						lathosB_7[16] = false;
						lathosB_7[17] = true;
					} else if (lathosB_7[17] == true) {
						lathosEr_7[17] = currentQ_7.getQUESTION_7();
						lathosXr_7[17] = (String) answer.getText();
						lathosAp_7[17] = currentQ_7.getANSWER_7();
						lathosB_7[17] = false;
						lathosB_7[18] = true;
					} else if (lathosB_7[18] == true) {
						lathosEr_7[18] = currentQ_7.getQUESTION_7();
						lathosXr_7[18] = (String) answer.getText();
						lathosAp_7[18] = currentQ_7.getANSWER_7();
						lathosB_7[18] = false;
						lathosB_7[19] = true;
					} else if (lathosB_7[19] == true) {
						lathosEr_7[19] = currentQ_7.getQUESTION_7();
						lathosXr_7[19] = (String) answer.getText();
						lathosAp_7[19] = currentQ_7.getANSWER_7();
						lathosB_7[19] = false;
						lathosB_7[20] = true;
					} else if (lathosB_7[20] == true) {
						lathosEr_7[20] = currentQ_7.getQUESTION_7();
						lathosXr_7[20] = (String) answer.getText();
						lathosAp_7[20] = currentQ_7.getANSWER_7();
						lathosB_7[20] = false;
						lathosB_7[21] = true;
					} else if (lathosB_7[21] == true) {
						lathosEr_7[21] = currentQ_7.getQUESTION_7();
						lathosXr_7[21] = (String) answer.getText();
						lathosAp_7[21] = currentQ_7.getANSWER_7();
						lathosB_7[21] = false;
						lathosB_7[22] = true;
					} else if (lathosB_7[22] == true) {
						lathosEr_7[22] = currentQ_7.getQUESTION_7();
						lathosXr_7[22] = (String) answer.getText();
						lathosAp_7[22] = currentQ_7.getANSWER_7();
						lathosB_7[22] = false;
						lathosB_7[23] = true;
					} else if (lathosB_7[23] == true) {
						lathosEr_7[23] = currentQ_7.getQUESTION_7();
						lathosXr_7[23] = (String) answer.getText();
						lathosAp_7[23] = currentQ_7.getANSWER_7();
						lathosB_7[23] = false;
						lathosB_7[24] = true;
					} else if (lathosB_7[24] == true) {
						lathosEr_7[24] = currentQ_7.getQUESTION_7();
						lathosXr_7[24] = (String) answer.getText();
						lathosAp_7[24] = currentQ_7.getANSWER_7();
						lathosB_7[24] = false;
						lathosB_7[25] = true;
					} else if (lathosB_7[25] == true) {
						lathosEr_7[25] = currentQ_7.getQUESTION_7();
						lathosXr_7[25] = (String) answer.getText();
						lathosAp_7[25] = currentQ_7.getANSWER_7();
						lathosB_7[25] = false;
						lathosB_7[26] = true;
					} else if (lathosB_7[26] == true) {
						lathosEr_7[26] = currentQ_7.getQUESTION_7();
						lathosXr_7[26] = (String) answer.getText();
						lathosAp_7[26] = currentQ_7.getANSWER_7();
						lathosB_7[26] = false;
						lathosB_7[27] = true;
					} else if (lathosB_7[27] == true) {
						lathosEr_7[27] = currentQ_7.getQUESTION_7();
						lathosXr_7[27] = (String) answer.getText();
						lathosAp_7[27] = currentQ_7.getANSWER_7();
						lathosB_7[27] = false;
						lathosB_7[28] = true;
					} else if (lathosB_7[28] == true) {
						lathosEr_7[28] = currentQ_7.getQUESTION_7();
						lathosXr_7[28] = (String) answer.getText();
						lathosAp_7[28] = currentQ_7.getANSWER_7();
						lathosB_7[28] = false;
						lathosB_7[29] = true;
					} else if (lathosB_7[29] == true) {
						lathosEr_7[29] = currentQ_7.getQUESTION_7();
						lathosXr_7[29] = (String) answer.getText();
						lathosAp_7[29] = currentQ_7.getANSWER_7();
						lathosB_7[29] = false;
						lathosB_7[30] = true;
					} else if (lathosB_7[30] == true) {
						lathosEr_7[30] = currentQ_7.getQUESTION_7();
						lathosXr_7[30] = (String) answer.getText();
						lathosAp_7[30] = currentQ_7.getANSWER_7();
						lathosB_7[30] = false;
						lathosB_7[31] = true;
					} else if (lathosB_7[31] == true) {
						lathosEr_7[31] = currentQ_7.getQUESTION_7();
						lathosXr_7[31] = (String) answer.getText();
						lathosAp_7[31] = currentQ_7.getANSWER_7();
						lathosB_7[31] = false;
						lathosB_7[32] = true;
					} else if (lathosB_7[32] == true) {
						lathosEr_7[32] = currentQ_7.getQUESTION_7();
						lathosXr_7[32] = (String) answer.getText();
						lathosAp_7[32] = currentQ_7.getANSWER_7();
						lathosB_7[32] = false;
						lathosB_7[33] = true;
					} else if (lathosB_7[33] == true) {
						lathosEr_7[33] = currentQ_7.getQUESTION_7();
						lathosXr_7[33] = (String) answer.getText();
						lathosAp_7[33] = currentQ_7.getANSWER_7();
						lathosB_7[33] = false;
						lathosB_7[34] = true;
					} else if (lathosB_7[34] == true) {
						lathosEr_7[34] = currentQ_7.getQUESTION_7();
						lathosXr_7[34] = (String) answer.getText();
						lathosAp_7[34] = currentQ_7.getANSWER_7();
						lathosB_7[34] = false;
						lathosB_7[35] = true;
					} else if (lathosB_7[35] == true) {
						lathosEr_7[35] = currentQ_7.getQUESTION_7();
						lathosXr_7[35] = (String) answer.getText();
						lathosAp_7[35] = currentQ_7.getANSWER_7();
						lathosB_7[35] = false;
						lathosB_7[36] = true;
					} else if (lathosB_7[36] == true) {
						lathosEr_7[36] = currentQ_7.getQUESTION_7();
						lathosXr_7[36] = (String) answer.getText();
						lathosAp_7[36] = currentQ_7.getANSWER_7();
						lathosB_7[36] = false;
						lathosB_7[37] = true;
					} else if (lathosB_7[37] == true) {
						lathosEr_7[37] = currentQ_7.getQUESTION_7();
						lathosXr_7[37] = (String) answer.getText();
						lathosAp_7[37] = currentQ_7.getANSWER_7();
						lathosB_7[37] = false;
						lathosB_7[38] = true;
					} else if (lathosB_7[38] == true) {
						lathosEr_7[38] = currentQ_7.getQUESTION_7();
						lathosXr_7[38] = (String) answer.getText();
						lathosAp_7[38] = currentQ_7.getANSWER_7();
						lathosB_7[38] = false;
						lathosB_7[39] = true;
					} else if (lathosB_7[39] == true) {
						lathosEr_7[39] = currentQ_7.getQUESTION_7();
						lathosXr_7[39] = (String) answer.getText();
						lathosAp_7[39] = currentQ_7.getANSWER_7();
						lathosB_7[39] = false;
						lathosB_7[40] = true;
					} else if (lathosB_7[40] == true) {
						lathosEr_7[40] = currentQ_7.getQUESTION_7();
						lathosXr_7[40] = (String) answer.getText();
						lathosAp_7[40] = currentQ_7.getANSWER_7();
						lathosB_7[40] = false;
					}

				}
				if (qid_7 < 40) {
					txtErotisi.setText("Ερώτηση: " + (qid_7 + 1));
					currentQ_7 = quesList_7.get(qid_7);
					setQuestionView();
				} else {
					Intent intent = new Intent(QuizActivity_7.this,
							ResultActivity_7.class);
					Bundle b = new Bundle();
					b.putInt("score", score_7); // Your score
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
		txtQuestion.setText(currentQ_7.getQUESTION_7());
		rda.setText(currentQ_7.getOPTA_7());
		rdb.setText(currentQ_7.getOPTB_7());
		rdc.setText(currentQ_7.getOPTC_7());
		rdd.setText(currentQ_7.getOPTD_7());
		qid_7++;
	}
}
