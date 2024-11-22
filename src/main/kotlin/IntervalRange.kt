fun main() {
    val chars = 'a' .. 'h'    // 'a'부터 'h'까지의 모든 문자
//  val twoDigits = 10 .. 99  // 10 부터 99까지의 모든 수
    val zero2One = 0.0 .. 1.0 // 0부터 1까지의 모든 부동소수점 수

//    val num = readLine()!!.toInt()
//    println(num in 10..99) // num >= 10 && num <= 99
//    println(num !in 10..99) // !(num in 10..99)

    println("def" in "abc".."xyz") // true
    println("zzz" in "abc".."xyz") // false

    val twoDigits = 10 until 100 // 10..99와 같음. 100은 포함되지 않음
}
