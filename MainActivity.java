package com.youcanthide.android.gamespage;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

  Button browse, create; //,refresh

	//Game [] games; **********//the array of available games to populate the SlideView
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		create = (Button) findViewById(R.id.bCreate);
		browse = (Button) findViewById(R.id.bBrowse);
		//refresh = (Button) findViewById(R.id.bRefresh);
		
		
		browse.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				//Need to figure out how to call the intent with a Constructor
				//to send it an array of Game objects
				
				Intent ourMenu = new Intent("com.youcanthide.android.gamespage.MENU");
				startActivity(ourMenu);
				
			}
		});
		
		/*
		create.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				//Create a new Game object 
			}
		});
		*/
		/*
		refresh.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent fresh = new Intent("android.intent.action.MAIN");
				startActivity(fresh);
			}
		});
		*/
		
	}

	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
