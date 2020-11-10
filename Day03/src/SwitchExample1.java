import java.util.Scanner;

public class SwitchExample1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("성별을 입력하세요(M/F): ");
		String gender = sc.next();
		
		// switch 키워드의 괄호 안에는 정수 또는 문자열이
		// 들어올 수 있습니다. (조건식 x)
		switch(gender) {
		
		case "m": case "M":
			System.out.println("남자입니다.");
			break; //해당 케이스만 실행하고 switch문을 나가라!
		case "f": case "F":
			System.out.println("여자입니다.");
			break;
		
		default: //case를 작성하지 않은 모든 경우의 수가 default로 옵니다.
			System.out.println("잘못 입력하셨습니다.");
		}
		
		
		
		
		
		
		
		

	}

}













