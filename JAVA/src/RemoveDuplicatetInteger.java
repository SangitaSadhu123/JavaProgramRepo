import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.stream.Stream;

public class RemoveDuplicatetInteger {

	public static void main(String[] args) {
		int[] arr= {4,1,3,4,1,2,7,8,6,8,6};
		//Stream.of(4,1,3,4,1,2,7,8,6,8,6).distinct().sorted().forEach(s->System.out.println(s));
		
		LinkedHashSet<Integer> set=new LinkedHashSet<Integer>();
		for(int i=0;i<arr.length;i++)
		{
			set.add(arr[i]);
			
		}
		System.out.println(set);
		for(Integer s:set)
		{
			System.out.println(s);
			
			
		}		
		
	}

}
