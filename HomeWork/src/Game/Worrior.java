package Game;

public class Worrior extends Job{
	
	public Worrior() {
		setName("Worrior");
		setHp(2000);
		setMp(2000);
		setAttack(200);
	}
	
	public void Attack(Monster m) {
		System.out.println(getName() + " 이 " + m.getName() + "을 공격하여" + getAttack() + "만큼의 피해를 입혓습니다.");
		
	}

}
