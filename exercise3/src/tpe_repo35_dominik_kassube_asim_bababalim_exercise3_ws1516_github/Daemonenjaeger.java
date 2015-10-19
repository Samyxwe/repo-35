package tpe_repo35_dominik_kassube_asim_bababalim_exercise3_ws1516_github;

public final class Daemonenjaeger extends Nachtelf{
	protected double cost = 290;
	private double bonus = 3.0;
	
	 public double getCost(){
		 return cost;
	 }
	
	 public String toString() {
			return "Dämonenjäger [Lebenspunkte=" + hp + ", Schaden=" + damage + ", Geschwindigkeit=" + speed + ", Rüstung=" + armor + "]";
		}
	 
	public double attack(){
		return ((damage*speed)*this.bonus);
	}
}