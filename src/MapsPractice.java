import java.util.*;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

public class MapsPractice {

	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<>();
		map.put("Jagan", 70000);
		map.put("Mohan", 20000);
		map.put("mylapuru", 3000);
		map.put("Kamakshi", 4000);
		map.put("Pushpa", 3000);
		map.put("Rani", 50000);
		map.put("Raja", 3000);
		map.put("Madhavi", 20000);
		map.put("Latha", 3000);
		map.put("Ravi", 30000);
		map.put("Teja", 33000);
		map.put("Santhosh", 10000);
		map.put("Ramjeji", 40000);
		
		//map function
		List<String> list =map.entrySet().stream().map(m->m.getKey()).collect(Collectors.toList());
		System.out.println(list);
		
		//filter function
		List<Map.Entry<String, Integer>> list1 =map.entrySet().stream().filter(f->f.getValue().equals(20000)).collect(Collectors.toList());
		System.out.println(list1);
		
		//sorted
		Map<Object, Object> m = map.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));
		
		//sorted reverse
		
		Map<Object, Object> m1 = map.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByKey())).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		
		// 
		
		System.out.println(m);
		System.out.println(m1);
		
		//TreeMap
		Map<String,Integer> tree = new TreeMap<>(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				
				return o2.compareTo(o1);
			}
		});
		tree.put("Jagan", 70000);
		tree.put("Mohan", 20000);
		tree.put("Mylapuru", 3000);
		tree.put("Kamakshi", 4000);
		tree.put("Pushpa", 3000);
		tree.put("Rani", 50000);
		tree.put("Raja", 3000);
		tree.put("Madhavi", 20000);
		tree.put("Latha", 3000);
		tree.put("Ravi", 30000);
		tree.put("Teja", 33000);
		tree.put("Santhosh", 10000);
		tree.put("Ramjeji", 40000);
		
		Iterator itr = tree.entrySet().iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		//SynchronizedMap
		Map<String,Integer> sync = new HashMap<>();
		sync.put("Jagan", 70000);
		sync.put("Mohan", 20000);
		sync.put("Mylapuru", 3000);
		sync.put("Kamakshi", 4000);
		sync.put("Pushpa", 3000);
		sync.put("Rani", 50000);
		sync.put("Raja", 3000);
		sync.put("Madhavi", 20000);
		sync.put("Latha", 3000);
		sync.put("Ravi", 30000);
		sync.put("Teja", 33000);
		sync.put("Santhosh", 10000);
		sync.put("Ramjeji", 40000);;
		
		
		System.out.println(Collections.synchronizedMap(sync));
		
	
		
		//ConcurrentHashMap
		Map<String,Integer> conce = new ConcurrentHashMap<>();
		conce.put("Jagan", 70000);
		conce.put("Mohan", 20000);
		conce.put("Mylapuru", 3000);
		conce.put("Kamakshi", 4000);
		conce.put("Pushpa", 3000);
		conce.put("Rani", 50000);
		conce.put("Raja", 3000);
		conce.put("Madhavi", 20000);
		conce.put("Latha", 3000);
		conce.put("Ravi", 30000);
		conce.put("Teja", 33000);
		conce.put("Santhosh", 10000);
		conce.put("Ramjeji", 40000);
				
		Iterator itr2 = conce.entrySet().iterator();
				
		while(itr2.hasNext()) {
			conce.put("STANNES",2004);
					System.out.println(itr2.next());
				}
	
		
		
}


}
