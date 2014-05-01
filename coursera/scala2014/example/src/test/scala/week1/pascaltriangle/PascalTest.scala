package week1.pascaltriangle

import org.scalatest.{Matchers, FunSuite}
import Main._
import org.scalatest.prop.TableDrivenPropertyChecks._

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
class PascalTest extends FunSuite with Matchers {

  val pascalTrianglePositionValues = {
    Table (
      ("row", "column", "value"),
      (0,0,1) ,
      (1,0,1),
      (1,1,1),
      (2,0,1),
      (2,1,2),
      (2,2,1),
      (3,0,1),
      (3,1,3),
      (3,2,3),
      (3,3,1),
      (4,0,1),
      (4,1,4),
      (4,2,6),
      (4,3,4),
      (4,4,1)

    )
  }

  test("pascal triangle number at row and column") {
    forAll(pascalTrianglePositionValues) {(row, column, value) =>
      pascal(row, column) should be(value)
    }
  }

}

