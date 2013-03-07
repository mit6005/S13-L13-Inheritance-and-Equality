import java.lang.Math.*;

public class Duration {

	// abstract duration is an integer representing total number of seconds
	// A(r) = r.getSecs()
	private final int mins;
	private final int secs;
	private static final int CLOCK_SKEW = 5; // seconds
	
	public Duration(int m, int s) {
		mins = m;
		secs = s;
	}
	
	public int getSecs() {
		return mins*60+ secs;
	}
	
	@Override // compile-time error if doesnÕt match a superclass method 
	public boolean equals (Object _that) {
	   // also handles _that == null
		 if (! (_that instanceof Duration)) return false; 
		 Duration that = (Duration) _that;
		 return this.getSecs() == that.getSecs();
	}
	
	
	public static void main(String[] args) {
		Duration d1 = new Duration(1, 2);
		Duration d2 = new Duration(1, 2);
		PreciseDuration pd1 = new PreciseDuration(1, 2, 100);
		PreciseDuration pd2 = new PreciseDuration(1, 2, 100);
			
		
		System.out.printf("d1.equals(d2) --> %b\n" , d1.equals(d2));
		System.out.printf("d2.equals(d1) --> %b\n\n" , d2.equals(d1));
		
		System.out.printf("pd1.equals(pd2) --> %b\n" , pd1.equals(pd2));
		System.out.printf("pd2.equals(pd1) --> %b\n\n" , pd2.equals(pd1));
		
		System.out.printf("pd1.equals(d1) --> %b\n" , pd1.equals(d1));
		System.out.printf("d1.equals(pd1) --> %b\n\n" , d1.equals(pd1));
		

	}

}
