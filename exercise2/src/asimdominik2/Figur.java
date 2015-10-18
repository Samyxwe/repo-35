/**
 * Durch den Paketnamen asimdominik2 haben wir eine
 * Kollision mit anderen Packages verhindert,
 * da unsere Namen und die Aufagben Nummer im Paketnamen vorkommen.
 */
package asimdominik2;
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
	
	public double getFlaeche(){
		return this.flaeche;
	}
}

/**
 * 
 * Rechteck wird mit Höhe und Breite erzeugt.
 * Fläche wird an Figur übergeben.
 * Setter und Getter sind von außerhalb aufrufbar.
 * Fläche wird mir Höhe * Breite berechnet.
 */
class Rechteck extends Figur{
	private double hoehe, breite;
	Rechteck (double hoehe,double breite){	
		setHoehe(hoehe);
		setBreite(breite);
		super.flaeche = hoehe*breite;
	}
	public double getHoehe() {
		return hoehe;
	}
	public void setHoehe(double hoehe) {
		this.hoehe = hoehe;
	}
	public double getBreite() {
		return breite;
	}
	public void setBreite(double breite) {
		this.breite = breite;
	}
}
/**
 * 
 * Dreieck wird mit Grundseite und Höhe erzeugt.
 * Fläche wird an Figur übergeben.
 * Setter und Getter sind von außerhalb aufrufbar.
 * Fläche wird mir Höhe * Grundseite berechnet.
 */
class Dreieck extends Figur{
	private double grundseite, hoehe;
	Dreieck(double grundseite, double hoehe){
		setHoehe(hoehe);
		setGrundseite(grundseite);
		super.flaeche = (0.5)*(hoehe*grundseite); 
	}
	public double getGrundseite() {
		return grundseite;
	}
	public void setGrundseite(double grundseite) {
		this.grundseite = grundseite;
	}
	public double getHoehe() {
		return hoehe;
	}
	public void setHoehe(double hoehe) {
		this.hoehe = hoehe;
	}
}
/**
 * 
 * Gerade wird mit Länge erzeugt.
 * Fläche wird an Figur übergeben.
 * Die Fläche einer Geraden ist immer 0.
 * Setter und Getter sind von außerhalb aufrufbar.
 */
class Gerade extends Figur {
	private double laenge;
	
	Gerade(double laenge){
		setLaenge(laenge);
		super.flaeche = 0;
	}
	public double getLaenge() {
		return laenge;
	}
	public void setLaenge(double laenge) {
		this.laenge = laenge;
	}
}
/**
 * 
 * Quadrat wird mit einer Seite erzeugt.
 * Fläche wird an Figur übergeben.
 * Setter und Getter sind von außerhalb aufrufbar.
 * Fläche wird mir Seite * Seite berechnet.
 */
class Quadrat extends Figur {
	private double seite;
	
	Quadrat(double seite){
		setSeite(seite);
		super.flaeche = seite*seite;
	}
	public double getSeite() {
		return seite;
	}
	public void setSeite(double seite) {
		this.seite = seite;
	}
}