package MonsterHunter1;

public class Magician extends Job {
	
	
	public static int mNum = 0;
	
	
	
	public Magician(String name) {
		super(name);
		mNum += 1;
		
		System.out.println(mNum + "번쨰 Magician 계정 생성");
	}
	
	public void Attack(Monster m) {
		System.out.println("당신은 일반 공격을 헀습니다.");
		System.out.println("데미지를" + getAttack() + "입혔습니다.");
		
		m.setHp(m.getHp() - getAttack());
		System.out.println("현재 "+ m.getName() +" 체력은" + m.getHp() + "입니다.");
		m.Attack(this);
		System.out.println("");
	}
	
	public void FireBall(Monster m) {
		System.out.println("당신은 화염구를 던졌습니다.");
		System.out.println("데미지를 " + getAttack() * 3 + "입혔습니다.");
		System.out.println("마력을 5소모 하였습니다.");
		setMp(getMp()-5);
		
		m.setHp(m.getHp() - getAttack()*3);
		m.Attack(this);
	}
	
}
