
public class Duration {
	private final int mins;
	private final int secs;
	
	public Duration(int m, int s) {
		mins = m;
		secs = s;
	}
	
	public int getSecs() {
		return mins*60+ secs;
	}

	@Override
    public boolean equals (Object _that) {
       if (_that == null || !this.getClass().equals(_that.getClass())) return false;
       Duration that = (Duration) _that;
       return this.getSecs() == that.getSecs();
    }
	
    @Override
    public int hashCode () {
        return this.getSecs();
   }
}
