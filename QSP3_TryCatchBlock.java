// here we going to caught previous code exception & make code to run as planned stop.
import java.util.Scanner;
public class QSP3_TryCatchBlock
{ 
    public static void main(String[] args)
    {
        Scanner s =new Scanner(System.in);
        System.out.print("Enter 1st number:- ");
        int n1 = s.nextInt();
        System.out.print("Enter 2nd number:- ");
        int n2 = s.nextInt();

        try
        {
            int res = n1/n2; // if we divide by zero it will throw error & it will create object of error type(Arith. Excep. which we solve in catch block)
            System.out.println(res); //
        }

        catch (ArithmeticException obj)
        {
            System.out.println("\nMay be you made an mistake error has occurred...");
            System.out.println("Don't divide by zero");
        }
        System.out.println("\n\t*-*-*-Execution completed-*-*-*");
    }
}
