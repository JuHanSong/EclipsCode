import java.util.Scanner;

public class WhileExample3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요: ");
		int num = sc.nextInt();
		
		/*
		 - 정수를 1개 입력받아서 해당 정수가 소수(prime number)
		  인지의 여부를 판단하는 로직.
		 */
		
		int i = 1;
		int count = 0; //나누어 떨어지는 횟수를 기억할 변수.
		
		while(i <= num) {
			if(num % i == 0) {
				count++;
			}
			i++;
		}
		
		if(count == 2) {
			System.out.println(num + "은(는) 소수입니다.");
		} else {
			System.out.println(num + "은(는) 소수가 아닙니다.");
		}

		
		System.out.println("-----------------------------------");
		
		int j = 2;
		while(num % j != 0) {
			j++;
		}
		
		System.out.println((num == j ? "소수입니다." : "소수가 아닙니다."));
		
	}

}

















