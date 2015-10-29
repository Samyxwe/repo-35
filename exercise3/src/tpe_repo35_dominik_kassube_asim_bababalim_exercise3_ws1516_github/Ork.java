package tpe_repo35_dominik_kassube_asim_bababalim_exercise3_ws1516_github;

/**
 * Die Klasse Ork beinhaltet die Instanziierung für das Wesen Ork selbst
 * und den Anführer Farseer
 */
public class Ork extends Wesen{
	
	/**
	 * Hier wird ein Ork erstellt
	 */
	Ork(){
		super(100,33,1,0.3,150,1,"Ork");
	}
	
	/**
	 * Hier wird der Anführer Farseer erstellt
	 * @param bonus
	 * @param typ
	 */
	Ork(double bonus,String typ){
		super(100,33,1,0.3,300,bonus,typ);
	}
}