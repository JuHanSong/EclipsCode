package ClassStudy2;

import java.util.Scanner;
import java.util.jar.Attributes.Name;

public class CatMain {
	
	public static void main(String[] args) {
		Dog dog1 = new Dog("서완식", 30, "시박이");
		Cat cat1 = new Cat("송주한", 30,"하박이");
		
		
		
		dog1.showDogInfo();
		dog1.BowWow();
		
		cat1.ShowCatInfo();
		cat1.CatMeow();
		
	}

}
