import java.util.Scanner;

public class BreakExample2 {

	public static void main(String[] args) {
		
		/*
		 # 무한 루프
		 
		 - 무한 루프는 반복문의 횟수를 개발자가 사전에 정확하게 인지하지
		  못하는 상황에서 주로 사용합니다.
		  
		 - 특정 조건 하에서 반복문을 강제로 종료하는 형태로
		  구성합니다.
		  
		 - 무한루프는 일반적으로 while문을 사용하며,
		  while문의 조건식 자리에 논리상수 true를 쓰면
		   무한 루프가 구성됩니다.
		 */
		
		int i = 0;
		
		while(true) {
			System.out.println(i);
			if(i == 150) break;
			i++;
		}
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("15 x 6 = ???");
			System.out.print("> ");
			int answer = sc.nextInt();
			
			if(answer == 90) {
				System.out.println("정답입니다!");
				break;
			} else {
				System.out.println("틀렸습니다!");
			}		
		}
		
		sc.close();

	}

}













