import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n,i,j,c=1;
		System.out.println("Enter the Number:");
		n=s.nextInt();
		c=n-1;
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=c;j++)
			{
				System.out.print(" ");
			}
			c--;
			for(j=1;j<=2*i-1;j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}