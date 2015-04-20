package in.umlaut.sicp

import in.umlaut.sicp.utils.SicpMathUtils

import scala.math.pow
/**
 * Created by gagan.mishra on 21/04/15.
 */
/**
 * Cube root by Newton's method
 */
object Sicp1Dot8 {
  def cubeRoot(x:Float, approx: Float, error: Float ):Float =
    if(isGoodEnough(x, approx, error)) approx
    else cubeRoot(x, nextGuess(x, approx), error)

  def isGoodEnough(x: Float, guess: Float, error: Float) = math.abs(pow(guess, 3) - x) < error

  def nextGuess(x: Float, guess: Float) = ((x/SicpMathUtils.square(guess) + 2 * guess) / 3)
}
