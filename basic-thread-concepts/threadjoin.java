class threadjoin {
    public static void main(String[] args){
        Thread t1=new Thread(){
            public void run(){
                for(int i=0;i<10;i++){
                    System.out.println("from thread 1:"+i);
                }
            }
        };
        t1.start();
        try {
            t1.join();   // Wait for t1 to finish
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("from main thread");
    }
}