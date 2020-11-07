package MonsterHunter1;

public class Monster {
	
	private int hp;
	private int attack;
	private String name;
	
	public void Attack(Job j) {
		System.out.println("몬스터가 당신을 공격했습니다.");
		System.out.println("데미지가" + attack + " 을 입었습니다.");
		j.setHp(j.getHp() - attack);
		System.out.println("현재 마법사의 체력은 " + j.getHp() + "입니다.");
		System.out.println();
		
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
