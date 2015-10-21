package tpe_repo35_dominik_kassube_asim_bababalim_exercise3_ws1516_github;

public class Menschen extends Squad {

    double bonus;
    public double cost=110;
	
	Menschen(){
		this.lifepoints=150;
		this.strength=40;
		this.bonus=0.5;
		this.ruestung=0.4;
		this.speed=2;
	}
	
	public boolean isLebendig(){
		if(super.lifepoints>0){
		    return true;
		}else{
		    return false;
		}
	}

}
