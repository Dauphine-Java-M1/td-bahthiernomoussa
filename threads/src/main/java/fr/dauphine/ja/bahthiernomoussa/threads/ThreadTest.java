package fr.dauphine.ja.bahthiernomoussa.threads;


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
}
