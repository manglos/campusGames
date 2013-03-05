public class It extends Player{
	
	int numTaggedThisTurn;
	
	It(){
		super();
		setType("IT");
		numTaggedThisTurn=0;
	}
	It(String fn, String ln, String un, String pw, String pn, int x, boolean on){
		super(fn, ln, un, pw, pn, x, on);
		setType("IT");
		numTaggedThisTurn=0;
	}
	
	void tagHandler(){
		/* It will request tag from server here
		 * sends location, sents request to others
		 * gets confirmation and performs action */
	}

}
