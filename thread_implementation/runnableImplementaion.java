class runnableIplemenataion{
    public static void main(String[]args){
        Thread t1=new Thread(new threadOne());
        Thread t2=new Thread(new threadTwo());
        Thread t3=new Thread(()->{
                for(int i=0;i<15;i++){
                    System.out.println("from thread 3"+i);
                }
        });
        t1.start();
        t2.start();
        t3.start();
    }

}

class threadOne implements Runnable{
    @Override
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("from thread 1:"+i);
        }
    }
}
class threadTwo implements Runnable{
    @Override
    public void run(){
        for(int i=0;i<20;i++){
            System.out.println("from thread 2:"+i);
        }
    }
}