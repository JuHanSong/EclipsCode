package Inheritance;

public class Warrior extends Job {
	public void Defence() {
		System.out.println("이 스킬은 마나를 3 소모 합니다.");
		setMp(-3);
		System.out.println("방패를 들었습니다.");
	}
}
