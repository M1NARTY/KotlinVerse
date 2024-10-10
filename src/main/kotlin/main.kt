//import java.util.Date
fun main(){
    val size = readLine()!!.toInt()
    val square = Array(size) { (it + 1)*(it + 1) } // 람다식 활용
    for (value in square) {
        println(value)
    }

    val operations = charArrayOf('+', '-', '*', '/', '%')
    val squares = IntArray(10){ (it + 1)*(it + 1)}
}