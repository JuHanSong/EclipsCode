package this_super;

public class Warrior extends Player {

	int rage;
	
	Warrior(String name) {
		super(name);
//		this.name = name;
//		this.level = 1;
//		this.hp = 50;
//		this.atk = 3;
		this.rage = 60;
	}

	@Override
	void characterInfo() {
		super.characterInfo();
		System.out.println("# 분노: " + rage);
	}
	
	
	
}















