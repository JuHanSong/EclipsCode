package lottoNum;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LottoNum {
	
	static void title() {
		System.out.println("*** 당첨 번호를 추첨합니다. ***");
		System.out.println("06 = 행운의 번호");
		System.out.println("01  02  03  04  05  06");
	}
	
	public static void main(String[] args) {
		
		List lottoList = new ArrayList(); // 당첨 번호를 저장하는 리스트.
		List dupliNum = new ArrayList(); // 중복 숫자 저장.
		
		int ruckyNum = 0;
		
		title();
		
		
		for(int i = 0; i < 5; i++) {
			
			while(lottoList.size() < 6) {
			
				ruckyNum = (int)(Math.random()*45+1); // 램덤으로 당첨번호 출력. 
					
				if(lottoList.contains(ruckyNum) == false) { // 중복 판별여부.
					lottoList.add(ruckyNum); // 당첨 숫자저장
				}else {
					dupliNum.add(ruckyNum); // 중복 숫자저장	
				}
				
			}
			Collections.sort(lottoList); //오름차순 정리.
			System.out.println(lottoList); // 당첨숫자 출력.
			System.out.println("중복 숫자 : " + dupliNum);
			lottoList.clear(); // 다음 뽑는 당첨번호를 저장하기 위해서 리스트 클리어.
			dupliNum.clear(); // 중복숫자 클리어.
		}
	}
	
}
