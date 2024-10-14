fun printSorted(vararg items: Int) {
//    println(items.contentToString())
    items.sort()
    println(items.contentToString())
}

fun change(vararg items: IntArray) {
    items[0][0] = 100
}

fun printSorted2(prefix: String = "", vararg items: Int) { }
fun printSorted3(vararg items: Int, prefix: String = "") { }

fun main() {
    printSorted(6, 2, 10, 1)
    val numbers = intArrayOf(6, 2, 10 ,1)
    printSorted(*numbers)
//    printSorted(numbers) // Error: passing IntArray instead of Int

    val a = intArrayOf(6, 2, 10, 1)
    printSorted(*a)
    println(a.contentToString())

    val a2 = intArrayOf(1, 2, 3)
    val b2 = intArrayOf(4, 5, 6)
    change(a2, b2)
    println(a2.contentToString())
    println(b2.contentToString())

    printSorted(6, 1, *intArrayOf(3, 8), 2)
    printSorted(items = *intArrayOf(1,2,3))
//    printSorted(items = 1, 2, 3) // Error

//    printSorted2(6, 2, 10, 1) // Error: 6 is taken as value of prefix
    printSorted2(items = *intArrayOf(6, 2, 10 ,1)) // 정상

//    printSorted3(6, 2, 10, 1, "!") // Error
    printSorted3(6, 2, 10, 1, prefix = "!")

}