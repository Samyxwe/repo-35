package tpe_repo35_dominik_kassube_asim_bababalim_exercise3_ws1516_github;

import java.util.Scanner;

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
	
	Squad(){
		
		System.out.println("Teamnamen eingeben:");
		teamName=in.nextLine();
		
		System.out.println("Shop:\n"
							+ "1) Mensch: 110;   2) Erzmagier: 220\n"
							+ "3) Ork: 150;      4) Farseer: 300\n"
							+ "5) Nachtelf: 145; 6) Daemonenjaeger: 290\n"
							+ "7) Untote: 70;    8) Lich: 140");
		
		while(elfendollar>69 & !fertig){
			System.out.println("Geld: " + elfendollar);
			eingabe=in.nextInt();
			
			if()
			switch(eingabe){
			case 1:	
					einheiten[zaehler]= new Mensch();
					
					break;
			
			
			}
			zaehler++;
		}
	}
	
	public void attack(){
		
	}
	
}
