package com.example.smartalarm2;

import java.util.Random;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Level3 extends Activity {
Random rand = new Random();
public static int score1;
public static int c = 0;
public static int cn = 0;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_count2);
		int result = 0;
		int result2 = 0;
		switch(Alarm.DiffLvl) {
			case 3:
		result = rand.nextInt(9999);
		result2 = rand.nextInt(9999);
		break;
			case 2:
				result = rand.nextInt(999);
				result2 = rand.nextInt(999);
				break;
			case 1:
				result = rand.nextInt(99);
				result2 = rand.nextInt(99);
				break;
		}
		int c = rand.nextInt(2);
		int plusminus = rand.nextInt(2);
		int endResult;
        Button button1aa = (Button)findViewById(R.id.button1aa);
        Button button2aa = (Button)findViewById(R.id.button2aa);
        Button button3aa = (Button)findViewById(R.id.button3aa);
        TextView textView1 = (TextView)findViewById(R.id.textView1);
        
        
       
		if(plusminus==1){
			endResult = result + result2; 
			textView1.setText(result2+"+"+result+"=?");
		}else{
			endResult = result2 - result;
			textView1.setText(result2+"-"+result+"=?");
		}
		int wResult = (int)(endResult +(Math.pow(10,rand.nextInt(3)))*(rand.nextInt(8)+1)); 
		int wResult2 = (int)(endResult +(Math.pow(10,rand.nextInt(3)))*(rand.nextInt(8)+1)); 
		
		 switch(c) {
			 case 0:
			 button1aa.setText(""+endResult+"");
			 button2aa.setText(""+wResult+"");
			 button3aa.setText(""+wResult2+"");
			 cn = 0;
		  break;
		  case 1:
			 button2aa.setText(""+endResult+"");
			 button1aa.setText(""+wResult+"");
			 button3aa.setText(""+wResult2+"");
			cn = 1;
		 break;
		 case 2:
			 button3aa.setText(""+endResult+"");
			 button2aa.setText(""+wResult+"");
			 button1aa.setText(""+wResult2+"");
			 cn = 2;
			 break;
		 }
		 }

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_level3, menu);
		return true;
	}
	
	public void score(View score){
		if((score.getId()==R.id.button1aa && cn == 0)||(score.getId()==R.id.button2aa && cn == 1)||(score.getId()==R.id.button3aa && cn == 2)){
			TextView textView2 = (TextView)findViewById(R.id.textView2);
			score1 = score1 + 1;
			textView2.setText(""+score1+"");
						}else{
			score1 = score1 - 1;
			TextView textView2 = (TextView)findViewById(R.id.textView2);
			textView2.setText(""+score1+"");
				}
			}
			}
		
