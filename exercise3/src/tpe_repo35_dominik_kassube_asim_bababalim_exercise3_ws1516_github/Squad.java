package tpe_repo35_dominik_kassube_asim_bababalim_exercise3_ws1516_github;

import java.util.*;
import java.util.ArrayList;

public class Squad {

	Scanner in = new Scanner(System.in);
	Wesen wesen;
	ArrayList<Wesen> team = new ArrayList<Wesen>();
	private double elfendollar = 2000;
	String teamName;
	boolean [] einmal=new boolean[4];
	int wahl;

	Squad() {
		erstelleSquad();
	}

	public void erstelleSquad() {

		System.out.println("Teamnamen eingeben:");
		teamName = in.nextLine();

		
		while (elfendollar > 69) {
			// System.out.println("Geld: " + elfendollar);
			wahl = (int)(Math.random() * 8 + 1);

			switch (wahl) {
			// case 0:
			// fertig = true;
			// break;
			case 1:
				wesen = new Mensch();
				if (elfendollar - wesen.cost >= 0) {
					team.add(wesen);
					elfendollar -= wesen.cost;
				} else {
					// System.out.println("Elfendollar reichen nicht aus für
					// diese Rasse");
				}
				break;
			case 2:
				
				wesen = new Erzmagier();
				
				if(einmal[0]==false){
					if (elfendollar - wesen.cost >= 0) {
						team.add(wesen);
						elfendollar -= wesen.cost;
						einmal[0]=true;
						System.out.println("45454");
					} else {
						// System.out.println("Elfendollar reichen nicht aus für
						// diese Rasse");
					}
				}
				break;
			case 3:
				wesen = new Ork();
				if (elfendollar - wesen.cost >= 0) {
					team.add(wesen);
					elfendollar -= wesen.cost;
				} else {
					// System.out.println("Elfendollar reichen nicht aus für
					// diese Rasse");
				}
				break;
			case 4:
				wesen = new Farseer();
				
				if(einmal[1]==false){
					if (elfendollar - wesen.cost >= 0) {
						team.add(wesen);
						elfendollar -= wesen.cost;
						einmal[1]=true;
						System.out.println("45454");
					} else {
						// System.out.println("Elfendollar reichen nicht aus für
						// diese Rasse");
					}
				}
				break;
			case 5:
				wesen = new Nachtelf();
				if (elfendollar - wesen.cost >= 0) {
					team.add(wesen);
					elfendollar -= wesen.cost;
				} else {
					// System.out.println("Elfendollar reichen nicht aus für
					// diese Rasse");
				}
				break;
			case 6:
				wesen = new Daemonenjaeger();
				
				if(einmal[2]==false){
					if (elfendollar - wesen.cost >= 0) {
						team.add(wesen);
						elfendollar -= wesen.cost;
						einmal[2]=true;
						System.out.println("45454");
					} else {
						// System.out.println("Elfendollar reichen nicht aus für
						// diese Rasse");
					}
				}
				break;
			case 7:
				wesen = new Untote();
				if (elfendollar - wesen.cost >= 0) {
					team.add(wesen);
					elfendollar -= wesen.cost;
				} else {
					// System.out.println("Elfendollar reichen nicht aus für
					// diese Rasse");
				}
				break;
			case 8:
				wesen = new Lich();
				if(einmal[3]==false){
					if (elfendollar - wesen.cost >= 0) {
						team.add(wesen);
						elfendollar -= wesen.cost;
						einmal[3]=true;
						System.out.println("45454");
					} else {
						// System.out.println("Elfendollar reichen nicht aus für
						// diese Rasse");
					}
				}
				break;
			default:
				
			}

		}
	}

	Squad(Squad Spieler1, Squad Spieler2) {
		schlacht(Spieler1, Spieler2);
	}

	public void schlacht(Squad allianz, Squad clan) {
		int zahl;
		int i;
		int runde=0;
		
		do {

			if(existens(clan)){
				
				runde++;
				
				do {
					zahl = (int) (Math.random() * allianz.team.size());
				} while (!allianz.team.get(zahl).isLebendig() && existens(allianz));
				
				System.out.println("\nRunde: "+runde);
				
				System.out.println("Verteidiger: "+allianz.team.get(zahl).typ+": " +allianz.team.get(zahl).toString(allianz.team.get(zahl)));
				
				do {
					i = (int) (Math.random() * clan.team.size());
				} while (!clan.team.get(i).isLebendig() && existens(clan));
				
				System.out.println("Angreifer: "+clan.team.get(i).typ+": "+ clan.team.get(i).toString(clan.team.get(i)));

				allianz.team.get(zahl).hp -= clan.team.get(i).attack();
			}
			
			if(existens(allianz)){
				
				runde++;
				
				do {
					zahl = (int) (Math.random() * clan.team.size());
				} while (!clan.team.get(zahl).isLebendig() && existens(clan));
				
				System.out.println("\nRunde: "+runde);
				
				System.out.println("Verteidiger: "+clan.team.get(zahl).typ+": " +clan.team.get(zahl).toString(clan.team.get(zahl)));

				do {
					i = (int) (Math.random() * allianz.team.size());
				} while (!allianz.team.get(i).isLebendig() && existens(allianz));
				
				System.out.println("Angreifer: "+allianz.team.get(i).typ+": "+ allianz.team.get(i).toString(allianz.team.get(i)));
				
				clan.team.get(zahl).hp -= allianz.team.get(i).attack();
			}
			
		} while (existens(allianz) && existens(clan));
		
		if(!existens(allianz)){
			System.out.println(allianz.teamName+ " tot");
		}else{
			System.out.println(clan.teamName+ " tot");
		}

	}

	public boolean existens(Squad spieler) {

		for (int i = 0; i < spieler.team.size(); i++) {
			if (spieler.team.get(i).isLebendig()) {
				return true;
			}
		}

		return false;
	}
	
	 
}
