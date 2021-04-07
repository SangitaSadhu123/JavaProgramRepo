import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseOfStringAndWords {

	public static void main(String[] args) {
		String str="My name is sangita";
		String[] splitString=str.split(" ");
		
		List<String> words=Arrays.asList(splitString); // converting 
		Collections.reverse(words); //interface 
		for(String reverseWord:words)
		{
			StringBuilder sb=new StringBuilder(reverseWord);
			
			System.out.print(sb.reverse()+" "); // output: atignas si eman yM
		}

	}

}
