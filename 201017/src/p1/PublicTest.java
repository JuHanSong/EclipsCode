package p1;

import java.util.Scanner;

public class PublicTest {
	private String a;
	private int b;
	
	public PublicTest() {
		a = "퍼블릭 접근제한자";
		b = 10; 
	}
	
	public void Geta() {
		System.out.println(a);
	}
	public void Getb() {
		System.out.println(b);
	}
	public void Seta() {
		System.out.println("Seta (String)");
		Scanner sc = new Scanner(System.in);
		a = sc.nextLine();
	}
	
	
	public void Setb() {
		System.out.println("Setb (int)");
		Scanner sc2 = new Scanner(System.in);
		int c;
		c = sc2.nextInt();
		if(c > 100) {
			System.out.println("100 초과 값 입니다.");
			return;
		}
		b = c;
		sc2.close();
	}
	
	
	
}
