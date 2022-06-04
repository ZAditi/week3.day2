package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class PrintOnlyUniqueCharacters {

	public static void main(String[] args) {
		//define input string
		String name="babu";
		//convert to char array
		char[] allChars = name.toCharArray();
		//Create set of Character
		Set<Character> unique= new LinkedHashSet<Character>();
		//Define loop for reading each character
		for(int i=0; i<allChars.length;i++) {
			if(unique.add(allChars[i])) {
				System.out.println(allChars[i]);
			}
		}

	}

}
