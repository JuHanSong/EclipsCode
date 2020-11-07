package Inheritance;

public class Warrior extends Job {
	
	
	
	public void ShowState() {
		System.out.println("전사의 현재 상태입니다.");
		System.out.println("체력 : " + getHp() + "마력 : " +getMp()+ "레벨 : " +getLevel()+"공격력 : " +getAttack());
	}


	
	@Override
	public void Meditation() {
		System.out.println("전사가 명상을 하였습니다.");
		System.out.println("명상으로 마나를 7 회복하였습니다.");
		setMp(7);
	}
	
	public void Defence() {
		System.out.println("이 스킬은 마나를 3 소모 합니다.");
		setMp(-3);
		System.out.println("방패를 들었습니다.");
	}
}
