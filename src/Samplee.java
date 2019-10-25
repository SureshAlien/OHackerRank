import java.util.*;


public class Samplee {
	
	public static void main(String[] args) {

		
		
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		
		Map<String, Object> map = new HashMap<String, Object >();
		map.put("foo", "bar");
		map.put("boo", "far");
		
		list.add(map);
		
		Map<String, Object> map1 = new HashMap<String, Object >();
		map1.put("o", "r");
		map1.put("b", "f");
		
		list.add(map1);

		
		System.out.println(list.get(1).get("b"));

		
		

		

	}

}
