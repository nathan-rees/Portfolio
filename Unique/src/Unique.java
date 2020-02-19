import java.util.Arrays;
import java.util.stream.Collectors;

public class Unique {
public static void main(String[] args) {
	System.out.println(uniqueLetters("hello"));
}
public static String uniqueLetters(String sentence)
{
	return(Arrays.asList(sentence.split("")).stream().distinct().collect(Collectors.joining("")));
}
}
