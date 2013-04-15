package umbrella.magic.youcanthide;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class GameLobby extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_game_lobby);
		// Create the text view:
		TextView textView = (TextView) findViewById(R.id.game_lobby_player_list);
		textView.setTextSize(24);
		textView.setText("Finn\n");
		textView.append("Jake\n");
		textView.append("BMO\n");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.game_lobby, menu);
		return true;
	}

	/* Called when the user clicks the "Refresh" button */
    public void refresh(View view) {
    	Intent intent = new Intent(this, NotIt.class);
    	startActivity(intent); 
    }
}
