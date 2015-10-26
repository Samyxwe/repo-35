package tpe_repo35_dominik_kassube_asim_bababalim_exercise3_ws1516_github;

public class Wesen {
	
	double hp;
	int damage;
	int speed;
    double armor;
    int cost;
    protected double bonus = 1;
    
    Wesen(double hp,int damage, int speed, double armor, int cost, double bonus){
    
    	this.hp=hp;
    	this.damage=damage;
    	this.speed=speed;
    	this.armor=armor;
    	this.cost=cost;
    	this.bonus=bonus;
    }
    
    public boolean isLebendig(){
		if (this.hp <= 0){
			return false;
		}
		return true;
	}
    
    public String toString() {
		return "[Lebenspunkte=" + hp + ", Schaden=" + damage + ", Geschwindigkeit=" + speed + ", R�stung=" + armor + "]";
	}
    
    public double attack(){
		return ((damage*speed)*this.bonus);
	}
	
}
