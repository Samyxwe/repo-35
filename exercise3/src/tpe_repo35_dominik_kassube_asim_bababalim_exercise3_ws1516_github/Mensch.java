package tpe_repo35_dominik_kassube_asim_bababalim_exercise3_ws1516_github;

/**
 * Die Klasse Mensch beinhaltet die Instanziierung für das Wesen Mensch selbst
 * und den Anführer Erzmagier
 */
public class Mensch extends Wesen{

	
	Mensch(){
		super(150,40,2,0.4,110,1,"Mensch");
	}

	Mensch(double bonus,String typ){
		super(150,40,2,0.4,220,bonus,typ);
	}

}
