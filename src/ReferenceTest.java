
public class ReferenceTest {

	public static void main(String[] args) {
		String a = "one";
		String b = "two";
		String c = "three";
		
		System.out.println("a=" + a);
		System.out.println("b=" + b);
		System.out.println("c=" + c);

        System.out.println("now switching values");
        new ReferenceTest().switchStrings(a, b, c);

        System.out.println("back in main(); values are now:");
        System.out.println("a=" + a);
        System.out.println("b=" + b);
        System.out.println("c=" + c);

	}

    public void switchStrings(String a, String b, String c) {
        a = b;
        b = c;
        c = a;

        System.out.println("After switching inside switchStrings():");
        System.out.println("a=" + a);
        System.out.println("b=" + b);
        System.out.println("c=" + c);
    }

}
