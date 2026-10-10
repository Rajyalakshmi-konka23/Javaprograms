package Numbers;

public class Armstrong {

	public static void main(String[] args) {
		int num=123;
		int sum=0;
		int temp=num;
		while(num!=0) {
			int r= num%10;
			sum=sum+(r*r*r);
			num=num/10;
			
		}
		if(temp==sum) {
			System.out.println(temp + "Given num is Armstrong");
		}
		else {
			System.out.println(temp+"Given num is not armstrong");
		}

	}

}
