package tpe_repo35_dominik_kassube_asim_bababalim_exercise3_ws1516_github;

public class Farseer extends Ork{
	protected double cost = 300;
	private double bonus = 1.2;
	
	public double getCost(){
		 return cost;
	 }
	
	public String toString() {
		return "Farseer [Lebenspunkte=" + hp + ", Schaden=" + damage + ", Geschwindigkeit=" + speed + ", R�stung=" + armor + "]";
	}
	
	public double attack(){
		return ((damage*speed)*this.bonus);
	}
}