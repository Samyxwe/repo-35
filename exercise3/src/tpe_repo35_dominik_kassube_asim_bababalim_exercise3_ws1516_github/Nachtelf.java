package tpe_repo35_dominik_kassube_asim_bababalim_exercise3_ws1516_github;

/**
 * Die Klasse Nachtelf beinhaltet die Instanziierung für das Wesen Nachtelf selbst
 * und den Anführer Daemonenjaeger
 */
public class Nachtelf extends Wesen{

	/**
	 * Hier wird ein Nachtelf erzeugt
	 */
	Nachtelf(){
		super(120,15,3,0.2,145,1,"Nachtelf");
	}
	
	/**
	 * Hier wird der Anführer Daemonenjaeger erstellt
	 * @param bonus
	 * @param typ
	 */
	Nachtelf(double bonus,String typ){
		super(120,15,3,0.2,290,bonus,typ);
	}
}