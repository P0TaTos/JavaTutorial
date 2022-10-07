public class Main {
    public static void main(String[] args) {
        TestThread testThread = new TestThread();
        Thread thread = new Thread(new UseRunnable());
        /*
         * Runnerble이라는 인터페이스는 run이라는 메소드밖에 없지만
         * 활용성이 좋아 많이 사용한다고 한다
         * Thread의 run과 같다
         */
        thread.start();
        testThread.start();

        for(int i=10; i>0; i--) {
            System.out.println("Main : " + i);
            try {
                Thread.sleep(1000);
                /*
                 * Java의 sleep는 Thread 안에 있다
                 * sleep 메소드 내부에선 반드시 IntterupedException이 발생하기때문에
                 * try, catch문을 사용해야한다
                 */
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}