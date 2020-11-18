package exception.throw_;

public class ThrowExample {
	
	public static int calcSum(int end) throws Exception {
		
		if(end <= 0) {
			//이 부분에서 예외를 강제로 발생시킴!
			throw new Exception();
		}
		
		int total = 0;
		for(int i=1; i<=end; i++) {
			total += i;
		}
		return total;
	}
	

	public static void main(String[] args) {
		
		
		try {
			int result = calcSum(100);
			System.out.println(result);
			
			int result2 = calcSum(-120);
			System.out.println(result2);

		} catch (Exception e) {
			System.out.println("매개값을 양수로 주세요!");
		}
		
		
	}

}






















