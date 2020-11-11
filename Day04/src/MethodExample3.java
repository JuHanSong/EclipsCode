
/*
 # 반환값, 반환 유형 (return type, return value)
 
 1. 반환값이란 메서드 실행 결과값을 의미합니다.
 2. 매개변수는 여러 개 존재할 수 있지만, 반환값은 오직 한 개만
  존재해야 합니다.
 3. return이라는 키워드를 사용하여 return 뒤에 전달할 값을
  지정합니다.
 4. 전달되는 값의 데이터 타입을 반환 유형이라고 하며, 메서드를 선언할 때
  메서드 이름 앞에 반드시 반환 유형을 명시해야 합니다.
 5. 반환값이 있는 메서드는 호출문이 하나의 값으로 처리되기 때문에
 반환값을 다른 변수에 대입할 수도 있고, 다른 메서드의 매개값으로도
 사용이 가능합니다.
 
 6. 모든 메서드가 반환값이 있는 것은 아닙니다. 메서드 실행 후에
  딱히 반환할 값이 없다면 return을 사용하지 않아도 됩니다.
 7. 이 때는 반환 유형을 메서드 선언시에 비워 두시면 안되고, 반드시
 void라는 키워드를 작성해 주셔야 합니다.
 
 
 */


public class MethodExample3 {
	
	static int add(int n1, int n2) {
		return n1 + n2;
	}
	
	static int[] operateTotal(int n1, int n2) {
		return new int[] {n1+n2, n1-n2, n1*n2, n1/n2};
		
	}
	
	
	

	public static void main(String[] args) {
		
		int r1 = add(3, 8); //int r1 = 11;
		
		int r2 = add(10, 15); //int r2 = 25;
		
		int r3 = add(add(4,6), add(7,8));
		System.out.println(r3);
		
		int[] totalResult = operateTotal(30, 6);
		System.out.println("30 + 6 = " + totalResult[0]);
		System.out.println("30 - 6 = " + totalResult[1]);
		System.out.println("30 * 6 = " + totalResult[2]);
		System.out.println("30 / 6 = " + totalResult[3]);

	}

}















