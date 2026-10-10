package Arrays;

public class ExtractEvenAndOddNumbers {

	public static void main(String[] args) {
		int[] num= {10,20,11,23,45,80};
		
		int [] even;
		int[] odd;
		for(int i=0;i<num.length;i++) {
			int n=num[i];
			if(n%2==0) {
			System.out.print(n +"  ");
			}
		
		}
		System.out.println("");
		for(int i=0;i<num.length;i++) {
			int n=num[i];
			if(!(n%2==0)){
				System.out.print(n+"  ");
				
			}
		}

	}

}
