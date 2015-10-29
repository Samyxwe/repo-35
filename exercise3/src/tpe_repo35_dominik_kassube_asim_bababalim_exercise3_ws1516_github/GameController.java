package tpe_repo35_dominik_kassube_asim_bababalim_exercise3_ws1516_github;

/**
 * 
 * @author a.bababalim
 * @author d.kassube
 */
public class GameController {

	Squad Spieler1;
	Squad Spieler2;
	
	/**
	 * Hier werden für 2 Spieler jeweils ein Team/Squad erstellt
	 */
	GameController(){
		Spieler1 = new Squad("Spieler1");
		Spieler2 = new Squad("Spieler2");
	}
	
	/**
	 * Das Spiel fängt an
	 */
	void runGame(){
		new Squad(Spieler1,Spieler2);
	}
	
	/**
	 * Durch die main Methode kann ein  Spiel überhaupt stattfinden
	 * @param args
	 */
	public static void main(String [] args){
		
		GameController Spiel=new GameController();
		Spiel.runGame();
		
	}
}
