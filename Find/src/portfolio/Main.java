package portfolio;

public class Main {
public static void main(String[] args) 
{
	find("hello",1,'e');
}
public static boolean find(String a, int b,char c)
{
	char[] aa=a.toCharArray();
	return(aa[b]==c);
}
}

