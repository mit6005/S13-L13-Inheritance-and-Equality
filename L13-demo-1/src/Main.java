
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DemoSuper supersub   = new DemoSub();
		DemoSub   subsub     = new DemoSub();
		DemoSuper supersuper = new DemoSuper();

		DemoSuper dsuper = subsub;
		DemoSub   dsub   = (DemoSub)supersub;
		DemoSub   dsub2  = (DemoSub)supersuper;
	}

}
