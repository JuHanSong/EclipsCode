package game1;

import java.util.Formattable;

public class Magicion {
	String name;
	int level;
	int hp;
	int mp;
	int attack;
	
	public Magicion(String Mname, int Mlevel, int Mhp, int Mmp, int Mattack) {
		name = Mname; 
		level = Mlevel;
		hp = Mlevel;
		mp = Mmp;
		attack = Mattack;
	} // 생성자 
	
	void Attack() {
		System.out.println(name +"이(가)" + attack + "만큼의 데미지를 입혔습니다");
	}
	
	void Fireball() {
		System.out.println("마나 5를 소모하여"+ (attack*3) + "값 만큼 데미지를 입혔습니다.");
		mp -=5;
	}
	
	void Meditation() {
		System.out.println("명상으로 마나 20을 충전 합니다.");
		mp +=20;
	}
	void ShowStat() {
		System.out.println("Name =" + name);
		System.out.println("Level =" + level);
		System.out.println("HP =" + hp);
		System.out.println("MP =" + mp);
		System.out.println("Attack" + attack);
	}
	

}
