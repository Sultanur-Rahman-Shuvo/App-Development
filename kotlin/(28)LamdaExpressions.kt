fun main() {
    var fn: (a:Int,b:Int) -> Int = ::sum //function in variable
    //lambda function
    val lambda1 = {x:Int,y:Int -> x+y}
    println(lambda1(1,2))

    val multilineLambda = {
        println("Hello Lambda")
        var a = 2+3
        "hello shuvo"
        2//this last expression will be the return type of this lambda function
    }
    println(multilineLambda())

    val singleParamLambda = { x:Int -> x*x}
    println(singleParamLambda(5))

    var lambda2: (Int)->Int = {x -> x*x}
    println(lambda2)

    var sayHi = {msg:String -> println("hello $msg") }

    val singleParam: (Int)->Int = {x -> x + x}
    val simplifysingleParam: (Int)->Int = {it + it}

    calculator(1,2, { a, b ->a+b})
    /* calculator(1,2,{a,b -> a+b}) */
}

fun sum(a:Int,b:Int):Int = a+b

fun calculator(a:Int,b:Int, res : (Int,Int) -> Int):Int{
    return res(a,b)
}