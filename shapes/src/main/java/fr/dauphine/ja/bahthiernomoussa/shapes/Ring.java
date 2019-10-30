package fr.dauphine.ja.bahthiernomoussa.shapes;

//Exercice 5
public class Ring extends Circle{
	private double ri;
	
	public Ring(Point pc, double r, double r2) {
		super(pc, r);
		// TODO Auto-generated constructor stub
		this.ri = r2;
	}
	
	public double getRI() {
		return this.ri;
	}
	public boolean equals(Ring r) {
		return (this.getCenter() == r.getCenter() && this.getRayon() == r.getRayon() && this.ri == r.ri);
	}
	
	public String toString() {
		return "anneau de centre ("+this.getCenter()+") de rayon "+this.getRayon()+" et de rayon interne "+this.getRI()+".";
	}
	
	public boolean contains(Point p) {
		return p.isSameAs(p);
	}
	
	public boolean contains(Point p, Ring[] rings) {
		for(int i=0; i<rings.length; i++) {
			
		}
		return true;
	}
	public static void main(String[] args) {
		
		Point p = new Point(2,17);
		Ring ring = new Ring(p,4,3);
		
		System.out.println(ring); 
	}

}
