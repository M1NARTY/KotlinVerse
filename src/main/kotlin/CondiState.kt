//fun main(args: Array<String>) {
//    if (args.isNotEmpty()) {
//        val message = "Hello, ${args[0]}"
//        println(message)
//    } else {
//        println()
//    }
//}
//
//fun max(a: Int, b: Int) = if (a > b) a else b   // if 식

fun main() {
    val s = readLine()!!
    val i = s.indexOf("/")

    val result = if (i>=0) {
        val a = s.substring(0, i).toInt()
        val b = s.substring(i + 1).toInt()
        (a/b).toString()
    } else ""

    println(result)
}