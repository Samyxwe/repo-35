package asimdominik2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestFigur {

	private static final double PRECISION = 0.0001;
	
	@Test
	public void Rechteck() {
		Rechteck r1 = new Rechteck(5,10);
        assertEquals(50, r1.getFlaeche(),PRECISION);
	}
	@Test
	public void Dreieck() {
		Dreieck d1 = new Dreieck(5,7);
        assertEquals(17.5, d1.getFlaeche(),PRECISION);
	}
	@Test
	public void Gerade() {
		Gerade g1 = new Gerade(10);
        assertEquals(0, g1.getFlaeche(),PRECISION);
	}
	@Test
	public void Quadrat() {
		Quadrat q1 = new Quadrat(5);
        assertEquals(25, q1.getFlaeche(),PRECISION);
	}
}
