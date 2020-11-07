package MonsterHunter1;

public class Orc extends Monster {
	
	public Orc() {
		setHp(10);
		setAttack(3);
		setName("Orc");
	}
	
	public void Attack(Job j) {
		System.out.println("Orc가 당신을 공격했습니다.");
		System.out.println("데미지가" + getAttack() + " 을 입었습니다.");
		j.setHp(j.getHp() - getAttack());
		System.out.println("현재"+ j.getName()+" 체력은 " + j.getHp() + "입니다.");
		System.out.println();
		
	}
}
