package Arrays;
import java.util.*;

public class FindSecondSmallestElementInArray {

	public static void main(String[] args) {
		 int[] arr = {12, 45, 7, 23, 89, 34, 56};
		 
		 Arrays.sort(arr);
		 for(int num:arr) {
			 System.out.print(num +" ");
		 }
		 System.out.println("");
		 System.out.println(arr[2-1]);

	}

}
