class nonSyncThread {
    private static  int counter;
    public static void main(String[] args) {

            Thread one  = new Thread(() -> {
                for (int i = 1; i <= 1000; i++) {
                    counter++;
                }
            });
            Thread two = new Thread(() -> {
                for (int i = 1; i <= 1000; i++) {
                    counter++;
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

            System.out.println(counter);
    }
}