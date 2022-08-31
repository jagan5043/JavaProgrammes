import java.util.*;

public class CountChars {

	public static void main(String[] args) {
		String str ="jagan mohan mylapuru";
		char[] ch = str.toCharArray();
		
		Map<Character,Integer> map = new HashMap<>();
		
		for(char c:ch) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}else {
				map.put(c, 1);
			}
		}
		
		Iterator<Map.Entry<Character,Integer>> itr = map.entrySet().iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
