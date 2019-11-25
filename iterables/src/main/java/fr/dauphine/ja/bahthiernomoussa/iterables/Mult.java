package fr.dauphine.ja.bahthiernomoussa.iterables;

import java.util.AbstractSequentialList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public  class Mult{
	
	public static List<Integer> mult(final int nbre, final List<Integer> l){
		
		return new AbstractSequentialList<Integer>(){
			
			public ListIterator<Integer> listIterator(final int index){
				return new ListIterator<Integer>() {
					private ListIterator<Integer> myLit = l.listIterator(index);
					
					public Integer next() {
						return myLit.next()*nbre;
					}
					public boolean hasNext() {
						return myLit.hasNext();
					}
					@Override
					public void add(Integer e) { // Ici, on empêche la modification
						// TODO Auto-generated method stub
						throw new UnsupportedOperationException();
					}
					@Override
					public boolean hasPrevious() {
						// TODO Auto-generated method stub
						return myLit.hasPrevious();
					}
					@Override
					public int nextIndex() {
						// TODO Auto-generated method stub
						return myLit.nextIndex();
					}
					@Override
					public Integer previous() {
						// TODO Auto-generated method stub
						return myLit.previous();
					}
					@Override
					public int previousIndex() {
						// TODO Auto-generated method stub
						return myLit.previousIndex();
					}
					@Override
					public void remove() {
						// TODO Auto-generated method stub
						
					}
					@Override
					public void set(Integer e) {
						// TODO Auto-generated method stub
						
					}
				};
			}
		
			

			@Override
			public int size() {
				// TODO Auto-generated method stub
				return 0;
			}
			
		};
	}
	
	public static void main(String[] args) {
		// Tester la fonction mult
		ArrayList<Integer> al = new ArrayList<>();
		
		for(int i=0; i<1000000; i++) {
			al.add(i);
		}
		
		long t0 = System.nanoTime();
		List<Integer> ret = Mult.mult(2, al);
		long sum=0;
		
		for(int val : ret) {
			sum +=val/2;
		}
		System.out.println(System.nanoTime() - t0);
		
		LinkedList<Integer> ll = new LinkedList<>();
		for(int i=0; i<1000000; i++) {
			ll.add(i);
		}
		
		t0 = System.nanoTime();
		sum=0;
		
		ret=Mult.mult(2, ll);
		
		for(int val : ret) {
			sum +=val/2;
		}
		
		System.out.println(System.nanoTime() - t0);
	}

}
