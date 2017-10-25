import static org.junit.Assert.*;
import org.junit.*;

import exercise_3.Sequencer;

public class SequenceTest {
  @Test
  public void triangleOne() {
    int result = Sequencer.triangle(1);
    assertEquals(1, result);
  }

  @Test
  public void triangleZero() {
    int result = Sequencer.triangle(0);
    assertEquals(0, result);
  }

  @Test
  public void triangleThree() {
    int result = Sequencer.triangle(3);
    assertEquals(6, result);
  }

  @Test
  public void lazyCatererOne() {
    int result = Sequencer.lazyCaterer(1);
    assertEquals(2, result);
  }

  @Test
  public void lazyCatererZero() {
    int result = Sequencer.lazyCaterer(0);
    assertEquals(1, result);
  }

  @Test
  public void lazyCatererThree() {
    int result = Sequencer.lazyCaterer(3);
    assertEquals(7, result);
  }
}
