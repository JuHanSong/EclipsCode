package structure;


public class UsingPerson1 {
	
	public static void main(String[] args) {
		
		Person1 person1 = new Person1();
		Person1 person2 = new Person1();
		
		Cat cat1 = new Cat();
		Cat cat2 = new Cat();
		
		Dog dog1 = new Dog();
		Dog dog2 = new Dog();
		
		person1.name = "송주한";
		person1.age = 18;
		person1.phoneNum = "010-0000-0000";
		
		person2.name = "종훈이";
		person2.age = 30;
		person2.phoneNum = "010-0000-0000";
		
		cat1.name = "야옹이";
		cat1.age = 30;
		cat1.race = "길량이";
		
		cat2.name = "냥냥이";
		cat2.age = 30;
		cat2.race = "집냥이";
		
		dog1.name = "댕댕이";
		dog1.home = "인천";
		dog1.age = 30;
		
		dog2.name = "바우";
		dog2.home = "서울";
		dog2.age = 30;
		
		
		person1.show();
		person1.buyLiquor();
		person2.show();
		person2.buyLiquor();
		
//		person1.age += 1;
//		person2.age += 1;
//		
//		person1.show();
//		person2.show();
		
//		cat1.show();
//		cat2.show();
//		
//		dog1.showDogInfo();
//		dog2.showDogInfo();
//		
//		
		
	}

}
