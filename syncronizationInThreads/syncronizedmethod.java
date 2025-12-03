class syncronizedmethod{
    private static int counter1;
    private static int counter2;
    public static void main(String[] args) {
        Thread one  = new Thread(() -> {
            for (int i = 1; i <= 1000; i++) {
                increment1();
            }
        });
        Thread two = new Thread(() -> {
            for (int i = 1; i <= 1000; i++) {
                increment2();
            }
        });
        one.start();
        two.start();
        try{
            one.join();
            two.join();
        }catch (InterruptedException e){
            throw new RuntimeException();
        }

        System.out.println(counter1+" "+counter2);
    }
    public synchronized   static  void increment1(){
        counter1++;
    }
    public synchronized   static  void increment2(){
        counter2++;
    }
}