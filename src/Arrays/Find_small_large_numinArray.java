package Arrays;

public class Find_small_large_numinArray {

	public static void main(String[] args) {
		int []num= {50,20,30,40,50};
		int small= num[0];
		int large = num[0];
		
		for(int i=0; i<num.length; i++) {
			if(num[i]>large) {
				large=num[i];
			}
			else if(num[i]<small){
				small=num[i];
			}
		}
		System.out.println(small);
		System.out.println(large);

	}

}
