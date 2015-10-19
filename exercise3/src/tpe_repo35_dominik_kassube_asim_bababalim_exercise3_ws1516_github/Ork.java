package tpe_repo35_dominik_kassube_asim_bababalim_exercise3_ws1516_github;

public class Ork {
	protected double cost = 150;
	protected double hp = 100;
	protected double damage = 33;
	protected double speed = 1;
	protected double armor = 30;
	
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
		return "Ork [Lebenspunkte=" + hp + ", Schaden=" + damage + ", Geschwindigkeit=" + speed + ", Rüstung=" + armor + "]";
	}
	
	public double attack(){
		return this.damage*this.speed;
	}
}