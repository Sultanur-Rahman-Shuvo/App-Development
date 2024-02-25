fun main() {
    val circle2 = Circle2(4.0)
    println(circle2.area())
    circle2.display()
}
//abstract class can have both abstract and non-abstract properties and method
abstract class A{
    fun method1(){
        println("I am method")
    }
}

abstract class Shape2{
    var name: String = ""
    abstract fun area():Double
    abstract fun display()
}

class Circle2(val radius:Double):Shape2(){
    override fun area(): Double = Math.PI * radius * radius
    override fun display() {
        println("Circle is getting displayed")
    }
}