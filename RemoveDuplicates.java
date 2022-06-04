package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week";
		Set<String> unique = new LinkedHashSet<String>();
		String[] arr = text.split(" ");
		for(int i=0; i<arr.length;i++) {
			unique.add(arr[i]);
			System.out.println(arr[i]);
		}

		System.out.println(unique);
	}


}

