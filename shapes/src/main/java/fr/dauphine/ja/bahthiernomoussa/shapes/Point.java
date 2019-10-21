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
	
	public boolean isSameAs(Point p) {
		return (this.x==p.x && this.y==p.y);
	}
	
	// Exercice 4. Mutabilité et cercle
	public Point translate(double  dx, double dy) {
		
		return new Point(x+dx,y+dy);
	}
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
        //Point p = new Point();
    	Point p = new Point(0,0);
        System.out.println(p.x+","+p.y);
        
        //Exercice 2. Egalité
        Point p1 = new Point(1,2);
        Point p2 = p1;
        Point p3 = new Point(1,2);
       
        
        System.out.println(p1==p2);
        System.out.println(p1==p3);
        
        ArrayList<Point> list = new ArrayList<>();
        list.add(p1);
        System.out.println(list.indexOf(p2));
        System.out.println(list.indexOf(p3));
       
    }
}
