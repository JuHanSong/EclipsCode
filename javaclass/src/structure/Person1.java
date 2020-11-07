package structure;


public class Person1 {
	public String name;
	public String phoneNum;
	public int age;
	
	
	public void show() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(phoneNum);
	}
	
	public void buyLiquor() {
		if(age >=19) {
			System.out.println(name + "주류를 구매했습니다.");
		}else {
			System.out.println("미성년자는 주류를 구매할 수 없습니다");
		}
	}

}
