package Numbers;

public class Find_Evensum_oddsum {

	public static void main(String[] args) {
		int num=123456789;
		int evenSum=0;
		int oddSum=0;
		while(num!=0) {
			int r=num%10;
			if(r%2==0) {
				evenSum=evenSum+r;			}
			else {
				oddSum=oddSum+r;
			}
			num=num/10;
		}
		System.out.println("Sumof even digits:" +evenSum);
		System.out.println("Sumof odee digits:" +oddSum);

	}

}
