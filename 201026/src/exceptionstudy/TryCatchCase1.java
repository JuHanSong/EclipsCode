package exceptionstudy;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class TryCatchCase1 {

	public static void main(String[] args) {
		 
		int [] iarr = {1, 2, 3};
		
		
		try{
		System.out.println(iarr[0]);
		System.out.println(iarr[1]);
		System.out.println(iarr[2]);
		Integer.parseInt("가");
		System.out.println(3/0);
		System.out.println(iarr[3]);
		
		} catch(NumberFormatException e) {
			System.out.println("예측한 예외가 발생헀습니다.");
			e.printStackTrace();
		} catch(Exception e) {
			System.out.println("예측하지 못한 에러가 발생했습니다,");
			System.out.println("원인 : " + e.getMessage());
		}
		finally {
			System.out.println("예외를 처리했거나 정상 종료되었습니다.");
		}
	}

}
