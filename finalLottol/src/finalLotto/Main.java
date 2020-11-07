package finalLotto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		
		
		List ruckyNum = new ArrayList();
		List comNum = new ArrayList();
		
		int createNum = 0;
		int ruckyCount = 0;
		boolean ok = false; 
		
		/*
		 * 당첨번호 생성.
		 */
		while(ruckyNum.size() < 6 ) {
			
			createNum = (int) (Math.random()*45+1);
			
			if(ruckyNum.contains(createNum) == false) {
				ruckyNum.add(createNum);
			}
			
		}
		Collections.sort(ruckyNum);
		
		System.out.println("1등 당첨번호 = " + ruckyNum);
		
		/*
		 * 번호 생성.
		 */
		
		while(!ok) {
			
			while(comNum.size() < 6) {
				createNum =(int)(Math.random()*45+1);
				
				if(comNum.contains(createNum) == false) {
					comNum.add(createNum);
				}
			}
			
//		Collections.sort(comNum);
		ruckyCount ++;
		System.out.println(ruckyCount + "번쨰 생성 번호 = " + comNum);
		
		
		/*
		 * 당첨번호 확인구문
		 */
		int i;
		
		for (i = 0; i < 6; i++) {
			if(!ruckyNum.contains(comNum.get(i))) {
				comNum.clear();
				break;
			}
		}
		if (i == 6) {
			ok = true;
		}
		}
		System.out.println("당첨번호 = " + ruckyNum);
		System.out.println("당신의 번호 = " + comNum);
		System.out.println("총 금액 = " + (long)ruckyCount / 10 + "만원 입니다." );
	}
	

}
