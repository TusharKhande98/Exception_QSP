public class QSP6_ExceptionObjectPropogation
{
    public static void div(int a, int b)
    {
        int res = a/b;
        System.out.println(res);
    }

    public static void main(String[] args)
    {
        try
        {
            div(10,0);
        }

        catch (ArithmeticException ae)
        {
            System.out.println("Don't divide by zero");
        }
    }
}