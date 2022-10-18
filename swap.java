import java.util.*;
public class swap
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Before Swapping");
		int a=s.nextInt();
		int b=s.nextInt();
		System.out.println("A = "+a+" B = "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swapping");
		System.out.println("A = "+a+" B = "+b);
	}
}