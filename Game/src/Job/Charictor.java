package Job;

public class Charictor {
	private String name;
	private int level;
	private int hp;
	private int mp;
	private int attack;
	
	public Charictor() {
		return;
	}
	
	public void State() {
		System.out.println("Name = " + name + "Level = " + level + "HP = " + hp + "MP = " + mp + "Attack = " + attack);
	}
	
	public String getName() {
		return name;
	}
	
	public void setMP(int mp) {
		this.mp -= (mp);
	}
	
	
	
}
