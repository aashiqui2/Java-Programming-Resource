public class Test3 {
    public static void main(String[] args) {
        //! anonymous class--without lambda
        Thread t=new Thread(
            new Runnable()
            {
                public void run()
                {
                    for(int i=1;i<=5;i++)
                    {
                        System.out.println("Child thread "+ i);
                    }
                }
            }
        );
        t.start();
    }
}
