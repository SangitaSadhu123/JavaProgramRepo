import java.util.HashMap;
import java.util.Map;

public class MapNullKey {

	public static void main(String[] args) {
		Map<String,String> map = new HashMap<>();
		
		
		
		  //map.put("Football", "A");
		  map.put("Squash", "A");
		  map.put("cricket", "B");
	      map.put("Football", "C");
	      map.put("Football", "M");
	      System.out.println(map);
	     /* map.put("Football", "A");
	      map.put("Squash", "B");
	      map.put("Cricket", "C");
	      map.put("Hockey", "D");
	      map.put("Rugby", "E");
	      map.put("Golf", "F");
	      map.put("Archery", "G");
	      map.put("Archery", "L");
	      System.out.println("Size of HashMap = " + map.size());
	      map.put(null, "H"); // null is key
	      String newvalue=((Map<String, String>) map).put("Golf", "Z");
	      System.out.println("Golf  :" +newvalue);  // put method will overrride the old value eventhouh if we are inserting new value with existing keys
	      System.out.println("Updated Size of HashMap = " + map.size());
	      System.out.println("For null = " + map.get(null)); // map can store one null key and can store multiple null value
	      System.out.println("For Golf = " + map.get("Golf"));*/
	}

}
