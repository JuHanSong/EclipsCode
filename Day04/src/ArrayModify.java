import java.util.Arrays;
import java.util.Scanner;

public class ArrayModify {

	public static void main(String[] args) {
		
		String[] foods = {"치킨", "보쌈", "삼겹살", "피자"};
		System.out.println(Arrays.toString(foods));
		
		foods[1] = "짜장면";
		foods[0] = "핫도그";
		
		System.out.println(Arrays.toString(foods));
		
		System.out.println("--------------------------------");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("탐색할 음식명을 입력하세요: ");
		String name = sc.next();
		
		int idx;
		
		for(idx=0; idx<foods.length; idx++) {
			if(name.equals(foods[idx])) {
				System.out.println("탐색 완료!");
				System.out.println("인덱스 번호: " + idx + "번");
				break;
			}  			
		}
		
		if(idx == foods.length) {
			System.out.println("없는 음식입니다.");
		}
		
		
		sc.close();
		
		
	}

}























