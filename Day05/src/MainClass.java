
public class MainClass {
	
	//피자빵
	static String name = "피자빵";
	static int price = 500;
	static String ingredient = "밀가루";
	static void info() {
		System.out.println("빵 이름: " + name);
		System.out.println("빵 가격: " + price + "원");
		System.out.println("주 재료: " + ingredient);
	}
	
	//초코케이크
	static String name2 = "초코케이크";
	static int price2 = 1500;
	static String ingredient2 = "초콜렛";
	static void info2() {
		System.out.println("빵 이름: " + name2);
		System.out.println("빵 가격: " + price2 + "원");
		System.out.println("주 재료: " + ingredient2);

	}

	public static void main(String[] args) {
		
		/*
		 - 객체를 생성하지 않았을 때의 예시를 보고
		  설계용 클래스를 생성하여 속성과 기능을 선언하고
		  MainClass에서 피자빵, 초코케이크의
		  정보를 출력해 주세요.
		  
		 - 클래스 이름은 Bread로 통일하겠습니다.
		 */
		
		Bread p = new Bread();
		p.name = "피자빵";
		p.price = 500;
		p.ingredient = "밀가루";
		p.info();
		
		Bread c = new Bread("초코케이크", 1500, "초콜렛");
		c.info();

	}

}
















