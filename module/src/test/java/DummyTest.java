import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class DummyTest {

   @Test
   void shouldCheck1() {
      assertTrue(true);
   }
   @Test
   void shouldCheck2() {
      assertTrue(true);
   }

   @Test
   void shouldCheck3() {
      assertFalse(false);
   }
}
