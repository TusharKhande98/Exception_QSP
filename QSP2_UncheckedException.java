import java.util.Scanner;
public class QSP2_UncheckedException
{
    public static void main(String[] args)
    {
        Scanner s =new Scanner(System.in);
        System.out.print("Enter 1st number:- ");
        int n1 = s.nextInt();
        System.out.print("Enter 2nd number:- ");
        int n2 = s.nextInt();

        int res = n1/n2; // n1=5, n2=0
        System.out.println(res); // we get Arithmatic Exception(error) here, exception didn't get caught in code so it stop unplanned


    }
}
