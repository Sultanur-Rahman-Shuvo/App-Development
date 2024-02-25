fun main() {
    var gender:String = "Male"
    var gender2: String? = null  //Nullable Operator
    var isAdult:Boolean? = true
    if (gender2 != null) {
        println(gender2.uppercase())
    }
    println(gender2?.uppercase())  //Safe Call Operator

    gender2?.let {
        println("Line 1")
        println("Line 2 $gender2")
        println("Line 3 $it")
    }
    var selectedValue = gender2 ?: "NA"  //Elvis Operator
    println(selectedValue)
    var value = gender2!!.uppercase()  //Not Null Asserted Operator
    println(value)
}