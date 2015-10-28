package tpe_repo35_dominik_kassube_asim_bababalim_exercise3_ws1516_github;

public class Nachtelf extends Wesen{

	
	Nachtelf(){
		super(120,15,3,0.2,145,1,"Nachtelf");
	}
	
	Nachtelf(double bonus,String typ){
		super(120,15,3,0.2,290,bonus,typ);
	}
}