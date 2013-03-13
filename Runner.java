public class Runner extends Player{

	int numBeenTaggedThisTurn;

	Runner(){
		super();
		numBeenTaggedThisTurn=0;
	}
	Runner(String fn, String ln, String un, String pw, String pn, int x, boolean on){
		super(fn, ln, un, pw, pn, x, on);
		numBeenTaggedThisTurn=0;
	}

	void tagHandler(){}

}
