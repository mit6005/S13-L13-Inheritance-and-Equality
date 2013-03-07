
public class PreciseDuration extends Duration {
	private final int millisecs;
	public PreciseDuration(int m, int s, int ms) {
		super(m, s);
		millisecs = ms;
	}
	
	public int getMillisecs() {
		return super.getSecs()*1000 + millisecs; 
	}
	
    @Override 
    public boolean equals (Object _that) {
	    if (! (_that instanceof PreciseDuration)) 
			return false;
	    PreciseDuration that = (PreciseDuration) _that;
    	return this.getMillisecs() == that.getMillisecs();
    }

}
