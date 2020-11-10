
public class LoopNesting {

	public static void main(String[] args) {
		
		/*
		 # 중첩 for문 (loop nesting)
		 - 외부 for문의 내부에 for문이 또 존재하는 것을 for문의 중첩이라고 합니다.
		 - 외부 반복문의 제어변수가 하나씩 증감할 때마다 내부 반복문이 끝까지 한번
		 실행되게 됩니다.
		 - 반복문 자체를 반복하고 싶을 때 사용합니다.
		 */
		
		for(int dan=2; dan<=9; dan++) {
			System.out.println("*** 구구단 " + dan + "단 ***");
			System.out.println("-------------------------");
			for(int hang=1; hang<=9; hang++) {
				System.out.printf("%d x %d = %d\n", dan, hang, dan*hang);
			}
			
			System.out.println("-------------------------");
		}
		
		
		
		
		

	}

}










