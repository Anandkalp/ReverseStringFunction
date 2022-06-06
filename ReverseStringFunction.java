public class ReverseStringFunction
{
public static void main(String args[])
	{
		String s1="Indian Anand";
		s1=s1.toUpperCase();
		char chars[]=s1.toCharArray();
		for(int i=chars.length-1; i>=0; i--)
		{
			System.out.print(chars[i]);
		}
	}
}