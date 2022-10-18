import java.util.*;
import java.util.Scanner;

public class ArrayException
{
	public String getPriceDetails()
	{
		Scanner s=new Scanner(System.in);
     	  	try{
		System.out.println("Enter the number of elements");
		int i=s.nextInt();
		int[] a= new int[i];
		System.out.println("Enter the price details");
		for(int j=0;j<i;j++)
		{
			a[j]=s.nextInt();
		}
		
		System.out.println("Enter the index of the array");
		int n=s.nextInt(); 
			return("The array element is "+a[n]);
		}catch(ArrayIndexOutOfBoundsException e){
			return("Array index out of range");
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