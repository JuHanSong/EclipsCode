package obj_array;

import java.util.Arrays;

public class ArrayInsert {

	public static void main(String[] args) {
		
//		Person kim = new Person("김철수", 32, "남");
//		Person lee = new Person("이영희", 25, "여");
//		Person hong = new Person("홍길동", 45, "남");
//		
//		kim.personInfo();
//		lee.personInfo();
//		hong.personInfo();
		
//		int[] arr = new int[5];
//		Person[] people = new Person[3];
//		people[0] = new Person("김철수", 32, "남");
		
//		int[] arr = {1, 3, 5, 7, 9};
		
		Person[] people = {
				new Person("김철수", 32, "남"),
				new Person("이영희", 25, "여"),
				new Person("홍길동", 45, "남")
		};
		
//		System.out.println(Arrays.toString(people));
		
//		for(int i=0; i<people.length; i++) {
//			people[i].personInfo();
//		}
		
		for(Person p : people) {
			p.personInfo();
		}
		
		
		

	}

}


















