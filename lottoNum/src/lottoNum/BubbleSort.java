package lottoNum;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BubbleSort {
	
	
	public static void main(String[] args) {
		
		List<Integer> lottoList = new ArrayList<Integer>(); // 당첨 번호를 저장하는 리스트.
		List<Integer> bubbleList = new ArrayList<Integer>(); // 당첨 번호를 저장하는 리스트.

		int ruckyNum = 0;// 당첨번호.
		int empty = 0; // 바꾸는 숫자를 저장하는 공간.
			
		while(lottoList.size() < 6) {
			
			ruckyNum = (int)(Math.random()*45+1); // 램덤으로 당첨번호 출력. 
					
			if(lottoList.contains(ruckyNum) == false) { // 중복 판별여부.
				lottoList.add(ruckyNum); // 당첨 숫자저장
				bubbleList.add(ruckyNum);
			}
		}
		
		/*
		 # BubbleSort
		 서로 이웃한 데이터들을 비교하여 가장 큰 데이터를 가장 뒤로 보내며 정렬하는 방식.
		 */
		for(int i = 0; i < bubbleList.size(); i ++) { // i = ArrayList 이전 주소.
			for(int j = i+1; j <bubbleList.size(); j++) { // j = ArrayList i 보다 하나 큰 주소.
				if(bubbleList.get(i) > bubbleList.get(j)) { // 이전주소가 하나 큰 주소보다 크면
					empty = bubbleList.get(i); // 임시보관(empty)에 큰 값을(i) 저장
					bubbleList.set(i, bubbleList.get(j)); // i 주소에다 j 주소 값을 저장.
					bubbleList.set(j, empty); // j 주소에다가 i를 저장.
				}
			}
		}
		Collections.sort(lottoList);
		System.out.println("Collections.sort : " + lottoList);
		System.out.println("BubbleSort : " + bubbleList);
	}
}
	
