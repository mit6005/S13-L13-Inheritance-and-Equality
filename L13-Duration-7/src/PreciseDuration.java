
public class PreciseDuration  {
	private final Duration duration;
	private final int millisecs;
	public PreciseDuration(int m, int s, int ms) {
		duration = new Duration(m, s);
		millisecs = ms;
	}
	
	public int getMillisecs() {
		return duration.getSecs()*1000 + millisecs; 
	}
	
    @Override 
	public boolean equals (Object _that) {
	   // also handles _that == null
		 if (! (_that instanceof PreciseDuration)) return false; 
		 PreciseDuration that = (PreciseDuration) _that;
		 return this.getMillisecs() == that.getMillisecs();
	}

}
