package TypeStudy;

public class StringTest1 {

	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = str1;
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str1 == str2);
		
		
		String str3 = new String("Hello");
		String str4 = new String("Hello");
		
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3 == str4);
		System.out.println(str3.equals(str4));
		
	}
	
}
