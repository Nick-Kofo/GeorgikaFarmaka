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

public class QuizActivity_4 extends Activity {
	List<Question_4> quesList_4;
	int score_4 = 0;
	int qid_4 = 0;
	// SOSTA STATIC
	public static String[] sostesEr_4 = new String[40];
	public static String[] sostesAp_4 = new String[40];
	public static Boolean[] sostesB_4 = new Boolean[] { true, false, false,
			false, false, false, false, false, false, false, false, false,
			false, false, false, false, false, false, false, false, false,
			false, false, false, false, false, false, false, false, false,
			false, false, false, false, false, false, false, false, false,
			false, false, false, false, false, false, false, false, false,
			false, false, false };
	//LATHOS STATIC
	public static String[] lathosEr_4 = new String[40];
	public static String[] lathosAp_4 = new String[40];
	public static String[] lathosXr_4 = new String[40];
	public static Boolean[] lathosB_4 = new Boolean[] { true, false, false,
			false, false, false, false, false, false, false, false, false,
			false, false, false, false, false, false, false, false, false,
			false, false, false, false, false, false, false, false, false,
			false, false, false, false, false, false, false, false, false,
			false, false, false, false, false, false, false, false, false,
			false, false, false };

	Question_4 currentQ_4;
	TextView txtQuestion, txtErotisi;
	RadioButton rda, rdb, rdc, rdd;
	Button butNext;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_quiz);
		DbHelper db = new DbHelper(this);
		quesList_4 = db.getAllQuestions_4();
		currentQ_4 = quesList_4.get(qid_4);
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
				Log.d("yourans", currentQ_4.getANSWER_4() + " " + answer.getText());
				if (currentQ_4.getANSWER_4().equals(answer.getText())) {
					if (sostesB_4[0] == true) {
						sostesEr_4[0] = currentQ_4.getQUESTION_4();
						sostesAp_4[0] = (String) answer.getText();
						sostesB_4[0] = false;
						sostesB_4[1] = true;
					} else if (sostesB_4[1] == true) {
						sostesEr_4[1] = currentQ_4.getQUESTION_4();
						sostesAp_4[1] = (String) answer.getText();
						sostesB_4[1] = false;
						sostesB_4[2] = true;
					} else if (sostesB_4[2] == true) {
						sostesEr_4[2] = currentQ_4.getQUESTION_4();
						sostesAp_4[2] = (String) answer.getText();
						sostesB_4[2] = false;
						sostesB_4[3] = true;
					} else if (sostesB_4[3] == true) {
						sostesEr_4[3] = currentQ_4.getQUESTION_4();
						sostesAp_4[3] = (String) answer.getText();
						sostesB_4[3] = false;
						sostesB_4[4] = true;
					} else if (sostesB_4[4] == true) {
						sostesEr_4[4] = currentQ_4.getQUESTION_4();
						sostesAp_4[4] = (String) answer.getText();
						sostesB_4[4] = false;
						sostesB_4[5] = true;
					} else if (sostesB_4[5] == true) {
						sostesEr_4[5] = currentQ_4.getQUESTION_4();
						sostesAp_4[5] = (String) answer.getText();
						sostesB_4[5] = false;
						sostesB_4[6] = true;
					} else if (sostesB_4[6] == true) {
						sostesEr_4[6] = currentQ_4.getQUESTION_4();
						sostesAp_4[6] = (String) answer.getText();
						sostesB_4[6] = false;
						sostesB_4[7] = true;
					} else if (sostesB_4[7] == true) {
						sostesEr_4[7] = currentQ_4.getQUESTION_4();
						sostesAp_4[7] = (String) answer.getText();
						sostesB_4[7] = false;
						sostesB_4[8] = true;
					} else if (sostesB_4[8] == true) {
						sostesEr_4[8] = currentQ_4.getQUESTION_4();
						sostesAp_4[8] = (String) answer.getText();
						sostesB_4[8] = false;
						sostesB_4[9] = true;
					} else if (sostesB_4[9] == true) {
						sostesEr_4[9] = currentQ_4.getQUESTION_4();
						sostesAp_4[9] = (String) answer.getText();
						sostesB_4[9] = false;
						sostesB_4[10] = true;
					} else if (sostesB_4[10] == true) {
						sostesEr_4[10] = currentQ_4.getQUESTION_4();
						sostesAp_4[10] = (String) answer.getText();
						sostesB_4[10] = false;
						sostesB_4[11] = true;
					} else if (sostesB_4[11] == true) {
						sostesEr_4[11] = currentQ_4.getQUESTION_4();
						sostesAp_4[11] = (String) answer.getText();
						sostesB_4[11] = false;
						sostesB_4[12] = true;
					} else if (sostesB_4[12] == true) {
						sostesEr_4[12] = currentQ_4.getQUESTION_4();
						sostesAp_4[12] = (String) answer.getText();
						sostesB_4[12] = false;
						sostesB_4[13] = true;
					} else if (sostesB_4[13] == true) {
						sostesEr_4[13] = currentQ_4.getQUESTION_4();
						sostesAp_4[13] = (String) answer.getText();
						sostesB_4[13] = false;
						sostesB_4[14] = true;
					} else if (sostesB_4[14] == true) {
						sostesEr_4[14] = currentQ_4.getQUESTION_4();
						sostesAp_4[14] = (String) answer.getText();
						sostesB_4[14] = false;
						sostesB_4[15] = true;
					} else if (sostesB_4[15] == true) {
						sostesEr_4[15] = currentQ_4.getQUESTION_4();
						sostesAp_4[15] = (String) answer.getText();
						sostesB_4[15] = false;
						sostesB_4[16] = true;
					} else if (sostesB_4[16] == true) {
						sostesEr_4[16] = currentQ_4.getQUESTION_4();
						sostesAp_4[16] = (String) answer.getText();
						sostesB_4[16] = false;
						sostesB_4[17] = true;
					} else if (sostesB_4[17] == true) {
						sostesEr_4[17] = currentQ_4.getQUESTION_4();
						sostesAp_4[17] = (String) answer.getText();
						sostesB_4[17] = false;
						sostesB_4[18] = true;
					} else if (sostesB_4[18] == true) {
						sostesEr_4[18] = currentQ_4.getQUESTION_4();
						sostesAp_4[18] = (String) answer.getText();
						sostesB_4[18] = false;
						sostesB_4[19] = true;
					} else if (sostesB_4[19] == true) {
						sostesEr_4[19] = currentQ_4.getQUESTION_4();
						sostesAp_4[19] = (String) answer.getText();
						sostesB_4[19] = false;
						sostesB_4[20] = true;
					} else if (sostesB_4[20] == true) {
						sostesEr_4[20] = currentQ_4.getQUESTION_4();
						sostesAp_4[20] = (String) answer.getText();
						sostesB_4[20] = false;
						sostesB_4[21] = true;
					} else if (sostesB_4[21] == true) {
						sostesEr_4[21] = currentQ_4.getQUESTION_4();
						sostesAp_4[21] = (String) answer.getText();
						sostesB_4[21] = false;
						sostesB_4[22] = true;
					} else if (sostesB_4[22] == true) {
						sostesEr_4[22] = currentQ_4.getQUESTION_4();
						sostesAp_4[22] = (String) answer.getText();
						sostesB_4[22] = false;
						sostesB_4[23] = true;
					} else if (sostesB_4[23] == true) {
						sostesEr_4[23] = currentQ_4.getQUESTION_4();
						sostesAp_4[23] = (String) answer.getText();
						sostesB_4[23] = false;
						sostesB_4[24] = true;
					} else if (sostesB_4[24] == true) {
						sostesEr_4[24] = currentQ_4.getQUESTION_4();
						sostesAp_4[24] = (String) answer.getText();
						sostesB_4[24] = false;
						sostesB_4[25] = true;
					} else if (sostesB_4[25] == true) {
						sostesEr_4[25] = currentQ_4.getQUESTION_4();
						sostesAp_4[25] = (String) answer.getText();
						sostesB_4[25] = false;
						sostesB_4[26] = true;
					} else if (sostesB_4[26] == true) {
						sostesEr_4[26] = currentQ_4.getQUESTION_4();
						sostesAp_4[26] = (String) answer.getText();
						sostesB_4[26] = false;
						sostesB_4[27] = true;
					} else if (sostesB_4[27] == true) {
						sostesEr_4[27] = currentQ_4.getQUESTION_4();
						sostesAp_4[27] = (String) answer.getText();
						sostesB_4[27] = false;
						sostesB_4[28] = true;
					} else if (sostesB_4[28] == true) {
						sostesEr_4[28] = currentQ_4.getQUESTION_4();
						sostesAp_4[28] = (String) answer.getText();
						sostesB_4[28] = false;
						sostesB_4[29] = true;
					} else if (sostesB_4[29] == true) {
						sostesEr_4[29] = currentQ_4.getQUESTION_4();
						sostesAp_4[29] = (String) answer.getText();
						sostesB_4[29] = false;
						sostesB_4[30] = true;
					} else if (sostesB_4[30] == true) {
						sostesEr_4[30] = currentQ_4.getQUESTION_4();
						sostesAp_4[30] = (String) answer.getText();
						sostesB_4[30] = false;
						sostesB_4[31] = true;
					} else if (sostesB_4[31] == true) {
						sostesEr_4[31] = currentQ_4.getQUESTION_4();
						sostesAp_4[31] = (String) answer.getText();
						sostesB_4[31] = false;
						sostesB_4[32] = true;
					} else if (sostesB_4[32] == true) {
						sostesEr_4[32] = currentQ_4.getQUESTION_4();
						sostesAp_4[32] = (String) answer.getText();
						sostesB_4[32] = false;
						sostesB_4[33] = true;
					} else if (sostesB_4[33] == true) {
						sostesEr_4[33] = currentQ_4.getQUESTION_4();
						sostesAp_4[33] = (String) answer.getText();
						sostesB_4[33] = false;
						sostesB_4[34] = true;
					} else if (sostesB_4[34] == true) {
						sostesEr_4[34] = currentQ_4.getQUESTION_4();
						sostesAp_4[34] = (String) answer.getText();
						sostesB_4[34] = false;
						sostesB_4[35] = true;
					} else if (sostesB_4[35] == true) {
						sostesEr_4[35] = currentQ_4.getQUESTION_4();
						sostesAp_4[35] = (String) answer.getText();
						sostesB_4[35] = false;
						sostesB_4[36] = true;
					} else if (sostesB_4[36] == true) {
						sostesEr_4[36] = currentQ_4.getQUESTION_4();
						sostesAp_4[36] = (String) answer.getText();
						sostesB_4[36] = false;
						sostesB_4[37] = true;
					} else if (sostesB_4[37] == true) {
						sostesEr_4[37] = currentQ_4.getQUESTION_4();
						sostesAp_4[37] = (String) answer.getText();
						sostesB_4[37] = false;
						sostesB_4[38] = true;
					} else if (sostesB_4[38] == true) {
						sostesEr_4[38] = currentQ_4.getQUESTION_4();
						sostesAp_4[38] = (String) answer.getText();
						sostesB_4[38] = false;
						sostesB_4[39] = true;
					} else if (sostesB_4[39] == true) {
						sostesEr_4[39] = currentQ_4.getQUESTION_4();
						sostesAp_4[39] = (String) answer.getText();
						sostesB_4[39] = false;
						sostesB_4[40] = true;
					} else if (sostesB_4[40] == true) {
						sostesEr_4[40] = currentQ_4.getQUESTION_4();
						sostesAp_4[40] = (String) answer.getText();
						sostesB_4[40] = false;
					}
					score_4++;
					Log.d("score", "Your score" + score_4);
				} else {
					if (lathosB_4[0] == true) {
						lathosEr_4[0] = currentQ_4.getQUESTION_4();
						lathosXr_4[0] = (String) answer.getText();
						lathosAp_4[0] = currentQ_4.getANSWER_4();
						lathosB_4[0] = false;
						lathosB_4[1] = true;
					} else if (lathosB_4[1] == true) {
						lathosEr_4[1] = currentQ_4.getQUESTION_4();
						lathosXr_4[1] = (String) answer.getText();
						lathosAp_4[1] = currentQ_4.getANSWER_4();
						lathosB_4[1] = false;
						lathosB_4[2] = true;
					} else if (lathosB_4[2] == true) {
						lathosEr_4[2] = currentQ_4.getQUESTION_4();
						lathosXr_4[2] = (String) answer.getText();
						lathosAp_4[2] = currentQ_4.getANSWER_4();
						lathosB_4[2] = false;
						lathosB_4[3] = true;
					} else if (lathosB_4[3] == true) {
						lathosEr_4[3] = currentQ_4.getQUESTION_4();
						lathosXr_4[3] = (String) answer.getText();
						lathosAp_4[3] = currentQ_4.getANSWER_4();
						lathosB_4[3] = false;
						lathosB_4[4] = true;
					} else if (lathosB_4[4] == true) {
						lathosEr_4[4] = currentQ_4.getQUESTION_4();
						lathosXr_4[4] = (String) answer.getText();
						lathosAp_4[4] = currentQ_4.getANSWER_4();
						lathosB_4[4] = false;
						lathosB_4[5] = true;
					} else if (lathosB_4[5] == true) {
						lathosEr_4[5] = currentQ_4.getQUESTION_4();
						lathosXr_4[5] = (String) answer.getText();
						lathosAp_4[5] = currentQ_4.getANSWER_4();
						lathosB_4[5] = false;
						lathosB_4[6] = true;
					} else if (lathosB_4[6] == true) {
						lathosEr_4[6] = currentQ_4.getQUESTION_4();
						lathosXr_4[6] = (String) answer.getText();
						lathosAp_4[6] = currentQ_4.getANSWER_4();
						lathosB_4[6] = false;
						lathosB_4[7] = true;
					} else if (lathosB_4[7] == true) {
						lathosEr_4[7] = currentQ_4.getQUESTION_4();
						lathosXr_4[7] = (String) answer.getText();
						lathosAp_4[7] = currentQ_4.getANSWER_4();
						lathosB_4[7] = false;
						lathosB_4[8] = true;
					} else if (lathosB_4[8] == true) {
						lathosEr_4[8] = currentQ_4.getQUESTION_4();
						lathosXr_4[8] = (String) answer.getText();
						lathosAp_4[8] = currentQ_4.getANSWER_4();
						lathosB_4[8] = false;
						lathosB_4[9] = true;
					} else if (lathosB_4[9] == true) {
						lathosEr_4[9] = currentQ_4.getQUESTION_4();
						lathosXr_4[9] = (String) answer.getText();
						lathosAp_4[9] = currentQ_4.getANSWER_4();
						lathosB_4[9] = false;
						lathosB_4[10] = true;
					} else if (lathosB_4[10] == true) {
						lathosEr_4[10] = currentQ_4.getQUESTION_4();
						lathosXr_4[10] = (String) answer.getText();
						lathosAp_4[10] = currentQ_4.getANSWER_4();
						lathosB_4[10] = false;
						lathosB_4[11] = true;
					} else if (lathosB_4[11] == true) {
						lathosEr_4[11] = currentQ_4.getQUESTION_4();
						lathosXr_4[11] = (String) answer.getText();
						lathosAp_4[11] = currentQ_4.getANSWER_4();
						lathosB_4[11] = false;
						lathosB_4[12] = true;
					} else if (lathosB_4[12] == true) {
						lathosEr_4[12] = currentQ_4.getQUESTION_4();
						lathosXr_4[12] = (String) answer.getText();
						lathosAp_4[12] = currentQ_4.getANSWER_4();
						lathosB_4[12] = false;
						lathosB_4[13] = true;
					} else if (lathosB_4[13] == true) {
						lathosEr_4[13] = currentQ_4.getQUESTION_4();
						lathosXr_4[13] = (String) answer.getText();
						lathosAp_4[13] = currentQ_4.getANSWER_4();
						lathosB_4[13] = false;
						lathosB_4[14] = true;
					} else if (lathosB_4[14] == true) {
						lathosEr_4[14] = currentQ_4.getQUESTION_4();
						lathosXr_4[14] = (String) answer.getText();
						lathosAp_4[14] = currentQ_4.getANSWER_4();
						lathosB_4[14] = false;
						lathosB_4[15] = true;
					} else if (lathosB_4[15] == true) {
						lathosEr_4[15] = currentQ_4.getQUESTION_4();
						lathosXr_4[15] = (String) answer.getText();
						lathosAp_4[15] = currentQ_4.getANSWER_4();
						lathosB_4[15] = false;
						lathosB_4[16] = true;
					} else if (lathosB_4[16] == true) {
						lathosEr_4[16] = currentQ_4.getQUESTION_4();
						lathosXr_4[16] = (String) answer.getText();
						lathosAp_4[16] = currentQ_4.getANSWER_4();
						lathosB_4[16] = false;
						lathosB_4[17] = true;
					} else if (lathosB_4[17] == true) {
						lathosEr_4[17] = currentQ_4.getQUESTION_4();
						lathosXr_4[17] = (String) answer.getText();
						lathosAp_4[17] = currentQ_4.getANSWER_4();
						lathosB_4[17] = false;
						lathosB_4[18] = true;
					} else if (lathosB_4[18] == true) {
						lathosEr_4[18] = currentQ_4.getQUESTION_4();
						lathosXr_4[18] = (String) answer.getText();
						lathosAp_4[18] = currentQ_4.getANSWER_4();
						lathosB_4[18] = false;
						lathosB_4[19] = true;
					} else if (lathosB_4[19] == true) {
						lathosEr_4[19] = currentQ_4.getQUESTION_4();
						lathosXr_4[19] = (String) answer.getText();
						lathosAp_4[19] = currentQ_4.getANSWER_4();
						lathosB_4[19] = false;
						lathosB_4[20] = true;
					} else if (lathosB_4[20] == true) {
						lathosEr_4[20] = currentQ_4.getQUESTION_4();
						lathosXr_4[20] = (String) answer.getText();
						lathosAp_4[20] = currentQ_4.getANSWER_4();
						lathosB_4[20] = false;
						lathosB_4[21] = true;
					} else if (lathosB_4[21] == true) {
						lathosEr_4[21] = currentQ_4.getQUESTION_4();
						lathosXr_4[21] = (String) answer.getText();
						lathosAp_4[21] = currentQ_4.getANSWER_4();
						lathosB_4[21] = false;
						lathosB_4[22] = true;
					} else if (lathosB_4[22] == true) {
						lathosEr_4[22] = currentQ_4.getQUESTION_4();
						lathosXr_4[22] = (String) answer.getText();
						lathosAp_4[22] = currentQ_4.getANSWER_4();
						lathosB_4[22] = false;
						lathosB_4[23] = true;
					} else if (lathosB_4[23] == true) {
						lathosEr_4[23] = currentQ_4.getQUESTION_4();
						lathosXr_4[23] = (String) answer.getText();
						lathosAp_4[23] = currentQ_4.getANSWER_4();
						lathosB_4[23] = false;
						lathosB_4[24] = true;
					} else if (lathosB_4[24] == true) {
						lathosEr_4[24] = currentQ_4.getQUESTION_4();
						lathosXr_4[24] = (String) answer.getText();
						lathosAp_4[24] = currentQ_4.getANSWER_4();
						lathosB_4[24] = false;
						lathosB_4[25] = true;
					} else if (lathosB_4[25] == true) {
						lathosEr_4[25] = currentQ_4.getQUESTION_4();
						lathosXr_4[25] = (String) answer.getText();
						lathosAp_4[25] = currentQ_4.getANSWER_4();
						lathosB_4[25] = false;
						lathosB_4[26] = true;
					} else if (lathosB_4[26] == true) {
						lathosEr_4[26] = currentQ_4.getQUESTION_4();
						lathosXr_4[26] = (String) answer.getText();
						lathosAp_4[26] = currentQ_4.getANSWER_4();
						lathosB_4[26] = false;
						lathosB_4[27] = true;
					} else if (lathosB_4[27] == true) {
						lathosEr_4[27] = currentQ_4.getQUESTION_4();
						lathosXr_4[27] = (String) answer.getText();
						lathosAp_4[27] = currentQ_4.getANSWER_4();
						lathosB_4[27] = false;
						lathosB_4[28] = true;
					} else if (lathosB_4[28] == true) {
						lathosEr_4[28] = currentQ_4.getQUESTION_4();
						lathosXr_4[28] = (String) answer.getText();
						lathosAp_4[28] = currentQ_4.getANSWER_4();
						lathosB_4[28] = false;
						lathosB_4[29] = true;
					} else if (lathosB_4[29] == true) {
						lathosEr_4[29] = currentQ_4.getQUESTION_4();
						lathosXr_4[29] = (String) answer.getText();
						lathosAp_4[29] = currentQ_4.getANSWER_4();
						lathosB_4[29] = false;
						lathosB_4[30] = true;
					} else if (lathosB_4[30] == true) {
						lathosEr_4[30] = currentQ_4.getQUESTION_4();
						lathosXr_4[30] = (String) answer.getText();
						lathosAp_4[30] = currentQ_4.getANSWER_4();
						lathosB_4[30] = false;
						lathosB_4[31] = true;
					} else if (lathosB_4[31] == true) {
						lathosEr_4[31] = currentQ_4.getQUESTION_4();
						lathosXr_4[31] = (String) answer.getText();
						lathosAp_4[31] = currentQ_4.getANSWER_4();
						lathosB_4[31] = false;
						lathosB_4[32] = true;
					} else if (lathosB_4[32] == true) {
						lathosEr_4[32] = currentQ_4.getQUESTION_4();
						lathosXr_4[32] = (String) answer.getText();
						lathosAp_4[32] = currentQ_4.getANSWER_4();
						lathosB_4[32] = false;
						lathosB_4[33] = true;
					} else if (lathosB_4[33] == true) {
						lathosEr_4[33] = currentQ_4.getQUESTION_4();
						lathosXr_4[33] = (String) answer.getText();
						lathosAp_4[33] = currentQ_4.getANSWER_4();
						lathosB_4[33] = false;
						lathosB_4[34] = true;
					} else if (lathosB_4[34] == true) {
						lathosEr_4[34] = currentQ_4.getQUESTION_4();
						lathosXr_4[34] = (String) answer.getText();
						lathosAp_4[34] = currentQ_4.getANSWER_4();
						lathosB_4[34] = false;
						lathosB_4[35] = true;
					} else if (lathosB_4[35] == true) {
						lathosEr_4[35] = currentQ_4.getQUESTION_4();
						lathosXr_4[35] = (String) answer.getText();
						lathosAp_4[35] = currentQ_4.getANSWER_4();
						lathosB_4[35] = false;
						lathosB_4[36] = true;
					} else if (lathosB_4[36] == true) {
						lathosEr_4[36] = currentQ_4.getQUESTION_4();
						lathosXr_4[36] = (String) answer.getText();
						lathosAp_4[36] = currentQ_4.getANSWER_4();
						lathosB_4[36] = false;
						lathosB_4[37] = true;
					} else if (lathosB_4[37] == true) {
						lathosEr_4[37] = currentQ_4.getQUESTION_4();
						lathosXr_4[37] = (String) answer.getText();
						lathosAp_4[37] = currentQ_4.getANSWER_4();
						lathosB_4[37] = false;
						lathosB_4[38] = true;
					} else if (lathosB_4[38] == true) {
						lathosEr_4[38] = currentQ_4.getQUESTION_4();
						lathosXr_4[38] = (String) answer.getText();
						lathosAp_4[38] = currentQ_4.getANSWER_4();
						lathosB_4[38] = false;
						lathosB_4[39] = true;
					} else if (lathosB_4[39] == true) {
						lathosEr_4[39] = currentQ_4.getQUESTION_4();
						lathosXr_4[39] = (String) answer.getText();
						lathosAp_4[39] = currentQ_4.getANSWER_4();
						lathosB_4[39] = false;
						lathosB_4[40] = true;
					} else if (lathosB_4[40] == true) {
						lathosEr_4[40] = currentQ_4.getQUESTION_4();
						lathosXr_4[40] = (String) answer.getText();
						lathosAp_4[40] = currentQ_4.getANSWER_4();
						lathosB_4[40] = false;
					}

				}
				if (qid_4 < 40) {
					txtErotisi.setText("Ερώτηση: " + (qid_4 + 1));
					currentQ_4 = quesList_4.get(qid_4);
					setQuestionView();
				} else {
					Intent intent = new Intent(QuizActivity_4.this,
							ResultActivity_4.class);
					Bundle b = new Bundle();
					b.putInt("score", score_4); // Your score
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
		txtQuestion.setText(currentQ_4.getQUESTION_4());
		rda.setText(currentQ_4.getOPTA_4());
		rdb.setText(currentQ_4.getOPTB_4());
		rdc.setText(currentQ_4.getOPTC_4());
		rdd.setText(currentQ_4.getOPTD_4());
		qid_4++;
	}
}
