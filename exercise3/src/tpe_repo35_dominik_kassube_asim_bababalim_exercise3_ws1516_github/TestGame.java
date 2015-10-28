package tpe_repo35_dominik_kassube_asim_bababalim_exercise3_ws1516_github;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestGame {

	private static final double PRECISION = 0.0001;
	Mensch mensch=new Mensch();
	Ork ork=new Ork();
	Untote untote=new Untote();
	Nachtelf nachtelf=new Nachtelf();
	Erzmagier erzmagier=new Erzmagier();
	Farseer farseer=new Farseer();
	Squad Spieler1;
	Squad Spieler2;
	Squad spielsimulation;
	
	@Test
	public void isLebendig() {
		/**
		 * Mensch
		 */
		assertEquals(mensch.hp,150,PRECISION);
		assertEquals(mensch.armor,0.4,PRECISION);
		assertEquals(mensch.attack(),80,PRECISION);
		assertEquals(mensch.speed,2,PRECISION);
		assertEquals(mensch.isLebendig(),true);
		
		/**
		 * Ork
		 */
		assertEquals(ork.hp,100,PRECISION);
		assertEquals(ork.armor,0.3,PRECISION);
		assertEquals(ork.attack(),33,PRECISION);
		assertEquals(ork.speed,1,PRECISION);
		assertEquals(ork.isLebendig(),true);
		
		/**
		 * 	Untote
		 */
		assertEquals(untote.hp,120,PRECISION);
		assertEquals(untote.armor,0.3,PRECISION);
		assertEquals(untote.attack(),32,PRECISION);
		assertEquals(untote.speed,2,PRECISION);
		assertEquals(untote.isLebendig(),true);
		
		/**
		 * Nachtelf
		 */
		assertEquals(nachtelf.hp,120,PRECISION);
		assertEquals(nachtelf.armor,0.2,PRECISION);
		assertEquals(nachtelf.attack(),45,PRECISION);
		assertEquals(nachtelf.speed,3,PRECISION);
		assertEquals(nachtelf.isLebendig(),true);
		
		/**
		 * Erzmagier
		 */
		assertEquals(erzmagier.hp,150,PRECISION);
		
		assertEquals(erzmagier.attack(),400,PRECISION);
		
		assertEquals(erzmagier.isLebendig(),true);
	}

	@Test
	public void attack(){
		/**
		 * Erzmagier greift Ork an
		 * Erzmagier hat 120 Angriffspunkte und Ork nur 100 Lebenspunkte,
		 * somit stirbt Ork 
		 */
		ork.hp-=erzmagier.attack()-erzmagier.attack()*ork.armor;
		assertEquals(ork.isLebendig(),false);
		assertEquals(ork.hp,-180,PRECISION);
		
	}
	
	@Test
	public void simulation(){
		
		Spieler1 = new Squad();
		Spieler2 = new Squad();
		
		spielsimulation=new Squad(Spieler1,Spieler2);
		
		assertEquals(spielsimulation.existens(Spieler1) || spielsimulation.existens(Spieler2),true);
		assertEquals(spielsimulation.existens(Spieler1) && spielsimulation.existens(Spieler2),false);
	}
}
