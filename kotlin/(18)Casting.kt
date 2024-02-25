fun main() {
    val circle4 = Circle4(4.0)
    val player1 = Player1("Smiley")

    val arr : Array<Draggable1> = arrayOf(circle4,player1)
    //val arr : Array<Any> = arrayOf(circle4,player1,Test())
    for (obj in arr){
        if (obj is Circle4){
            println(obj.area())
        }else{
            (obj as Player1).sayMyName()
        }
    }

//    if (circle4 is Circle4){
//        println("This is Circle")
//    }
}

interface Draggable1{
    fun drag()
}

abstract class Shape4:Draggable1{
    abstract fun area():Double
}

class Circle4(val radius:Double):Shape4(){
    override fun area(): Double = Math.PI * radius * radius
    override fun drag() = println("Circle is dragging")
}

class Player1(val name:String):Draggable1{
    override fun drag() = println("$name is dragging")
    fun sayMyName() = println("Hey my name is - $name")
}

class Test{

}