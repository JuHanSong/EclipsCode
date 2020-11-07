
/*
 # 메서드 (method)
 
 1. 메서드는 코드의 모듈화 및 재활용성을 높이기 위해 사용합니다.
 
 2. 메서드는 선언하는 과정과 호출하는 과정으로 이루어집니다.
 
 3. 메서드 선언은 메서드 내부에서는 불가능합니다.
  새로운 메서드의 선언은 반드시 메서드 블록 외부, 클래스 블록
  내부에서만 가능합니다.
  
 4. 메서드 호출은 메서드 내부나 생성자 블록 내부에서만 가능합니다.
  클래스블록 내부에는 메서드 호출이 불가능합니다.
  
 5. 호출하는 과정은 메서드를 사용하는 과정이며, 해당 메서드가
  필요로 하는 데이터(매개값)를 메서드 내부로 전달하면, 해당 메서드는
  그 매개값을 통해 처리한 결과를 호출부로 다시 반환합니다.
 */


public class MethodExample1 {

	//메서드의 선언
	static int calcTotal(int x) {
		int total = 0;
		for(int i=1; i<=x; i++) {
			total += i;
		}
		return total;
	}
	
	
	public static void main(String[] args) {
		
		//메서드의 호출
		int result = calcTotal(10);
		System.out.println(result);
		
		System.out.println("1~100까지의 누적합: " + calcTotal(100));
		System.out.println("1~200까지의 누적합: " + calcTotal(200));
		System.out.println("1~300까지의 누적합: " + calcTotal(300));
		System.out.println("1~400까지의 누적합: " + calcTotal(400));
		System.out.println("1~500까지의 누적합: " + calcTotal(500));
		System.out.println("1~600까지의 누적합: " + calcTotal(600));
		System.out.println("1~700까지의 누적합: " + calcTotal(700));
		System.out.println("1~800까지의 누적합: " + calcTotal(800));
		
		
	}
	
	
	

}



















