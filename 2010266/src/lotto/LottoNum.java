package lotto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LottoNum {
	
	public static void main(String[] args) {
		List lottoList = new ArrayList();
		int creatNum = 0;
		
		
		while(lottoList.size() <6) {
			creatNum = (int) (Math.random()*45+1);
			if(lottoList.contains(creatNum) == false) {
				lottoList.add(creatNum);
			}else
				System.out.println("중복된 숫자 : " + creatNum);	
		}
		
		Collections.sort(lottoList);
		System.out.println("1등번호" + lottoList);
		
		while(lottoList.size() < 7) {
			creatNum = (int)(Math.random()*45+1);
			if(lottoList.contains(creatNum) == false) {
				System.out.println("2등 당첨번호 :" + creatNum);
				lottoList.add(creatNum);
			}
		}
			
	}
}
