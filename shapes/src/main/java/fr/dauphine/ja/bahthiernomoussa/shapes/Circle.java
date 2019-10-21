package fr.dauphine.ja.bahthiernomoussa.shapes;

public class Circle {
	
  private Point pCentre;
  private double rayon;
  
  public Circle(Point pc, double r) {
	  
	  //this.pCentre = pc;
	  this.rayon = r;
	  
	  this.pCentre = new Point(pc.getX(),pc.getY());
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
	  return 3.14*rayon*rayon;
  }
  public static void main(String[] args) {
	  Point p = new Point(1,2);
	  Circle c = new Circle(p,1);
	  
	  Circle c2 = new Circle(p,2);
	  c2.translate(1, 1);
	  
	  System.out.println(c+".\n"+c2);
	  
	  //Question 4.6
	  Circle c3 = new Circle(new Point(1,2), 1);
	   c3.getCenter().translate(1, 1);
	  System.out.println(c3);
  }
}
