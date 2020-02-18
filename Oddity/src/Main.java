
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		
		int asd[]= {1,5,10,7};
		List<Integer> as=oddify(asd);
		for(int a:as) {
			System.out.println(a);
		}
		
	}
	
	
	public static List<Integer> oddify(int[] nums)
	{
		
		List<Integer> numlist=new ArrayList<Integer>();
		for (int num:nums)
		{
			if(num%2!=0) {
				numlist.add(num);
			}
		}
		return numlist;
	}
}




