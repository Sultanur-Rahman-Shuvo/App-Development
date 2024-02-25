fun main() {
    var p1 = Person3(1,"John")
    var p2 = Person3(1,"John")
//    println(p1)
//    println(p2)
//    println(p1.hashCode())
//    println(p1==p2)//p1.equals(p2)
//
//    var p3 = p1.copy(id = 3)
//    println(p3)

    val(id,name) = p1
//    println(id)
//    println(name)
    println(p1.component1())
    println(p1.component2())
    println(p2.component1())
    println(p2.component2())
}

data class Person3(val id: Int,val name:String){

}