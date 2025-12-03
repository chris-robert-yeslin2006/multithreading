package thread_implementation;

class ExtendsThread{
    public static void main(String[] args){
        Thread t1=new Thread1();
        Thread t2=new Thread2();
        t1.start();
        t2.start();


    }
}
class Thread1 extends Thread{
    @Override
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("from thread 1:"+i);
        }
    }
}
class Thread2 extends Thread{
    @Override
    public void run(){
        for(int i=0;i<20;i++){
            System.out.println("from thread 2:"+i);
        }
    }
}