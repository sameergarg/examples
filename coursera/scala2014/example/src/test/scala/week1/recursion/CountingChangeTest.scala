package week1.recursion

import org.scalatest.{Matchers, FunSuite}
import Main._
import org.scalatest.prop.TableDrivenPropertyChecks._
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

/**
 *             1
 *            1 1
 *           1 2 1
 *          1 3 3 1
 *         1 4 6 4 1
 * User: sameer
 * Date: 30/04/2014
 * Time: 20:52
 */
class CountingChangeTest extends FunSuite with Matchers {

  val countingChangeDataTable =
    Table (
      ( "amount", "listOfCoinsDenomination", "waysToMakeChange"),
      (0,List(),0),
      (1,List(1),1)
    )


  test("ways to make change for an amount ") {
    forAll(countingChangeDataTable) {(amount: Int, listOfCoinsDenomination: List[Int], waysToMakeChange: Int) =>
      countChange(amount, listOfCoinsDenomination) should be(waysToMakeChange)
    }
  }

}

