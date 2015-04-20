package in.umlaut.sicp.utils


/**
 * Created by gagan.mishra on 20/04/15.
 */
object SicpMathUtils {

  /**
   * square an integer
   */
  def square(i:Integer) = i * i

  /**
   * square any number
   */
  def square(x:Float) = x * x

  /**
   * max of a 2 numbers
   */
  def max(a:Int, b:Int) = if(a > b) a else b

  /**
   * Sum of squares
   */
  def sumOfSquares(a: Int, b:Int) = square(a) + square(b)
}
