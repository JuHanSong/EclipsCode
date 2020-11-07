package MonsterHunter1;

public class Job {
	private int hp;
	private int mp;
	private int attack;
	private String name;
	
	public Job(String name) {
		this.name = name;
		this.hp = 40;
		this.mp = 40;
		this.attack = 5;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
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
