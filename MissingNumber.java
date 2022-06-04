package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class MissingNumber {

	public static void main(String[] args) {
		int[] numbers= {4,6,7,2,3,1,9,10,8,8,6,2};
		Set<Integer> unique = new LinkedHashSet<Integer>();
		for(int i=0; i<numbers.length;i++) {
			if(unique.add(numbers[i])) {

			}
		}
		List<Integer> list = new ArrayList<Integer>(unique);
		Collections.sort(list);
		System.out.println(list);
		int count=1;
		for(int j=0;j<list.size();j++) {
			if(list.contains(count)) {
				count=count+1;
			}
			else {
				System.out.println("Missing element:" + count);
				break;
			}
		} 
	}
}


