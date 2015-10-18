package tpe_repo35_asim_dominik_aufgabe2_github;

/**
 * 
 * Rechteck wird mit Höhe und Breite erzeugt.
 * Fläche wird an Figur übergeben.
 * Fläche wird mir Höhe * Breite berechnet.
 */
class Rechteck extends Figur{
	
	/**
	 * Konstruktor sorgt dafür, dass beim erstellen
	 * einer Figur breite und hoehe sofort festgelegt werden
	 * und die flaeche berechnet wird.
	*/
	Rechteck (double hoehe,double breite){	
		/**
		 * Konstruktoraufruf der Figur(double flaeche);
		 */
		super(hoehe*breite);
	}
	
}