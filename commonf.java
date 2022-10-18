import java.util.*;
import java.util.Scanner;

public class ArrayException
{
	public String getPriceDetails()
	{
		Scanner s=new Scanner(System.in);
     	  	try{
		System.out.println("Enter the number of elements i");
		int i=s.nextInt();
		int[] a= new int[i];
		System.out.println("Enter the price details");
		for(int j=0;j<i;j++)
		{
			a[j]=s.nextInt();
		}
		System.out.println("Enter the index of the array e");
		
		
			int n=s.nextInt(); 
			return("The The array element is "+a[n]);
		
		}catch(InputMismatchException e){
			return("Input was not in the correct format");
		}
	}
	public static void main(String args[])
	{
		ArrayException obj=new ArrayException();
		System.out.println(obj.getPriceDetails());
	}
}
