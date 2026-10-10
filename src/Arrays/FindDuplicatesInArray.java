package Arrays;

public class FindDuplicatesInArray {

	public static void main(String[] args) {
		int [] num= {10,20,30,40,50,30,40,50,30,50};
		for(int i=0;i<num.length;i++) {
			
			for(int j=i+1; j<num.length;j++) {
				if(num[i]==num[j]) {
					
					System.out.println(num[i]);
					
				}
			}
		}

	}

}
