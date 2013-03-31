package com.youcanthide.android.gamespage;

import android.app.ListActivity;
//import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Menu extends ListActivity {
  /*
	public Menu(String [] s){
		games = s;
		//now we have our list of Strings (eventually Games)
	}
	*/
	
	String games [] = {"game1", "game2","game3"};
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		//setContentView?
		setListAdapter(new ArrayAdapter<String>(Menu.this, android.R.layout.simple_list_item_1, games));
	}
	
	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		//Do nothing, for now
		//Eventually change this to "Enter Lobby" for selected game
	}
	
	/*
	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
		super.onListItemClick(l, v, position, id);
		String selected = games[position]; //selected item in our ListView from our array
	
		
		
	}
*/
	

}
