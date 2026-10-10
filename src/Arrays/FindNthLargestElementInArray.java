package Arrays;
import java.util.*;

public class FindNthLargestElementInArray {

	public static void main(String[] args) {
		 int[] arr = {12, 45, 7, 23, 89, 34, 56};

	        int n = 4;

	        Arrays.sort(arr);

	        System.out.println(n + "th Largest Element: " + arr[arr.length - n]);

	}

}
