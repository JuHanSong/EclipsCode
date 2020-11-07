import java.util.HashMap;
import java.util.Map;

public class Quiz {

	public static void main(String[] args) {
		
		Map maps = new HashMap();
		
		maps.put("탕수육", 12000);
		maps.put("피자", 23000);
		maps.put("회", 30000);
		maps.put("족발", 25000);
		maps.put("한정식", 120000);
		
		System.out.println("탕수육의 가격 : " + maps.get("탕수육"));
		System.out.println("피자의 가격 : " + maps.get("피자"));
		System.out.println("회의 가격 : " + maps.get("회"));
		System.out.println("족발의 가격 : " + maps.get("족발"));
		System.out.println("한정식의 가격 : " + maps.get("한정식"));
		
		
	}
	
}
