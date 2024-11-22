fun main() {
    val chars = 'a' .. 'h'
//    val twoDigits = 10 .. 99
    val zero2One = 0.0 .. 1.0

//    val num = readLine()!!.toInt()
//    println(num in 10..99)
//    println(num !in 10..99) // !(num in 10..99)

    println("def" in "abc".."xyz") // true
    println("zzz" in "abc".."xyz") // false

    val twoDigits = 10 until 100 // 10..99와 깥음. 100은 포함뙤찌 않음
}