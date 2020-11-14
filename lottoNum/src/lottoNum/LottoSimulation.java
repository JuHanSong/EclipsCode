package lottoNum;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LottoSimulation {
	
	/*
	 # 로또 시뮬레이션. 
	 -. 목표 : 당첨하는 숫자 카운트, 당첨까지 필요한 금액계산.
	 -. LottoNum 의 알고리즘을 이용하여 당첨번호 생성.
	 */
	
	static void startTitle() {
		System.out.println("*** 당첨 번호를 추첨합니다. ***");
		System.out.println("당첨까지 필요한 비용을 계산.");
		System.out.println("01  02  03  04  05  06");
	} // 시작문구.
	
	
	public static void main(String[] args) {
		
		List lottoList = new ArrayList(); // 당첨숫자를 담을 공간.
		List comList = new ArrayList();
		
		int ruckyNum = 0; // 당점 숫자.
		int countNum = 0; // 당첨까지 필요한 횟수.
		int totalPay = 0; // 당첨까지 필요한 금액.
		
		boolean status = false; // false : run(프로그램 동작)
		
		startTitle();
		
		while(lottoList.size() < 6) {
			
			ruckyNum = (int)(Math.random()*45+1); // 당첨숫자 생성.
			
			if(lottoList.contains(ruckyNum) == false) { // 중복 확인로직.
				lottoList.add(ruckyNum); // 중복되지 않으면 추가.
			}
			
		}
		System.out.println("당첨번호 입니다.");
		Collections.sort(lottoList);
		System.out.println(lottoList);
		
		
		while(!status) {
			
			while(comList.size() < 6) { // 구매번호 생성.
				ruckyNum = (int)(Math.random()*45+1); // 당첨숫자 생성.
				
				if(comList.contains(ruckyNum) == false) { // 중복 확인로직.
					comList.add(ruckyNum); // 중복되지 않으면 추가.
				}
			}
			
			countNum ++; // 구매횟수 증가.
			System.out.println(countNum + "번쨰 생성 번호 = " + comList);
			
			// 당첨확인 로직.
			int i = 0; 
			
			for(i = 0; i <6; i++) {
				if(!lottoList.contains(comList.get(i))) {
					comList.clear(); // comList(구매번호) 리셋
					break; // 당첨로직 종료.
				} 
				if(i == 6) {
					status = true; // 당첨이면 로직종료.
				}
			}
		}
		
		System.out.println("당첨을 축하합니다.");
		System.out.println("저희 당첨번호는 아래와 같습니다.");
		System.out.println(lottoList);
		System.out.println("고객님 구매번호는 아래와 같습니다.");
		System.out.println(comList);
		System.out.println("고객님의 구매까지 필요한 금액 :" + totalPay * 1000 + "원 입니다.");
	}
}
