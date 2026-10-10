package Arrays;

public class FindLargestWithoutSort {

	public static void main(String[] args) {
		 int[] arr = {12, 45, 7, 23, 89, 34, 56};
		 
		 for(int i=0;i<arr.length;i++) {
			 for(int j=i+1;j<arr.length;j++) {
				 if(arr[i]>arr[j]) {
					 int temp=arr[i];
					 arr[i]=arr[j];
					 arr[j]=temp;
				 }
			 }
		 }
		 for(int num:arr) {
			 System.out.print(num +" ");
		 }
		 
		 System.out.println("");
		 System.out.println(arr[arr.length-4]);

	}

}
