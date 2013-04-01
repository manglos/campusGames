package umbrella.magic.youcanthide;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class Registration extends Activity {
	public final static String EXTRA_FIRST_NAME = "umbrella.magic.youcanthide.FIRSTNAME";
	public final static String EXTRA_LAST_NAME = "umbrella.magic.youcanthide.LASTNAME";
	public final static String EXTRA_USER_NAME = "umbrella.magic.youcanthide.USERNAME";
	public final static String EXTRA_PASSWORD = "umbrella.magic.youcanthide.PASSWORD";
	public final static String EXTRA_PASSWORD_CONFIRM = "umbrella.magic.youcanthide.PASSWORD_CONFIRM";
	public final static String EXTRA_PHONE_NUMBER = "umbrella.magic.youcanthide.PHONE_NUMBER";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
    	/* 
    	 * !!!
    	 * Here we should send a post message with the phone's number to see if the user exists (auto log-in).
    	 * If they exist, we should log them in, and send them to the main screen, otherwise, continue with the registration:
    	 */
    	boolean alreadyRegistered = checkAutoLogin();
    	if (! alreadyRegistered) {
    		super.onCreate(savedInstanceState);
    		setContentView(R.layout.activity_registration);
    	}
    }

    private boolean checkAutoLogin() {
		// Stub:
		return false;
	}

	@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.registration, menu);
        return true;
    }
    
    /* Called when the user clicks the Send button */
    public void sendMessage(View view) {
    	// Do something in response to the button...
    	Intent intent = new Intent(this, RegistrationConfirm.class);
    	// Get the FirstName input:
    	EditText editText = (EditText) findViewById(R.id.reg_first_name);
    	String firstName = editText.getText().toString();
    	// Get the LastName input:
    	editText = (EditText) findViewById(R.id.reg_last_name);
    	String lastName = editText.getText().toString();
    	// Get the UserName input:
    	editText = (EditText) findViewById(R.id.reg_user_name);
    	String userName = editText.getText().toString();
    	// Get the Password input:
    	editText = (EditText) findViewById(R.id.reg_password);
    	String password = editText.getText().toString();
    	// Get the Password input:
    	editText = (EditText) findViewById(R.id.reg_password_confirm);
    	String passwordConfirm = editText.getText().toString();
    	// Get the phone's number (returns null, if unavailable):
    	TelephonyManager phoneManager = (TelephonyManager) getApplicationContext().getSystemService(TELEPHONY_SERVICE);
    	String phoneNumber = phoneManager.getLine1Number();
    	/*
    	 * !!!
    	 * Here we should send the userName, password, passwordConfirm, and number to the web service
    	 * We could send the error as an int or a string (we should set up codes for the possible results,
    	 * and re-direct based on the response).
    	 */
    	// int result = sendToWebService(userName, password, passwordConfirm, number);
    	
    	// Go to the next screen:
    	intent.putExtra(EXTRA_FIRST_NAME, firstName);
    	intent.putExtra(EXTRA_LAST_NAME, lastName);
    	intent.putExtra(EXTRA_USER_NAME, userName);
    	intent.putExtra(EXTRA_PASSWORD, password);
    	intent.putExtra(EXTRA_PASSWORD_CONFIRM, passwordConfirm);
    	intent.putExtra(EXTRA_PHONE_NUMBER, phoneNumber);
    	startActivity(intent);
    }
}
