fun main() {
    //MyClass.MyObject.f()
    MyClass.f()
    MyClass.AnotherObject.g()
}

class MyClass{
    companion object MyObject{//this is similar to static method in Java and multiple companion object is not allowed within a class in kotlin
        @JvmStatic
        fun f(){
            println("Hello I am F from MyObject")
        }
    }
    object AnotherObject{
        fun g(){
            println("Hello I am G from AnotherObject")
        }
    }
}