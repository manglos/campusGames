package umbrella.magic.youcanthide;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class GameCreation extends Activity {
	public final static String EXTRA_FIELD_SIZE = "umbrella.magic.youcanthide.FIELD_SIZE";
	//public final static String EXTRA_LOCATION = "umbrella.magic.youcanthide.LOCATION";
	//public final static String EXTRA_NUM_IT = "umbrella.magic.youcanthide.NUM_IT";
	
	// Some Variables:
	String fieldSelection;
	
	@Override
    protected void onCreate(Bundle savedInstanceState) {
		// Load the GUI
    	super.onCreate(savedInstanceState);
    	setContentView(R.layout.activity_game_creation);
    	
    }
    
	/* Called when the user clicks the Create button */
    public void fieldSizeSelected(View view) {
    	// Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        
        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.radio_field_sm:
                if (checked)
                	fieldSelection = "small";
                break;
            case R.id.radio_field_md:
                if (checked)
                	fieldSelection = "medium";
                break;
            case R.id.radio_field_lg:
                if (checked)
                	fieldSelection = "large";
                break;
        }
    }
	
    /* Called when the user clicks the Create button */
    public void createGame(View view) {
    	Intent intent = new Intent(this, NewGameConfirm.class);
    	intent.putExtra(EXTRA_FIELD_SIZE, fieldSelection);
    	startActivity(intent);
    }
}
