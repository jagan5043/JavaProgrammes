import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Sample {

	public static void main(String[] args) {
		List<String> arr = Arrays.asList("jagan","mohan","2","3");
		
		Predicate<String> b = s->s.length()>4;
		
		int a =arr.stream().filter(b).mapToInt(x->x.length()).sum();
		System.out.println(a);
		/*System.out.println(filter);
		int count =0;
		for(String s:filter) {
			count+=s.length();
		}
		System.out.println(count);*/
		
		

	}

}
