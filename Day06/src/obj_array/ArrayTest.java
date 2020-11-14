package obj_array;

import java.util.Scanner;

public class ArrayTest {

	public static void main(String[] args) {
		
		/*
		 1. Person 객체가 3개 들어갈 배열을 선언하세요.
		  Scanner를 사용하여 이름, 나이, 성별을 입력받아서
		  입력받은 값을 토대로 Person 객체를 생성하세요.
		  
		 2. 객체를 3개 생성하신 후 반복문을 이용하여
		  그 객체들의 personInfo()를 호출하세요.
		  (객체가 하나 생성될 때 마다 배열에 삽입.)
		  
		 3. personInfo()는 객체 3개가 모두 생성되어
		  배열에 들어간 후 출력하는 것으로 하겠습니다.
		 */
		
		Scanner sc = new Scanner(System.in);
		Person[] people = new Person[3];
		
		for(int i=0; i<people.length; i++) {
			System.out.println("*** 회원 정보 입력 ***");
			System.out.print("이름: ");
			String name = sc.next();
			
			System.out.print("나이: ");
			int age = sc.nextInt();
			
			System.out.print("성별: ");
			String gender = sc.next();
			
			people[i] = new Person(name, age, gender);
			
			System.out.println("회원정보 등록 성공!\n");
		}
		
		System.out.println("--------------------------------------");
		
		for(Person p : people) {
			p.personInfo();
		}
		
		sc.close();

	}

}












