import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Wheels
{
	

}
public class Bus implements Serializable{
	Wheels wl=new Wheels();
	public static void main(String[] args)
	{
		Bus b=new Bus();
		try {
			FileOutputStream fos=new FileOutputStream("aaa.txt");
			
			ObjectOutputStream os = new ObjectOutputStream(fos);
			os.writeObject(b);
			os.close();
			
			
			
		}
		catch(Exception e)
		{
			System.out.println("exception");
		}
		
		
	}
	
	
}
