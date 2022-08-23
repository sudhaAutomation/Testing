package seleniumBasics;

public class StringSwapping {

	public static void main(String[] args) {
		String str1 = "Swhizz";//6
		String str2 = "Testing";//7
		str1 = str1 + str2;//SwhizzTesting//13
		System.out.println(str1);
		str2=str1.substring(0, str1.length()-str2.length());
		
		str1=str1.substring(str2.length());
		System.out.println(str1);
		System.out.println(str2);
	}

}
