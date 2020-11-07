package FinalVariable;

import finalStatic.FinalStatic;

public class GetLuckyNumber {
	
	public static void main(String[] args) {
		System.out.println("행운번호를 추첨해 보겠습니다.");
		System.out.println("당첨 확률은 20% 입니다");
		
		int getNum = (int)(Math.random()*5+1);
		
		System.out.println("당첨번호 = " + getNum);
		if (FinalStatic.LUCKYNUM == getNum) {
			System.out.println("당첨 입니다.");
		}else
			System.out.println("꽝 입니다. 다음 기회를 노려주세요.");
		
	}

}
