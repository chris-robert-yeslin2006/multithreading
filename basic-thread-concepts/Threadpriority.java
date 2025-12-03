class Threadpriority{
    public static void main(String[] args){
        Thread one=new Thread(){
            public void run(){
                System.out.println("hi:");
                System.out.println("thread one name:"+Thread.currentThread().getName());
            }
        };
        one.start();
        one.setPriority(Thread.MIN_PRIORITY);
        System.out.println("one priority:"+one.getPriority());
        System.out.println("main:"+Thread.currentThread().getName());
        System.out.println("main priority:"+Thread.currentThread().getPriority());
    }
}