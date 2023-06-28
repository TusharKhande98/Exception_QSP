import java.util.InputMismatchException;
// import every error's parent class that is going to be occurred while doing code
// In IDE it will be add automatically, so please import it manually if it dosen't.
import java.util.Scanner;
public class QSP4_TryWithMultipleCatchBlock
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        try
        {
            int [] arr;
            System.out.print("Enter array size:- ");
            int size = s.nextInt();

            if (size>0)
            { // if user enter size >0
                arr = new int[size]; // that size of array will be created
                System.out.println("\tArray created");
            }
            else
            { // if value is not valid
                arr = null; // array is non-primitive DT(so its a object) then value will be set as null.
            }

            System.out.println("Enter element to the array");
            for (int i=0; i<arr.length; i++)
            {
                System.out.print("\tarr["+i+"]:- ");
                arr[i] = s.nextInt();
            }
            System.out.println("\tElement added");

            System.out.print("Enter index of divisor:- ");
            int numerator = s.nextInt();
            System.out.print("Enter index of dividend:- ");
            int den = s.nextInt();

            int result = arr[numerator]/arr[den];

            System.out.print("Result is:-" + result);
        }

        catch (NullPointerException npe)
        {
            System.out.println("Please enter size greater than zero");
        }
        catch (InputMismatchException ime)
        {
            System.out.println("Enter valid number");
        }
        catch (ArrayIndexOutOfBoundsException aiobe)
        {
            System.out.println("Give index greater than '-1' & less than inputted size of array");
        }
        catch (ArithmeticException ae)
        {
            System.out.println("Don't divide by zero");
        }
        catch (NegativeArraySizeException nase)
        {
            System.out.println("Array size must be greater than or equal to zero");
        }

        System.out.println("Execution completed...");
    }
}

