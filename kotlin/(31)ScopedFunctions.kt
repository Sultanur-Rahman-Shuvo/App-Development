fun main() {
    val emp = Employee()
    emp.age = 20
    emp.name = "Shuvo"
//    emp.apply {
//        age = 30
//        name = " Sean"
//    }
//    println(emp)

//    println(emp.age)
//    println(emp.name)
//    emp.let {
//        println(it.name)
//        println(it.age)
//        //return type will be the last expression data type
//    }

//    val emp : Employee? = null
//    emp?.age = 20
//    emp?.name = "Shuvo"
//    emp?.let {
//        it.age = 40
//        it.name = "Jhon"
//    }
    with(emp){
        age = 44
        name = "Helly"
    }
    emp.run {
        age = 29
        name = "Harry"
    }
}

data class Employee(var name:String="",var age: Int = 18)
