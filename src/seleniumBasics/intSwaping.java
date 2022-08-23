package seleniumBasics;

public class intSwaping {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		System.out.println("before swapping");
		System.out.println(a);
		System.out.println(b);
//		a = a + b;// 30
//		b = a - b;// 10
//		a = a - b;// 20
//		System.out.println("after  swapping");
//		System.out.println(a);
//		System.out.println(b);
		// OR
		// XOR
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		System.out.println("after  swapping");
		System.out.println(a);
		System.out.println(b);

	}

}
