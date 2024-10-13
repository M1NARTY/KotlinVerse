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

fun rectangleArea(width: Double, height: Double): Double {
    return width*height
}

fun main() {
    val w = readLine()!!.toDouble()
    val h = readLine()!!.toDouble()

    println("Rectangle area: ${rectangleArea(w, h)}")
    println("Rectangle area: ${rectangleArea(width = w, height = h)}")
    println("Rectangle area: ${rectangleArea(height = h, width = w)}")
}