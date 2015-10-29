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
		assertEquals(150,mensch.hp,PRECISION);
		assertEquals(0.4,mensch.armor,PRECISION);
		assertEquals(80,mensch.attack(),PRECISION);
		assertEquals(2,mensch.speed,PRECISION);
		assertEquals(true,mensch.isLebendig());
		
		/**
		 * Ork
		 */
		assertEquals(100,ork.hp,PRECISION);
		assertEquals(0.3,ork.armor,PRECISION);
		assertEquals(33,ork.attack(),PRECISION);
		assertEquals(1,ork.speed,PRECISION);
		assertEquals(true,ork.isLebendig());
		
		/**
		 * 	Untote
		 */
		assertEquals(120,untote.hp,PRECISION);
		assertEquals(0.3,untote.armor,PRECISION);
		assertEquals(32,untote.attack(),PRECISION);
		assertEquals(2,untote.speed,PRECISION);
		assertEquals(true,untote.isLebendig());
		
		/**
		 * Nachtelf
		 */
		assertEquals(120,nachtelf.hp,PRECISION);
		assertEquals(0.2,nachtelf.armor,PRECISION);
		assertEquals(45,nachtelf.attack(),PRECISION);
		assertEquals(3,nachtelf.speed,PRECISION);
		assertEquals(true,nachtelf.isLebendig());
		
		/**
		 * Erzmagier
		 */
		assertEquals(150,erzmagier.hp,PRECISION);
		
		assertEquals(400,erzmagier.attack(),PRECISION);
		
		assertEquals(true,erzmagier.isLebendig());
	}

	@Test
	public void attack(){
		/**
		 * Erzmagier greift Ork an
		 * Erzmagier hat 200 Angriffspunkte und Ork nur 100 Lebenspunkte,
		 * somit stirbt Ork 
		 */
		ork.hp-=erzmagier.attack()-erzmagier.attack()*ork.armor;
		assertEquals(false,ork.isLebendig());
		assertEquals(-180,ork.hp,PRECISION);
		
		untote.hp-=nachtelf.attack()-nachtelf.attack()*untote.armor;
		assertEquals(true,untote.isLebendig());
		assertEquals(88.5,untote.hp,PRECISION);
		
	}
	
	@Test
	public void simulation(){
		
		Spieler1 = new Squad("Spieler1");
		Spieler2 = new Squad("Spieler2");
		
		spielsimulation=new Squad(Spieler1,Spieler2);
		
		assertEquals(true,spielsimulation.existens(Spieler1) || spielsimulation.existens(Spieler2));
		assertEquals(false,spielsimulation.existens(Spieler1) && spielsimulation.existens(Spieler2));
	}
}
