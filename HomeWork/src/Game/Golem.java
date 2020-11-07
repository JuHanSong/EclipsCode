package Game;

public class Golem extends Monster {
	
	public Golem() {
		setName("Golem");
		setHp(200);
		setAttack(20);
	}
	
	public void Attack(Job j) {
		System.out.println(getName() + "이" +j.getName() + "을 공격하여" + getAttack() + "만큼의 피해를 주엇습니다.");
		j.setHp(j.getHp() - getAttack());
	}

}
