package fr.dauphine.ja.bahthiernomoussa.iterables;

import java.util.AbstractList;
import java.util.Iterator;

/**
 * Hello world!
 *
 */
public class Panel extends AbstractList<Integer>{
	private int lb, ub;
	
	public Panel(int lb, int ub) {
		this.lb = lb;
		this.ub = ub;
	}
	
	public int getLB() {
		return lb;
	}
	
	public int getUB() {
		return ub;
	}
	
	public static Iterator<Integer> panel1(final int start, final int end){
		
		return new Iterator<Integer>(){
			int i = start;
			@Override
			public boolean hasNext(){
				return i<= end;
			}
			@Override
			public Integer next(){
				return i++;
			}
		};
	}
	
	@Override
	public Integer get(int arg0) {
		// TODO Auto-generated method stub
		return lb+arg0;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return ub-lb+1;
	}
	
    public static void main( String[] args )
    {
        System.out.println( "Test de la fonction panel1. " );
        Iterator<Integer> it = panel1(1,5);
        
        for(;it.hasNext();) System.out.print(it.next()+" ");
    }
}
