
public class Plaindrom {

	public static void main(String[] args) {
		//String str="MAN";
		int a=454;
		String str=String.valueOf(a);
		
		int flag=0;
		/*StringBuilder sb=new StringBuilder(str);
	if(sb.reverse().toString().equalsIgnoreCase(str))
	
		System.out.println("Palindrom");
	}*/
		for(int i=0,j=str.length()-1;j>i;i++,j--)
		{
			if(str.charAt(j)!=str.charAt(i))
			{
				flag=1;
				break;
			}
		}
		if(flag==0)
		{
			System.out.println("palindrom");
		}
		
		else
			System.out.println("non-palindrom");
		}

}
