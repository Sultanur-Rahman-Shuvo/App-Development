import kotlin.math.pow

fun main() {
//    println(addition(1,2))
//    println(addition(1.0,2.0))
//
//    //Named Argument
//    println(addition(a=2,b=3))
//    println(addition(a=3,b=2))

    //function in variable
    var fn: (a: Double, b: Double) -> Double = ::addition
    println(fn(1.0, 2.0))
    fn = ::power
    println(fn(2.0,3.0))
}

//fun addition(a:Int,b:Int):Int{
//    return a + b
//}

fun addition(a:Double,b:Double):Double{
    return a + b
}

fun power(a:Double,b:Double):Double{
    return a.pow(b)
}