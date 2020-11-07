package MonsterHunter1;

public class Worrior extends Job {
	
	public Worrior(String name) {
		super(name);
	}
	
	public void Attack(Monster m) {
		System.out.println("Worrior는 일반 공격을 헀습니다.");
		System.out.println("데미지를" + getAttack() + "입혔습니다.");
		
		m.setHp(m.getHp() - getAttack());
		System.out.println("현재" + m.getName() +"체력은" + m.getHp() + "입니다.");
		m.Attack(this);
		System.out.println("");
	}
	
	
	
}
