
public class WhileExample1 {

	public static void main(String[] args) {
		
		
		int n = 1; //제어변수: 반복문의 횟수를 제어할 변수 (begin)
		while(n <= 10) { //논리형 조건식: 반복문의 끝을 조정 (end)
			System.out.println("안녕하세요! 반갑습니다~" + n);
			n++; //증감식: 반복문의 종료를 위해 제어변수의 값을 조정(step)
		}
		
		System.out.println("----------------------------------");
		
		//1~10까지의 누적합을 구하는 로직.
		
		int total = 0; //누적합을 담아줄 변수
		
		int i = 1; //begin
		while(i <= 10) { //end
			total += i;
			i++; //step
		}

		System.out.println("1~10까지의 누적합: " + total);
		
		
		
		

	}

}







