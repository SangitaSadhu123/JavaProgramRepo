import java.util.HashMap;
import java.util.Map;

public class IntegerCount {

	public static void main(String[] args) {
		
		int[] arr= {1,4,1,2,2,3};
		
		// converting integer array into String format:
		
		String st[]=new String[arr.length];
		
		for(int i=0;i<arr.length;i++)
		{
			st[i]=String.valueOf(arr[i]); //converting integer to String
	     }
		
			HashMap<String, Integer> hm=new HashMap<String, Integer>();
			
			
			for(String duplicate:st)
			{
				Integer j=hm.get(duplicate);
				hm.put(duplicate, (j==null)?1:j+1);
			}
			for(Map.Entry<String,Integer> map:hm.entrySet()) {
				/*System.out.println(map.getKey()+"------>"+map.getValue());
				1------>2
				2------>2
				4------>1*/
				
				int count=map.getValue();
				/*if(count>1)
				{
					System.out.println(map.getKey()+"------>"+count);
					break;
				} 1------>2 */
				
				
				/*if(count==1)
					System.out.println(map.getKey()+"------>"+count);
				3------>1
				4------>1*/
				if(count==1)
				{
				System.out.println(map.getKey()+"------>"+count);
				break;
				}  //3------>1
		}

	}

}
