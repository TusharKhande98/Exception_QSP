public class QSP5_FinallyBlock
{
    public static void main(String[] args)
    {
        try
        {
            int res = 30/0;
        }
        catch (ClassCastException cce)
        { // its not a type of error that is going to get, so it will not catch by this block
            System.out.println("Don't divide by zero");
        }

        finally
        {
            System.out.println("\nEXECUTION COMPLETED\nFinally block will execute any way... then error will displayed");
        }
    }
}
