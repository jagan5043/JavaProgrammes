import java.util.*;

public class CountWords {

	public static void main(String[] args) {
		String str = "jagan mohan jagan mohan mylapuru";
		String[] strArray = str.split(" ");
		Map<String,Integer> map = new HashMap<>();
		
		for(String s : strArray) {
			if(map.containsKey(s)) {
				map.put(s, map.get(s)+1);
			}else {
				map.put(s, 1);
			}
		}
		
		for(Map.Entry<String,Integer> m: map.entrySet()) {
			System.out.println(m.getKey()+"---"+m.getValue());
		}

	}

}
