package pc;

import org.cooperari.CSystem;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import static org.junit.Assert.assertTrue;

import org.cooperari.config.CScheduling;
import org.cooperari.config.CMaxTrials;
import org.cooperari.CSystem;
import org.cooperari.core.scheduling.CProgramStateFactory;
import org.cooperari.core.scheduling.CSchedulerFactory;
import java.util.Arrays;
import static org.junit.Assert.*;

@CMaxTrials(100)
@CScheduling(schedulerFactory=CSchedulerFactory.OBLITUS, stateFactory=CProgramStateFactory.RAW)
public class Ex2Test {

  public static void main(String[] args) {
     AtomicInteger v = new AtomicInteger();
     boolean[] b = new boolean[4];

     CSystem.forkAndJoin(
       () -> v.set(0),
       () -> v.set(1)
     );

     // TODO Complete
  }
}
