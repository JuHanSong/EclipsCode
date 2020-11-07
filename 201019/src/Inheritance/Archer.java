package Inheritance;

public class Archer extends Job{
	
	public void ShowState() {
		System.out.println("궁수의 현재 상태입니다.");
		System.out.println("체력 : " + getHp() + "마력 : " +getMp()+ "레벨 : " +getLevel()+"공격력 : " +getAttack());
	}
	
	public void Meditation() {
		System.out.println("궁수가 명상을 합니다.");
		System.out.println("마나가 6 회복 하였습니다");
		setMp(6);
	}
	
	public void RangeAttach() {
		System.out.println("이 스킬은 마나를 2 소모합니다.");
		setMp(-2);
		System.out.println("원거리 공격은 데미지를 2 입힙니다.");
		System.out.println("원거리 공격은로" + getAttack() *10 + "데미지를 입힙니다.");
		
	}
	
}
