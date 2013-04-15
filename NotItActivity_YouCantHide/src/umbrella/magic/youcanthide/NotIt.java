package umbrella.magic.youcanthide;

import java.util.ArrayList;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class NotIt extends Activity {
	
	ArrayList<String> newsFeedList;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_not_it);
		
		ListView newsFeed = (ListView) findViewById(R.id.game_news_feed);
		
		newsFeedList = new ArrayList();
		newsFeedList.add("Game Started");
		newsFeedList.add("Player Manglos had been tagged by Batman");
		
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, newsFeedList);
		newsFeed.setAdapter(adapter);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.not_it, menu);
		return true;
	}
	
	/* Called when the user clicks the "Refresh" button */
    public void refresh(View view) {
    	Intent intent = new Intent(this, GameList.class);
    	startActivity(intent); 
    }
    
    /* Called when the user clicks the "Refresh" button */
    public void imHome(View view) {
    	// Doesn't do anything yet. Will verify event, and send to web service.
    }

}
