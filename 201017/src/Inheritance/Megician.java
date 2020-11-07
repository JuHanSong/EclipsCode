package Inheritance;

public class Megician extends Job{
	public void fireBall() {
		System.out.println("당신은 화염구를 날렸습니다.");
		System.out.println("당신은 " + getAttack()*3 + "의 데미지를 입혔습니다.");
		System.out.println("당신은 마나를 5 소모하였습니다.");
		setMp(-5);
	}
}
