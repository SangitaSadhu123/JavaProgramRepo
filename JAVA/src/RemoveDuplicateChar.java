import java.awt.List;
import java.util.*;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateChar {

	public static void main(String[] args) {
		String str="Sangita";
		char[] ch=str.toCharArray();
		
		
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();// order of insertion will be same
		
		for(int i=0;i<ch.length;i++)
		{
			set.add(ch[i]);
			
		}
		System.out.println(set);
		
		for(Character s:set)
		{
		System.out.println(s);

	}
	}

}
