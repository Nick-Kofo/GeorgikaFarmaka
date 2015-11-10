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

public class QuizActivity_6 extends Activity {
	List<Question_6> quesList_6;
	int score_6 = 0;
	int qid_6 = 0;
	// SOSTA STATIC
	public static String[] sostesEr_6 = new String[40];
	public static String[] sostesAp_6 = new String[40];
	public static Boolean[] sostesB_6 = new Boolean[] { true, false, false,
			false, false, false, false, false, false, false, false, false,
			false, false, false, false, false, false, false, false, false,
			false, false, false, false, false, false, false, false, false,
			false, false, false, false, false, false, false, false, false,
			false, false, false, false, false, false, false, false, false,
			false, false, false };
	//LATHOS STATIC
	public static String[] lathosEr_6 = new String[40];
	public static String[] lathosAp_6 = new String[40];
	public static String[] lathosXr_6 = new String[40];
	public static Boolean[] lathosB_6 = new Boolean[] { true, false, false,
			false, false, false, false, false, false, false, false, false,
			false, false, false, false, false, false, false, false, false,
			false, false, false, false, false, false, false, false, false,
			false, false, false, false, false, false, false, false, false,
			false, false, false, false, false, false, false, false, false,
			false, false, false };

	Question_6 currentQ_6;
	TextView txtQuestion, txtErotisi;
	RadioButton rda, rdb, rdc, rdd;
	Button butNext;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_quiz);
		DbHelper db = new DbHelper(this);
		quesList_6 = db.getAllQuestions_6();
		currentQ_6 = quesList_6.get(qid_6);
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
				Log.d("yourans", currentQ_6.getANSWER_6() + " " + answer.getText());
				if (currentQ_6.getANSWER_6().equals(answer.getText())) {
					if (sostesB_6[0] == true) {
						sostesEr_6[0] = currentQ_6.getQUESTION_6();
						sostesAp_6[0] = (String) answer.getText();
						sostesB_6[0] = false;
						sostesB_6[1] = true;
					} else if (sostesB_6[1] == true) {
						sostesEr_6[1] = currentQ_6.getQUESTION_6();
						sostesAp_6[1] = (String) answer.getText();
						sostesB_6[1] = false;
						sostesB_6[2] = true;
					} else if (sostesB_6[2] == true) {
						sostesEr_6[2] = currentQ_6.getQUESTION_6();
						sostesAp_6[2] = (String) answer.getText();
						sostesB_6[2] = false;
						sostesB_6[3] = true;
					} else if (sostesB_6[3] == true) {
						sostesEr_6[3] = currentQ_6.getQUESTION_6();
						sostesAp_6[3] = (String) answer.getText();
						sostesB_6[3] = false;
						sostesB_6[4] = true;
					} else if (sostesB_6[4] == true) {
						sostesEr_6[4] = currentQ_6.getQUESTION_6();
						sostesAp_6[4] = (String) answer.getText();
						sostesB_6[4] = false;
						sostesB_6[5] = true;
					} else if (sostesB_6[5] == true) {
						sostesEr_6[5] = currentQ_6.getQUESTION_6();
						sostesAp_6[5] = (String) answer.getText();
						sostesB_6[5] = false;
						sostesB_6[6] = true;
					} else if (sostesB_6[6] == true) {
						sostesEr_6[6] = currentQ_6.getQUESTION_6();
						sostesAp_6[6] = (String) answer.getText();
						sostesB_6[6] = false;
						sostesB_6[7] = true;
					} else if (sostesB_6[7] == true) {
						sostesEr_6[7] = currentQ_6.getQUESTION_6();
						sostesAp_6[7] = (String) answer.getText();
						sostesB_6[7] = false;
						sostesB_6[8] = true;
					} else if (sostesB_6[8] == true) {
						sostesEr_6[8] = currentQ_6.getQUESTION_6();
						sostesAp_6[8] = (String) answer.getText();
						sostesB_6[8] = false;
						sostesB_6[9] = true;
					} else if (sostesB_6[9] == true) {
						sostesEr_6[9] = currentQ_6.getQUESTION_6();
						sostesAp_6[9] = (String) answer.getText();
						sostesB_6[9] = false;
						sostesB_6[10] = true;
					} else if (sostesB_6[10] == true) {
						sostesEr_6[10] = currentQ_6.getQUESTION_6();
						sostesAp_6[10] = (String) answer.getText();
						sostesB_6[10] = false;
						sostesB_6[11] = true;
					} else if (sostesB_6[11] == true) {
						sostesEr_6[11] = currentQ_6.getQUESTION_6();
						sostesAp_6[11] = (String) answer.getText();
						sostesB_6[11] = false;
						sostesB_6[12] = true;
					} else if (sostesB_6[12] == true) {
						sostesEr_6[12] = currentQ_6.getQUESTION_6();
						sostesAp_6[12] = (String) answer.getText();
						sostesB_6[12] = false;
						sostesB_6[13] = true;
					} else if (sostesB_6[13] == true) {
						sostesEr_6[13] = currentQ_6.getQUESTION_6();
						sostesAp_6[13] = (String) answer.getText();
						sostesB_6[13] = false;
						sostesB_6[14] = true;
					} else if (sostesB_6[14] == true) {
						sostesEr_6[14] = currentQ_6.getQUESTION_6();
						sostesAp_6[14] = (String) answer.getText();
						sostesB_6[14] = false;
						sostesB_6[15] = true;
					} else if (sostesB_6[15] == true) {
						sostesEr_6[15] = currentQ_6.getQUESTION_6();
						sostesAp_6[15] = (String) answer.getText();
						sostesB_6[15] = false;
						sostesB_6[16] = true;
					} else if (sostesB_6[16] == true) {
						sostesEr_6[16] = currentQ_6.getQUESTION_6();
						sostesAp_6[16] = (String) answer.getText();
						sostesB_6[16] = false;
						sostesB_6[17] = true;
					} else if (sostesB_6[17] == true) {
						sostesEr_6[17] = currentQ_6.getQUESTION_6();
						sostesAp_6[17] = (String) answer.getText();
						sostesB_6[17] = false;
						sostesB_6[18] = true;
					} else if (sostesB_6[18] == true) {
						sostesEr_6[18] = currentQ_6.getQUESTION_6();
						sostesAp_6[18] = (String) answer.getText();
						sostesB_6[18] = false;
						sostesB_6[19] = true;
					} else if (sostesB_6[19] == true) {
						sostesEr_6[19] = currentQ_6.getQUESTION_6();
						sostesAp_6[19] = (String) answer.getText();
						sostesB_6[19] = false;
						sostesB_6[20] = true;
					} else if (sostesB_6[20] == true) {
						sostesEr_6[20] = currentQ_6.getQUESTION_6();
						sostesAp_6[20] = (String) answer.getText();
						sostesB_6[20] = false;
						sostesB_6[21] = true;
					} else if (sostesB_6[21] == true) {
						sostesEr_6[21] = currentQ_6.getQUESTION_6();
						sostesAp_6[21] = (String) answer.getText();
						sostesB_6[21] = false;
						sostesB_6[22] = true;
					} else if (sostesB_6[22] == true) {
						sostesEr_6[22] = currentQ_6.getQUESTION_6();
						sostesAp_6[22] = (String) answer.getText();
						sostesB_6[22] = false;
						sostesB_6[23] = true;
					} else if (sostesB_6[23] == true) {
						sostesEr_6[23] = currentQ_6.getQUESTION_6();
						sostesAp_6[23] = (String) answer.getText();
						sostesB_6[23] = false;
						sostesB_6[24] = true;
					} else if (sostesB_6[24] == true) {
						sostesEr_6[24] = currentQ_6.getQUESTION_6();
						sostesAp_6[24] = (String) answer.getText();
						sostesB_6[24] = false;
						sostesB_6[25] = true;
					} else if (sostesB_6[25] == true) {
						sostesEr_6[25] = currentQ_6.getQUESTION_6();
						sostesAp_6[25] = (String) answer.getText();
						sostesB_6[25] = false;
						sostesB_6[26] = true;
					} else if (sostesB_6[26] == true) {
						sostesEr_6[26] = currentQ_6.getQUESTION_6();
						sostesAp_6[26] = (String) answer.getText();
						sostesB_6[26] = false;
						sostesB_6[27] = true;
					} else if (sostesB_6[27] == true) {
						sostesEr_6[27] = currentQ_6.getQUESTION_6();
						sostesAp_6[27] = (String) answer.getText();
						sostesB_6[27] = false;
						sostesB_6[28] = true;
					} else if (sostesB_6[28] == true) {
						sostesEr_6[28] = currentQ_6.getQUESTION_6();
						sostesAp_6[28] = (String) answer.getText();
						sostesB_6[28] = false;
						sostesB_6[29] = true;
					} else if (sostesB_6[29] == true) {
						sostesEr_6[29] = currentQ_6.getQUESTION_6();
						sostesAp_6[29] = (String) answer.getText();
						sostesB_6[29] = false;
						sostesB_6[30] = true;
					} else if (sostesB_6[30] == true) {
						sostesEr_6[30] = currentQ_6.getQUESTION_6();
						sostesAp_6[30] = (String) answer.getText();
						sostesB_6[30] = false;
						sostesB_6[31] = true;
					} else if (sostesB_6[31] == true) {
						sostesEr_6[31] = currentQ_6.getQUESTION_6();
						sostesAp_6[31] = (String) answer.getText();
						sostesB_6[31] = false;
						sostesB_6[32] = true;
					} else if (sostesB_6[32] == true) {
						sostesEr_6[32] = currentQ_6.getQUESTION_6();
						sostesAp_6[32] = (String) answer.getText();
						sostesB_6[32] = false;
						sostesB_6[33] = true;
					} else if (sostesB_6[33] == true) {
						sostesEr_6[33] = currentQ_6.getQUESTION_6();
						sostesAp_6[33] = (String) answer.getText();
						sostesB_6[33] = false;
						sostesB_6[34] = true;
					} else if (sostesB_6[34] == true) {
						sostesEr_6[34] = currentQ_6.getQUESTION_6();
						sostesAp_6[34] = (String) answer.getText();
						sostesB_6[34] = false;
						sostesB_6[35] = true;
					} else if (sostesB_6[35] == true) {
						sostesEr_6[35] = currentQ_6.getQUESTION_6();
						sostesAp_6[35] = (String) answer.getText();
						sostesB_6[35] = false;
						sostesB_6[36] = true;
					} else if (sostesB_6[36] == true) {
						sostesEr_6[36] = currentQ_6.getQUESTION_6();
						sostesAp_6[36] = (String) answer.getText();
						sostesB_6[36] = false;
						sostesB_6[37] = true;
					} else if (sostesB_6[37] == true) {
						sostesEr_6[37] = currentQ_6.getQUESTION_6();
						sostesAp_6[37] = (String) answer.getText();
						sostesB_6[37] = false;
						sostesB_6[38] = true;
					} else if (sostesB_6[38] == true) {
						sostesEr_6[38] = currentQ_6.getQUESTION_6();
						sostesAp_6[38] = (String) answer.getText();
						sostesB_6[38] = false;
						sostesB_6[39] = true;
					} else if (sostesB_6[39] == true) {
						sostesEr_6[39] = currentQ_6.getQUESTION_6();
						sostesAp_6[39] = (String) answer.getText();
						sostesB_6[39] = false;
						sostesB_6[40] = true;
					} else if (sostesB_6[40] == true) {
						sostesEr_6[40] = currentQ_6.getQUESTION_6();
						sostesAp_6[40] = (String) answer.getText();
						sostesB_6[40] = false;
					}
					score_6++;
					Log.d("score", "Your score" + score_6);
				} else {
					if (lathosB_6[0] == true) {
						lathosEr_6[0] = currentQ_6.getQUESTION_6();
						lathosXr_6[0] = (String) answer.getText();
						lathosAp_6[0] = currentQ_6.getANSWER_6();
						lathosB_6[0] = false;
						lathosB_6[1] = true;
					} else if (lathosB_6[1] == true) {
						lathosEr_6[1] = currentQ_6.getQUESTION_6();
						lathosXr_6[1] = (String) answer.getText();
						lathosAp_6[1] = currentQ_6.getANSWER_6();
						lathosB_6[1] = false;
						lathosB_6[2] = true;
					} else if (lathosB_6[2] == true) {
						lathosEr_6[2] = currentQ_6.getQUESTION_6();
						lathosXr_6[2] = (String) answer.getText();
						lathosAp_6[2] = currentQ_6.getANSWER_6();
						lathosB_6[2] = false;
						lathosB_6[3] = true;
					} else if (lathosB_6[3] == true) {
						lathosEr_6[3] = currentQ_6.getQUESTION_6();
						lathosXr_6[3] = (String) answer.getText();
						lathosAp_6[3] = currentQ_6.getANSWER_6();
						lathosB_6[3] = false;
						lathosB_6[4] = true;
					} else if (lathosB_6[4] == true) {
						lathosEr_6[4] = currentQ_6.getQUESTION_6();
						lathosXr_6[4] = (String) answer.getText();
						lathosAp_6[4] = currentQ_6.getANSWER_6();
						lathosB_6[4] = false;
						lathosB_6[5] = true;
					} else if (lathosB_6[5] == true) {
						lathosEr_6[5] = currentQ_6.getQUESTION_6();
						lathosXr_6[5] = (String) answer.getText();
						lathosAp_6[5] = currentQ_6.getANSWER_6();
						lathosB_6[5] = false;
						lathosB_6[6] = true;
					} else if (lathosB_6[6] == true) {
						lathosEr_6[6] = currentQ_6.getQUESTION_6();
						lathosXr_6[6] = (String) answer.getText();
						lathosAp_6[6] = currentQ_6.getANSWER_6();
						lathosB_6[6] = false;
						lathosB_6[7] = true;
					} else if (lathosB_6[7] == true) {
						lathosEr_6[7] = currentQ_6.getQUESTION_6();
						lathosXr_6[7] = (String) answer.getText();
						lathosAp_6[7] = currentQ_6.getANSWER_6();
						lathosB_6[7] = false;
						lathosB_6[8] = true;
					} else if (lathosB_6[8] == true) {
						lathosEr_6[8] = currentQ_6.getQUESTION_6();
						lathosXr_6[8] = (String) answer.getText();
						lathosAp_6[8] = currentQ_6.getANSWER_6();
						lathosB_6[8] = false;
						lathosB_6[9] = true;
					} else if (lathosB_6[9] == true) {
						lathosEr_6[9] = currentQ_6.getQUESTION_6();
						lathosXr_6[9] = (String) answer.getText();
						lathosAp_6[9] = currentQ_6.getANSWER_6();
						lathosB_6[9] = false;
						lathosB_6[10] = true;
					} else if (lathosB_6[10] == true) {
						lathosEr_6[10] = currentQ_6.getQUESTION_6();
						lathosXr_6[10] = (String) answer.getText();
						lathosAp_6[10] = currentQ_6.getANSWER_6();
						lathosB_6[10] = false;
						lathosB_6[11] = true;
					} else if (lathosB_6[11] == true) {
						lathosEr_6[11] = currentQ_6.getQUESTION_6();
						lathosXr_6[11] = (String) answer.getText();
						lathosAp_6[11] = currentQ_6.getANSWER_6();
						lathosB_6[11] = false;
						lathosB_6[12] = true;
					} else if (lathosB_6[12] == true) {
						lathosEr_6[12] = currentQ_6.getQUESTION_6();
						lathosXr_6[12] = (String) answer.getText();
						lathosAp_6[12] = currentQ_6.getANSWER_6();
						lathosB_6[12] = false;
						lathosB_6[13] = true;
					} else if (lathosB_6[13] == true) {
						lathosEr_6[13] = currentQ_6.getQUESTION_6();
						lathosXr_6[13] = (String) answer.getText();
						lathosAp_6[13] = currentQ_6.getANSWER_6();
						lathosB_6[13] = false;
						lathosB_6[14] = true;
					} else if (lathosB_6[14] == true) {
						lathosEr_6[14] = currentQ_6.getQUESTION_6();
						lathosXr_6[14] = (String) answer.getText();
						lathosAp_6[14] = currentQ_6.getANSWER_6();
						lathosB_6[14] = false;
						lathosB_6[15] = true;
					} else if (lathosB_6[15] == true) {
						lathosEr_6[15] = currentQ_6.getQUESTION_6();
						lathosXr_6[15] = (String) answer.getText();
						lathosAp_6[15] = currentQ_6.getANSWER_6();
						lathosB_6[15] = false;
						lathosB_6[16] = true;
					} else if (lathosB_6[16] == true) {
						lathosEr_6[16] = currentQ_6.getQUESTION_6();
						lathosXr_6[16] = (String) answer.getText();
						lathosAp_6[16] = currentQ_6.getANSWER_6();
						lathosB_6[16] = false;
						lathosB_6[17] = true;
					} else if (lathosB_6[17] == true) {
						lathosEr_6[17] = currentQ_6.getQUESTION_6();
						lathosXr_6[17] = (String) answer.getText();
						lathosAp_6[17] = currentQ_6.getANSWER_6();
						lathosB_6[17] = false;
						lathosB_6[18] = true;
					} else if (lathosB_6[18] == true) {
						lathosEr_6[18] = currentQ_6.getQUESTION_6();
						lathosXr_6[18] = (String) answer.getText();
						lathosAp_6[18] = currentQ_6.getANSWER_6();
						lathosB_6[18] = false;
						lathosB_6[19] = true;
					} else if (lathosB_6[19] == true) {
						lathosEr_6[19] = currentQ_6.getQUESTION_6();
						lathosXr_6[19] = (String) answer.getText();
						lathosAp_6[19] = currentQ_6.getANSWER_6();
						lathosB_6[19] = false;
						lathosB_6[20] = true;
					} else if (lathosB_6[20] == true) {
						lathosEr_6[20] = currentQ_6.getQUESTION_6();
						lathosXr_6[20] = (String) answer.getText();
						lathosAp_6[20] = currentQ_6.getANSWER_6();
						lathosB_6[20] = false;
						lathosB_6[21] = true;
					} else if (lathosB_6[21] == true) {
						lathosEr_6[21] = currentQ_6.getQUESTION_6();
						lathosXr_6[21] = (String) answer.getText();
						lathosAp_6[21] = currentQ_6.getANSWER_6();
						lathosB_6[21] = false;
						lathosB_6[22] = true;
					} else if (lathosB_6[22] == true) {
						lathosEr_6[22] = currentQ_6.getQUESTION_6();
						lathosXr_6[22] = (String) answer.getText();
						lathosAp_6[22] = currentQ_6.getANSWER_6();
						lathosB_6[22] = false;
						lathosB_6[23] = true;
					} else if (lathosB_6[23] == true) {
						lathosEr_6[23] = currentQ_6.getQUESTION_6();
						lathosXr_6[23] = (String) answer.getText();
						lathosAp_6[23] = currentQ_6.getANSWER_6();
						lathosB_6[23] = false;
						lathosB_6[24] = true;
					} else if (lathosB_6[24] == true) {
						lathosEr_6[24] = currentQ_6.getQUESTION_6();
						lathosXr_6[24] = (String) answer.getText();
						lathosAp_6[24] = currentQ_6.getANSWER_6();
						lathosB_6[24] = false;
						lathosB_6[25] = true;
					} else if (lathosB_6[25] == true) {
						lathosEr_6[25] = currentQ_6.getQUESTION_6();
						lathosXr_6[25] = (String) answer.getText();
						lathosAp_6[25] = currentQ_6.getANSWER_6();
						lathosB_6[25] = false;
						lathosB_6[26] = true;
					} else if (lathosB_6[26] == true) {
						lathosEr_6[26] = currentQ_6.getQUESTION_6();
						lathosXr_6[26] = (String) answer.getText();
						lathosAp_6[26] = currentQ_6.getANSWER_6();
						lathosB_6[26] = false;
						lathosB_6[27] = true;
					} else if (lathosB_6[27] == true) {
						lathosEr_6[27] = currentQ_6.getQUESTION_6();
						lathosXr_6[27] = (String) answer.getText();
						lathosAp_6[27] = currentQ_6.getANSWER_6();
						lathosB_6[27] = false;
						lathosB_6[28] = true;
					} else if (lathosB_6[28] == true) {
						lathosEr_6[28] = currentQ_6.getQUESTION_6();
						lathosXr_6[28] = (String) answer.getText();
						lathosAp_6[28] = currentQ_6.getANSWER_6();
						lathosB_6[28] = false;
						lathosB_6[29] = true;
					} else if (lathosB_6[29] == true) {
						lathosEr_6[29] = currentQ_6.getQUESTION_6();
						lathosXr_6[29] = (String) answer.getText();
						lathosAp_6[29] = currentQ_6.getANSWER_6();
						lathosB_6[29] = false;
						lathosB_6[30] = true;
					} else if (lathosB_6[30] == true) {
						lathosEr_6[30] = currentQ_6.getQUESTION_6();
						lathosXr_6[30] = (String) answer.getText();
						lathosAp_6[30] = currentQ_6.getANSWER_6();
						lathosB_6[30] = false;
						lathosB_6[31] = true;
					} else if (lathosB_6[31] == true) {
						lathosEr_6[31] = currentQ_6.getQUESTION_6();
						lathosXr_6[31] = (String) answer.getText();
						lathosAp_6[31] = currentQ_6.getANSWER_6();
						lathosB_6[31] = false;
						lathosB_6[32] = true;
					} else if (lathosB_6[32] == true) {
						lathosEr_6[32] = currentQ_6.getQUESTION_6();
						lathosXr_6[32] = (String) answer.getText();
						lathosAp_6[32] = currentQ_6.getANSWER_6();
						lathosB_6[32] = false;
						lathosB_6[33] = true;
					} else if (lathosB_6[33] == true) {
						lathosEr_6[33] = currentQ_6.getQUESTION_6();
						lathosXr_6[33] = (String) answer.getText();
						lathosAp_6[33] = currentQ_6.getANSWER_6();
						lathosB_6[33] = false;
						lathosB_6[34] = true;
					} else if (lathosB_6[34] == true) {
						lathosEr_6[34] = currentQ_6.getQUESTION_6();
						lathosXr_6[34] = (String) answer.getText();
						lathosAp_6[34] = currentQ_6.getANSWER_6();
						lathosB_6[34] = false;
						lathosB_6[35] = true;
					} else if (lathosB_6[35] == true) {
						lathosEr_6[35] = currentQ_6.getQUESTION_6();
						lathosXr_6[35] = (String) answer.getText();
						lathosAp_6[35] = currentQ_6.getANSWER_6();
						lathosB_6[35] = false;
						lathosB_6[36] = true;
					} else if (lathosB_6[36] == true) {
						lathosEr_6[36] = currentQ_6.getQUESTION_6();
						lathosXr_6[36] = (String) answer.getText();
						lathosAp_6[36] = currentQ_6.getANSWER_6();
						lathosB_6[36] = false;
						lathosB_6[37] = true;
					} else if (lathosB_6[37] == true) {
						lathosEr_6[37] = currentQ_6.getQUESTION_6();
						lathosXr_6[37] = (String) answer.getText();
						lathosAp_6[37] = currentQ_6.getANSWER_6();
						lathosB_6[37] = false;
						lathosB_6[38] = true;
					} else if (lathosB_6[38] == true) {
						lathosEr_6[38] = currentQ_6.getQUESTION_6();
						lathosXr_6[38] = (String) answer.getText();
						lathosAp_6[38] = currentQ_6.getANSWER_6();
						lathosB_6[38] = false;
						lathosB_6[39] = true;
					} else if (lathosB_6[39] == true) {
						lathosEr_6[39] = currentQ_6.getQUESTION_6();
						lathosXr_6[39] = (String) answer.getText();
						lathosAp_6[39] = currentQ_6.getANSWER_6();
						lathosB_6[39] = false;
						lathosB_6[40] = true;
					} else if (lathosB_6[40] == true) {
						lathosEr_6[40] = currentQ_6.getQUESTION_6();
						lathosXr_6[40] = (String) answer.getText();
						lathosAp_6[40] = currentQ_6.getANSWER_6();
						lathosB_6[40] = false;
					}

				}
				if (qid_6 < 40) {
					txtErotisi.setText("Ερώτηση: " + (qid_6 + 1));
					currentQ_6 = quesList_6.get(qid_6);
					setQuestionView();
				} else {
					Intent intent = new Intent(QuizActivity_6.this,
							ResultActivity_6.class);
					Bundle b = new Bundle();
					b.putInt("score", score_6); // Your score
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
		txtQuestion.setText(currentQ_6.getQUESTION_6());
		rda.setText(currentQ_6.getOPTA_6());
		rdb.setText(currentQ_6.getOPTB_6());
		rdc.setText(currentQ_6.getOPTC_6());
		rdd.setText(currentQ_6.getOPTD_6());
		qid_6++;
	}
}
