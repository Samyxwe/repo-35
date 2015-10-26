package tpe_repo35_dominik_kassube_asim_bababalim_exercise3_ws1516_github;

public class GameController {

	Squad Spieler1;
	Squad Spieler2;
	
	GameController(){
		Spieler1 = new Squad();
		Spieler2 = new Squad();
	}
	
	void runGame(){
		Squad spiel=new Squad(Spieler1,Spieler2);
	}
	
	public static void main(String [] args){
		
		GameController Spiel=new GameController();
		Spiel.runGame();
		
	}
}
