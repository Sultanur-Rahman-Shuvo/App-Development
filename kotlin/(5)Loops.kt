fun main() {
    //while and do while loops are same as c,JavaScript,Java,Python
    //for loop

    /*for (i in 1..5){
        println(i)
    }*/

    /*for (i in 1..5 step 2){
        println(i)
    }*/

    /*for (i in 1 until 5){
        println(i)
    }*/

    /*for (i in 10 downTo 1){
        println(i)
    }*/

    /*for (i in 10 downTo 1 step 2){
        println(i)
    }*/

    //table of 2
    val number = 2
    for (i in 1..10){
        //println(number.toString() + " X " + i + " = " + (number * i))
        //String Templating
        println("$number X $i = ${number*i}")
    }
}