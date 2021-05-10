package Practice;
import java.util.*;
public class Loop18 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int rev=0;
		int ori=n;
		while(n > 0)   
		{  
		int r = n % 10;  
		rev =rev * 10 + r;  
		n = n/10;  
		}  
		if(rev==ori)
		System.out.println("Palindrome");
		else
		{
			System.out.println("Not a Palindrome");
		}
		sc.close();

	}

}
