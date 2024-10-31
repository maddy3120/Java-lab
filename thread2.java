class odd extends Thread{
        public void run(){
                for(int i=1;i<=100;i++){
                        if(i%2!=0){
                                System.out.println(i);
                        }
                }
        }
}
class even extends Thread{
        public void run(){
                for(int i=1;i<=100;i++){
                        if(i%2==0){
                                System.out.println(i);
                        }
                }
        }
}
class thread2{
        public static void main(String args[]){
                odd t1=new odd();
                even t2=new even();
                t1.start();
                t2.start();
        }
}               
