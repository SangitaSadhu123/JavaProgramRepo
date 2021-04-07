import java.io.IOException;
import java.util.ArrayList;

public class TestSample {

	public static void main(String[] args) throws IOException {
	DataDriven d=new DataDriven();
	ArrayList finaldata=d.getdata("login");
	System.out.println(finaldata);
	}

}
