package ClassStudy2;

public class Dog {
	public String name;
	public int age;
	public String cloths;
	
	public Dog(String danme, int dage, String dclothes) {
		name = danme;
		age = dage;
		cloths = dclothes;
	}
	
	public void showDogInfo() {
		System.out.println("강아지 이름 =" + name);
		System.out.println("강아지 나이 =" + age);
		System.out.println("강아지 옷 =" + cloths);
	}
	
	public void BowWow() {
		System.out.println("멍멍!!");
	}
	
}
