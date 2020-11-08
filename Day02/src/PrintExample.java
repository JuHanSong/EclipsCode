
public class PrintExample {

	public static void main(String[] args) {
		
		//자바의 표준 출력 형식은 크게 3가지입니다.
		//1. 개행을 포함하지 않는 print()
		//2. 자동 개행을 포함해 주는 println()
		
		System.out.print("안녕하세요~!");
		System.out.println("hello~!");
		System.out.print("안녕히 가세요~!");
		System.out.println("bye~!");
		
		
		//3. 형식 지정 표준 출력 함수 printf()
		//서식 문자를 이용하여 문자열을 조립한 후 
		//나중에 서식문자에 들어갈 값을 지정합니다.
		
		/*
		 # printf()에서 사용하는 서식 문자
		 
		 %d = 부호가 있는 10진수 정수 데이터(decimal)
		 %f = 실수 데이터 (float)
		 %s = 문자열 데이터 (string)
		 
		 \n = 줄 개행 (enter)
		 \t = 탭 정렬 (tab)
		 */
		
		
		int month = 12;
		int day = 25;
		String anni = "크리스마스";
		
		//12월 25일은 크리스마스 입니다.
		System.out.println(month + "월 " + day + "일은 " + anni + "입니다.");
		
		System.out.printf("%d월 %d일은 %s입니다.\n", month, day, anni);
		System.out.printf("오늘은 %d월 %d일 %s요일입니다.\n", 10, 25, "일");
		
		/*
		 - %f는 기본적으로 소수점 6자리까지 표현하도록 설정되어 있습니다.
		 - 만약 자리수를 조절하려면 %.[자리수에 해당하는 숫자]f를 사용합니다.
		 - 특수문자 %를 표현하려면 %%를 작성합니다.
		 */
		
		double rate = 63.456;
		System.out.printf("시험 합격율: %.2f%%", rate);
		
		
		
		

	}

}










