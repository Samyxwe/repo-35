package tpe_repo35_dominik_kassube_asim_bababalim_exercise3_ws1516_github;

import java.util.*;
public class Squad {

	Scanner in=new Scanner(System.in);
	private double elfendollar=2000;
	String teamName;
	Wesen[] einheiten = new Wesen[28];
	boolean fertig=false;
	int eingabe;
	int zaehler=0;
	Mensch mensch=new Mensch();
	Untote untote=new Untote();
	Ork ork=new Ork();
	Nachtelf nachtelf=new Nachtelf();
	Erzmagier erzmagier=new Erzmagier();
	Farseer farseer=new Farseer();
	Daemonenjaeger daemonenjaeger=new Daemonenjaeger();
	Lich lich =new Lich();
	
	Squad(){
		erstelleSquad();
	}
	
	public void erstelleSquad(){
		System.out.println("Teamnamen eingeben:");
		teamName=in.nextLine();
		
		System.out.println("Shop:\n"
							+ "1) Mensch: "+mensch.cost+";   2) Erzmagier: "+erzmagier.cost+"\n"
							+ "3) Ork: "+ork.cost+";      4) Farseer: "+farseer.cost+"\n"
							+ "5) Nachtelf: "+nachtelf.cost+"; 6) Daemonenjaeger: "+daemonenjaeger.cost+"\n"
							+ "7) Untote: "+untote.cost+";    8) Lich: "+lich.cost);
		
		while(elfendollar>69 & !fertig){
			System.out.println("Geld: " + elfendollar);
			eingabe=in.nextInt();
			
			switch (eingabe) {
			case 0:
				fertig = true;
				break;
			case 1:
				if (elfendollar - mensch.cost >= 0) {
					einheiten[zaehler] = new Mensch();
					elfendollar -= mensch.cost;
					zaehler++;
				} else {
					System.out.println("Elfendollar reichen nicht aus für diese Rasse");
				}
				break;
			case 2:
				if (elfendollar - erzmagier.cost >= 0) {
					einheiten[zaehler] = new Erzmagier();
					elfendollar -= erzmagier.cost;
					zaehler++;
				} else {
					System.out.println("Elfendollar reichen nicht aus für diese Rasse");
				}
				break;
			case 3:
				if (elfendollar - ork.cost >= 0) {
					einheiten[zaehler] = new Ork();
					elfendollar -= ork.cost;
					zaehler++;
				} else {
					System.out.println("Elfendollar reichen nicht aus für diese Rasse");
				}
				break;
			case 4:
				if (elfendollar - farseer.cost >= 0) {
					einheiten[zaehler] = new Farseer();
					elfendollar -= farseer.cost;
					zaehler++;
				} else {
					System.out.println("Elfendollar reichen nicht aus für diese Rasse");
				}
				break;
			case 5:
				if (elfendollar - nachtelf.cost >= 0) {
					einheiten[zaehler] = new Nachtelf();
					elfendollar -= nachtelf.cost;
					zaehler++;
				} else {
					System.out.println("Elfendollar reichen nicht aus für diese Rasse");
				}
				break;
			case 6:
				if (elfendollar - daemonenjaeger.cost >= 0) {
					einheiten[zaehler] = new Daemonenjaeger();
					elfendollar -= daemonenjaeger.cost;
					zaehler++;
				} else {
					System.out.println("Elfendollar reichen nicht aus für diese Rasse");
				}
				break;
			case 7:
				if (elfendollar - untote.cost >= 0) {
					einheiten[zaehler] = new Untote();
					elfendollar -= untote.cost;
					zaehler++;
				} else {
					System.out.println("Elfendollar reichen nicht aus für diese Rasse");
				}
				break;
			case 8:
				if (elfendollar - lich.cost >= 0) {
					einheiten[zaehler] = new Lich();
					elfendollar -= lich.cost;
					zaehler++;
				} else {
					System.out.println("Elfendollar reichen nicht aus für diese Rasse");
				}
				break;
			default:
				break;
			}
			
		}
	}
	
	Squad(Squad Spieler1,Squad Spieler2){
		attack(Spieler1,Spieler2);
	}
	
	public void attack(Squad verteidiger, Squad angreifer){
		int zahl;
		for (int i = 0; i < einheiten.length; i++) {
			if (angreifer.einheiten[i] != null && angreifer.einheiten[i].isLebendig()){
				do{
					zahl =(int)Math.random()*27;
				} while(!verteidiger.einheiten[zahl].isLebendig());
					System.out.println("Angriff1");
					verteidiger.einheiten[zahl].hp-=angreifer.einheiten[i].attack();
				}
			if (verteidiger.einheiten[i] != null && verteidiger.einheiten[i].isLebendig()){
				do{
					zahl =(int)Math.random()*27;
				}while(!angreifer.einheiten[zahl].isLebendig());
					System.out.println("Angriff");
					angreifer.einheiten[zahl].hp-=verteidiger.einheiten[i].attack();
			}	
		}
		
	}
}
