package fr.dauphine.ja.bahthiernomoussa.shapes;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class Point
{
	//Question 1
	private final double x,y;
	static int nbre_points=0;
	
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	public Point(double px, double py) {
		this.x = px;
		this.y = py;
		nbre_points++;
	}
	
	public Point(Point p) {
		this(p.x,p.y);
	}
	
	//Question 1.9
	public String toString() {
		return this.x+","+this.y;
	}
	
	//Question 2.2
	public boolean isSameAs(Point p) {
		return (this.x==p.x && this.y==p.y);
	}
	
	// Exercice 4. Mutabilité et cercle
	public Point translate(double  dx, double dy) {
		
		return new Point(x+dx,y+dy);
	}
	
	// Distance entre 2 points
	 public double distanceAB(Point p1, Point p2){
		    
	   double dist = (p2.getX()-p1.getX())*(p2.getX()-p1.getX()) + (p2.getY()-p1.getY())* (p2.getY()-p1.getY());
	   return dist;
	}
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
        //Point p = new Point();
    	Point p = new Point(0,0);
        //System.out.println(p.x+","+p.y);
        System.out.println(p);
        //Exercice 2. Egalité
        Point p1 = new Point(1,2);
        Point p2 = p1;
        Point p3 = new Point(1,2);
       
        
        System.out.println(p1==p2);
        System.out.println(p1==p3);
        
        System.out.println("indexOf");
        ArrayList<Point> list = new ArrayList<>();
        list.add(p1);
        System.out.println(list.indexOf(p2));
        System.out.println(list.indexOf(p3));
        System.out.println(list.indexOf(p1));
        
        // Teste de la fonction distance.
        Point a = new Point(1,5);
        Point b = new Point(4,5);
        
        System.out.println("distance entre a et b "+a.distanceAB(a, b));
       
    }
}
