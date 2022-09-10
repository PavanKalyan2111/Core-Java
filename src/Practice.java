public class Practice {
    public static void main(String[] args) {
        Thread t1 = new Thread( () -> { for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            }
            catch (Exception e){
                System.out.println(e);
            }
            System.out.println("Hello");
        } } );

        Thread t2 = new Thread( () -> {
            for (int i = 0; i < 5; i++) {
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    System.out.println(e);
                }
                System.out.println("Hi");
            }
        });
        t1.start();
        try {
            Thread.sleep(10);
        }
        catch (Exception e){}
        t2.start();

    }
}
