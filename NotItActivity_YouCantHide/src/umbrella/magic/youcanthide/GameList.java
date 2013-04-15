package umbrella.magic.youcanthide;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class GameList extends Activity {

	String gamesList[] = {"game1", "game2", "game3"};

	//Game [] games; **********//the array of available games to populate the SlideView
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_game_list);
		
		ListView games = (ListView) findViewById(R.id.gamesListView);
		
		//Will have to remake adapter for Game objects
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, gamesList);
		games.setAdapter(adapter);
	}
		
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.game_list, menu);
		return true;
	}

	/* Called when the user clicks the "Create" button */
    public void goToGameCreation(View view) {
    	Intent intent = new Intent(this, GameCreation.class);
    	startActivity(intent); 
    }
    
    /* Called when the user clicks the "Refresh" button */
    public void refresh(View view) {
    	Intent intent = new Intent(this, GameList.class);
    	startActivity(intent); 
    }
}
