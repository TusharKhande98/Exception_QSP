public class QSP1_CheckedException
{
    // by using 'throws' keyword we caught exception here only which is going to occur at last, so we won't get RTE
    public static void main(String[] args) throws InterruptedException
    {
        for (int i=0; i<5; i++)
        {
            System.out.println("Hello");
            Thread.sleep(2000);
        }
        System.out.println("Code Terminated");


    }
}
