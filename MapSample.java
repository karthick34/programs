package temp;

import java.util.HashMap;
import java.util.Map;

public class MapSample {

	public static void main(String[] args) {
		
		
		Map<Long,String> map = new HashMap<>();
		
		map.put(9698285199L, "karthik");
		map.put(9698285199L, "karthik");
		map.put(9698285199L, "karthik");
		map.put(9940301310l, "Yogesh");
		
		System.out.println(map.get(9940301310l));
		
		
		for (Map.Entry<Long, String> mp: map.entrySet()) {
			//System.out.println(mp.getKey());
			System.out.println(mp.getValue()+ mp.getKey());
		}
		
		/*
		SetClass<Integer> class1 = new SetClass<>();
		class1.add("Yogesh");
		class1.add("Yogesh");
		class1.add("Yogesh");
		class1.add("Yogesh")
		
		class1.add(1);
		
		System.out.println(class1.size())*/;
		
		
	}
}
