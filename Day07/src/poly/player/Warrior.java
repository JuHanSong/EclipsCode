package poly.player;

public class Warrior extends Player {

	int rage;
	
	Warrior(String name) {
		super(name);
		this.rage = 60;
	}
	
	public void rush(Player p) {
		/*
		 1. 기술을 시전하는 사람의 이름과 피격당하는 사람의 이름을
		  각각 출력해 주세요.
		 
		 2. rush라는 기술은 마법사에게는 20의 피해,
		  사냥꾼에게는 15의 피해, 전사에게는 10의 피해를 각각 입힙니다.
		  
		 3. instanceof 키워드를 사용하여 매개변수로 들어오는 객체가
		  무엇인지를 판단하여 각각 직업별로 다른 데미지를 적용시켜 주세요.
		  
		 4. 남은 체력도 마찬가지로 출력해 주세요.
		 */
		System.out.printf("%s님이 %s님에게 돌진 시전!!!\n"
				, this.name, p.name);
		
		if(p instanceof Warrior) {
			p.hp -= 10;
			System.out.printf("%s(전사)님이 10의 피해를 입었습니다.\n"
					, p.name);
		} else if(p instanceof Mage) {
			p.hp -= 20;
			System.out.printf("%s(마법사)님이 20의 피해를 입었습니다.\n"
					, p.name);
		} else if(p instanceof Hunter) {
			p.hp -= 15;
			System.out.printf("%s(사냥꾼)님이 15의 피해를 입었습니다.\n"
					, p.name);
		}
		
		System.out.printf("%s님의 남은 체력: %d\n"
				, p.name, p.hp);
		
		System.out.println("-----------------------------------");
		
	}
	
	
	

	@Override
	void characterInfo() {
		super.characterInfo();
		System.out.println("# 분노: " + rage);
	}
	
	
	
}















