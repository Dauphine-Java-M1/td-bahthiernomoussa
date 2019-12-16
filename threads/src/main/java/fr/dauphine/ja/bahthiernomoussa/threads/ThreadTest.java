package fr.dauphine.ja.bahthiernomoussa.threads;

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

}
