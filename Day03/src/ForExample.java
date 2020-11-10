
public class ForExample {

	public static void main(String[] args) {
		
		//1~10까지의 누적합을 구하는 로직 (while)
//		int total = 0;
//		int n = 1;
//		while(n <= 10) {
//			total += n;
//			n++;
//		}
		
		//1~10까지의 누적합을 구하는 로직(for)
		int total = 0;
		for(int n=1; n<=10; n++) {
			total += n;
		}
		
		
		//7~200까지의 정수 중 7의 배수를 가로로 출력.(for)
		for(int i=7; i<=200; i++) {
			if(i % 7 == 0) {
				System.out.print(i + " ");
			}
		}
		
		System.out.println();
		
		//1~30000까지의 정수 중 177의 배수의 갯수를 출력. (for)
		int count = 0;
		for(int i=1; i<=30000; i++) {
			if(i % 177 == 0) {
				count++;
			}
		}
		
		System.out.println("1~30000중 177의 배수의 갯수: " + count + "개");
		

	}

}


























