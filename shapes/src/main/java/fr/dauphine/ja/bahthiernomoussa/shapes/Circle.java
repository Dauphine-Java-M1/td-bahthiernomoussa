package fr.dauphine.ja.bahthiernomoussa.shapes;

public class Circle {
	
  private Point pCentre;
  private double rayon;
  
  public Circle(Point pc, double r) {
	  
	  //this.pCentre = pc;
	  this.rayon = r;
	  
	  this.pCentre = new Point(pc.getX(),pc.getY());
  }
  
  public double getRayon() {
	  return this.rayon;
  }
  public String toString() {
	  return "cercle de centre ("+this.pCentre.getX()+","+this.pCentre.getY()+"), de rayon "+this.rayon+" et de surface: "+surface();
  }
  //Question 4.4
  public void translate(double dx, double dy) {
	  this.pCentre.translate(dx, dy);
  }
  //Question 4.6
  public Point getCenter() {
	  return (new Point(pCentre.getX(),pCentre.getY()));
  }
  //Question 4.7
  public double surface() {
	  return 3.14159*rayon*rayon;
  }
  
  //Question 4.8
  //Je suppose que le point doit être entièrement dans le cercle et non sur le cercle.
  public boolean contains(Point p) {
	  if(p.distanceAB(p, this.getCenter()) < this.getRayon()*this.getRayon()) return true;
	  return false;
  }
  
  //Question 4.9
  //Ici, je suppose que j'ai un tableau de cercles.
  public static boolean contains(Point p, Circle[] circles) {
	  for(int i=0; i<circles.length; i++) {
		  if(circles[i].contains(p)) return true;
	  }
	  return false;
  }
  public static void main(String[] args) {
	  //Quelques tests
	  Point p = new Point(1,2);
	  Circle c = new Circle(p,1);
	  
	  Circle c2 = new Circle(p,2);
	  c2.translate(1, 1);
	  
	  System.out.println(c+".\n"+c2);
	  
	  //Question 4.6
	  Circle c3 = new Circle(new Point(1,2), 1);
	   c3.getCenter().translate(1, 1);
	  System.out.println(c3);
	  //Question 4.8
	  
	  Point a = new Point(1,5);
	  Point pc = new Point(4,5);
	  Circle cr = new Circle(pc,3);
	  
	  System.out.println("le point a de coordonnées: "+a.toString());
	  System.out.println("le point pc de coordonnées: "+pc.toString());
	  System.out.println(cr);
	  System.out.println(pc.distanceAB(a, cr.getCenter()));
	  System.out.println(cr.contains(a));
	  
	  //Question 4.9
	  
	  Point b = new Point(10,15);
	  Circle[] tc = new Circle[3];
	  tc[0] = new Circle(p,1);
	  tc[1] = new Circle(a,5);
	  tc[2] = new Circle(b,2);
	  
	  System.out.println(Circle.contains(pc, tc));
	  
	  
	  
  }
}
