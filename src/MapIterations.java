import java.util.*;
import java.util.stream.Stream;

public class MapIterations {

	public static void main(String[] args) {
		
		Map<String,Integer> map = new HashMap<>();
		map.put("Jagan", 001);
		map.put("Mohan", 00);
		map.put("Mylapuru", 001);
		map.put("Kamakshi", 001);
		/*Iterator<Map.Entry<String,Integer>> itr = map.entrySet().iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}*/
		
		//map.entrySet().stream().forEach(System.out::println);
		
		for(Map.Entry<String,Integer> m: map.entrySet()) {
			System.out.println(m.getKey() +"---"+m.getValue());
			System.out.println("*************************");
			
		}
		

	}

}
