
public class Main {
	public static void main(String[] args) {
		DemoSuper supersuper = new DemoSuper();
		DemoSuper supersub   = new DemoSub();
		DemoSub   subsub     = new DemoSub();
		
		
		supersuper.mytest();
		supersub.mytest();
		subsub.mytest();
	}
}
