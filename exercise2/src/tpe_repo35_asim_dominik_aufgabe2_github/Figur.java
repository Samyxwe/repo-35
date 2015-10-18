/**
 * Durch den Paketnamen tpe_repo35_asim_dominik_aufgabe2_github haben wir eine
 * Kollision mit anderen Packages verhindert,
 * da unsere Namen, die Gruppennummer, das Vorlesungsfach,die Aufgabennummer 
 *  und die Webseite auf die wir die Übung Hochladen im Paketnamen vorkommen.
 */
package tpe_repo35_asim_dominik_aufgabe2_github;
/**
 * 	Klasse Figur dient zum speichern der Fläche der
 * 	jeweiligen Figur. Das Attribut und der Konstruktor
 *	können nur von Sub-Klassen aufgerufen werden.
 */
class Figur {

	protected double flaeche;
	
	protected Figur(){
		this.flaeche=0;
	}	
	
	protected Figur(double flaeche){
		this.flaeche=flaeche;
	}
	
	/**
	 * Hier wird nur die Fläche zurückgegeben
	 * 
	 */
	public double getFlaeche(){
		return this.flaeche;
	}
}



