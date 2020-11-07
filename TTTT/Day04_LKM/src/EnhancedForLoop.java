
public class EnhancedForLoop {

	public static void main(String[] args) {
		
		/*
		 # 향상된 for문 (ForEach)
		 
		 - 배열 및 컬렉션 내부의 요소를 순차적으로 순회하여
		  반복작업을 할 수 있는 반복문 입니다.
		 */
		
		String[] week = {"월", "화", "수", "목", "금", "토", "일"};
		
//		for(int i=0; i<week.length; i++) {
//			System.out.println(week[i] + "요일");
//		}
		
		for(String day : week) {
			System.out.println(day + "요일");
		}
		
		/*
		 1. scores라는 int배열에 점수 데이터를 저장하세요.
		 [98, 71, 85, 66, 100, 95]
		 
		 2. 향상 for문을 사용하여 총점과 평균을 구하세요.
		 
		 3. 평균은  double타입입니다. 소수점 둘째 자리까지 출력하세요.
		 */
		
		int[] scores = {98, 71, 85, 66, 100, 95};
		
		int total = 0;
		for(int s : scores) {
			total += s;
		}
		
//		for(int idx=0; idx<scores.length; idx++) {
//			total += scores[idx];
//		}
		
		
		double avg = (double) total / scores.length;
		System.out.printf("총점: %d점, 평균: %.2f점"
				, total, avg);
		
		
		
	}

}











