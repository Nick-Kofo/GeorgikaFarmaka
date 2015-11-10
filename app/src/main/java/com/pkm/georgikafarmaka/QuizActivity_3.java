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

public class QuizActivity_3 extends Activity {
    List<Question_3> quesList_3;
    int score_3 = 0;
    int qid_3 = 0;
    // SOSTA STATIC
    public static String[] sostesEr_3 = new String[40];
    public static String[] sostesAp_3 = new String[40];
    public static Boolean[] sostesB_3 = new Boolean[]{true, false, false,
            false, false, false, false, false, false, false, false, false,
            false, false, false, false, false, false, false, false, false,
            false, false, false, false, false, false, false, false, false,
            false, false, false, false, false, false, false, false, false,
            false, false, false, false, false, false, false, false, false,
            false, false, false};
    //LATHOS STATIC
    public static String[] lathosEr_3 = new String[40];
    public static String[] lathosAp_3 = new String[40];
    public static String[] lathosXr_3 = new String[40];
    public static Boolean[] lathosB_3 = new Boolean[]{true, false, false,
            false, false, false, false, false, false, false, false, false,
            false, false, false, false, false, false, false, false, false,
            false, false, false, false, false, false, false, false, false,
            false, false, false, false, false, false, false, false, false,
            false, false, false, false, false, false, false, false, false,
            false, false, false};

    Question_3 currentQ_3;
    TextView txtQuestion, txtErotisi;
    RadioButton rda, rdb, rdc, rdd;
    Button butNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        DbHelper db = new DbHelper(this);
        quesList_3 = db.getAllQuestions_3();
        currentQ_3 = quesList_3.get(qid_3);
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
                Log.d("yourans", currentQ_3.getANSWER_3() + " " + answer.getText());
                if (currentQ_3.getANSWER_3().equals(answer.getText())) {
                    if (sostesB_3[0] == true) {
                        sostesEr_3[0] = currentQ_3.getQUESTION_3();
                        sostesAp_3[0] = (String) answer.getText();
                        sostesB_3[0] = false;
                        sostesB_3[1] = true;
                    } else if (sostesB_3[1] == true) {
                        sostesEr_3[1] = currentQ_3.getQUESTION_3();
                        sostesAp_3[1] = (String) answer.getText();
                        sostesB_3[1] = false;
                        sostesB_3[2] = true;
                    } else if (sostesB_3[2] == true) {
                        sostesEr_3[2] = currentQ_3.getQUESTION_3();
                        sostesAp_3[2] = (String) answer.getText();
                        sostesB_3[2] = false;
                        sostesB_3[3] = true;
                    } else if (sostesB_3[3] == true) {
                        sostesEr_3[3] = currentQ_3.getQUESTION_3();
                        sostesAp_3[3] = (String) answer.getText();
                        sostesB_3[3] = false;
                        sostesB_3[4] = true;
                    } else if (sostesB_3[4] == true) {
                        sostesEr_3[4] = currentQ_3.getQUESTION_3();
                        sostesAp_3[4] = (String) answer.getText();
                        sostesB_3[4] = false;
                        sostesB_3[5] = true;
                    } else if (sostesB_3[5] == true) {
                        sostesEr_3[5] = currentQ_3.getQUESTION_3();
                        sostesAp_3[5] = (String) answer.getText();
                        sostesB_3[5] = false;
                        sostesB_3[6] = true;
                    } else if (sostesB_3[6] == true) {
                        sostesEr_3[6] = currentQ_3.getQUESTION_3();
                        sostesAp_3[6] = (String) answer.getText();
                        sostesB_3[6] = false;
                        sostesB_3[7] = true;
                    } else if (sostesB_3[7] == true) {
                        sostesEr_3[7] = currentQ_3.getQUESTION_3();
                        sostesAp_3[7] = (String) answer.getText();
                        sostesB_3[7] = false;
                        sostesB_3[8] = true;
                    } else if (sostesB_3[8] == true) {
                        sostesEr_3[8] = currentQ_3.getQUESTION_3();
                        sostesAp_3[8] = (String) answer.getText();
                        sostesB_3[8] = false;
                        sostesB_3[9] = true;
                    } else if (sostesB_3[9] == true) {
                        sostesEr_3[9] = currentQ_3.getQUESTION_3();
                        sostesAp_3[9] = (String) answer.getText();
                        sostesB_3[9] = false;
                        sostesB_3[10] = true;
                    } else if (sostesB_3[10] == true) {
                        sostesEr_3[10] = currentQ_3.getQUESTION_3();
                        sostesAp_3[10] = (String) answer.getText();
                        sostesB_3[10] = false;
                        sostesB_3[11] = true;
                    } else if (sostesB_3[11] == true) {
                        sostesEr_3[11] = currentQ_3.getQUESTION_3();
                        sostesAp_3[11] = (String) answer.getText();
                        sostesB_3[11] = false;
                        sostesB_3[12] = true;
                    } else if (sostesB_3[12] == true) {
                        sostesEr_3[12] = currentQ_3.getQUESTION_3();
                        sostesAp_3[12] = (String) answer.getText();
                        sostesB_3[12] = false;
                        sostesB_3[13] = true;
                    } else if (sostesB_3[13] == true) {
                        sostesEr_3[13] = currentQ_3.getQUESTION_3();
                        sostesAp_3[13] = (String) answer.getText();
                        sostesB_3[13] = false;
                        sostesB_3[14] = true;
                    } else if (sostesB_3[14] == true) {
                        sostesEr_3[14] = currentQ_3.getQUESTION_3();
                        sostesAp_3[14] = (String) answer.getText();
                        sostesB_3[14] = false;
                        sostesB_3[15] = true;
                    } else if (sostesB_3[15] == true) {
                        sostesEr_3[15] = currentQ_3.getQUESTION_3();
                        sostesAp_3[15] = (String) answer.getText();
                        sostesB_3[15] = false;
                        sostesB_3[16] = true;
                    } else if (sostesB_3[16] == true) {
                        sostesEr_3[16] = currentQ_3.getQUESTION_3();
                        sostesAp_3[16] = (String) answer.getText();
                        sostesB_3[16] = false;
                        sostesB_3[17] = true;
                    } else if (sostesB_3[17] == true) {
                        sostesEr_3[17] = currentQ_3.getQUESTION_3();
                        sostesAp_3[17] = (String) answer.getText();
                        sostesB_3[17] = false;
                        sostesB_3[18] = true;
                    } else if (sostesB_3[18] == true) {
                        sostesEr_3[18] = currentQ_3.getQUESTION_3();
                        sostesAp_3[18] = (String) answer.getText();
                        sostesB_3[18] = false;
                        sostesB_3[19] = true;
                    } else if (sostesB_3[19] == true) {
                        sostesEr_3[19] = currentQ_3.getQUESTION_3();
                        sostesAp_3[19] = (String) answer.getText();
                        sostesB_3[19] = false;
                        sostesB_3[20] = true;
                    } else if (sostesB_3[20] == true) {
                        sostesEr_3[20] = currentQ_3.getQUESTION_3();
                        sostesAp_3[20] = (String) answer.getText();
                        sostesB_3[20] = false;
                        sostesB_3[21] = true;
                    } else if (sostesB_3[21] == true) {
                        sostesEr_3[21] = currentQ_3.getQUESTION_3();
                        sostesAp_3[21] = (String) answer.getText();
                        sostesB_3[21] = false;
                        sostesB_3[22] = true;
                    } else if (sostesB_3[22] == true) {
                        sostesEr_3[22] = currentQ_3.getQUESTION_3();
                        sostesAp_3[22] = (String) answer.getText();
                        sostesB_3[22] = false;
                        sostesB_3[23] = true;
                    } else if (sostesB_3[23] == true) {
                        sostesEr_3[23] = currentQ_3.getQUESTION_3();
                        sostesAp_3[23] = (String) answer.getText();
                        sostesB_3[23] = false;
                        sostesB_3[24] = true;
                    } else if (sostesB_3[24] == true) {
                        sostesEr_3[24] = currentQ_3.getQUESTION_3();
                        sostesAp_3[24] = (String) answer.getText();
                        sostesB_3[24] = false;
                        sostesB_3[25] = true;
                    } else if (sostesB_3[25] == true) {
                        sostesEr_3[25] = currentQ_3.getQUESTION_3();
                        sostesAp_3[25] = (String) answer.getText();
                        sostesB_3[25] = false;
                        sostesB_3[26] = true;
                    } else if (sostesB_3[26] == true) {
                        sostesEr_3[26] = currentQ_3.getQUESTION_3();
                        sostesAp_3[26] = (String) answer.getText();
                        sostesB_3[26] = false;
                        sostesB_3[27] = true;
                    } else if (sostesB_3[27] == true) {
                        sostesEr_3[27] = currentQ_3.getQUESTION_3();
                        sostesAp_3[27] = (String) answer.getText();
                        sostesB_3[27] = false;
                        sostesB_3[28] = true;
                    } else if (sostesB_3[28] == true) {
                        sostesEr_3[28] = currentQ_3.getQUESTION_3();
                        sostesAp_3[28] = (String) answer.getText();
                        sostesB_3[28] = false;
                        sostesB_3[29] = true;
                    } else if (sostesB_3[29] == true) {
                        sostesEr_3[29] = currentQ_3.getQUESTION_3();
                        sostesAp_3[29] = (String) answer.getText();
                        sostesB_3[29] = false;
                        sostesB_3[30] = true;
                    } else if (sostesB_3[30] == true) {
                        sostesEr_3[30] = currentQ_3.getQUESTION_3();
                        sostesAp_3[30] = (String) answer.getText();
                        sostesB_3[30] = false;
                        sostesB_3[31] = true;
                    } else if (sostesB_3[31] == true) {
                        sostesEr_3[31] = currentQ_3.getQUESTION_3();
                        sostesAp_3[31] = (String) answer.getText();
                        sostesB_3[31] = false;
                        sostesB_3[32] = true;
                    } else if (sostesB_3[32] == true) {
                        sostesEr_3[32] = currentQ_3.getQUESTION_3();
                        sostesAp_3[32] = (String) answer.getText();
                        sostesB_3[32] = false;
                        sostesB_3[33] = true;
                    } else if (sostesB_3[33] == true) {
                        sostesEr_3[33] = currentQ_3.getQUESTION_3();
                        sostesAp_3[33] = (String) answer.getText();
                        sostesB_3[33] = false;
                        sostesB_3[34] = true;
                    } else if (sostesB_3[34] == true) {
                        sostesEr_3[34] = currentQ_3.getQUESTION_3();
                        sostesAp_3[34] = (String) answer.getText();
                        sostesB_3[34] = false;
                        sostesB_3[35] = true;
                    } else if (sostesB_3[35] == true) {
                        sostesEr_3[35] = currentQ_3.getQUESTION_3();
                        sostesAp_3[35] = (String) answer.getText();
                        sostesB_3[35] = false;
                        sostesB_3[36] = true;
                    } else if (sostesB_3[36] == true) {
                        sostesEr_3[36] = currentQ_3.getQUESTION_3();
                        sostesAp_3[36] = (String) answer.getText();
                        sostesB_3[36] = false;
                        sostesB_3[37] = true;
                    } else if (sostesB_3[37] == true) {
                        sostesEr_3[37] = currentQ_3.getQUESTION_3();
                        sostesAp_3[37] = (String) answer.getText();
                        sostesB_3[37] = false;
                        sostesB_3[38] = true;
                    } else if (sostesB_3[38] == true) {
                        sostesEr_3[38] = currentQ_3.getQUESTION_3();
                        sostesAp_3[38] = (String) answer.getText();
                        sostesB_3[38] = false;
                        sostesB_3[39] = true;
                    } else if (sostesB_3[39] == true) {
                        sostesEr_3[39] = currentQ_3.getQUESTION_3();
                        sostesAp_3[39] = (String) answer.getText();
                        sostesB_3[39] = false;
                        sostesB_3[40] = true;
                    } else if (sostesB_3[40] == true) {
                        sostesEr_3[40] = currentQ_3.getQUESTION_3();
                        sostesAp_3[40] = (String) answer.getText();
                        sostesB_3[40] = false;
                    }
                    score_3++;
                    Log.d("score", "Your score" + score_3);
                } else {
                    if (lathosB_3[0] == true) {
                        lathosEr_3[0] = currentQ_3.getQUESTION_3();
                        lathosXr_3[0] = (String) answer.getText();
                        lathosAp_3[0] = currentQ_3.getANSWER_3();
                        lathosB_3[0] = false;
                        lathosB_3[1] = true;
                    } else if (lathosB_3[1] == true) {
                        lathosEr_3[1] = currentQ_3.getQUESTION_3();
                        lathosXr_3[1] = (String) answer.getText();
                        lathosAp_3[1] = currentQ_3.getANSWER_3();
                        lathosB_3[1] = false;
                        lathosB_3[2] = true;
                    } else if (lathosB_3[2] == true) {
                        lathosEr_3[2] = currentQ_3.getQUESTION_3();
                        lathosXr_3[2] = (String) answer.getText();
                        lathosAp_3[2] = currentQ_3.getANSWER_3();
                        lathosB_3[2] = false;
                        lathosB_3[3] = true;
                    } else if (lathosB_3[3] == true) {
                        lathosEr_3[3] = currentQ_3.getQUESTION_3();
                        lathosXr_3[3] = (String) answer.getText();
                        lathosAp_3[3] = currentQ_3.getANSWER_3();
                        lathosB_3[3] = false;
                        lathosB_3[4] = true;
                    } else if (lathosB_3[4] == true) {
                        lathosEr_3[4] = currentQ_3.getQUESTION_3();
                        lathosXr_3[4] = (String) answer.getText();
                        lathosAp_3[4] = currentQ_3.getANSWER_3();
                        lathosB_3[4] = false;
                        lathosB_3[5] = true;
                    } else if (lathosB_3[5] == true) {
                        lathosEr_3[5] = currentQ_3.getQUESTION_3();
                        lathosXr_3[5] = (String) answer.getText();
                        lathosAp_3[5] = currentQ_3.getANSWER_3();
                        lathosB_3[5] = false;
                        lathosB_3[6] = true;
                    } else if (lathosB_3[6] == true) {
                        lathosEr_3[6] = currentQ_3.getQUESTION_3();
                        lathosXr_3[6] = (String) answer.getText();
                        lathosAp_3[6] = currentQ_3.getANSWER_3();
                        lathosB_3[6] = false;
                        lathosB_3[7] = true;
                    } else if (lathosB_3[7] == true) {
                        lathosEr_3[7] = currentQ_3.getQUESTION_3();
                        lathosXr_3[7] = (String) answer.getText();
                        lathosAp_3[7] = currentQ_3.getANSWER_3();
                        lathosB_3[7] = false;
                        lathosB_3[8] = true;
                    } else if (lathosB_3[8] == true) {
                        lathosEr_3[8] = currentQ_3.getQUESTION_3();
                        lathosXr_3[8] = (String) answer.getText();
                        lathosAp_3[8] = currentQ_3.getANSWER_3();
                        lathosB_3[8] = false;
                        lathosB_3[9] = true;
                    } else if (lathosB_3[9] == true) {
                        lathosEr_3[9] = currentQ_3.getQUESTION_3();
                        lathosXr_3[9] = (String) answer.getText();
                        lathosAp_3[9] = currentQ_3.getANSWER_3();
                        lathosB_3[9] = false;
                        lathosB_3[10] = true;
                    } else if (lathosB_3[10] == true) {
                        lathosEr_3[10] = currentQ_3.getQUESTION_3();
                        lathosXr_3[10] = (String) answer.getText();
                        lathosAp_3[10] = currentQ_3.getANSWER_3();
                        lathosB_3[10] = false;
                        lathosB_3[11] = true;
                    } else if (lathosB_3[11] == true) {
                        lathosEr_3[11] = currentQ_3.getQUESTION_3();
                        lathosXr_3[11] = (String) answer.getText();
                        lathosAp_3[11] = currentQ_3.getANSWER_3();
                        lathosB_3[11] = false;
                        lathosB_3[12] = true;
                    } else if (lathosB_3[12] == true) {
                        lathosEr_3[12] = currentQ_3.getQUESTION_3();
                        lathosXr_3[12] = (String) answer.getText();
                        lathosAp_3[12] = currentQ_3.getANSWER_3();
                        lathosB_3[12] = false;
                        lathosB_3[13] = true;
                    } else if (lathosB_3[13] == true) {
                        lathosEr_3[13] = currentQ_3.getQUESTION_3();
                        lathosXr_3[13] = (String) answer.getText();
                        lathosAp_3[13] = currentQ_3.getANSWER_3();
                        lathosB_3[13] = false;
                        lathosB_3[14] = true;
                    } else if (lathosB_3[14] == true) {
                        lathosEr_3[14] = currentQ_3.getQUESTION_3();
                        lathosXr_3[14] = (String) answer.getText();
                        lathosAp_3[14] = currentQ_3.getANSWER_3();
                        lathosB_3[14] = false;
                        lathosB_3[15] = true;
                    } else if (lathosB_3[15] == true) {
                        lathosEr_3[15] = currentQ_3.getQUESTION_3();
                        lathosXr_3[15] = (String) answer.getText();
                        lathosAp_3[15] = currentQ_3.getANSWER_3();
                        lathosB_3[15] = false;
                        lathosB_3[16] = true;
                    } else if (lathosB_3[16] == true) {
                        lathosEr_3[16] = currentQ_3.getQUESTION_3();
                        lathosXr_3[16] = (String) answer.getText();
                        lathosAp_3[16] = currentQ_3.getANSWER_3();
                        lathosB_3[16] = false;
                        lathosB_3[17] = true;
                    } else if (lathosB_3[17] == true) {
                        lathosEr_3[17] = currentQ_3.getQUESTION_3();
                        lathosXr_3[17] = (String) answer.getText();
                        lathosAp_3[17] = currentQ_3.getANSWER_3();
                        lathosB_3[17] = false;
                        lathosB_3[18] = true;
                    } else if (lathosB_3[18] == true) {
                        lathosEr_3[18] = currentQ_3.getQUESTION_3();
                        lathosXr_3[18] = (String) answer.getText();
                        lathosAp_3[18] = currentQ_3.getANSWER_3();
                        lathosB_3[18] = false;
                        lathosB_3[19] = true;
                    } else if (lathosB_3[19] == true) {
                        lathosEr_3[19] = currentQ_3.getQUESTION_3();
                        lathosXr_3[19] = (String) answer.getText();
                        lathosAp_3[19] = currentQ_3.getANSWER_3();
                        lathosB_3[19] = false;
                        lathosB_3[20] = true;
                    } else if (lathosB_3[20] == true) {
                        lathosEr_3[20] = currentQ_3.getQUESTION_3();
                        lathosXr_3[20] = (String) answer.getText();
                        lathosAp_3[20] = currentQ_3.getANSWER_3();
                        lathosB_3[20] = false;
                        lathosB_3[21] = true;
                    } else if (lathosB_3[21] == true) {
                        lathosEr_3[21] = currentQ_3.getQUESTION_3();
                        lathosXr_3[21] = (String) answer.getText();
                        lathosAp_3[21] = currentQ_3.getANSWER_3();
                        lathosB_3[21] = false;
                        lathosB_3[22] = true;
                    } else if (lathosB_3[22] == true) {
                        lathosEr_3[22] = currentQ_3.getQUESTION_3();
                        lathosXr_3[22] = (String) answer.getText();
                        lathosAp_3[22] = currentQ_3.getANSWER_3();
                        lathosB_3[22] = false;
                        lathosB_3[23] = true;
                    } else if (lathosB_3[23] == true) {
                        lathosEr_3[23] = currentQ_3.getQUESTION_3();
                        lathosXr_3[23] = (String) answer.getText();
                        lathosAp_3[23] = currentQ_3.getANSWER_3();
                        lathosB_3[23] = false;
                        lathosB_3[24] = true;
                    } else if (lathosB_3[24] == true) {
                        lathosEr_3[24] = currentQ_3.getQUESTION_3();
                        lathosXr_3[24] = (String) answer.getText();
                        lathosAp_3[24] = currentQ_3.getANSWER_3();
                        lathosB_3[24] = false;
                        lathosB_3[25] = true;
                    } else if (lathosB_3[25] == true) {
                        lathosEr_3[25] = currentQ_3.getQUESTION_3();
                        lathosXr_3[25] = (String) answer.getText();
                        lathosAp_3[25] = currentQ_3.getANSWER_3();
                        lathosB_3[25] = false;
                        lathosB_3[26] = true;
                    } else if (lathosB_3[26] == true) {
                        lathosEr_3[26] = currentQ_3.getQUESTION_3();
                        lathosXr_3[26] = (String) answer.getText();
                        lathosAp_3[26] = currentQ_3.getANSWER_3();
                        lathosB_3[26] = false;
                        lathosB_3[27] = true;
                    } else if (lathosB_3[27] == true) {
                        lathosEr_3[27] = currentQ_3.getQUESTION_3();
                        lathosXr_3[27] = (String) answer.getText();
                        lathosAp_3[27] = currentQ_3.getANSWER_3();
                        lathosB_3[27] = false;
                        lathosB_3[28] = true;
                    } else if (lathosB_3[28] == true) {
                        lathosEr_3[28] = currentQ_3.getQUESTION_3();
                        lathosXr_3[28] = (String) answer.getText();
                        lathosAp_3[28] = currentQ_3.getANSWER_3();
                        lathosB_3[28] = false;
                        lathosB_3[29] = true;
                    } else if (lathosB_3[29] == true) {
                        lathosEr_3[29] = currentQ_3.getQUESTION_3();
                        lathosXr_3[29] = (String) answer.getText();
                        lathosAp_3[29] = currentQ_3.getANSWER_3();
                        lathosB_3[29] = false;
                        lathosB_3[30] = true;
                    } else if (lathosB_3[30] == true) {
                        lathosEr_3[30] = currentQ_3.getQUESTION_3();
                        lathosXr_3[30] = (String) answer.getText();
                        lathosAp_3[30] = currentQ_3.getANSWER_3();
                        lathosB_3[30] = false;
                        lathosB_3[31] = true;
                    } else if (lathosB_3[31] == true) {
                        lathosEr_3[31] = currentQ_3.getQUESTION_3();
                        lathosXr_3[31] = (String) answer.getText();
                        lathosAp_3[31] = currentQ_3.getANSWER_3();
                        lathosB_3[31] = false;
                        lathosB_3[32] = true;
                    } else if (lathosB_3[32] == true) {
                        lathosEr_3[32] = currentQ_3.getQUESTION_3();
                        lathosXr_3[32] = (String) answer.getText();
                        lathosAp_3[32] = currentQ_3.getANSWER_3();
                        lathosB_3[32] = false;
                        lathosB_3[33] = true;
                    } else if (lathosB_3[33] == true) {
                        lathosEr_3[33] = currentQ_3.getQUESTION_3();
                        lathosXr_3[33] = (String) answer.getText();
                        lathosAp_3[33] = currentQ_3.getANSWER_3();
                        lathosB_3[33] = false;
                        lathosB_3[34] = true;
                    } else if (lathosB_3[34] == true) {
                        lathosEr_3[34] = currentQ_3.getQUESTION_3();
                        lathosXr_3[34] = (String) answer.getText();
                        lathosAp_3[34] = currentQ_3.getANSWER_3();
                        lathosB_3[34] = false;
                        lathosB_3[35] = true;
                    } else if (lathosB_3[35] == true) {
                        lathosEr_3[35] = currentQ_3.getQUESTION_3();
                        lathosXr_3[35] = (String) answer.getText();
                        lathosAp_3[35] = currentQ_3.getANSWER_3();
                        lathosB_3[35] = false;
                        lathosB_3[36] = true;
                    } else if (lathosB_3[36] == true) {
                        lathosEr_3[36] = currentQ_3.getQUESTION_3();
                        lathosXr_3[36] = (String) answer.getText();
                        lathosAp_3[36] = currentQ_3.getANSWER_3();
                        lathosB_3[36] = false;
                        lathosB_3[37] = true;
                    } else if (lathosB_3[37] == true) {
                        lathosEr_3[37] = currentQ_3.getQUESTION_3();
                        lathosXr_3[37] = (String) answer.getText();
                        lathosAp_3[37] = currentQ_3.getANSWER_3();
                        lathosB_3[37] = false;
                        lathosB_3[38] = true;
                    } else if (lathosB_3[38] == true) {
                        lathosEr_3[38] = currentQ_3.getQUESTION_3();
                        lathosXr_3[38] = (String) answer.getText();
                        lathosAp_3[38] = currentQ_3.getANSWER_3();
                        lathosB_3[38] = false;
                        lathosB_3[39] = true;
                    } else if (lathosB_3[39] == true) {
                        lathosEr_3[39] = currentQ_3.getQUESTION_3();
                        lathosXr_3[39] = (String) answer.getText();
                        lathosAp_3[39] = currentQ_3.getANSWER_3();
                        lathosB_3[39] = false;
                        lathosB_3[40] = true;
                    } else if (lathosB_3[40] == true) {
                        lathosEr_3[40] = currentQ_3.getQUESTION_3();
                        lathosXr_3[40] = (String) answer.getText();
                        lathosAp_3[40] = currentQ_3.getANSWER_3();
                        lathosB_3[40] = false;
                    }

                }
                if (qid_3 < 40) {
                    txtErotisi.setText("Ερώτηση: " + (qid_3 + 1));
                    currentQ_3 = quesList_3.get(qid_3);
                    setQuestionView();
                } else {
                    Intent intent = new Intent(QuizActivity_3.this,
                            ResultActivity_3.class);
                    Bundle b = new Bundle();
                    b.putInt("score", score_3); // Your score
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
        txtQuestion.setText(currentQ_3.getQUESTION_3());
        rda.setText(currentQ_3.getOPTA_3());
        rdb.setText(currentQ_3.getOPTB_3());
        rdc.setText(currentQ_3.getOPTC_3());
        rdd.setText(currentQ_3.getOPTD_3());
        qid_3++;
    }
}
