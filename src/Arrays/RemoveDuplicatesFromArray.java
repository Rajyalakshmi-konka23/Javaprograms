package Arrays;

public class RemoveDuplicatesFromArray {

	public static void main(String[] args) {
		int [] num = {10,20,20,30,40,50};
		for(int i=0;i<num.length;i++) {
			if(num[i]==-1) {
				continue; // skip already marked duplicates
			}
			for(int j=i+1;j<num.length;j++) {
				if(num[i]==num[j]) {
					num[j]=-1; //mark duplicate
				}
			}
			System.out.print(num[i] + " ");
		}

	}

}
