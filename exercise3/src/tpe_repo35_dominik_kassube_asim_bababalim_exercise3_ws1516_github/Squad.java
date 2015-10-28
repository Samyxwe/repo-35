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
	int eingabe;
	int zaehler = 0;
	Mensch mensch = new Mensch();
	Untote untote = new Untote();
	Ork ork = new Ork();
	Nachtelf nachtelf = new Nachtelf();
	Erzmagier erzmagier = new Erzmagier();
	Farseer farseer = new Farseer();
	Daemonenjaeger daemonenjaeger = new Daemonenjaeger();
	Lich lich = new Lich();

	Squad() {
		erstelleSquad();
	}

	public void erstelleSquad() {
		System.out.println("Teamnamen eingeben:");
		teamName = in.nextLine();

		
		while (elfendollar > 69) {
			// System.out.println("Geld: " + elfendollar);
			eingabe = (int) Math.random() * 8 + 1;

			switch (eingabe) {
			// case 0:
			// fertig = true;
			// break;
			case 1:
				if (elfendollar - mensch.cost >= 0) {
					// einheiten[zaehler] = new Mensch();
					wesen = new Mensch();
					team.add(wesen);
					elfendollar -= mensch.cost;
					zaehler++;
				} else {
					// System.out.println("Elfendollar reichen nicht aus für
					// diese Rasse");
				}
				break;
			case 2:
				if(einmal[0]==false){
					if (elfendollar - erzmagier.cost >= 0) {
						// einheiten[zaehler] = new Erzmagier();
						wesen = new Erzmagier();
						team.add(wesen);
						elfendollar -= erzmagier.cost;
						zaehler++;
						einmal[0]=true;
					} else {
						// System.out.println("Elfendollar reichen nicht aus für
						// diese Rasse");
					}
				}
				break;
			case 3:
				if (elfendollar - ork.cost >= 0) {
					// einheiten[zaehler] = new Ork();
					wesen = new Ork();
					team.add(wesen);
					elfendollar -= ork.cost;
					zaehler++;
				} else {
					// System.out.println("Elfendollar reichen nicht aus für
					// diese Rasse");
				}
				break;
			case 4:
				if(einmal[1]==false){
					if (elfendollar - farseer.cost >= 0) {
						// einheiten[zaehler] = new Farseer();
						wesen = new Farseer();
						team.add(wesen);
						elfendollar -= farseer.cost;
						zaehler++;
						einmal[1]=true;
					} else {
						// System.out.println("Elfendollar reichen nicht aus für
						// diese Rasse");
					}
				}
				break;
			case 5:
				if (elfendollar - nachtelf.cost >= 0) {
					// einheiten[zaehler] = new Nachtelf();
					wesen = new Nachtelf();
					team.add(wesen);
					elfendollar -= nachtelf.cost;
					zaehler++;
				} else {
					// System.out.println("Elfendollar reichen nicht aus für
					// diese Rasse");
				}
				break;
			case 6:
				if(einmal[2]==false){
					if (elfendollar - daemonenjaeger.cost >= 0) {
						// einheiten[zaehler] = new Daemonenjaeger();
						wesen = new Daemonenjaeger();
						team.add(wesen);
						elfendollar -= daemonenjaeger.cost;
						zaehler++;
						einmal[2]=true;
					} else {
						// System.out.println("Elfendollar reichen nicht aus für
						// diese Rasse");
					}
				}
				break;
			case 7:
				if (elfendollar - untote.cost >= 0) {
					// einheiten[zaehler] = new Untote();
					wesen = new Untote();
					team.add(wesen);
					elfendollar -= untote.cost;
					zaehler++;
				} else {
					// System.out.println("Elfendollar reichen nicht aus für
					// diese Rasse");
				}
				break;
			case 8:
				if(einmal[3]==false){
					if (elfendollar - lich.cost >= 0) {
						// einheiten[zaehler] = new Lich();
						wesen = new Lich();
						team.add(wesen);
						elfendollar -= lich.cost;
						zaehler++;
						einmal[3]=true;
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
		do {

		if(existens(clan)){
			do {
				zahl = (int) (Math.random() * allianz.team.size());
			} while (!allianz.team.get(zahl).isLebendig() && existens(allianz));

			do {
				i = (int) (Math.random() * clan.team.size());
			} while (!clan.team.get(i).isLebendig() && existens(clan));

			System.out.println("Angriff1");
			allianz.team.get(zahl).hp -= clan.team.get(i).attack();
		}
			if(existens(allianz)){
				do {
					zahl = (int) (Math.random() * clan.team.size());
				} while (!clan.team.get(zahl).isLebendig() && existens(clan));

				do {
					i = (int) (Math.random() * allianz.team.size());
				} while (!allianz.team.get(i).isLebendig() && existens(allianz));

				System.out.println("Angriff2");
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

	/*
	 * public boolean urteil(Squad Spieler1, Squad Spieler2){
	 * 
	 * boolean ueberlebende = false;
	 * 
	 * for (int j = 0; j < Spieler1.team.size(); j++) {
	 * if(Spieler1.team.get(j).isLebendig()==true){ ueberlebende=false; }else{
	 * return true; } }
	 * 
	 * for (int j = 0; j < Spieler2.team.size(); j++) {
	 * if(Spieler2.team.get(j).isLebendig()==true){ ueberlebende=false; }else{
	 * return true; } }
	 * 
	 * return ueberlebende;
	 * 
	 * }
	 */
}
