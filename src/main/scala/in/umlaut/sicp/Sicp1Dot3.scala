package in.umlaut.sicp

import in.umlaut.sicp.utils.SicpMathUtils

/**
 * Created by gagan.mishra on 20/04/15.
 */
/**
 * SICP 1.3 Takes three integers and returns sum of squares of the larger two
 */
object Sicp1Dot3 {
  def squareAndSumLargest2(x: Int, y:Int, z:Int)=
    SicpMathUtils.sumOfSquares(SicpMathUtils.max(x, y), SicpMathUtils.max(z, y))
}
