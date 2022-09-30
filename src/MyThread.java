public class MyThread {

    public static void main(String[] args) {

        Ticket ticket = new Ticket();

        Thread thread1 = new Thread(()->{
            for (int i = 0; i < 30; i++) {
                ticket.sell();
            } }, "A");

        thread1.start();
        Thread thread2 = new Thread(()->{
            for (int i = 0; i < 30; i++) {
                ticket.sell();
            } }, "B");
        thread2.start();

    }

}

class Ticket {

    private Integer num = 20 ;

    private Object obj = new Object();

    public void sell() {

        // why shouldn't I use "num" as a monitor object ?
        // I thought "num" is unique among two threads.
        synchronized ( num ) { 

            if (this.num >= 0) {
                System.out.println(Thread.currentThread().getName() + " sells " + this.num + "th ticket");
                this.num--;
            }
        }
    }
}