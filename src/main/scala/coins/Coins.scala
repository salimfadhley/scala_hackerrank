package coins

import scalaz.Memo

/**
  * Created by salim on 8/4/2017.
  */
class Coins(coins:Set[Int]) {


  def count(value: Int):BigInt = {
    value match {
      case 0 => 1
      case n => {
        val validCoins = coins.filter((i: Int) => i <= n)
        val counts = validCoins.toList.map((i: Int) => countm(n - i))
        counts.sum
      }
    }
  }

  val countm: Int => BigInt = Memo.mutableHashMapMemo {
    case n => count(n)
  }


}
