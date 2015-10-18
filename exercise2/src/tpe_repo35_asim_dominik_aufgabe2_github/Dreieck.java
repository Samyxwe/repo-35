package tpe_repo35_asim_dominik_aufgabe2_github;

/**
 * Dreieck wird mit Grundseite und Höhe erzeugt.
 * Fläche wird an Figur übergeben.
 * Fläche wird mir Höhe * Grundseite berechnet.
 */
class Dreieck extends Figur{
	
	/**
	 * Konstruktor sorgt dafür, dass beim erstellen
	 * einer Figur grungseite und hoehe sofort festgelegt werden
	 * und die flaeche berechnet wird.
	*/
	Dreieck(double grundseite, double hoehe){
		/**
		 * Konstruktoraufruf der Figur(double flaeche);
		 */
		super((0.5)*(hoehe*grundseite)); 
	}
}
