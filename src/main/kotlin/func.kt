//import kotlin.math.PI
//
//fun circleArea(radius: Double): Double {
//    return PI*radius*radius
//}
//
//fun main() {
//    print("Enter radius: ")
//    val radius = readLine()!!.toDouble()
//    println("Circle area: ${circleArea(radius)}")
//}
// This function calculates the area of a circle given its radius. The main function takes user input for the radius and calls the circleArea function to calculate and print the area of the circle.

//fun increment(a: IntArray): Int {
//    return ++a[0]
//}
//
//fun main() {
//    val a = intArrayOf(1, 2, 3)
//    println(increment(a))
//    println(a.contentToString())
//}

//fun rectangleArea(width: Double, height: Double): Double {
//    return width*height
//}
//
//fun main() {
//    val w = readLine()!!.toDouble()
//    val h = readLine()!!.toDouble()
//
//    println("Rectangle area: ${rectangleArea(w, h)}")
//    println("Rectangle area: ${rectangleArea(width = w, height = h)}")
//    println("Rectangle area: ${rectangleArea(height = h, width = w)}")
//}

//fun swap(s: String, from:Int, to: Int): String {
//    val chars = s.toCharArray() // 배열로 변환
//    // 배열 원소 교환하기
//    val tmp = chars[from]
//    chars[from] = chars[to]
//    chars[to] = tmp
//    return chars.concatToString() // 문자열로 다시 변환
//}
//
//fun main() {
//    println(swap("Hello", 1, 2)) // Hlelo
//    println(swap("Hello", from = 1, to = 2)) // Hlelo
//    println(swap("Hello", to = 3, from = 0)) // lelHo
//    println(swap("Hello", 1, to =3)) // Hlleo
//    println(swap(from = 1, s = "Hello", to = 2)) // Hlelo
//    // 위치 기반 인자와 이름 붙은 인자를 혼용한 경우
//    println(swap(s = "Hello", 1, 2)) // 1.4 이전에는 컴파일 오류. 1.4부터는 정상
//    println(swap(s = "Hello", 1, to = 2)) // 1.4 이전에는 컴파일 오류. 1.4부터는 정상
////    println(swap(s = "Hello", 2, from = 1)) // error: an argument is already passed for this parameter
//                                                  // error: no value passed for parameter 'to'
////    println(swap(1, 2, s = "Hello")) // the integer literal does not conform to the expected type String
//                                              // error: an argument is already passed for this parameter
//                                              // error: no value passed for parameter 'to'
//}

//fun readInt() = readLine()!!.toInt()
//fun readInt(radix:Int) = readLine()!!.toInt(radix)

//fun plus(a: String, b: String) = a + b
//fun plus(a: String, b: String) = a.toInt() + b.toInt() // error: conflicting overloads: public final fun plus(a: String, b: String): String defined(이하 생략)

fun mul(a: Int, b: Int) = a*b               // 1
fun mul(a: Int, b: Int, c: Int) = a*b*c     // 2
fun mul(s: String, n: Int) = s.repeat(n)    // 3
fun mul(o: Any, n: Int) = Array(n) { o }    // 4

fun main() {
    println(mul(1, 2))
//    println(mul(1, 2L)) // error: none of the following functions can be called with the arguments supplied
                          // 오류: (Int, Long) 타입을 받을 수 있는 함수가 없음
    println(mul(1L, 2).contentToString()) // Long, Int 타입을 받을 수 있는 함수는 4번뿐이므로 4를 선택
    println(mul("0", 3)) // String이 Any의 하위 타입이기 때문에 3과 4 중에 3을 선택
    println(mul("0" as Any, 3).contentToString()) // (Any, Int)를 받을 수 있는 함수는 4뿐이므로 4를 선택
}