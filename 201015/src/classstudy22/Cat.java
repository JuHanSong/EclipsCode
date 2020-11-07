package classstudy22;

public class Cat {
	String Name;
	int Age;
	String CatFood;
	
	public Cat(String CName, int CAge, String CCatFood) {
		Name = CName;
		Age = CAge;
		CatFood = CCatFood;
	}
	
	public void ShowCatInfo() {
		System.out.println("고양이 이름 =" + Name);
		System.out.println("고양이 나이 =" + Age);
		System.out.println("고양이 먹이 =" + CatFood);
	}

}
