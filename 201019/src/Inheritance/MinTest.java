package Inheritance;

public class MinTest {
	public static void main(String[] args) {
		Megician m1 = new Megician();
		
		m1.ShowState();
		m1.Meditation();
		m1.Attack();
		m1.fireBall();
		m1.ShowState();
		
		Archer a1 = new Archer();
		
		a1.ShowState();
		a1.RangeAttach();
		a1.ShowState();
		
		Warrior w1 = new Warrior();
		w1.ShowState();
		w1.Meditation();
		w1.Defence();
		w1.ShowState();
		
	}

}
