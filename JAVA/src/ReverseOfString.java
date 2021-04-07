import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseOfString {

	public static void main(String[] args) {
		
		String str="My name is sangita";
		String[] splitString=str.split(" "); // split the string 
		
		List<String> words=Arrays.asList(splitString); // converting array to arrayList
		
		Collections.reverse(words); //interface is Collections 
		//System.out.println(words);
		for(String reverseWord:words)
		{
			//StringBuilder st=new StringBuilder(reverseWord);
			//System.out.print(st.reverse()+" ");
			System.out.print(reverseWord+" "); //output: sangita is name My
			
		}
	}

}
