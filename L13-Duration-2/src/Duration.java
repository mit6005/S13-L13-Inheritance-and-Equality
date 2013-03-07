import java.lang.Math.*;

public class Duration {

	/**
	 * @param args
	 */
	private final int mins;
	private final int secs;
	
	public Duration(int m, int s) {
		mins = m;
		secs = s;
	}
	
	public int getSecs() {
		return mins*60+ secs;
	}
	
	public boolean equals (Duration that) {
	    return this.getSecs() == that.getSecs();
	}

	public static void main(String[] args) {
		Duration d1 = new Duration(1, 2);
		Duration d2 = new Duration(1, 3);
		Duration d3 = new Duration(0, 62);
		
		System.out.printf("d1 == d1 --> %b\n\n" , d1 == d1);
		
		System.out.printf("d1 == d2 --> %b\n" , d1 == d2);
		System.out.printf("d1 == d3 --> %b\n" , d1 == d3);
		System.out.printf("d2 == d3 --> %b\n\n\n" , d2 == d3);
		
		System.out.printf("d1.equals(d1) --> %b\n\n" , d1.equals(d1));
		
		System.out.printf("d1.equals(d2) --> %b\n" , d1.equals(d2));
		System.out.printf("d2.equals(d1) --> %b\n\n" , d2.equals(d1));
		
		System.out.printf("d1.equals(d3) --> %b\n" , d1.equals(d3));
		System.out.printf("d3.equals(d1) --> %b\n\n" , d3.equals(d1));
		
		System.out.printf("d2.equals(d3) --> %b\n" , d2.equals(d3));
		System.out.printf("d3.equals(d2) --> %b\n\n" , d3.equals(d2));
		

	}

}
