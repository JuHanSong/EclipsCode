package collection.list;

import java.util.ArrayList;
import java.util.Scanner;

public class ListDelete {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> kakao = new ArrayList<>();
		kakao.add("무지");kakao.add("라이언");
		kakao.add("어피치");kakao.add("네오");
		kakao.add("제이지");
		
		System.out.println("변경 전 정보: " + kakao);
		
		/*
		 - 삭제할 별명을 입력받아서
		  해당 별명이 리스트에 존재한다면 삭제를 진행해 주시고
		  삭제 후 결과를 출력해 주세요.
		 - 해당 별명이 리스트에 존재하지 않는다면
		  "없는 별명입니다." 를 출력해 주세요.
		 */
		
		System.out.println("- 삭제할 친구의 이름을 입력하세요.");
		System.out.print("> ");
		String name = sc.next();
		
		if(kakao.contains(name)) {
			System.out.println(name + "을 삭제합니다.");
			kakao.remove(name);
			System.out.println("# 삭제 후 정보: " + kakao);
		} else {
			System.out.println("없는 별명입니다.");
		}
		
		sc.close();

	}

}















