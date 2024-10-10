//import java.util.Date
fun main(){
//    val size = readLine()!!.toInt()
//    val square = Array(size) { (it + 1)*(it + 1) } // 람다식 활용
//    for (value in square) {
//        println(value)
//    }
//
//    val operations = charArrayOf('+', '-', '*', '/', '%')
//    val squares = IntArray(10){ (it + 1)*(it + 1)}
    val squares = arrayOf(1, 4, 9, 16)
    squares.size
    squares.lastIndex
    squares[3]
    squares[1]
    squares[2] = 100
    squares[3] += 9
    squares[0]--
    val numbers = squares.copyOf()
    numbers[0] = 1000
    squares.copyOf(2)
    squares.copyOf(5)
    var a = arrayOf(1, 4, 9, 16)
//    a = arrayOf("one", "two")
    val b = intArrayOf(1, 2, 3) + 4
    val c = intArrayOf(1, 2, 3) + intArrayOf(5, 6)
    println(intArrayOf(1, 2, 3) == intArrayOf(1, 2, 3))
    println(intArrayOf(1, 2, 3).contentEquals(intArrayOf(1, 2, 3)))
}