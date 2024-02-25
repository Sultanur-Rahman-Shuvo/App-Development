//open class Phone{
//    fun call(){}
//    fun type(){}
//    fun restart(){}
//}
//
//class BaicPhone:Phone(){
//    fun radio(){}
//
//}
//
//class SmartPhone:Phone(){
//    fun camera(){}
//}

fun main() {
    val obj = Child()
    obj.myMethod()
    obj.myMethod2()
}

open class Parent{
    init {
        println("parent constructor is called")
    }
    val name:String = ""
    fun myMethod(){
        println("I am parent")
    }
}

class Child:Parent(){
    init {
        println("child constructor is called")
    }
    val name2:String = ""
    fun myMethod2(){
        println("I am child")
    }
}