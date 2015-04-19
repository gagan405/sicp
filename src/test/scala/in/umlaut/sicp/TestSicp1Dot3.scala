package in.umlaut.sicp

import org.junit.Test
import org.junit.Assert._

/**
 * Created by gagan.mishra on 20/04/15.
 */
class TestSicp1Dot3 {

  @Test
  def verify1Dot3: Unit ={
    val x = Sicp1Dot3.squareAndSumLargest2(4,5,6)
    assertEquals(61, x)
  }


}
