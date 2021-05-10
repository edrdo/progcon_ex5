package pc;

import org.cooperari.config.CScheduling;
import org.cooperari.config.CMaxTrials;
import org.cooperari.CSystem;
import org.cooperari.core.scheduling.CProgramStateFactory;
import org.cooperari.core.scheduling.CSchedulerFactory;
import java.util.Arrays;
import static org.junit.Assert.*;

@CMaxTrials(100)
@CScheduling(schedulerFactory=CSchedulerFactory.OBLITUS, stateFactory=CProgramStateFactory.RAW)
public class Ex1Test {

  public static void main(String[] args) {
     Register<Integer> r = new Register<>(0);
     Stack<Integer> s = new Stack<>();
     Integer[] x = new Integer[3];

     CSystem.forkAndJoin(
       () -> r.write(1),
       () -> r.write(0)
     );
     CSystem.forkAndJoin(
       () -> s.push(2),
       () -> x[0] = r.read()
     );
     CSystem.forkAndJoin(
       () -> x[1] = s.pop(), 
       () -> s.push(x[0]),
       () -> { x[2] = s.size(); r.write(x[2]); }
     );

     System.out.println("--- results ---");
     System.out.printf("r = %s%n", r.read());
     System.out.printf("s.size() = %d%n", s.size());
     System.out.printf("x = %s%n", Arrays.toString(x));

     assertTrue(r.read() >= 0 && r.read() <= 2);
     assertTrue(s.size() == 1);
 
     /* TODO: Descomente e complete
     assertTrue(
       (x[0] == 0 && x[1] == 0 && x[2] == 1)
     ||
       (x[0] == 0 && x[1] == 0 && x[2] == 2)
     || 
        ... outras possibilidades ...
     );
     */

  }
}
