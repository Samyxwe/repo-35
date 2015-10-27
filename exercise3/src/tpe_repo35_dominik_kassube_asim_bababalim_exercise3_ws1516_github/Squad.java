package tpe_repo35_dominik_kassube_asim_bababalim_exercise3_ws1516_github;

import java.util.*;
import java.util.ArrayList;
public class Squad {

	Scanner in=new Scanner(System.in);
	Wesen wesen;
	ArrayList<Wesen> team=new ArrayList<Wesen>();
	private double elfendollar=2000;
	String teamName;
	//Wesen[] einheiten = new Wesen[28];
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
					//einheiten[zaehler] = new Mensch();
					wesen=new Mensch();
					team.add(wesen);
					elfendollar -= mensch.cost;
					zaehler++;
				} else {
					System.out.println("Elfendollar reichen nicht aus für diese Rasse");
				}
				break;
			case 2:
				if (elfendollar - erzmagier.cost >= 0) {
					//einheiten[zaehler] = new Erzmagier();
					wesen=new Erzmagier();
					team.add(wesen);
					elfendollar -= erzmagier.cost;
					zaehler++;
				} else {
					System.out.println("Elfendollar reichen nicht aus für diese Rasse");
				}
				break;
			case 3:
				if (elfendollar - ork.cost >= 0) {
					//einheiten[zaehler] = new Ork();
					wesen=new Ork();
					team.add(wesen);
					elfendollar -= ork.cost;
					zaehler++;
				} else {
					System.out.println("Elfendollar reichen nicht aus für diese Rasse");
				}
				break;
			case 4:
				if (elfendollar - farseer.cost >= 0) {
					//einheiten[zaehler] = new Farseer();
					wesen=new Farseer();
					team.add(wesen);
					elfendollar -= farseer.cost;
					zaehler++;
				} else {
					System.out.println("Elfendollar reichen nicht aus für diese Rasse");
				}
				break;
			case 5:
				if (elfendollar - nachtelf.cost >= 0) {
					//einheiten[zaehler] = new Nachtelf();
					wesen=new Nachtelf();
					team.add(wesen);
					elfendollar -= nachtelf.cost;
					zaehler++;
				} else {
					System.out.println("Elfendollar reichen nicht aus für diese Rasse");
				}
				break;
			case 6:
				if (elfendollar - daemonenjaeger.cost >= 0) {
					//einheiten[zaehler] = new Daemonenjaeger();
					wesen=new Daemonenjaeger();
					team.add(wesen);
					elfendollar -= daemonenjaeger.cost;
					zaehler++;
				} else {
					System.out.println("Elfendollar reichen nicht aus für diese Rasse");
				}
				break;
			case 7:
				if (elfendollar - untote.cost >= 0) {
					//einheiten[zaehler] = new Untote();
					wesen=new Untote();
					team.add(wesen);
					elfendollar -= untote.cost;
					zaehler++;
				} else {
					System.out.println("Elfendollar reichen nicht aus für diese Rasse");
				}
				break;
			case 8:
				if (elfendollar - lich.cost >= 0) {
					//einheiten[zaehler] = new Lich();
					wesen=new Lich();
					team.add(wesen);
					elfendollar -= lich.cost;
					zaehler++;
				} else {
					System.out.println("Elfendollar reichen nicht aus für diese Rasse");
				}
				break;
			default: System.out.println("Shop:\n"
					+ "1) Mensch: "+mensch.cost+";   2) Erzmagier: "+erzmagier.cost+"\n"
					+ "3) Ork: "+ork.cost+";      4) Farseer: "+farseer.cost+"\n"
					+ "5) Nachtelf: "+nachtelf.cost+"; 6) Daemonenjaeger: "+daemonenjaeger.cost+"\n"
					+ "7) Untote: "+untote.cost+";    8) Lich: "+lich.cost);

				break;
			}
			
		}
	}
	
	Squad(Squad Spieler1,Squad Spieler2){
		schlacht(Spieler1,Spieler2);
	}
	
	public void schlacht(Squad verteidiger, Squad angreifer){
		int zahl;
		for (int i = 0; i < team.size(); i++) {
			if (angreifer.team.get(i) != null && angreifer.team.get(i).isLebendig()){
				do{
					zahl =(int)Math.random()*27;
				} while(!verteidiger.team.get(zahl).isLebendig());
					System.out.println("Angriff1");
					verteidiger.team.get(zahl).hp-=angreifer.team.get(i).attack();
				}
			if (verteidiger.team.get(i) != null && team.get(i).isLebendig()){
				do{
					zahl =(int)Math.random()*27;
				}while(!angreifer.team.get(zahl).isLebendig());
					System.out.println("Angriff");
					angreifer.team.get(zahl).hp-=verteidiger.team.get(i).attack();
			}	
			
			boolean rteil=urteil(verteidiger,angreifer);
			if(rteil==false)
			System.out.println("tot");
		}
		
	}
	
	public boolean urteil(Squad Spieler1, Squad Spieler2){
		
		boolean ueberlebende = false;
		
		for (int j = 0; j < Spieler1.team.size(); j++) {
			if(Spieler1.team.get(j).isLebendig()==true){
				ueberlebende=false;
			}else{
				return true;
			}
		}
		
		for (int j = 0; j < Spieler2.team.size(); j++) {
			if(Spieler2.team.get(j).isLebendig()==true){
				ueberlebende=false;
			}else{
				return true;
			}
		}
		
		return ueberlebende;
		
	}
}
