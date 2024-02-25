import kotlin.math.pow

fun main() {
    println(sum(2.0,3.0))
    println(powerr(2.0,3.0))

    var fn: (a: Double, b: Double) -> Double = ::sum //function in variable
    var fn2: (a: Double, b: Double) -> Double = ::powerr
    println(fn(2.0,3.0))
    println(fn2(4.0,3.0))
    //var fn3: (a: Double, b: Double) -> Double = ::hello  --> gonna give error because parameter data type doesn't match
    calculator(5.0,3.0,::sum)
    calculator(5.0,3.0,::powerr)

}

fun sum(a:Double,b:Double):Double{
    return a+b
}

fun powerr(a:Double,b:Double):Double{
    return a.pow(b)
}

//fun hello(a:Int):Unit{
//
//}

fun calculator(a:Double,b:Double,gn: (Double,Double) -> Double){
    val result = gn(a,b)
    println("The result is " + result)
}