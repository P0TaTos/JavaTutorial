public class TestThread extends Thread {

    private static final int loop = 10;
    //자바에는 const가 없다

    public void run()
    {
        loopNumber();
        super.run();
    }

    public void loopNumber()
    {
        for(int i=0; i<loop; i++) {
            System.out.println("ThreadLoop : " + i);
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
}

