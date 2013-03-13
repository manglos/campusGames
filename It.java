public class It extends Role{
	
	int numTaggedThisGame;
	int numTaggedThisTurn;
	int xpGained;
	
	It(){
		super();
		setType("IT");
		numTaggedThisTurn=0;
		numTaggedThisTurn=0;
		xpGained=0;
	}
<<<<<<< HEAD

	void tagHandler(){}
	
=======
	
	void gameEventHandler(GameEvent e){
		/* Large method with logic for handling any given event
		 * according to player role 'it'
		 */
	}
>>>>>>> 47914cde7f2018b680213dc55c81845cbcc84e4e

}
