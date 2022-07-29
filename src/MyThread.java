import java.util.concurrent.TimeUnit;

public class MyThread extends Thread {

    public MyThread ( String name, ThreadGroup group ) {
        super( group, name );
    }

    @Override
    public void run () {
        try {
            while (!isInterrupted()) {

                Thread.sleep( 2500 );
                System.out.println( "Hello! I " + Thread.currentThread().getName() );

            }
        } catch (InterruptedException err) {

        } finally {

            System.out.printf( "%s completed\n", getName() );
        }
    }

}