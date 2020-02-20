package fizzbuzz;

public class FizzBuzzPop {
	public static void main(String[] args) {
		fizzBuzzPop(5);
	}
	public static String fizzBuzzPop(int n)
	{
		String s="";
		if(n%3==0) {
			s+="fizz";
		}
		if(n%5==0) {
			s+="buzz";
		}
		if(n%7==0) {
			s+="pop";
		}
		if(s.equals("")) {
			s=String.valueOf(n);
		}
		return s;
		
	}

}
