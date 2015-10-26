package tpe_repo35_dominik_kassube_asim_bababalim_exercise3_ws1516_github;

public class Mensch extends Wesen{
	
	int cost=150;
	
	Mensch(){
		super(150,40,2,0.4,110,1);
	}

	Mensch(double bonus){
		super(150,40,2,0.4,220,bonus);
	}

}
