package fr.dauphine.ja.bahthiernomoussa.threads;

<<<<<<< HEAD
public class ThreadTest {
	
	public Runnable count(final int id) {
		
		Runnable r = new Runnable() {
			public void run() {
				for(int i=0; i<10000; i++) {
					System.out.println("Je suis le thread "+id);
				}
			}
		};
		return r;
	}
	
	public static void main(String[] args) {
		ThreadTest tt = new ThreadTest();
		
		Thread t1 = new Thread(tt.count(1));
		Thread t2 = new Thread(tt.count(2));
		
		t1.start(); t2.start();
	}

=======

public class ThreadTest 
{
	public void compteur(int id) {
		for(int i=0; i<10000; i++) {
			System.out.println("Je suis le thread "+id);
		}
		
	}
    public static void main( String[] args ) {
    	ThreadTest test = new ThreadTest();
    	
    	Runnable runnable = new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				test.compteur(1);
			}
    		
    	};
        
    }
>>>>>>> 82f29f44c1e2fd0d3f1167a0b4702da36f586a60
}
