package listTest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ListStudy {
	
	public static void main(String[] args) {
		List list = new ArrayList();
		
		list.add(5);
		list.add(6);
		
		System.out.println(list);
		
		list.add(0,10);
		System.out.println(list);
		
		Collections.sort(list);
		
		System.out.println(list);
		list.set(1, 50);
		System.out.println(list);
		
		System.out.println(list.contains(10));
		System.out.println(list.isEmpty());
		System.out.println(list.size());
		
		System.out.println(list.remove(0));
		list.add(1, 0);
		System.out.println(list);
		System.out.println(list.remove((Integer)50));
		System.out.println(list);
		
		list.clear();
		System.out.println(list);
		
		
		
	}

}
