package classstudy22;

public class Dog {
	
	String name;
	int Age;
	String cloth;
	
	public Dog (String Dname, int DAge, String Dcloth) {
		name = Dname;
		Age = DAge;
		cloth = Dcloth;
	}
	
	public void ShowDogInfo() {
		System.out.println("강아지 이름 =" + name);
		System.out.println("강아지 나이 =" + Age);
		System.out.println("강아지 옷 ="  + cloth);
	}
	
}
