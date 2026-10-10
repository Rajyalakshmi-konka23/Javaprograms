package Arrays;
import java.util.Arrays;
public class CheckEqualityOfTwoArrays {

	public static void main(String[] args) {
		int[] arr1= {10,20,30,40,60,70};
		int [] arr2= {10,20,30,50};
		//System.out.println(Arrays.equals(arr1,arr2));
		
		boolean status=true;
		
		if(arr1.length!=arr2.length) {
			status =false;
		}
		else {
		for(int i=0;i<arr1.length;i++) {
			if(arr1[i]!=arr2[i]) {
				status=false;
			}
		}
		}
		
		if(status==true) {
			System.out.println("Arrays are equal");
		}
		else {
			System.out.println("Arrays are not equal");
		}

	}

}
