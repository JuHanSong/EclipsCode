
public class VariableExample {

	public static void main(String[] args) {
		
		/*
		 # 변수 (variable)
		 1. 변수는 데이터가 저장되는 공간에 이름을 붙여놓은 것입니다.
		 2. 변수를 생성할 때는 변수에 저장되는 데이터의 크기와 모양에 따라
		  적당한 데이터 타입을 선언해야 합니다.
		  ex) int: 4바이트 정수, String: 문자열(문장)
		 3. 변수는 동일한 이름으로 중복 저장할 수 없습니다.
		  그리고, 하나의 변수에는 단 하나의 데이터만 저장이 가능합니다.
		 4. 변수의 내부 값은 언제든지 변경이 가능합니다.
		 */
		
		//변수의 선언: [자료형(데이터 타입)] [변수 이름];
		int score;
		
		//변수의 초기화: [변수의 이름] = [값];
		score = 90;
	
		//변수의 값 참조(사용)
		System.out.println(score);
		
		//변수는 선언과 동시에 초기화를 진행할 수 있습니다.
		//(처음 선언 시 1회만 가능)
		//변수의 값을 변경할 때는 데이터 타입을 붙이지 않습니다.
		//변수는 값을 두 개 이상 저장할 수 없습니다.
		int num = 1;
//		int num = 4; (x)
		num = 4;
		System.out.println(num);
		
		//변수에는 다른 변수의 값도 저장이 가능합니다.
		int doubleScore = score * 2;
		System.out.println(doubleScore);
		
		//변수의 자료형에 맞지 않는 데이터는 저장이 불가능합니다.
//		int age = "한살"; (x)
		String nick = "홍길동";
//		String name = 1004; (x)
		
		//변수는 자료형이 달라도 동일한 이름으로 중복 선언할 수 없습니다.
//		int nick = 1004; (x)
		
		//선언 및 초기화되지 않은 변수는 참조할 수 없습니다.
//		int result = score + number; (x) number를 선언하지 않음.
		int result;
//		System.out.println(result); (x) 초기화가 필요합니다.
		
		

	}

}




















