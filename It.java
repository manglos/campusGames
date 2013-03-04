public class It extends Player{
	
	int numTaggedThisTurn;
	
	It(){
		super();
		numTaggedThisTurn=0;
	}
	It(String fn, String ln, String un, String pw, String pn, int x, boolean on){
		super(fn, ln, un, pw, pn, x, on);
		numTaggedThisTurn=0
	}
	
	//Not sure which will work better
	void requestTag(){
		/* here get location and send request to server
		 * server sends confirm request to clients in range
		 * clients either confirmTag() or disputeTag() */
	}
	void requestTag(Player p){
		/* here get location and send request to server
		 * server sends confirm request to clients in range
		 * clients either confirmTag() or disputeTag() */
	}
	
	

}
