import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main ( String[] args ) {
        ThreadGroup mainGroup = new ThreadGroup( "group one" );
        for (int i = 1; i < 5; i++) {
            new MyThread( "flow :" + i, mainGroup ).start();
        }


        try {
            TimeUnit.SECONDS.sleep( 10 );
            System.out.println( "I complete all streams:" );
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        mainGroup.interrupt();

    }
}
