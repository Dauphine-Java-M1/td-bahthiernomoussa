package fr.dauphine.ja.bahthiernomoussa.shapes;

public class Circle {
	
  private Point pCentre;
  private double rayon;
  
  public Circle(Point pc, double r) {
	  
	  this.pCentre = pc;
	  this.rayon = r;
  }
  
  public String toString() {
	  return "cercle de centre ("+this.pCentre.getX()+","+this.pCentre.getY()+") et de rayon "+this.rayon;
  }
  //Question 4.4
  public void translate(double dx, double dy) {
	  this.pCentre.translate(dx, dy);
  }
  
  public static void main(String[] args) {
	  Point p = new Point(1,2);
	  Circle c = new Circle(p,1);
	  
	  Circle c2 = new Circle(p,2);
	  c2.translate(1, 1);
	  
	  System.out.println(c+" "+c2);
  }
}
