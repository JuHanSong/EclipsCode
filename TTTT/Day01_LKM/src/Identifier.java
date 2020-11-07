
public class Identifier {

	public static void main(String[] args) {
		
		//1. 식별자 이름은 중복을 허용하지 않습니다.
		//그리고 대 / 소문자를 철저하게 구분합니다.
		
		int age = 30;
		int Age = 40;
		System.out.println(age);
		System.out.println(Age);
		
		//2. 식별자 이름은 숫자로 지정하거나 숫자로 시작하시면 안됩니다.
//		int 700 = 365; (x)
//		int 7number = 7; (x)
		int number7 = 7;
		int num7ber = 7;
		
		//3. 식별자 이름에 공백을 포함할 수 없습니다.
//		int my birth day = 19921013; (x)
		int mybirthday = 19921013;
		int myBirthDay = 19921013;
		
		//4. 식별자 이름에 쓸 수 있는 특수문자는 밑줄(_)과 달러기호($)
		//뿐입니다. 하지만 사용을 권장하지는 않습니다.
		//이미 다른 곳에서 사용하고 있는 특수 문자이기 때문에
		//그것들과의 혼선을 막기 위해서 사용을 권하지 않습니다.
		String $hello_ = "안녕";
		
		//5.키워드(예약어)는 식별자 이름으로 사용이 불가능합니다.
		//키워드 -> 이미 어떠한 기능을 가지고 있는 단어.
//		String class = "클래스"; (x)
		String className = "클래스";
		
		//6. 한글이나 한자 같은 식별자 이름도 사용이 가능합니다.
		//하지만 사용을 권장하지는 않습니다.
		int 숫자 = 10;
		String 名 = "홍길동";
		System.out.println(숫자);
		System.out.println(名);
		
		
		
		
		
		
		
		
		
		
		

	}

}
