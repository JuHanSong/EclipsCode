package MonsterHunter1;

public class HeteroQuiz {

	public static void main(String[] args) {
		
		Job mJob[] = new Job[5];
		
		Worrior w1 = new Worrior("전사 1");
		Worrior w2 = new Worrior("전사 2");
		Worrior w3 = new Worrior("전사 3");
		
		Magician m1 = new Magician("법사 1");
		Magician m2 = new Magician("법사 2");
		
		mJob[0] = w1;
		mJob[1] = w2;
		mJob[2] = w3;
		mJob[3] = m1;
		mJob[4] = m2;
		
		
//		for(int i = 0; i < mJob.length; i ++) {
//			if(mJob[i] instanceof Magician) {
//				System.out.println(mJob[i].getName() + " 의 직업은 법사 입니다.");
//			}else {
//				System.out.println(mJob[i].getName() +" 의 직업은 전사 입니다.");
//			}
//		}
		
		for(Job j : mJob) {
			if(j instanceof Magician) {
				System.out.println(j.getName() + "의 직업은 법사 입니다.");
			}else {
				System.out.println(j.getName() + " 의 직업은 전사 입니다.");
			}
		}
	}

}
