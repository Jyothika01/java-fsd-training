package milestone_1;

import java.util.HashMap;

public class Pgm35{
	public static void main(String[] args) {
    	HashMap<String, Integer> map = new HashMap<>();
        map.put("Apple", 10);
        map.put("Oranges", 20);
        map.put("Grapes", 30);
        for (String key: map.keySet()) {
    		System.out.println(key + "=" + map.get(key));
		}
  }
}