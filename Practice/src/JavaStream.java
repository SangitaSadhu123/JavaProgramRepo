import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.*;

public class JavaStream {

	public static void main(String[] args) {
		//Stream.of(3,4,3,1,1,2,5).distinct().sorted().forEach(s->System.out.println(s)); // get unique or duplicate result 
		//Stream.of(3,4,3,1,1,2,5).distinct().sorted(Comparator.reverseOrder()).forEach(s->System.out.println(s)); //get unique or duplicate result in desending order
	
		Stream.of("java","java","session").distinct().sorted().forEach(s->System.out.println(s));
		List<String> ls=Stream.of("java","java","session").distinct().sorted().collect(Collectors.toList());
		System.out.println(ls);
	
	
	}

}
