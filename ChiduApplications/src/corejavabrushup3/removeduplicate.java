package corejavabrushup3;

import java.util.LinkedHashSet;

public class removeduplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String str ="India greenland";
			LinkedHashSet<Character>set =new LinkedHashSet<>();
			for (char c : str.toCharArray()) {
				set.add(c);
			}
			for(char c :set) {
				System.out.println(c);
			}
			
	}

}
