import java.util.Scanner;

public class WhileQuiz {

	public static void main(String[] args) {
		
		/*
		 - 정수를 2개(x, y) 입력받아서 x부터 y까지의 
		  누적합계를 while을 사용해서 구하는 코드를 작성하세요.
		  ex) x부터 y까지의 누적합계: z
		  
		 - 처음에 작성할 때는 x가 무조건 작은 값이 들어올 것이다
		  라고 가정하고 로직을 작성하세요.
		  작성 완료 후, 만약 x에 큰 값이 들어왔을 경우에는 어떻게 대처할 지 생각해 보세요.
		  (참고로 while은 두번 쓰지 않습니다.)
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수1: ");
		int num1 = sc.nextInt();
		System.out.print("정수2: ");
		int num2 = sc.nextInt();
		
		if(num1 > num2) {
			int temp = num1;
			num1 = num2;
			num2 = temp;
		}
		
		int total = 0;
		int n = num1;
		
		while(n <= num2) {
			total += n;
			n++;
		}
		
		System.out.printf("%d~%d까지의 누적합: %d", num1, num2, total);
		
		sc.close();
		

	}

}















