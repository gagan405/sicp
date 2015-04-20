package in.umlaut.sicp

import org.junit.Test
import org.junit.Assert._

/**
 * Created by gagan.mishra on 20/04/15.
 */
class TestSicp {

  @Test
  def verify1Dot3: Unit ={
    val x = Sicp1Dot3.squareAndSumLargest2(4,5,6)
    assertEquals(61, x)
  }

  @Test
  def verify1Dot8:Unit = {
    val x = Sicp1Dot8.cubeRoot(45.5f, 4.5f, 0.0001f)
    assertTrue(math.abs(math.pow(x, 3) - 45.5) < 0.0001)
  }


}
