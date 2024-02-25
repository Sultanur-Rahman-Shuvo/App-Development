fun main() {
//    val ob = Calculator()
//    println(ob.add(1,3))
    val p1 = Personnn("cheezy",21)
    println(p1.name)
    println(p1.age)
}

//class Calculator{
//    lateinit var message:String
//    fun add(a:Int,b:Int):Int{
//        return a+b
//    }
//    fun multiply(a:Int,b:Int):Int{
//        return a*b
//    }
//}

class Personnn(var nameParam:String,ageParam:Int){
    var name:String = nameParam
    var age:Int = ageParam
        get() {
            return field
        }
        set(value) {
            if (value>0){
                field = value
            }
            else{
                println("age can't be negative")
            }
        }
}