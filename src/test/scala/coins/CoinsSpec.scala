package coins

import org.scalatest.{FlatSpec, Matchers}

/**
  * Created by salim on 8/4/2017.
  */
class CoinsSpec extends FlatSpec with Matchers {

  "Coins" should "know there is 0 ways of making 0 from any kind of coin" in {
    val coins = Set(1, 3, 5, 100)
    val value = 0
    val result = new Coins(coins).count(value)
    assert(result == 1)
  }

  it should "know that there is 1 way to make 1p from a 1p coin" in {
    val coins = Set(1)
    val value = 1
    val result = new Coins(coins).count(value)
    assert(result == 1)
  }

  it should "know that there is 1 way to make 1p from a 1p and a 9p coin coin" in {
    val coins = Set(1,9)
    val value = 1
    val result = new Coins(coins).count(value)
    assert(result == 1)
  }

  it should "know that there are 0 ways to make 1p from a 100p coin" in {
    val coins = Set(100)
    val value = 1
    val result = new Coins(coins).count(value)
    assert(result == 0)
  }

  it should "know that there is 1 way to make 2p from a 2p coin" in {
    val coins = Set(2)
    val value = 2
    val result = new Coins(coins).count(value)
    assert(result == 1)
  }

  it should "know that there are 2 ways to make 2p from a 2p and 1p coins" in {
    val coins = Set(1, 2)
    val value = 2
    val result = new Coins(coins).count(value)
    assert(result == 2)
  }

  it should "know that there are 2 ways to make 2p from a 5p, 2p and 1p coins" in {
    val coins = Set(1, 2, 5)
    val value = 2
    val result = new Coins(coins).count(value)
    assert(result == 2)
  }

  it should "know that there are one poind fom a bunch of coins" in {
    val coins = Set(1, 2, 5, 10, 20, 50, 100)
    val value = 100
    val result = new Coins(coins).count(value)
    assert(result == BigInt("119310010658418457688202"))
  }

//  it should "know that there are lots of ways of making ten pounds from all the coins" in {
//    val coins = Set(200, 100, 50, 20, 10, 5, 2, 1)
//    val value = 1000
//    val result = new Coins(coins).count(value)
//    assert(result == 55418612077363252135450753721944496173321565214699508234827006745445223712408956346614865857423894127271100610997980452947053993627268703441379461567142184236102511231841364757757664289668758857127110710035809558659750254072927519726)
//  }

}
