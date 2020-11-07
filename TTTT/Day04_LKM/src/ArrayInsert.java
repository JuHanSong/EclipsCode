import java.util.Arrays;
import java.util.Scanner;

public class ArrayInsert {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String[] names = new String[6];
		
		System.out.println("이름을 입력하세요.");
		System.out.println("그만 입력하시려면 '그만'이라고 입력하세요.");
		
		for(int idx=0; idx<names.length; idx++) {
			System.out.print("> ");
			String name = sc.next();
			
			/*
			 - 자바에서는 문자열 동등 비교 시에 '==' 연산자를
			  사용하시면 안됩니다.
			  
			 - String은 기본 데이터 타입이 아닌 객체 참조 타입이기 때문에
			  정확한 결과를 얻지 못할 수 있습니다.
			  
			 - 문자열 동등 비교 시에는
			 비교문자열1.equals(비교문자열2) 를 사용하여
			 동등 비교를 진행하셔야 합니다.
			 */		
			
			if(name.equals("그만")) {
				System.out.println("입력을 종료합니다.");
				break;
			}
			
			names[idx] = name;
			
		}
		
		System.out.print("입력된 이름: ");
		for(String n : names) {
			if(n == null) break;
			System.out.print(n + " ");
		}
		
		sc.close();
		
	}

}
















