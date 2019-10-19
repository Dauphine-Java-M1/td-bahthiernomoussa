package fr.dauphine.ja.bahthiernomoussa.td00;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class PrimeCollection
{
	//Question 1
	private ArrayList<Integer> numbers;
	
	public PrimeCollection() {
		numbers = new ArrayList<>();
	}
	//Question 2
	private void initRandom(int n, int m) {
		for(int i=0; i<n; i++) {
			int nombreAleatoire = (int) (Math.random()*((m+1))); //Min + (int)(Math.random()*((Max-Min)+1));
			numbers.add(nombreAleatoire);
		}
	}
	//Question 3
	private boolean isPrime(int p) {
		if(p<=1) return false;
		for(int x=2; x<=(int)Math.sqrt(p); x++) {
			if(p%x==0) return false;
		}
		
		return true;
	}
	
	//Question 4
	
	private void printPrimes() {
		for(int i=0; i<numbers.size(); i++) {
			if(isPrime(numbers.get(i))) System.out.println(numbers.get(i));
		}
	}
	
    public static void main( String[] args )
    {
        System.out.println( "Bonjour!" );
        
        //Question 5
        PrimeCollection pc = new PrimeCollection();
        pc.initRandom(100, 1000);
        pc.printPrimes();
    }
}
