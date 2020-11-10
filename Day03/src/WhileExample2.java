
public class WhileExample2 {

	public static void main(String[] args) {
		
		//48~150사이의 정수 중 8의 배수만 가로로 출력하기.
//		int n = 48;
//		while(n <= 150) {
//			if(n % 8 == 0) {
//				System.out.print(n + " ");
//			}
//			n++;
//		}
		
		int n = 48;
		while(n <= 150) {
			System.out.print(n + " ");
			n += 8;
		}
		
		System.out.println(); //단순 줄 개행

		//13 ~ 200까지의 정수 중 4의 배수이면서 
		//8의 배수는 아닌 수를 가로로 출력하세요.
		
		int i = 13;
		while(i <= 200) {
			if(i % 4 == 0) {
				if(i % 8 != 0) {
					System.out.print(i + " ");
				}
			}
			i++;
		}
		
		System.out.println();
		
		//1~20000까지의 정수 중 248의 배수의 갯수를 출력.
		
		int j = 1;
		int count = 0;
		
		while(j <= 20000) {
			if(j % 248 == 0) {
				count++;
			}
			j++;
		}
		
		System.out.println("1~20000중 248의 배수의 갯수: " + count + "개");
		

	}

}












