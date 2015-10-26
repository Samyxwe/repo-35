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
	
	@Test
	public void isLebendig() {
		/**
		 * Mensch
		 */
		assertEquals(mensch.hp,150,PRECISION);
		
		assertEquals(mensch.attack(),80,PRECISION);
		
		assertEquals(mensch.isLebendig(),true);
		
		/**
		 * Ork
		 */
		assertEquals(ork.hp,100,PRECISION);
		
		assertEquals(ork.attack(),33,PRECISION);
		
		assertEquals(ork.isLebendig(),true);
		
		/**
		 * Erzmagier
		 */
		assertEquals(erzmagier.hp,150,PRECISION);
		
		assertEquals(erzmagier.attack(),80*erzmagier.bonus,PRECISION);
		
		assertEquals(erzmagier.isLebendig(),true);
	}

	public void attack(){
		/**
		 * Erzmagier greift Ork an
		 * Erzmagier hat 120 Angriffspunkte und Ork nur 100 Lebenspunkte,
		 * somit stirbt Ork 
		 */
		ork.hp-=erzmagier.attack();
		assertEquals(ork.isLebendig(),false);
		assertEquals(ork.hp,-20,PRECISION);
		
	}
}
