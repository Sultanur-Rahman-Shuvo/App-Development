fun main() {
    val result = add(4,5)
    println(result)
    val result2 = add(5,6)
    println(result2)
    evenOrOdd(12) //argument
    evenOrOdd(13)
    //printMessage(3)
    printMessage()
}
//fun add(num1: Int, num2: Int): Int {
//    val sum = num1 + num2
//    return sum
//}

//inline function
//fun add(num1: Int, num2: Int): Int = num1 + num2
//another inline function
fun add(num1: Int, num2: Int)= num1 + num2

fun evenOrOdd(num: Int) //parameter
{
    val result = if (num % 2 == 0) "even" else "odd"
    println(result)
}

//fun printMessage(count:Int){
//    for (i in 1..count){
//        println("hello $i")
//    }
//}

fun printMessage(count:Int=2){
    for (i in 1..count){
        println("hello $i")
    }
}