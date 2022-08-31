import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MaxBySalary {

	public static void main(String[] args) {
		List<Employee> empList = Stream.of( 
				new Employee(1,"Jagan",99000,"DEV"),
				new Employee(1,"Mohan",93000,"DEV"),
				new Employee(1,"Kamakshi",88000,"TEST"),
				new Employee(1,"Mani",78000,"DEVOPS"),
				new Employee(1,"Kumar",66000,"TEST"),
				new Employee(1,"Tharun",33000,"TEST"),
				new Employee(1,"Farooq",27000,"DEVOPS")
				).collect(Collectors.toList());
		
		
		
		Comparator<Employee> salComparator = Comparator.comparingLong(Employee::getSalary);
		
		Map<String, Optional<Employee>> map =empList.stream().collect(Collectors.groupingBy(Employee::getDept,Collectors.reducing(BinaryOperator.maxBy(salComparator))));
		
		/*for(Map.Entry<String, Optional<Employee>> e: map.entrySet()) {
			System.out.println(e.getKey()+"----"+e.getValue());
		}*/
		System.out.println(map);
		
	}

}
