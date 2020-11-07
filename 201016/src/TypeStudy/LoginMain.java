package TypeStudy;

import java.util.Scanner;

public class LoginMain {
	public static void main(String[] args) {
		
		System.out.println("접속 아이디를 입력해주세요.");
		
		Scanner sc = new Scanner(System.in);
		String id = sc.nextLine();
		if(id.equals("kgitbank")) {
			System.out.println("접속 비밀번호를 입력해주세요.");
			String pw = sc.nextLine();
			
			if(pw.equals("password")) {
				System.out.println("접속에 성공 하였습니다.");
			}
			else
				System.out.println("비밀번호가 틀립니다.");
		}else
			System.out.println("아이디가 틀립니다.");
		
	}

}
