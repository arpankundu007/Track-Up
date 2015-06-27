package com.example.trackup;

//import java.util.Random;

import java.util.ArrayList;
import java.util.Collections;

import com.crittercism.app.Crittercism;
import com.google.analytics.tracking.android.EasyTracker;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity
{

	Handler handler = new Handler();
	public int ch;
	public int count;

	public void button1(View V)
	{
		final Button b1 = (Button) findViewById(R.id.button1);
		MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.beep);
		mp.start(); 
		handler.postDelayed(new Runnable()
		{
			public void run()
			{
				b1.setBackgroundResource(R.drawable.shape);
			}
		},000 );
		handler.postDelayed(new Runnable() {
			public void run()
			{
				b1.setBackgroundResource(R.drawable.shape2);
			}
		},200);

	}
	public void button2(View V)
	{
		//findViewById(R.id.button2).setBackgroundResource(R.drawable.shape);
		final Button b2 = (Button) findViewById(R.id.button2);
		MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.beep);
		mp.start();
		handler.postDelayed(new Runnable()
		{
			public void run()
			{
				b2.setBackgroundResource(R.drawable.shape);
			}
		},000 );
		handler.postDelayed(new Runnable() {
			public void run()
			{
				b2.setBackgroundResource(R.drawable.shape2);
			}
		},200);
	}
	public void button3(View V)
	{
		//findViewById(R.id.button3).setBackgroundResource(R.drawable.shape);
		MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.beep);
		mp.start();
		final Button b3 = (Button) findViewById(R.id.button3);
		handler.postDelayed(new Runnable()
		{
			public void run()
			{
				b3.setBackgroundResource(R.drawable.shape);
			}
		},000 );
		handler.postDelayed(new Runnable() {
			public void run()
			{
				b3.setBackgroundResource(R.drawable.shape2);
			}
		},200);
	}
	public void button4(View V)
	{
		//findViewById(R.id.button4).setBackgroundResource(R.drawable.shape);
		MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.beep);
		mp.start();
		final Button b4 = (Button) findViewById(R.id.button4);
		handler.postDelayed(new Runnable()
		{
			public void run()
			{
				b4.setBackgroundResource(R.drawable.shape);
			}
		},000 );
		handler.postDelayed(new Runnable() {
			public void run()
			{
				b4.setBackgroundResource(R.drawable.shape2);
			}
		},200);
	}
	public void button5(View V)
	{
		//findViewById(R.id.button5).setBackgroundResource(R.drawable.shape);
		MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.beep);
		mp.start();
		final Button b5 = (Button) findViewById(R.id.button5);
		handler.postDelayed(new Runnable()
		{
			public void run()
			{
				b5.setBackgroundResource(R.drawable.shape);
			}
		},000 );
		handler.postDelayed(new Runnable() {
			public void run()
			{
				b5.setBackgroundResource(R.drawable.shape2);
			}
		},200);
	}
	public void button6(View V)
	{
		//findViewById(R.id.button6).setBackgroundResource(R.drawable.shape);
		MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.beep);
		mp.start();
		final Button b6 = (Button) findViewById(R.id.button6);
		handler.postDelayed(new Runnable()
		{
			public void run()
			{
				b6.setBackgroundResource(R.drawable.shape);
			}
		},000);
		handler.postDelayed(new Runnable() {
			public void run()
			{
				b6.setBackgroundResource(R.drawable.shape2);
			}
		},200);
	}
	public void button7(View V)
	{
		//findViewById(R.id.button7).setBackgroundResource(R.drawable.shape);
		MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.beep);
		mp.start();
		final Button b7 = (Button) findViewById(R.id.button7);
		handler.postDelayed(new Runnable()
		{
			public void run()
			{
				b7.setBackgroundResource(R.drawable.shape);
			}
		},000 );
		handler.postDelayed(new Runnable() {
			public void run()
			{
				b7.setBackgroundResource(R.drawable.shape2);
			}
		},200);
	}
	public void button8(View V)
	{
		//findViewById(R.id.button8).setBackgroundResource(R.drawable.shape);
		MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.beep);
		mp.start();
		final Button b8 = (Button) findViewById(R.id.button8);
		handler.postDelayed(new Runnable()
		{
			public void run()
			{
				b8.setBackgroundResource(R.drawable.shape);
			}
		},000 );
		handler.postDelayed(new Runnable() {
			public void run()
			{
				b8.setBackgroundResource(R.drawable.shape2);
			}
		},200);
	}
	public void button9(View V)
	{
		//findViewById(R.id.button9).setBackgroundResource(R.drawable.shape);
		MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.beep);
		mp.start();
		final Button b9 = (Button) findViewById(R.id.button9);
		handler.postDelayed(new Runnable()
		{
			public void run()
			{
				b9.setBackgroundResource(R.drawable.shape);
			}
		},000 );
		handler.postDelayed(new Runnable() {
			public void run()
			{
				b9.setBackgroundResource(R.drawable.shape2);
			}
		},200);
	}
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {

		Crittercism.initialize(getApplicationContext(), "CRITTERCISM_APP_ID");
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		final Button b = (Button) findViewById(R.id.button10);
		final Button b1 = (Button) findViewById(R.id.button1);
		final Button b2 = (Button) findViewById(R.id.button2);
		final Button b3 = (Button) findViewById(R.id.button3);
		final Button b4 = (Button) findViewById(R.id.button4);
		final Button b5 = (Button) findViewById(R.id.button5);
		final Button b6 = (Button) findViewById(R.id.button6);
		final Button b7 = (Button) findViewById(R.id.button7);
		final Button b8 = (Button) findViewById(R.id.button8);
		final Button b9 = (Button) findViewById(R.id.button9);
		final int time =1000;
		final TextView tv =(TextView) findViewById(R.id.textView1);
		

		//////////////////////////////////////////////////////////////////////////////////////////////////


		b.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v)
			{
				MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.beep);
				mp.start();
				handler.postDelayed(new Runnable() {
					
					@Override
					public void run() {
						b.setBackgroundResource(R.drawable.shape);
						}
				}, 000);
				handler.postDelayed(new Runnable() {
					
					@Override
					public void run() {
						
						b.setBackgroundResource(R.drawable.shape2);
					}
				}, 200);
				tv.setText("Result");
				count=0;
				final ArrayList<Integer> rand = new ArrayList<Integer>();
				int del=0;
				final int[] ans= new int[9];
				for(int j = 0; j < 9; j++)
				{
					rand.add(j);
				}
				Collections.shuffle(rand);
				
				for(int i=0;i<9;i++)
				{	
					if(rand.get(i) == 0)
					{
						handler.postDelayed(new Runnable()
						{
							public void run()
							{
								b1.setBackgroundResource(R.drawable.shape);
							}
						},000+del );
						handler.postDelayed(new Runnable() {
							public void run()
							{
								b1.setBackgroundResource(R.drawable.shape2);
							}
						},time+del);
						del=del+1000;
					}
					if(rand.get(i) == 1)
					{

						handler.postDelayed(new Runnable()
						{
							public void run()
							{
								b2.setBackgroundResource(R.drawable.shape);
							}
						},000 + del);
						handler.postDelayed(new Runnable() {
							public void run()
							{
								b2.setBackgroundResource(R.drawable.shape2);
							}
						},time +del);del+=1000;
					}
					if(rand.get(i) == 2)
					{
						//del+=1000;
						handler.postDelayed(new Runnable()
						{
							public void run()
							{
								b3.setBackgroundResource(R.drawable.shape);
							}
						},000+del );
						handler.postDelayed(new Runnable() {
							public void run()
							{
								b3.setBackgroundResource(R.drawable.shape2);
							}
						},time+del);del+=1000;
					}
					if(rand.get(i) == 3)
					{
						//del+=1000;
						handler.postDelayed(new Runnable()
						{
							public void run()
							{
								b4.setBackgroundResource(R.drawable.shape);
							}
						},000+del );
						handler.postDelayed(new Runnable() {
							public void run()
							{
								b4.setBackgroundResource(R.drawable.shape2);
							}
						},time+del);del+=1000;
					}
					if(rand.get(i) == 4)
					{
						//del+=1000;
						handler.postDelayed(new Runnable()
						{
							public void run()
							{
								b5.setBackgroundResource(R.drawable.shape);
							}
						},000+del );
						handler.postDelayed(new Runnable() {
							public void run()
							{
								b5.setBackgroundResource(R.drawable.shape2);
							}
						},time+del);del+=1000;
					}
					if(rand.get(i) == 5)
					{
						//del+=1000;
						handler.postDelayed(new Runnable()
						{
							public void run()
							{
								b6.setBackgroundResource(R.drawable.shape);
							}
						},000+del );
						handler.postDelayed(new Runnable() {
							public void run()
							{
								b6.setBackgroundResource(R.drawable.shape2);
							}
						},time+del);del+=1000;
					}
					if(rand.get(i) == 6)
					{
						//del+=1000;
						handler.postDelayed(new Runnable()
						{
							public void run()
							{
								b7.setBackgroundResource(R.drawable.shape);
							}
						},000+del );
						handler.postDelayed(new Runnable() {
							public void run()
							{
								b7.setBackgroundResource(R.drawable.shape2);
							}
						},time+del);del+=1000;
					}
					if(rand.get(i) == 7)
					{
						//	del+=1000;
						handler.postDelayed(new Runnable()
						{
							public void run()
							{
								b8.setBackgroundResource(R.drawable.shape);
							}
						},000+del );
						handler.postDelayed(new Runnable() {
							public void run()
							{
								b8.setBackgroundResource(R.drawable.shape2);
							}
						},time+del);del+=1000;
					}
					if(rand.get(i) == 8)
					{
						handler.postDelayed(new Runnable()
						{
							public void run()
							{
								b9.setBackgroundResource(R.drawable.shape);
							}
						},000+del );
						handler.postDelayed(new Runnable() {
							public void run()
							{
								b9.setBackgroundResource(R.drawable.shape2);
							}
						},time+del);del+=1000;
					}
				}
				
				ch=-1;
				b1.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub
						MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.beep);
						mp.start();
						final Button b1 = (Button) findViewById(R.id.button1);
						handler.postDelayed(new Runnable()
						{
							public void run()
							{
								b1.setBackgroundResource(R.drawable.shape);
							}
						},000 );
						handler.postDelayed(new Runnable() {
							public void run()
							{
								b1.setBackgroundResource(R.drawable.shape2);
							}
						},200);
						ch++;
						if(ch<9){
						ans[ch]=0;}
						if(ch>=9)
						{
							b1.setEnabled(false);
							b2.setEnabled(false);
							b3.setEnabled(false);
							b4.setEnabled(false);
							b5.setEnabled(false);
							b6.setEnabled(false);
							b7.setEnabled(false);
							b8.setEnabled(false);
							b9.setEnabled(false);
						}
						if(ans[ch]==rand.get(ch))
						{
							count++;
						}
						if(count==9)
						{
							
							AlertDialog.Builder build = new AlertDialog.Builder(MainActivity.this);
							build.setMessage("Correct");
							build.setPositiveButton("Reset",new DialogInterface.OnClickListener() {
								
								@Override
								public void onClick(DialogInterface dialog, int which) {
									count=0;
									final ArrayList<Integer> rand = new ArrayList<Integer>();
									
									ch=0;
									for(int j = 0; j < 9; j++)
									{
										rand.add(j);
									}
									Collections.shuffle(rand);
									
								}
							});
							build.create().show();
						}

					}
				});
				b2.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub
						MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.beep);
						mp.start();
						handler.postDelayed(new Runnable()
						{
							public void run()
							{
								b2.setBackgroundResource(R.drawable.shape);
							}
						},000 );
						handler.postDelayed(new Runnable() {
							public void run()
							{
								b2.setBackgroundResource(R.drawable.shape2);
							}
						},200);
						ch++;
						if(ch<9){
						ans[ch]=1;}
						if(ch>=9)
						{
							b1.setEnabled(false);
							b2.setEnabled(false);
							b3.setEnabled(false);
							b4.setEnabled(false);
							b5.setEnabled(false);
							b6.setEnabled(false);
							b7.setEnabled(false);
							b8.setEnabled(false);
							b9.setEnabled(false);
						}
						if(ans[ch]==rand.get(ch))
						{
							count++;
						}
						if(count==9)
						{
						
							AlertDialog.Builder build = new AlertDialog.Builder(MainActivity.this);
							build.setMessage("Correct");
							build.setPositiveButton("Reset",new DialogInterface.OnClickListener() {
								
								@Override
								public void onClick(DialogInterface dialog, int which) {
									count=0;
									final ArrayList<Integer> rand = new ArrayList<Integer>();
									ch=0;
									
									for(int j = 0; j < 9; j++)
									{
										rand.add(j);
									}
									Collections.shuffle(rand);
									
								}
							});
							build.create().show();
						}
					}
				});
				b3.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub
						MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.beep);
						mp.start();
						handler.postDelayed(new Runnable()
						{
							public void run()
							{
								b3.setBackgroundResource(R.drawable.shape);
							}
						},000 );
						handler.postDelayed(new Runnable() {
							public void run()
							{
								b3.setBackgroundResource(R.drawable.shape2);
							}
						},200);
						ch++;
						if(ch<9){
						ans[ch]=2;}
						if(ch>=9)
						{
						
							b1.setEnabled(false);
							b2.setEnabled(false);
							b3.setEnabled(false);
							b4.setEnabled(false);
							b5.setEnabled(false);
							b6.setEnabled(false);
							b7.setEnabled(false);
							b8.setEnabled(false);
							b9.setEnabled(false);
						}
						if(ans[ch]==rand.get(ch))
						{
							count++;
						}
						if(count==9)
						{
							AlertDialog.Builder build = new AlertDialog.Builder(MainActivity.this);
							build.setMessage("Correct");
							build.setPositiveButton("Reset",new DialogInterface.OnClickListener() {
								
								@Override
								public void onClick(DialogInterface dialog, int which) {
									count=0;
									final ArrayList<Integer> rand = new ArrayList<Integer>();
									
									ch=0;
									for(int j = 0; j < 9; j++)
									{
										rand.add(j);
									}
									Collections.shuffle(rand);
									
								}
							});build.create().show();
						}
					}
				});
				b4.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub
						MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.beep);
						mp.start();
						handler.postDelayed(new Runnable()
						{
							public void run()
							{
								b4.setBackgroundResource(R.drawable.shape);
							}
						},000 );
						handler.postDelayed(new Runnable() {
							public void run()
							{
								b4.setBackgroundResource(R.drawable.shape2);
							}
						},200);
						ch++;
						if(ch<9){
						ans[ch]=3;}
						if(ch>=9)
						{
							b1.setEnabled(false);
							b2.setEnabled(false);
							b3.setEnabled(false);
							b4.setEnabled(false);
							b5.setEnabled(false);
							b6.setEnabled(false);
							b7.setEnabled(false);
							b8.setEnabled(false);
							b9.setEnabled(false);
						}
						if(ans[ch]==rand.get(ch))
						{
							count++;
						}
						if(count==9)
						{
							AlertDialog.Builder build = new AlertDialog.Builder(MainActivity.this);
							build.setMessage("Correct");
							build.setPositiveButton("Reset",new DialogInterface.OnClickListener() {
								
								@Override
								public void onClick(DialogInterface dialog, int which) {
									count=0;
									final ArrayList<Integer> rand = new ArrayList<Integer>();
									ch=0;
									
									for(int j = 0; j < 9; j++)
									{
										rand.add(j);
									}
									Collections.shuffle(rand);
									
								}
							});build.create().show();
						}
					}
				});
				b5.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub
						MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.beep);
						mp.start();
						handler.postDelayed(new Runnable()
						{
							public void run()
							{
								b5.setBackgroundResource(R.drawable.shape);
							}
						},000 );
						handler.postDelayed(new Runnable() {
							public void run()
							{
								b5.setBackgroundResource(R.drawable.shape2);
							}
						},200);
						ch++;
						if(ch<9){
						ans[ch]=4;}
						if(ch>=9)
						{
							b1.setEnabled(false);
							b2.setEnabled(false);
							b3.setEnabled(false);
							b4.setEnabled(false);
							b5.setEnabled(false);
							b6.setEnabled(false);
							b7.setEnabled(false);
							b8.setEnabled(false);
							b9.setEnabled(false);
						}
						if(ans[ch]==rand.get(ch))
						{
							count++;
						}
						if(count==9)
						{
							AlertDialog.Builder build = new AlertDialog.Builder(MainActivity.this);
							build.setMessage("Correct");
							build.setPositiveButton("Reset",new DialogInterface.OnClickListener() {
								
								@Override
								public void onClick(DialogInterface dialog, int which) {
									count=0;
									final ArrayList<Integer> rand = new ArrayList<Integer>();
									ch=0;
									
									for(int j = 0; j < 9; j++)
									{
										rand.add(j);
									}
									Collections.shuffle(rand);
									
								}
							});build.create().show();
						}
					}
				});
				b6.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub
						MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.beep);
						mp.start();
						handler.postDelayed(new Runnable()
						{
							public void run()
							{
								b6.setBackgroundResource(R.drawable.shape);
							}
						},000 );
						handler.postDelayed(new Runnable() {
							public void run()
							{
								b6.setBackgroundResource(R.drawable.shape2);
							}
						},200);
						ch++;
						if(ch<9){
						ans[ch]=5;}
						if(ch>=9)
						{
							b1.setEnabled(false);
							b2.setEnabled(false);
							b3.setEnabled(false);
							b4.setEnabled(false);
							b5.setEnabled(false);
							b6.setEnabled(false);
							b7.setEnabled(false);
							b8.setEnabled(false);
							b9.setEnabled(false);
						}
						if(ans[ch]==rand.get(ch))
						{
							count++;
						}
						if(count==9)
						{
							AlertDialog.Builder build = new AlertDialog.Builder(MainActivity.this);
							build.setMessage("Correct");
							build.setPositiveButton("Reset",new DialogInterface.OnClickListener() {
								
								@Override
								public void onClick(DialogInterface dialog, int which) {
									count=0;
									final ArrayList<Integer> rand = new ArrayList<Integer>();
									ch=0;
									
									for(int j = 0; j < 9; j++)
									{
										rand.add(j);
									}
									Collections.shuffle(rand);
									
								}
							});build.create().show();
						}
					}
				});
				b7.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub
						MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.beep);
						mp.start();
						handler.postDelayed(new Runnable()
						{
							public void run()
							{
								b7.setBackgroundResource(R.drawable.shape);
							}
						},000 );
						handler.postDelayed(new Runnable() {
							public void run()
							{
								b7.setBackgroundResource(R.drawable.shape2);
							}
						},200);
						ch++;
						if(ch<9){
						ans[ch]=6;}
						if(ch>=9)
						{
							b1.setEnabled(false);
							b2.setEnabled(false);
							b3.setEnabled(false);
							b4.setEnabled(false);
							b5.setEnabled(false);
							b6.setEnabled(false);
							b7.setEnabled(false);
							b8.setEnabled(false);
							b9.setEnabled(false);
						}
						if(ans[ch]==rand.get(ch))
						{
							count++;
						}
						if(count==9)
						{
							AlertDialog.Builder build = new AlertDialog.Builder(MainActivity.this);
							build.setMessage("Correct");
							build.setPositiveButton("Reset",new DialogInterface.OnClickListener() {
								
								@Override
								public void onClick(DialogInterface dialog, int which) {
									count=0;
									final ArrayList<Integer> rand = new ArrayList<Integer>();
									ch=0;
									
									for(int j = 0; j < 9; j++)
									{
										rand.add(j);
									}
									Collections.shuffle(rand);
									
								}
							});build.create().show();
						}
					}
				});
				b8.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub
						MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.beep);
						mp.start();
						handler.postDelayed(new Runnable()
						{
							public void run()
							{
								b8.setBackgroundResource(R.drawable.shape);
							}
						},000 );
						handler.postDelayed(new Runnable() {
							public void run()
							{
								b8.setBackgroundResource(R.drawable.shape2);
							}
						},200);
						ch++;
						if(ch<9){
						ans[ch]=7;}
						if(ch>=9)
						{
							b1.setEnabled(false);
							b2.setEnabled(false);
							b3.setEnabled(false);
							b4.setEnabled(false);
							b5.setEnabled(false);
							b6.setEnabled(false);
							b7.setEnabled(false);
							b8.setEnabled(false);
							b9.setEnabled(false);
						}
						if(ans[ch]==rand.get(ch))
						{
							count++;
						}
						if(count==9)
						{
							AlertDialog.Builder build = new AlertDialog.Builder(MainActivity.this);
							build.setMessage("Correct");
							build.setPositiveButton("Reset",new DialogInterface.OnClickListener() {
								
								@Override
								public void onClick(DialogInterface dialog, int which) {
									count=0;
									final ArrayList<Integer> rand = new ArrayList<Integer>();
									
									ch=0;
									for(int j = 0; j < 9; j++)
									{
										rand.add(j);
									}
									Collections.shuffle(rand);
									
								}
							});build.create().show();
						}
					}
				});
				b9.setOnClickListener(new OnClickListener() {

					@Override
					public void onClick(View v) {
						// TODO- Auto-generated method stub
						MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.beep);
						mp.start();
						handler.postDelayed(new Runnable()
						{
							public void run()
							{
								b9.setBackgroundResource(R.drawable.shape);
							}
						},000 );
						handler.postDelayed(new Runnable() {
							public void run()
							{
								b9.setBackgroundResource(R.drawable.shape2);
							}
						},200);
						ch++;
						if(ch<9){
						ans[ch]=8;}
						if(ch>=9)
						{
							b1.setEnabled(false);
							b2.setEnabled(false);
							b3.setEnabled(false);
							b4.setEnabled(false);
							b5.setEnabled(false);
							b6.setEnabled(false);
							b7.setEnabled(false);
							b8.setEnabled(false);
							b9.setEnabled(false);
						}
						if(ans[ch]==rand.get(ch))
						{
							count++;
						}
						if(count==9)
						{
							AlertDialog.Builder build = new AlertDialog.Builder(MainActivity.this);
							build.setMessage("Correct");
							build.setPositiveButton("Reset",new DialogInterface.OnClickListener() {
								
								@Override
								public void onClick(DialogInterface dialog, int which) {
									count=0;
									final ArrayList<Integer> rand = new ArrayList<Integer>();
									ch=0;
									
									for(int j = 0; j < 9; j++)
									{
										rand.add(j);
									}
									Collections.shuffle(rand);
									
								}
							});build.create().show();
						}
					}
				});
				
			}
		});
	}
	@Override
	protected void onStart() {
		EasyTracker.getInstance(this).activityStart(this);
		super.onStart();
	}
	@Override
	protected void onStop() {
		EasyTracker.getInstance(this).activityStop(this);
		super.onStop();
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
