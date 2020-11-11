
/*
 # 매개 변수 (parameter, argument)
 
 1. 매개변수는 메서드를 호출할 때 메서드 실행에 필요한 값들을
  메서드 내부로 전달하기 위한 매개체 역할을 합니다.
  
 2. 메서드 호출부에서 어떤 매개값을 전달하느냐에 따라
  메서드 실행 결과는 달라질 수 있습니다.
  
 3. 매개값을 몇 개 전달받아 사용할지는 메서드를 선언할 때 선언부에서
  ()안에 미리 타입과 갯수를 지정해야 합니다.
  
 4. 매개변수는 하나도 선언하지 않을 수 있습니다. 이 때는 메서드의 선언부에
 () 내부를 비워둡니다. 그리고 호출할 때도 ()를 비워서 호출합니다.
  
 */

public class MethodExample2 {

	//x ~ y까지의 누적합 구하기
	static int calcRangeTotal(int start, int end) {
		int total = 0;
		for(int i=start; i<=end; i++) {
			total += i;
		}
		return total;
	}
	
	static String selectRandomFood() {
		double rn = Math.random();
		if(rn > 0.66) {
			return "치킨";
		} else if(rn > 0.33) {
			return "족발";
		} else {
			return "삼겹살";
		}
	}
	
	//정수 n개를 전달하면 정수 n개의 총합을 리턴하는 메서드
	static int calcNumberTotal(int[] nums) {
		int total = 0;
		for(int n : nums) {
			total += n;
		}
		return total;
	}
	
	
	
	
	public static void main(String[] args) {

		int result = calcRangeTotal(3, 7);
		System.out.println(result);
		
		System.out.println("오늘 점심 뭐먹지???: " + selectRandomFood());
		
		int[] arr = {10,20,30,40,50};
		
		int sum = calcNumberTotal(arr);
		System.out.println(sum);
		
		
		
	}

}














