package demopack;

import java.util.HashMap;
import java.util.Map;

public class SortMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			HashMap<String, Integer>map=new HashMap<>();
			map.put("java", 90);
			map.put("python", 80);
			map.put("selenium", 70);
	map.entrySet().stream()
	.sorted(Map.Entry.comparingByValue())
	.forEach(System.out::println);

	}
}
