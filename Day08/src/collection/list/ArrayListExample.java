package collection.list;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {

	public static void main(String[] args) {
		
//		String[] str = new String[100];
		
		//<>(제네릭)에는 생성된 list가 어떤 타입의 객체들의 모음인지를
		//표시해 주시면 됩니다.
		ArrayList<String> nick = new ArrayList<>();
		
		String str1 = "멍멍이";
		String str2 = "야옹이";
		
		//list에 객체를 추가하는 메서드: add(객체)
		nick.add(str1);
		nick.add(str2);
		nick.add(new String("개구리"));
		nick.add("야옹이");
		nick.add("짹짹이");
		System.out.println(nick); //list는 객체의 중복 저장을 허용.
		
		//list에 객체를 추가: add(index, 객체): 객체를 해당 인덱스에 삽입.
		nick.add(2, "어흥이");
		System.out.println(nick);
		
		//list에 저장된 총 객체의 수 얻기: size()
		System.out.println("nick에 저장된 요소의 갯수: " + nick.size());
		
		//list의 데이터 수정하기: set(index, 수정할 객체)
//		nick[3] = "메롱이"; (x)
		nick.set(3, "메롱이");
		System.out.println(nick);
		
		//list에 저장된 데이터 참조하기: get(index)
//		String nickName = nick[4]; (x)
		String nickName = nick.get(4);
		System.out.println("4번 인덱스의 값: " + nickName);
		
		//list에 저장된 객체 삭제: remove(index), remove(객체)
		nick.remove(5);
		System.out.println(nick);
		
		nick.remove(str1);
		System.out.println(nick);
		
		//list 내부에 저장된 객체의 존재 유무를 확인: contains(객체)
		System.out.println(nick.contains("어흥이"));
		System.out.println(nick.contains("삐약이"));
		
		//list의 반복문 처리
		for(String name : nick) {
			System.out.println(name);
		}
		
		//list 내부 객체 인덱스 확인: indexOf(객체);
		int idx = nick.indexOf("어흥이");
		System.out.println("어흥이가 위치한 인덱스: " + idx);
		
		//list 내부 객체 전체 삭제: clear()
		nick.clear();
		
		
		//list 내부가 비어있는지의 여부를 체크
		System.out.println(nick.isEmpty());
		
		//리스트의 정렬
		//기본 데이터 타입의 객체 형태
		//Byte, Short, Integer, Long, Float, Double
		//Boolean, Character
		ArrayList<Integer> scores = new ArrayList();
		scores.add(90);scores.add(47);scores.add(69);
		scores.add(80);scores.add(100);scores.add(21);
		System.out.println(scores);
		
		//오름차 정렬
		Collections.sort(scores);
		System.out.println(scores);
		
		//내림차 정렬
		Collections.sort(scores, Collections.reverseOrder());
		System.out.println(scores);
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
