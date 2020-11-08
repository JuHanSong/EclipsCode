
public class LogicalOperator {

	public static void main(String[] args) {
		
		/*
		 # 비교(관계) 연산자 (<, <=, >, >=, ==, !=)
		 - 두 항을 비교하여 논리값을 도출하는 연산자 입니다.
		 */
		System.out.println(6 <= 6);
		
		/*
		 # 논리 연산자 (&, &&, |, ||)
		 - 좌항과 우항의 논리값을 연산하는 연산자 입니다.
		 1. &, &&: 양쪽 항의 논리값이 모두 true일 경우에만 true를 도출.
		 2. |, ||: 양쪽 항 중에 한쪽만 true여도 true를 도출.
		 */
		
		int x = 10, y = 20;
		
		System.out.println(x > 10 && y < 30);
		System.out.println(x > 10 || y < 30);
		
		//논리 반전 연산자 (!: 단항)
		//논리값 앞에 붙어서 논리를 반전시킵니다. true -> false, false -> true
		
		int z = 10;
		System.out.println(z == 10);
		System.out.println(!(z == 10));

		boolean isLogin = false;
		System.out.println(!isLogin);
		
		
	}

}

















