public class Spectator extends Player{

	Spectator(){
		super();
		setType("Spectator");
	}
	Spectator(String fn, String ln, String un, String pw, String pn, int x, boolean on){
		super(fn, ln, un, pw, pn, x, on);
		setType("Spectator");
	}

	void tagHandler(){
		/* probably just a notification
		 * of current tags here */
	}

}
