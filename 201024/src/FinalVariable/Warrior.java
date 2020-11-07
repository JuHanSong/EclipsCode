package FinalVariable;

public class Warrior {
	int level;
	int hp;
	int mp;
	int attack;
	final int attack2 = 5;
	
	public Warrior() {
		this.level =1;
		this.hp = 20;
		this.mp = 20;
		this.attack =3;
		
	}
	
	public void Attack() {
		System.out.println("데미지를 " + attack + "입혔습니다.");
	}
	public void Attack2() {
		System.out.println("고정 데미지를 " + attack2 + "입혔습니다.");
	}

	public void burf() {
		System.out.println("전사가 버프를 겁니다.");
		attack += 2; 
		
		
		System.out.println("버프의 결과로 공격력이 2증가 하였습니다.");
		System.out.println("현재 공격력은 " + attack + "입니다");
	}
	
}
