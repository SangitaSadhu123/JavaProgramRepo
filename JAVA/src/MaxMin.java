
public class MaxMin {
	
		
		public static void main(String args[]){
		    int arr[] = {10, 11,3,120};
		    
		    int max=arr[0], min=arr[0];
		    
		    for(int i=0;i<arr.length;i++)
		    {
		    	if(arr[i]>max)
		    		max=arr[i]; 
		    	
		    	if(arr[i]<min)
		    		min=arr[i];
		    	
		   }
		    System.out.println(max);
		    System.out.println(min);
		 
		    
		}
	}


