package MonsterHunter1;

public abstract class Monster {
	
	private int hp;
	private int attack;
	private String name;
	
	public abstract void Attack(Job j); // 내용은 없지만 자식 클래스도 Attack 클래스를 갖고 있어야 한다. 

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
