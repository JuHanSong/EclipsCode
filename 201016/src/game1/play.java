package game1;



public class play {
	
	public static void main(String[] args) {
		Magicion m1 = new Magicion("마법사", 1, 20, 20, 3);
		
		
		m1.Attack();
		m1.ShowStat();
		m1.Fireball();
		m1.ShowStat();
		m1.Meditation();
		m1.ShowStat();
	}

}
