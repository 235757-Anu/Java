import java.util.Scanner;

public class Switch{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter any two positive integer numbers:");

        
        int p = in.nextInt();
        int q = in.nextInt();

        System.out.println("\nEnter one option to make calculation::");
        System.out.println("Option 1 :: To make sum");
        System.out.println("Option 2 :: To make subtraction");
        System.out.println("Option 3 :: To make multiplication");
        System.out.println("Option 4 :: To make division");
        System.out.println("Option 5 :: To make modulus\n");

        int c = in.nextInt();
        float Res = 0;

        switch(c) {
            
            case 1:
                Res = p + q;
                System.out.println("\nSUM         " + p + " + " + q + " = " + Res);
                break;

            
            case 2:
                Res = p - q;
                System.out.println("\nDIFFERENCE  " + p + " - " + q + " = " + Res);
                break;

            
            case 3:
                Res = p * q;
                System.out.println("\nPRODUCT     " + p + " * " + q + " = " + Res);
                break;

            
            case 4:
                Res = p / q;
                System.out.println("\nQUOTIENT    " + p + " / " + q + " = " + Res);
                break;

            
            case 5:
                Res = p % q;
                System.out.println("\nMODULUS     " + p + " % " + q + " = " + Res);
                break;

            default:
                System.out.println("\nYou choosed the wrong option!");
        }   
    }
}