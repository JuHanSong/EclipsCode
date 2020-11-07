package MonsterHunter1;

public class CastingTest {
	
	public static void main(String[] args) {
		Job j = new Magician("법사짱");
		Orc o1 = new Orc();
		
		Magician j2 = (Magician)j;
		
		j2.Attack(o1);
		j2.FireBall(o1);
		
	}

}
