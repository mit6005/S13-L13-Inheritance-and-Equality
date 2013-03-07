import java.lang.String;
public class DemoSuper {

	 void mytest() { System.out.println("in DemoSuper"); }

	 static void mytest2(DemoSuper ds) {
		 System.out.println("called mytest2(DemoSuper ds)");
	 }
	 
	 static void mytest2(DemoSub ds) {
		 System.out.println("called mytest2(DemoSub ds)");
	 }

	
	public static void main(String[] args) {
		DemoSuper supersuper = new DemoSuper();
		DemoSuper supersub   = new DemoSub();
		DemoSub   subsub     = new DemoSub();
		
		mytest2(supersuper);
		mytest2(supersub);
		mytest2(subsub);
	}

}
