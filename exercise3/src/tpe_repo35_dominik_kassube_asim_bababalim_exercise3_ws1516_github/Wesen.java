package tpe_repo35_dominik_kassube_asim_bababalim_exercise3_ws1516_github;

/**
 * In dieser Klasse werden die Eigenschaften der Wesen gespeichert/ausgeführt
 * @author a.bababalim
 * @author d.kassube
 */
public class Wesen {
	
	double hp;
	double damage;
	double speed;
    double armor;
    int cost;
    String typ;
    protected double bonus = 1;
    
    /**
     * Hier wird jedem erzeugtem Wesen(Mensch, Untote, Ork, Nachtelf),
     * die zu ihrer Rasse dazugehörigen Attribute übergeben
     * @param hp
     * @param damage
     * @param speed
     * @param armor
     * @param cost
     * @param bonus
     * @param typ
     */
    Wesen(double hp,double damage, double speed, double armor, int cost, double bonus,String typ){
    
    	this.hp=hp;
    	this.damage=damage;
    	this.speed=speed;
    	this.armor=armor;
    	this.cost=cost;
    	this.bonus=bonus;
    	this.typ=typ;
    }
    
    /**
     * Hier wird geguckt ob ein wesen noch lebt und ein boolean-Wert zurückgegeben
     * @return
     */
    public boolean isLebendig(){
		if (this.hp <= 0){
			return false;
		}
		return true;
	}
    
    /**
     * Hier werden Eigenschaften eines Wesens zurückgegeben
     * @param a
     * @return
     */
    public String toString(Wesen a) {
		return "[Lebenspunkte=" + a.hp + ", Schaden=" + a.damage + ", Geschwindigkeit=" + a.speed + ", Ruestung=" + a.armor + "]";
	}
    
    /**
     *Berechnung und rückgabe des Schadens 
     */
    public double attack(){
		return ((damage*speed)*this.bonus);
	}
	
}
