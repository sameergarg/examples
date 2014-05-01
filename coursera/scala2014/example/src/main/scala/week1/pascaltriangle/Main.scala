package week1.pascaltriangle

object Main extends App {


    def pascal(row: Int, col: Int) : Int =  (row, col) match {

      case (row, col) if(col== 0 || col == row) => 1

      case _ => pascal(row-1,col-1) + pascal(row-1, col)

    }

    println(pascal(0,0))

}
