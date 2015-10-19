package tpe_repo35_dominik_kassube_asim_bababalim_exercise3_ws1516_github;

public class Nachtelf {
	protected double cost = 145;
	protected double hp = 120;
	protected double damage = 15;
	protected double speed = 3;
	protected double armor = 20;
	
	public double getCost(){
		 return cost;
	 }
	
	public boolean isLebendig(){
		if (this.hp <= 0){
			return false;
		}
		return true;
	}
	
	public String toString() {
		return "Nachtelf [Lebenspunkte=" + hp + ", Schaden=" + damage + ", Geschwindigkeit=" + speed + ", Rüstung=" + armor + "]";
	}

	public double attack(){
		return this.damage*this.speed;
	}
}