package Inheritance;

public class Job {
	private int level;
	private int hp;
	private int mp;
	private int attack;
	
	public Job() {
		level = 1;
		hp = 20;
		mp = 20;
		attack = 3;
	}
	
	public void Attack() {
		System.out.println("당신은" + attack + "의 데미지를 입혔다.");
	}
	public void Meditation() {
		System.out.println("당신은 명상을 통해서 마나를 20 회복 하였습니다.");
		mp +=20;
	}
	public void ShowState() {
		System.out.println("당신의 상태 입니다.");
		System.out.println("체력 : " + hp);
		System.out.println("마력 : " + mp);
		System.out.println("레벨 : " + level);
		System.out.println("공격력 : " + attack);
	}
	
	public int getAttack() {
		return attack;
	}
	
	public void setMp(int mp) {
		this.mp +=(mp);
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level += level;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp += hp;
	}

	public int getMp() {
		return mp;
	}

	public void setAttack(int attack) {
		this.attack += attack;
	}
	
	
}
