package ClassStudy2;

public class Cat {
	String name;
	String catFood;
	int age;
	
	public Cat(String cName, int cAge, String cCatFood) {
		name = cName;
		age = cAge;
		catFood = cCatFood;
	}
	
	public void ShowCatInfo() {
		System.out.println("고양이 이름 :" + name);
		System.out.println("고양이 음식 :" + catFood);
		System.out.println("고양이 나이 :" + age);
	}
	
	public void EatFood() {
		System.out.println(name + "이(가)" + catFood +"를 먹습니다");
	}
	
	public void CatMeow() {
		System.out.println(name + "의 울름소리 입니다.");
	}
}
