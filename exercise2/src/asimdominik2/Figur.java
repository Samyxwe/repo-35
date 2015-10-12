package asimdominik2;

class Figur {

	private double flaeche;
	
	protected Figur(){
		this.flaeche=0;
	}	
	
	protected Figur(double hoehe,double breite){
    	this.flaeche=hoehe*breite;
    }
	
	
	public double getFlaeche(){
		return this.flaeche;
	}
}

class Rechteck extends Figur{
	private double hoehe, breite;
	private Figur flaeche;
	Rechteck (double hoehe,double breite){
		
		this.hoehe=hoehe;
		this.breite=breite;
		this.flaeche=new Figur(hoehe,breite); 
		
	}
}