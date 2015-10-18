package tpe_repo35_asim_dominik_aufgabe2_github;

/**
 * 
 * Quadrat wird mit einer Seite erzeugt.
 * Fläche wird an Rechteck übergeben.
 * Fläche wird mir Seite * Seite berechnet.
 */
class Quadrat extends Rechteck {
	
	/**
	 * Konstruktor sorgt dafür, dass beim erstellen
	 * einer Figur seite sofort festgelegt wird
	 * und die flaeche berechnet wird.
	*/
	Quadrat(double seite){
		/**
		 * Konstruktoraufruf von Rechteck(double hoehe,double breite);
		 */
		super(seite, seite);
		
	}
	
}
