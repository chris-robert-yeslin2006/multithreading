//package basicthreadconcepts;
class deamonuserthreads{
    public static void main(String[] args){
        Thread daemon = new Thread(() -> {
            for (int i = 1; i <= 10000; i++) {
                System.out.println("Daemon: " + i);
                try { Thread.sleep(300); } catch (Exception e) {}
            }
        });
        Thread user = new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println("user: " + i);
                try { Thread.sleep(1000); } catch (Exception e) {}
            }
        });

        daemon.setDaemon(true);
        daemon.start();
        user.start();
        System.out.println("Main thread ");

    }

}