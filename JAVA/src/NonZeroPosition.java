
public class NonZeroPosition {

	public static void main(String[] args) {
		int[] arr={1,0,5,0,2,3,0,8};
		int temp;
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] != 0)
			{ 
				temp = arr[count]; 
				arr[count] = arr[i]; 
				arr[i] = temp;
				count = count + 1; 
		     }
		}
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		
		

	}

}
