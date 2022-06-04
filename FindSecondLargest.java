package week3.day2;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {
		int[] data = {3,2,11,4,6,7};
		Arrays.sort(data);
		int k=data.length;
		for(int i=0; i<data.length;i++)
		{
			if(data[i]==data[k-2]) {
				System.out.println("2nd largest element: "+ data[i]);
			}
		}
	}
}
