import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Test {

	public static void main(String[] args) {
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
