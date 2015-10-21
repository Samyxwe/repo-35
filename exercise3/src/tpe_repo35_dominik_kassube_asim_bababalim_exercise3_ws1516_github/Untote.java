package tpe_repo35_dominik_kassube_asim_bababalim_exercise3_ws1516_github;

public class Untote extends Squad{

	  double bonus;
	    public double cost=150;
		
		Untote(){
			this.lifepoints=120;
			this.strength=16;
			this.ruestung=0.3;
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
