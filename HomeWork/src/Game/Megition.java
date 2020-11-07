package Game;

public class Megition extends Job{
	
	public Megition() {
		setName("Megition");
		setHp(1000);
		setMp(1000);
		setAttack(100);
	}
	
	public void Attack(Monster m) {
		System.out.println(getName() + " 이 " + m.getName() + "을 공격하여" + getAttack() + "만큼의 피해를 입혓습니다.");
		
	}

}
