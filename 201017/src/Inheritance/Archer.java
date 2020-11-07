package Inheritance;

public class Archer extends Job{
	public void RangeAttach() {
		System.out.println("이 스킬은 마나를 2 소모합니다.");
		setMp(-2);
		System.out.println("원거리 공격은 데미지를 2 입힙니다.");
		System.out.println("원거리 공격은로" + getAttack() *10 + "데미지를 입힙니다.");
		
	}
	
}
