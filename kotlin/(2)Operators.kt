fun main() {
    var i = 13
    var j = 2
    //Arithmetic Operators
    println(i+j)
    println(i-j)
    println(i*j)
    println(i.toFloat()/j)
    println(i%j)

    //Relational Operators
    println(i>j)
    println(i<j)
    println(i>=j)
    println(i<=j)
    println(i==j)
    println(i!=j)

    //Increment Operators
    println(i++ + ++i) //if i=10 then, 10+12=22

    //Logical Operators
    val above70 = false
    val knowsProgramming = true

    var calledForInterview = above70 && knowsProgramming
    println(calledForInterview)

    calledForInterview = above70 || knowsProgramming
    println(calledForInterview)

}