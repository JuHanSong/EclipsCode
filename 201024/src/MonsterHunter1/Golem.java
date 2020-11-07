package MonsterHunter1;

public class Golem extends Monster {
	
	public Golem() {
		setHp(20);
		setAttack(7);
		setName("Golem");
	}

	public void Attack(Job j) {
		System.out.println("Golem가 당신을 공격했습니다.");
		System.out.println("데미지가" + getAttack() + " 을 입었습니다.");
		j.setHp(j.getHp() - getAttack());
		System.out.println("현재"+ j.getName()+" 체력은 " + j.getHp() + "입니다.");
		System.out.println();
		
	}	
}
