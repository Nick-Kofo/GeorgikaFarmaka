package com.pkm.georgikafarmaka;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.content.Intent;

public class Erotimatologio extends Activity implements OnClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.erotimatologio);
		
		Button test_1 = (Button) findViewById(R.id.bTest1);
		test_1.setOnClickListener(this);
		Button test_2 = (Button) findViewById(R.id.bTest2);
		test_2.setOnClickListener(this);
		Button test_3 = (Button) findViewById(R.id.bTest3);
		test_3.setOnClickListener(this);
		Button test_4 = (Button) findViewById(R.id.bTest4);
		test_4.setOnClickListener(this);
		Button test_5 = (Button) findViewById(R.id.bTest5);
		test_5.setOnClickListener(this);
		Button test_6 = (Button) findViewById(R.id.bTest6);
		test_6.setOnClickListener(this);
		Button test_7 = (Button) findViewById(R.id.bTest7);
		test_7.setOnClickListener(this);
	}

	private void test1Click() {

		startActivity(new Intent("com.example.triviality.QuizActivity"));
	}
	
	private void test2Click() {

		startActivity(new Intent("com.example.triviality.QuizActivity_2"));
	}
	private void test3Click() {

		startActivity(new Intent("com.example.triviality.QuizActivity_3"));
	}
	private void test4Click() {

		startActivity(new Intent("com.example.triviality.QuizActivity_4"));
	}
	private void test5Click() {

		startActivity(new Intent("com.example.triviality.QuizActivity_5"));
	}
	private void test6Click() {

		startActivity(new Intent("com.example.triviality.QuizActivity_6"));
	}
	private void test7Click() {

		startActivity(new Intent("com.example.triviality.QuizActivity_7"));
	}

	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.bTest1:
			test1Click();
			break;
		case R.id.bTest2:
			test2Click();
			break;
		case R.id.bTest3:
			test3Click();
			break;
		case R.id.bTest4:
			test4Click();
			break;
		case R.id.bTest5:
			test5Click();
			break;
		case R.id.bTest6:
			test6Click();
			break;
		case R.id.bTest7:
			test7Click();
			break;
		default:
			break;
		
		}
	}
}
