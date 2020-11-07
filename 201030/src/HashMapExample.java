import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
	
	public static void main(String[] args) {
		Map maps = new HashMap();
		
		String s1 = new String("홍길동");
		maps.put("name", s1);
		maps.put("hiredate", new Date()); // 1회용 익명객체  
		maps.put("Salary",20000);
		
		System.out.println(maps);
		System.out.println(maps.get("name"));
		System.out.println(maps.get("salary"));
		System.out.println(maps.get("hiredate"));
		
		System.out.println();
		//map 안의 요소를 entrySet()  메서드를 이용해서 조회
		Set<Map.Entry<String, Object>> s = maps.entrySet();
		for(Map.Entry<String, Object> me : s) {
			System.out.println(me.getKey() + ":" + me.getValue());
		}
		
		System.out.println();
		
		Set<String> ss = maps.keySet();
		for(String key : ss) {
			System.out.println(key + " :" + maps.get(key));
		}
		
		
		
	}

}
