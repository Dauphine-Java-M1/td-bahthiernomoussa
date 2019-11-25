package fr.dauphine.ja.bahthiernomoussa.iterables;

import java.util.AbstractSequentialList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
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
					public void add(Integer e) {
						// TODO Auto-generated method stub
						myLit.add(e);
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
						return null;
					}
					@Override
					public int previousIndex() {
						// TODO Auto-generated method stub
						return 0;
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
		List<Integer> li = Arrays.asList(1,2,3,4);
		
		List<Integer> lii = new ArrayList<>();
		
		lii = mult(3,li);
		
		for(Integer i:lii) {
			System.out.println(i);
		}
		
		
		
	}

}
