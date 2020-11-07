package MonsterHunter1;

public class MonHunMain {
	public static void main(String[] args) {
		Magician m1 = new Magician("렉먹은법사");
		Worrior w1 = new Worrior("렉먹은전사");
		Orc o1 = new Orc();
		Golem g1 = new Golem();
		Orc o2 = new Orc();
		Golem g2 = new Golem();
		
		m1.FireBall(o1);
		m1.FireBall(g1);
		
		w1.Attack(o2);
		w1.Attack(g2);

		
	}

}
