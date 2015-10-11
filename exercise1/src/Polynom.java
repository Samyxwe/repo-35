import java.lang.Math;
/**
 * Diese Klasse präsentiert ein Polynom von einem beliebigen Grad mit
 * realen Koeffizienten.
 * <p>
 * Polynome können addiert und subtrahiert werden. Außerdem ist es möglich,
 * die Koeffizienten einzeln oder en-bloc wieder auszulesen. Für beliebige
 * Werte x kann der Polynom ausgerechnet werden.
 * <p>
 * Es besteht die Möglichkeit das Polynom zu differnzieren oder zu
 * integrieren.
 * <p>
 * Objekte dieser Klasse sind immutable. Die Methoden verändern den Zustand
 * des Objektes nicht sondern geben grundsätzlich ein neues Objekt zurück.
 * <p>
 * Die Indices beim Zugriff auf die Koeffizienten beginnen immer
 * bei {@literal 0}
 */
public class Polynom {
	
	double[] poly;
    /*
     * Hilfe, ich bin werde auf der Mother Base gefangen gehalten
     * und muss hier den ganzen Tag Programme schreiben...
     *
     * Ich lösche jetzt einfach die meisten Implementierung der
     * Methoden und flüchte mit dem Schlauchboot, vielleicht finden
     * sie mich ja nicht....
     */

    /**
     * Erzeugt ein neues Polynom mit den gegebenen Koeffizienten.
     * Die Koeffizienten beginnen Element a0 und setzen sich dann zu
     * höheren Koeffizienten fort. D.h., dass z.B. das Polynom
     * <code>2x^4 - 1x^3 + 0,5x^2</code> erzeugt werden muss als:
     * <code>new Polynom(0.0, 0.0, 0.5, -1.0, 2.0)</code>.
     *
     * @param a Koeffizienten des Polynoms
     */
    public Polynom(double... a) {
    	this.poly = a;
    }

    /**
     * Erzeugt das Nullpolynom, d.h. das Polynom, bei dem alle Koeffizienten
     * 0 sind.
     */
    public Polynom() {
    	this.poly=new double [0];
    	new Polynom(0);
    }

    /**
     * Berechnet das Polynom an der Stelle x.
     *
     * @param x Stelle, für die das Polynom berechnet werden soll.
     * @return Wert an der Stelle x
     */
    public double berechne(double x) {
        double sum = 0;
    	for (int i = 0; i<this.poly.length; i++){
    		sum += (poly[i])*(Math.pow(x,i));
    	}
    	return sum;
    }

    /**
     * Berechnet das Polynom an mehreren Stellen.
     *
     * @param xs die Stellen an der das Polynom berechnet werden soll.
     * @return Ergebnis
     */
    public double[] calc(double[] xs) {
    	double[] sum = new double[xs.length];
    	for (int i = 0; i < sum.length; i++) {
			sum[i] = berechne(xs[i]);
		}
        return sum;
    }

    /**
     * Liefert den Grad des Polynoms.
     *
     * @return Grad des Polynoms, -1 für das Nullpolynom
     */
    public int getGrad() {
    	if (this.poly.length != 0){
    		int x=0;
    		for (int i = 0; i < poly.length; i++) {
				if(this.poly[i]!=0)
				x=i;	
			}
    		return x;
    	}	
        return -1;    
    }

    /**
     * Liefert den n-ten Koeffizienten.
     *
     * @param n Koeffizient, der gelesen werden soll.
     * @return Wert des Koeffizienten oder 0 wenn n größer als der Grad des
     *         Polynoms ist
     */
    public double getKoeffizient(int n) {
        return this.poly[n];
    }

    /**
     * Liefert die Koeffizienten dieses Polynoms.
     *
     * @return die Koeffizienten.
     */
    public double[] getKoeffizienten() {
        
    	return this.poly;
    }

    /**
     * Addiert das gegebenen Polynom zu diesem.
     *
     * @param p Polynom, das addiert werden soll.
     * @return neues Polynom mit dem Ergebnis der Addition
     */
    public Polynom addiere(Polynom p) {
    	
    	Polynom x=new Polynom();
    	int length;
    	if (this.poly.length > p.poly.length){
    		length = p.poly.length;
    		x.poly = this.poly;
    	} else {
    		length = this.poly.length;
    		x.poly = p.poly;
    	}
    	for (int i = 0; i < length; i++) {
			x.poly[i]=this.poly[i]+p.poly[i];	
    	}
        return x;
    }

    /**
     * Subtrahiert das gegebenen Polynom von diesem.
     *
     * @param p Polynom, das subtrahiert werden soll.
     * @return neues Polynom mit dem Ergebnis der Subtraktion
     */
    public Polynom subtrahiere(Polynom p) {
    	Polynom x=new Polynom();
    	int length;
    	if (this.poly.length > p.poly.length){
    		length = p.poly.length;
    		x.poly = this.poly;
    	} else {
    		length = this.poly.length;
    		x.poly = p.poly;
    	}
    	for (int i = 0; i < length; i++) {
			x.poly[i]=this.poly[i]-p.poly[i];	
    	}
        return x;
    }

    /**
     * Differenziert das Polynom.
     *
     * @return Ergebnis der Ableitung
     */
    public Polynom differenziere() {
    	
    	Polynom ableitung=new Polynom();
    	double [] a= new double[this.poly.length];
    	
    	ableitung.poly=new double[this.poly.length-1];
    	
    	for (int i = this.poly.length-1; i > 1 ; i--) {
			
    		a[i]=i*this.poly[i];
    		
		}
    	
    	for (int i = a.length-1; i >0; i--) {
			
    		ableitung.poly[i-1]=a[i];
    		
		}
    	
        return ableitung;
    }

    /**
     * Integriert das Polynom.
     *
     * @return Ergebnis der Integration.
     */
    public Polynom integriere() {
    	
    	Polynom stammfunktion=new Polynom();
    	
    	stammfunktion.poly = new double[this.poly.length+1];
    	
    	for (int i = this.poly.length-1; i >= 0; i--) {
			
    		stammfunktion.poly[i+1]=(this.poly[i]/(i+1));
    		
		}
    	
        return stammfunktion;
    }

    /**
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        return 0;
    }

    /**
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {
        return false;
    }

    /**
     * Diese Methode wandelt das Polynom in einen lesbaren String um.
     * Dabei lässt sie alle Koeffizienten aus, die 0 sind und gibt den
     * Grad vorweg aus. Für das Polynom -9x^8 - 4x^5 - 0,5x^4 + 5x^2 - 2x + 3
     * lautet die Ausgabe:
     * <code>
     * Grad 8: -9x^8 - 4x^5 - 0,5x^4 + 5x^2 - 2x + 3
     * </code>
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
    	String polynom="Grad "+ (this.poly.length-1)+": ";
    	
    	if(this.poly.length==0){
    		return "0";
    	}
    	
    	polynom+="" + Math.round(this.poly[this.poly.length-1])+"x^"+(this.poly.length-1);
    	
    	for (int i = this.poly.length-2; i > 1; i--) {
    		//polynom+="" ;
			if(this.poly[i]!=0){
				if(this.poly[i]<0){
					polynom+=" - ";
					this.poly[i]=this.poly[i]*(-1);
				}else{
					polynom+=" + ";
				}
				if(this.poly[i]-(int)(this.poly[i])!=0){
					polynom+="" + this.poly[i]+"x^"+i;
				}else{
					polynom+="" + Math.round(this.poly[i])+"x^"+i;
				}
				
			}
		}
    	
    	if(this.poly[1]<0){
			polynom+=" - ";
			this.poly[1]=this.poly[1]*(-1);
		}else{
			polynom+=" + ";
		}
    	
    	if(this.poly[1]-(int)(this.poly[1])==0){
    	    polynom+=""+Math.round(this.poly[1])+"x";
        }else{
        	polynom+=""+this.poly[1];
    	}
    	if(this.poly[0]-(int)(this.poly[0])==0){
    	    polynom+=" + "+Math.round(this.poly[0]);
        }else{
        	polynom+=" + "+this.poly[0];
    	}
        return polynom;
    }
}
