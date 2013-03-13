public class Runner extends Role{

	int numBeenTaggedThisTurn;
	int numBeenTaggedThisGame;
	int xpGained;

	Runner(){
		super();
		setType("Runner");
		numBeenTaggedThisTurn=0;
		numBeenTaggedThisGame=0;
		xpGained=0;
	}
	
	void gameEventHandler(GameEvent e){
		/* Large method with logic for handling any given event
		 * according to player role 'Runner'
		 */
	}
<<<<<<< HEAD

	void tagHandler(){}

=======
	
>>>>>>> 47914cde7f2018b680213dc55c81845cbcc84e4e
}
