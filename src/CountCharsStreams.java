import java.util.*;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountCharsStreams {

	public static void main(String[] args) {
		String str ="jagan mohan mylapuru";
		
		Map<String, Long> map=Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(map);
		
		
		System.out.println(str.chars().filter(c->c=='a').count());

	}

}
