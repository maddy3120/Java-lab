class MyThread extends Thread {
    private String threadName;
    MyThread(String name) {
        this.threadName = name;
    }
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(threadName + ": " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println(threadName + " interrupted.");
            }
        }
    }
}

public class thread3{
    public static void main(String[] args) {
        MyThread thread1 = new MyThread("Thread 1");
        MyThread thread2 = new MyThread("Thread 2");
        thread1.setPriority(Thread.MIN_PRIORITY); 
        thread2.setPriority(Thread.MAX_PRIORITY); 
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        System.out.println("Main thread finished.");
    }
}
