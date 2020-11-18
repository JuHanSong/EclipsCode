package exception.throws_;

public class ThrowsExample {
	
	public static String[] greetings = {"안녕", "헬로", "니하오"};
	
	/*
	 - 예외의 원인이 메서드 선언부가 아닌 메서드 호출부에 있을 경우
	  예외처리를 메서드 호출부로 떠넘기는 방식을 throws라고 합니다.
	  
	 - 메서드나 생성자 호출 시 예외처리를 강요할 때 사용합니다.
	 
	 - throws가 붙은 생성자나 메서드를 호출할 때는 반드시 try블록을
	  사용하여 예외 처리를 진행해야 합니다.
	 */
	
	public static void greet(int idx) throws Exception {
		System.out.println(greetings[idx]);
	}

	public static void main(String[] args) {

		try {
			greet(3);
		} catch (Exception e) {
			e.printStackTrace();
//			System.out.println(e.getMessage());
			/*
			 - printStackTrace메서드는 예외 발생 경로를 추적하여
			  예외의 원인과 예외가 발생한 코드의 위치를 알려줍니다.
			  
			 - 주로 개발 과정에서 예외의 원인을 찾을 때 유용하기 때문에
			  자주 사용합니다.
			 */
		}
		
		System.out.println("프로그램 정상 종료!");
		
	}

}















