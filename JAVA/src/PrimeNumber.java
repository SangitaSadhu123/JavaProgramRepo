
public class PrimeNumber {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6,7};
		int fg=0;
		
		
		for(int i=0; i<a.length; i++)
		{
			fg=0;
	        
			//for(int j=2;j<=(int)Math.sqrt(a[i]);j++)
			
			for(int j=2;j<=a[i]/2;j++)
			{
				if(a[i]%j==0)
				{
					fg=1;
					break;
					
				}
			}
				if(fg==0 && a[i]!=1)
					System.out.println(a[i]);	
			
		}
	}
}


