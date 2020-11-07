import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifyQuiz {

	public static void main(String[] args) {
		
		String[] kakao = {"무지", "네오", "어피치", "라이언", "제이지"};
		Scanner sc = new Scanner(System.in);
		System.out.println("저장된 카카오 친구: " + Arrays.toString(kakao));
		System.out.println("수정하실 카카오 친구를 입력하세요.");
		System.out.print("> ");
		String name = sc.next();
		
		/*
		 - 수정할 이름을 입력받아서 배열 내에 그 이름이 있는지부터 확인하세요.
		 - 이름이 있다면 수정할 이름을 새롭게 입력받아서 해당 이름으로
		  수정을 진행하세요.
		 - 수정 후 결과: ~~~~  를 출력하세요.
		 - 없는 이름이 입력되었다면 "해당 이름은 존재하지 않습니다." 를 출력하세요.
		 */
		
		int idx;
		for(idx=0; idx<kakao.length; idx++) {
			if(name.equals(kakao[idx])) {
				System.out.printf("%s의 이름을 수정합니다.", kakao[idx]);
				System.out.print("> ");
				kakao[idx] = sc.next();
				System.out.println("수정 완료!");
				System.out.println("수정 후 결과: " + Arrays.toString(kakao));
				break;
			}
		}
		
		if(idx == kakao.length) {
			System.out.println("해당 이름은 존재하지 않습니다.");
		}
		
		sc.close();
		

	}

}




















