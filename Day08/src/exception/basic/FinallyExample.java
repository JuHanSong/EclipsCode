package exception.basic;

public class FinallyExample {

	public static void main(String[] args) {
		
		String[] pets = {"멍멍이", "야옹이", "짹짹이"};
		
		for(int i=0; i<4; i++) {
			try {
				System.out.println(pets[i] + " 키우고싶다~");				
			} catch(Exception e) {
				System.out.println("애완동물의 정보가 없습니다.");
			} finally {
				/*
				 - finally는 예외 발생 여부와 상관없이
				  무조건 실행되는 문장을 작성하는 곳입니다.
				 */
				System.out.println("아무튼 실행되는 문장입니다.");
				System.out.println("---------------------");
			}
		}
		

	}

}













