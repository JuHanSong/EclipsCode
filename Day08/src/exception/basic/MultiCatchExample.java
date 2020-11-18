package exception.basic;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiCatchExample {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.print("정수: ");
			int num = sc.nextInt();
			
			int result = 100 / num;
			
			int[] arr = new int[4];
			
			System.out.println(arr[result]);
			
			
			String s = null;
			s.equals("안녕~");
		} catch(InputMismatchException | ArithmeticException e) {
			System.out.println("입력값에 문제가 있어요!");
		} catch(NullPointerException e) {
			System.out.println("null을 참조해서 에러가 발생했습니다!");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("인덱스 범위를 벗어났어요!");
		} catch(Exception e) {
			System.out.println("알 수 없는 예외 발생! 금방 조치하겠습니다.");
		}

		System.out.println("프로그램 정상 종료!");
		
	}

}




















