import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class RemoveDuplicatFromString {

	public static void main(String[] args) {
		String str="Java Session Java";
		String[] splitWord=str.split(" ");
		
		//List<String> words=Arrays.asList(splitWord); // converting array to arrayList
		//words.stream().distinct().forEach(s->System.out.println(s));
		
		//HashSet<String> set=new HashSet<String>(Arrays.asList(splitWord)); // converting Array to List then converting List to set
		HashSet<String> set=new HashSet<String>();
		
		for(int i=0;i<splitWord.length;i++)
		{
			
			set.add(splitWord[i]);
		}
		
		System.out.println(set);
		for(String word:set)
		{
			
			System.out.println(word);
		}
		
	}

}
