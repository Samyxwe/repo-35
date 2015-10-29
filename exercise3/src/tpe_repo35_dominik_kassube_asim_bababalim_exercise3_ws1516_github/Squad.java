package tpe_repo35_dominik_kassube_asim_bababalim_exercise3_ws1516_github;

import java.util.*;
import java.util.ArrayList;

/**
 * In dieser Klasse werden die Squads verwaltet
 * und das Spiel begonnen
 * @author a.bababalim
 * @author d.kassube
 */
public class Squad {

	Wesen wesen;
	ArrayList<Wesen> team = new ArrayList<Wesen>();
	private double elfendollar = 2000;
	String teamName;
	
	/**
	 * da jeder Anführer nur einmal vorhanden sein darf wird einmal an der Stelle x 
	 * auf true gesetzt, falls der Anführer schon im Squad existiert
	 */
	boolean [] einmal=new boolean[4];
	
	int wahl;

	/**
	 * Hier wird ein Teamname festgesetzt und auf erstelleSquad() verwiesen
	 * @param teamName
	 */
	Squad(String teamName) {
		this.teamName=teamName;
		erstelleSquad();
	}

	/**
	 * Hier wird ein Squad/Team erstellt
	 * Solange man noch genug Elfendollar hat und sich keinen Anführer kauft der 
	 * schon im Team/Squad ist, wird ein Squad erstellt
	 */
	public void erstelleSquad() {

		
		while (elfendollar > 69) {
			/**
			 * zufälligezahl wird erzeugt
			 */
			wahl = (int)(Math.random() * 8 + 1);

			switch (wahl) {
			
			case 1:
				wesen = new Mensch();
				if (elfendollar - wesen.cost >= 0) {
					team.add(wesen);
					elfendollar -= wesen.cost;
				} else {
					/**
					 * Du hast nicht genug Elfendollar
					 */
				}
				break;
			case 2:
				
				wesen = new Erzmagier();
				/**
				 * Hast du schon einen Erzmagier kannst du  
				 * nicht noch einen kaufen
				 */
				if(einmal[0]==false){
					if (elfendollar - wesen.cost >= 0) {
						team.add(wesen);
						elfendollar -= wesen.cost;
						einmal[0]=true;
					} else {
						/**
						 * Du hast nicht genug Elfendollar
						 */
					}
				}
				break;
			case 3:
				wesen = new Ork();
				if (elfendollar - wesen.cost >= 0) {
					team.add(wesen);
					elfendollar -= wesen.cost;
				} else {
					/**
					 * Du hast nicht genug Elfendollar
					 */
				}
				break;
			case 4:
				wesen = new Farseer();
				/**
				 * Hast du schon einen Farseer kannst du  
				 * nicht noch einen kaufen
				 */
				if(einmal[1]==false){
					if (elfendollar - wesen.cost >= 0) {
						team.add(wesen);
						elfendollar -= wesen.cost;
						einmal[1]=true;
					} else {
						/**
						 * Du hast nicht genug Elfendollar
						 */
					}
				}
				break;
			case 5:
				wesen = new Nachtelf();
				if (elfendollar - wesen.cost >= 0) {
					team.add(wesen);
					elfendollar -= wesen.cost;
				} else {
					/**
					 * Du hast nicht genug Elfendollar
					 */
				}
				break;
			case 6:
				wesen = new Daemonenjaeger();
				/**
				 * Hast du schon einen Daemonenjaeger kannst du  
				 * nicht noch einen kaufen
				 */
				if(einmal[2]==false){
					if (elfendollar - wesen.cost >= 0) {
						team.add(wesen);
						elfendollar -= wesen.cost;
						einmal[2]=true;
					} else {
						/**
						 * Du hast nicht genug Elfendollar
						 */
					}
				}
				break;
			case 7:
				wesen = new Untote();
				if (elfendollar - wesen.cost >= 0) {
					team.add(wesen);
					elfendollar -= wesen.cost;
				} else {
					/**
					 * Du hast nicht genug Elfendollar
					 */
				}
				break;
			case 8:
				wesen = new Lich();
				/**
				 * Hast du schon einen Lich kannst du  
				 * nicht noch einen kaufen
				 */
				if(einmal[3]==false){
					if (elfendollar - wesen.cost >= 0) {
						team.add(wesen);
						elfendollar -= wesen.cost;
						einmal[3]=true;
					} else {
						/**
						 * Du hast nicht genug Elfendollar
						 */
					}
				}
				break;
			default:
				
			}

		}
	}

	/**
	 * Hier werden beide Squads zu einer Schlacht weitergeleitet
	 * @param Spieler1
	 * @param Spieler2
	 */
	Squad(Squad Spieler1, Squad Spieler2) {
		schlacht(Spieler1, Spieler2);
	}

	/**
	 * Kampf der Squads bis zur Auslöschung eines Squads
	 * Allianz tritt gegen Clan an
	 * @param allianz
	 * @param clan
	 */
	public void schlacht(Squad allianz, Squad clan) {
		int zahl;
		int i;
		int runde=0;
		
		/**
		 * Solange beide Squads noch lebendig sind, kämpft ein zufälliges Wesen 
		 * des einen Squads gegen ein zufälliges Wesen des gegenerischen Squads
		 */
		do {

			
			if(existens(clan)){
				
				runde++;
				/**
				 * Hier wird geprüft ob das zufällig gewählte Wesen des Squads noch lebendig
				 * ist und überhaupt noch ein Squad lebendig ist
				 */
				do {
					zahl = (int) (Math.random() * allianz.team.size());
				} while (!allianz.team.get(zahl).isLebendig() && existens(allianz));
				
				System.out.println("\nRunde: "+runde);
				
				System.out.println(allianz.teamName+": Verteidiger: "+allianz.team.get(zahl).typ+": " +allianz.team.get(zahl).toString(allianz.team.get(zahl)));
				
				/**
				 * Hier wird geprüft ob das zufällig gewählte Wesen des Squads noch lebendig
				 * ist und überhaupt noch ein Squad lebendig ist
				 */
				do {
					i = (int) (Math.random() * clan.team.size());
				} while (!clan.team.get(i).isLebendig() && existens(clan));
				
				System.out.println(clan.teamName+": Angreifer: "+clan.team.get(i).typ+": "+ clan.team.get(i).toString(clan.team.get(i)));

				/**
				 * Angriff erfolgt, Lebenspunkte werden so berechnet
				 * (Verteiger)Lebenspunkte-((Angreifer)schaden-schaden*(Verteidiger)rüstung)
				 */
				allianz.team.get(zahl).hp -= clan.team.get(i).attack()-clan.team.get(i).attack()*allianz.team.get(zahl).armor;
				
				/**
				 * Lebenspunkte werden nach zweinachkommastellen gerechnet
				 */
				allianz.team.get(zahl).hp = Math.round(100.0 * allianz.team.get(zahl).hp)/100.0;
			}
			
			if(existens(allianz)){
				
				runde++;
				
				/**
				 * Hier wird geprüft ob das zufällig gewählte Wesen des Squads noch lebendig
				 * ist und überhaupt noch ein Squad lebendig ist
				 */
				do {
					zahl = (int) (Math.random() * clan.team.size());
				} while (!clan.team.get(zahl).isLebendig() && existens(clan));
				
				System.out.println("\nRunde: "+runde);
				
				System.out.println(clan.teamName+": Verteidiger: "+clan.team.get(zahl).typ+": " +clan.team.get(zahl).toString(clan.team.get(zahl)));

				/**
				 * Hier wird geprüft ob das zufällig gewählte Wesen des Squads noch lebendig
				 * ist und überhaupt noch ein Squad lebendig ist
				 */
				do {
					i = (int) (Math.random() * allianz.team.size());
				} while (!allianz.team.get(i).isLebendig() && existens(allianz));
				
				System.out.println(allianz.teamName+": Angreifer: "+allianz.team.get(i).typ+": "+ allianz.team.get(i).toString(allianz.team.get(i)));
				
				/**
				 * Angriff erfolgt, Lebenspunkte werden so berechnet
				 * (Verteiger)Lebenspunkte-((Angreifer)schaden-schaden*(Verteidiger)rüstung)
				 */
				clan.team.get(zahl).hp -= allianz.team.get(i).attack()-allianz.team.get(i).attack()*clan.team.get(zahl).armor;
				
				/**
				 * Lebenspunkte werden nach zweinachkommastellen gerechnet
				 */
				clan.team.get(zahl).hp = Math.round(100.0 * clan.team.get(zahl).hp)/100.0;
			}
			
		} while (existens(allianz) && existens(clan));
		
		System.out.println("\nResultat:");
		
		if(!existens(allianz)){
			System.out.println(allianz.teamName+ " ist geschlagen.");
			System.out.println(clan.teamName+" hat diese Schlacht für sich entschieden.");
		}else{
			System.out.println(clan.teamName+ " ist geschlagen.");
			System.out.println(allianz.teamName+ " hat diese Schlacht für sich entschieden.");
		}

	}

	/**
	 * Sind im Squad noch lebendige wesen enthalten
	 * Rückgabe: true oder false
	 * @param spieler
	 * @return
	 */
	public boolean existens(Squad spieler) {

		for (int i = 0; i < spieler.team.size(); i++) {
			if (spieler.team.get(i).isLebendig()) {
				return true;
			}
		}

		return false;
	}
	
}
