
public class ConOperatorQuiz {

	public static void main(String[] args) {
		
		/*
		 - Math.random()메서드로 1~100까지의 난수를 발생시켜서
		 해당 난수가 짝수인지 홀수인지의 여부를 삼항연산식으로 판단해서
		 결과를 출력하세요.
		 */
		
		int rn = (int) ((Math.random()*100) + 1);
		
		System.out.println("발생한 난수: " + rn);
		String result = (rn % 2 == 0 ? "짝수입니다.":"홀수입니다.");
		System.out.println("홀/짝수 여부: " + result);
		//System.out.println("홀/짝수 여부:" + (rn % 2 == 0 ? "짝수" : "홀수"));

	}

}

















