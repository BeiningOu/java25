package project25.advance;

/**
 * Author: Beining
 * Since: 5/27/25
 * Description: ...
 */
public class RunnablePractice implements Runnable {


    public static void main(String[] args) {
        Thread t2 = new Thread(new RunnablePractice());
        t2.start();
    }

    @Override
    public void run() {
        System.out.println("running");
    }


}
