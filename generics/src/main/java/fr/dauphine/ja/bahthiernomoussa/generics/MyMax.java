package fr.dauphine.ja.bahthiernomoussa.generics;

/**
 * Hello world!
 *
 */
public class MyMax 
{
	
	// Exemple myMax(2,3,5,7) -> premier argument = 2 et 2e argument = {3,5,7}
	public static int myMax(int first, Integer...valeur) {
		//int res = -1 ; //le mieux est de l'initialiser à la première valeur du tableau
		int res = first;
		for(int i:valeur) {
			if(i>res)
				res = i;
		}
		return res;
		
		
	}
	
	public static <T extends Comparable<T>> T myMax2(T first, T...valeur) {
		T res = first;
		for(T i:valeur) {
			if(i.compareTo(res)>0)
				res = i;
		}
		return res;
		
			
	}
	
	public static <T extends Comparable<T>> T myMax3(T o, T...objects) {
		T max = o;
		
		for(T ob:objects) {
			if(max.compareTo(ob) < 0) max=ob;
		}
		
		return max;
	}
	
	public static void main(String[] args) {
		
		System.out.println(myMax(42,1664)); 
		System.out.println(myMax2(8.6,16.64));
		System.out.println(myMax2("baa","aba"));
		//System.out.println(myMax2("salut",4)); 
		//System.out.println(myMax("salut","bonjour")); 
		
		System.out.println(myMax3("baa","aba"));
		System.out.println(myMax3(42,1664)); 
	}

}
