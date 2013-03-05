public class Runner extends Player{

	int numBeenTaggedThisTurn;

	Runner(){
		super();
		setType("Runner");
		numBeenTaggedThisTurn=0;
	}
	Runner(String fn, String ln, String un, String pw, String pn, int x, boolean on){
		super(fn, ln, un, pw, pn, x, on);
		setType("Runner");
		numBeenTaggedThisTurn=0;
	}
	
	void tagHandler(){
		/* runner gets tag request
		 * here sends confirmation option 
		 * to activity, then performs action
		 * accordingly */
	}
	
}
