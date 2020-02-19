
public class BorrowOrRob {
public static void main(String[] args) {
	System.out.println(palindrome("Borrow or Rob"));
	
}
public static boolean palindrome(String sentence)
{
	sentence=sentence.toLowerCase().replace(" ", "");//lower case and remove space
	StringBuilder s=new StringBuilder(sentence);//for reversing the 
	return(sentence.equalsIgnoreCase(s.reverse().toString()));
}
}
