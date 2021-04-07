
public class ReverseArrayInSubString {

	public static void main(String[] args) {
		
		int arr[]= {1,3,5,7,9,11,15,17,19};
		int k=3;
		int temp;
		for(int i=0;i<arr.length;i+=3)
		{
			int left=i;
			
			int right=i+k-1;
			while(left<right)
			{
				temp=arr[left];
				arr[left]=arr[right];
				arr[right]=temp;
				left=left+1;
				right=right-1;	
			}
				
		}
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		
		

	}

}
