 class GrdandFather 
{
	
public  void swimmer()
	{
		System.out.println("Father is good swimmer");
	}

}
class Son extends GrdandFather
{
	public  void swimmer()
	{
		System.out.println("Son is good swimmer");
	}
}





public class MethodOverride {

	public static void main(String[] args) {
		Son s=new Son();
		s.swimmer();

	}


}
