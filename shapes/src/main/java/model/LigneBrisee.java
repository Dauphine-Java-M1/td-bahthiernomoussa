package model;

public class LigneBrisee {
	
	private int nombrePoints;
	private Point[] tabPoint;
	
	public LigneBrisee(int np) {
		this.nombrePoints = np;
	    tabPoint = new Point[np];
	}
	
	public void add(Point p) {
		tabPoint[tabPoint.length-1]=p;
	}
	
	public int pointCapacity() {
		return this.nombrePoints;
	}
	
	public int nbPoints() {
		return tabPoint.length;
	}
	
	public boolean contains(Point p) {
		for(int i=0; i<nbPoints(); i++) {
			if(tabPoint[i].isSameAs(p)) return true;
		}
		
		return false;
	}
	public String toString() {
		return "";
	}
	public static void main(String[] args) {
		//Quelques tests.
		LigneBrisee lb = new LigneBrisee(5);
		
		Point p0 = new Point(1,2);
		Point p1 = new Point(3,5);
		lb.add(p0);
		lb.add(null);
		lb.add(p1);
	}

}
