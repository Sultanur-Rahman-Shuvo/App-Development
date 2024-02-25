fun main() {
    dragObjects(arrayOf(Circle3(4.0),Square3(4.0),Triangle3(2.0,3.0),Player("Smiley")))
}

fun dragObjects(objects: Array<Draggable>){
    for (obj in objects){
        obj.drag()
    }
}

interface Draggable{
//    val dragSpeen: Int
    fun drag()
}

//interface Cloneable{
//    fun clone()
//}

abstract class Shape3:Draggable,Cloneable{
    abstract fun area():Double
}

class Circle3(val radius:Double):Shape3(){
    override fun area(): Double = Math.PI * radius * radius
    override fun drag() = println("Circle is dragging")
}
class Square3(val side:Double):Shape3(){
    override fun area(): Double = side * side
    override fun drag() = println("Square is dragging")
}

class Triangle3(val base:Double,val height:Double):Shape3(){
    override fun area(): Double = 0.5 * base * height
    override fun drag() = println("Triangle is dragging")
}

class Player(val name:String):Draggable{
    override fun drag() = println("$name is dragging")
}