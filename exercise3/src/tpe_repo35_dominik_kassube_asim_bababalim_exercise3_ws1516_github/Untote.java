package tpe_repo35_dominik_kassube_asim_bababalim_exercise3_ws1516_github;

/**
 * Die Klasse Untote beinhaltet die Instanziierung für das Wesen Untote selbst
 * und den Anführer Lich
 */
public class Untote extends Wesen{

		/**
		 * Hier wird ein Untoter erstellt
		 */
		Untote(){
			super(120,16,2,0.3,70,1,"Untote");
		}
		
		/**
		 * Hier wird der Anführer Lich erstellt
		 * @param bonus
		 * @param typ
		 */
		Untote(double bonus,String typ){
			super(120,16,2,0.3,140,bonus,typ);
		}
}
