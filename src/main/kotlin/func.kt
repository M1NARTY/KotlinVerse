import kotlin.math.PI

fun circleArea(radius: Double): Double {
    return PI*radius*radius
}

fun main() {
    print("Enter radius: ")
    val radius = readLine()!!.toDouble()
    println("Circle area: ${circleArea(radius)}")
}
// This function calculates the area of a circle given its radius. The main function takes user input for the radius and calls the circleArea function to calculate and print the area of the circle.