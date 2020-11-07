package Inheritance;

public class Megician extends Job{
	
	@Override
	public void ShowState() {
		System.out.println("마법사의 현재 상태입니다.");
		System.out.println("체력 : " + getHp() + "마력 : " +getMp()+ "레벨 : " +getLevel()+"공격력 : " +getAttack());
	}
	
	public void Meditation() {
		 System.out.println("마법사가 명상을 합니다.");
		 System.out.println("마나가 20 회복 하였습니다.");
		 setMp(20);
	}
	
	
	public void fireBall() {
		System.out.println("당신은 화염구를 날렸습니다.");
		System.out.println("당신은 " + getAttack()*3 + "의 데미지를 입혔습니다.");
		System.out.println("당신은 마나를 5 소모하였습니다.");
		setMp(-5);
	}
}
