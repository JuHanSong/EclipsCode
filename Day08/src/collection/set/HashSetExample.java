package collection.set;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetExample {

	public static void main(String[] args) {
		
		/*
		 - HashSet클래스는 Set 인터페이스를 구현한 클래스입니다.
		  저장된 객체의 순서를 보장하지 않고, 중복 또한 허용하지 않습니다.
		  
		 - Set 인터페이스를 구현한 컬렉션 중 대표적으로 사용하는 
		  클래스 중 하나입니다.
		 */
		
		HashSet<String> set = new HashSet<>();
		
		//set에 객체를 추가: add(객체);
		set.add("피자");
		set.add("치킨");
		set.add("족발");
		set.add("햄버거");
		set.add("피자"); //set은 중복저장을 허용하지 않습니다.
		System.out.println(set);
		
		//set에 저장된 객체의 수를 알아보는 메서드: size()
		System.out.println("set에 저장된 객체 수: " + set.size());
		
		/*
		 - set에서 값을 검색하려면
		  반복문, 조건문을 이용하여 객체를 하나씩 꺼내보셔야 합니다.
		 */
		for(String s : set) {
			if(s.equals("햄버거")) {
				System.out.println(s);
			}
		}
		
		//set의 데이터 삭제: remove(객체)
		set.remove("족발");
		System.out.println(set);
		
		//set을 list로 변환하는 방법.
		ArrayList<String> list = new ArrayList<>(set);
		System.out.println("list 내부의 값: " + list);
		System.out.println(list.get(2));
		
		//set의 데이터 전체 삭제: clear()
		set.clear();
		System.out.println(set);
		
		

	}

}














