fun main() {
//    println("Hello World".formattedString())  //Extension Function
    calculateTimeAndRun {
        loop(1000000)
    }  //Inline Function
}

//fun String.formattedString():String{
//    return "-------------\n$this\n--------------"
//}   //Extension Function

//can't use Extension Functions inside a private class

inline fun calculateTimeAndRun(fn: ()->Unit){
    val start = System.currentTimeMillis()
    fn()
    val end = System.currentTimeMillis()
    println("Time taken ${end - start} ms")
}

fun loop(n:Long){
    for (i in 1..n){
        //
    }
}

