import java.util.Scanner;

public class SwitchExample2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하세요: ");
		int point = sc.nextInt();
		
		//switch 키워드 뒤의 괄호 안에는 변수의 연산식도 들어갈 수 있습니다.
		switch(point / 10) {
		
		case 10:	
			if(point > 100) {
				System.out.println("점수를 잘못 입력하셨습니다.");
				break;
			} 
		case 9:
			System.out.println("당신의 학점은 A입니다.");
			break;
		case 8:
			System.out.println("당신의 학점은 B입니다.");
			break;
		case 7:
			System.out.println("당신의 학점은 C입니다.");
			break;
		case 6:
			System.out.println("당신의 학점은 D입니다.");
			break;

		default:
			if(point > 100 || point < 0) {
				System.out.println("점수를 잘못 입력하셨습니다.");
			} else {
				System.out.println("당신의 학점은 F입니다.");
			}
		}
		
		sc.close();

	}

}













