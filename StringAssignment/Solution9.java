package StringAssignment;
import java.util.*;
public class Solution9 {
	static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		String s2="",s=sc.nextLine(),s1=sc.nextLine();
		s=s.toLowerCase();
		s1=s1.toLowerCase();
		int i,c=0,j;
		for(i=97;i<123;i++)
		{
			char ch=(char)i;
			c=0;
			for(j=0;j<s.length();j++)
			{
				if(s.charAt(j)==ch)
				{
					c++;
				}
			}
			for(j=0;j<s1.length();j++)
			{
				if(s1.charAt(j)==ch)
				{
					c++;
				}
			}
			if(c>=2)
				s2=s2+ch+' ';
		
			}
System.out.println(s2);		
sc.close();
	}
}
