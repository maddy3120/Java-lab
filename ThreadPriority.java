import java.lang.*;
public class ThreadPriority extends Thread{
                public static void main(String args[]){
                        ThreadPriority th1=new ThreadPriority();
                        ThreadPriority th2=new ThreadPriority();
                        ThreadPriority th3=new ThreadPriority();
                        System.out.println("Priority of the thread th1 is:"+th1.getPriority());
                        System.out.println("Priority of the thread th2 is:"+th2.getPriority());
                        System.out.println("Priority of the thread th3 is:"+th3.getPriority());
                        th1.setPriority(6);
                        th2.setPriority(3);
                        th3.setPriority(9);
                        System.out.println("Priority of the thread th1 is:"+th1.getPriority());
                        System.out.println("Priority of the thread th2 is:"+th2.getPriority());
                        System.out.println("Priority of the thread th3 is:"+th3.getPriority());
                        System.out.println("Currently executing the thread:"+Thread.currentThread().getName());
                        System.out.println("Priority of the main thread is:"+Thread.currentThread().getPriority());
                        Thread.currentThread().setPriority(10);
                        System.out.println("Priority of the main thread is:"+Thread.currentThread().getPriority());
                }
}                
