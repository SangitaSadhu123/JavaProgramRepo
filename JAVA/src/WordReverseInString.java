import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class WordReverseInString {

	public static void main(String[] args) {
		String str="My name is sangita";
		String[] splitString=str.split(" "); // split the string 
		
		List<String> words=Arrays.asList(splitString); // converting array to arrayList
		
		//Collections.reverse(words); //interface is Collections 
		
		for(String reverseWord:words)
		{
			StringBuilder sb=new StringBuilder(reverseWord);
			System.out.print(sb.reverse()+" ");  // output: yM eman si atignas
			//System.out.print(reverseWord+" "); 
			
		}
	}

}
