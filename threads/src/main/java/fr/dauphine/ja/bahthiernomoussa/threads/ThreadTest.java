package fr.dauphine.ja.bahthiernomoussa.threads;

public class ThreadTest {
	
	public static int n=0;
	private final Object monitor = new Object();
	
	public Runnable count(final int id) {
		
		Runnable r = new Runnable() {
			public void run() {
				while(n<10000) {
					
					synchronized (monitor) {
						System.out.println("Je suis le thread "+id+" et j'effectue l'iteration "+(n+1));
						n++;
					}
				}
			}
		};
		return r;
	}
	
	public static void main(String[] args) throws InterruptedException{
		ThreadTest tt = new ThreadTest();
		
		Thread t1 = new Thread(tt.count(1));
		Thread t2 = new Thread(tt.count(2));
		
		t1.start(); t2.start();
		t1.join(); t2.join();
	}
}
