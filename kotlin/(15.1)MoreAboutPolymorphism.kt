fun main() {
//    val shape1 = Shape1()
//    printArea(shape1)
//    val square1 = Square1(4.0)
//    printArea(square1)
    val circle1 = Circle1(4.0)
    println(circle1.toString())
}

//fun printArea(shape1: Shape1){
//    println(shape1.area())
//}

open class Shape1{
    open fun area():Double = 0.0
    override fun toString(): String {
        return "I am Shape"
    }
}

class Circle1(val radius:Double):Shape1(){
    override fun area(): Double = Math.PI * radius * radius
}

//class Square1(val side:Double):Shape1(){
//    override fun area(): Double = side * side
//}
//
//class Triangle1(val base:Double,val height:Double):Shape1(){
//    override fun area(): Double = 0.5 * base * height
//}