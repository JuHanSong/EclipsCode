package exceptionstudy;

import java.util.Scanner;

public class ZeroDivisionError {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Int 자료형1를 입려하여 주세요.");
		
		int num1 = sc.nextInt();
		System.out.println("Int 자료형2를 입려하여 주세요.");
		int num2 = sc.nextInt();
		
		if(num2 == 0) {
			System.out.println("num2 에는 0을 넣을 수 없습니다.");
		}else {
		
		int result = num1 / num2;
		System.out.println(result);
		}
		
		sc.close();
		

	}

}
