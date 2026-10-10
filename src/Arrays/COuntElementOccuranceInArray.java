package Arrays;
import java.util.*;

public class COuntElementOccuranceInArray {

	public static void main(String[] args) {
		int[] num= {10,20,30,40,30,30,20,10};
		Map<Integer,Integer> map=new HashMap<>();
		
		for(int i=0;i<num.length;i++) {
			int n=num[i];
			map.put(n, map.getOrDefault(n, 0)+1);
		}
		for(Map.Entry<Integer,Integer>entry:map.entrySet()) {
			System.out.print(entry.getKey() +":"+entry.getValue() +" ");
		}

	}

}
