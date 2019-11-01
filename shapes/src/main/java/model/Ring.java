package model;

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
		
		return this.ri==r.ri && r.getCenter().isSameAs(getCenter());
	}
	
	public String toString() {
		return "anneau de centre ("+this.getCenter()+") de rayon "+this.getRayon()+" et de rayon interne "+this.getRI()+".";
	}
	
	public boolean contains(Point p) {
		return this.contains(p);
	}
	
	public boolean contains(Point p, Ring[] rings) {
		for(int i=0; i<rings.length; i++) {
			if(rings[i].contains(p)== true) return true;
		}
		return false;
	}
	public static void main(String[] args) {
		// Quelques tests.
		
		Point p = new Point(2,17);
		Ring ring = new Ring(p,4,3);
		
		System.out.println(ring); 
		Point p1 = new Point(15,8);
		Ring r1 = new Ring(p,4,3);
		Ring r2 = new Ring(p1,4,3);
		System.out.println("test de la fonction equals");
		System.out.println("doit afficher true : -> "+ring.equals(r1));
		System.out.println(ring.equals(r2));
		System.out.println(r1.equals(r2));
		System.out.println("test de la fonction contains(Point)");
		
		Point a = new Point(1,5);
		Point pc = new Point(4,5);
		Circle cr = new Circle(pc,3);
		Point a1 = new Point(1,1); 
		System.out.println("le point a de coordonnées: "+a.toString());
		System.out.println("le point pc de coordonnées: "+pc.toString());
		System.out.println(cr);
		System.out.println(pc.distanceAB(a, cr.getCenter()));
	    System.out.println(cr.contains(a));
	    System.out.println(cr.contains(a1));
		  
	}

}
