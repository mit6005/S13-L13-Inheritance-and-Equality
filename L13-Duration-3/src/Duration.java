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
		Duration d = new Duration(1, 2);
		Object   o = new Duration(1, 2);
		
		System.out.printf("d.equals(o) --> %b\n" , d.equals(o));
		System.out.printf("o.equals(d) --> %b\n\n" , o.equals(d));	
	}

}
