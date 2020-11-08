
public class AssignmentOperator {

	public static void main(String[] args) {
		
		//대입 연산자 (=)
		//변수에 값을 대입할 때 사용합니다.
		
		int a = 5;
		int b = 5;
		
		//복합 대입 연산자 (대입 연산자에 산술 연산자가 결합한 형태)
		//기존 변수의 값에 연산을 진행 후 대입할 때 사용합니다. (누적시켜 연산)
		//(+=, -=, *=, /=, %=)
		
		a += 3; //a = a + 3
		
		
		a -= 4; //4
		System.out.println(a);
		
		a *= 6; //24
		System.out.println(a);
		
		a /= 5; //4
		System.out.println(a);
		
		a %= 3; //1
		System.out.println(a);
		

	}

}



















