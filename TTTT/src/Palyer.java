
public class Palyer {

	
	
	String name;
	int level;
	int atk;
	int hp;
	
	public Palyer() {
		super();
		System.out.println("Player 1번 생성자 호출");
		
	}
	public Palyer(String name) {
		this();
		System.out.println("Player 2번 생성자 호출");
	}
	public Palyer(String name, int hp) {
		this();
		System.out.println("Player 2번 생성자 호출");
	}
	
}
