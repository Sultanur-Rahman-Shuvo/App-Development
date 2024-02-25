fun main() {
    val nums = listOf(1,2,3,4,5)
//    println(isOdd(3))
//    println(isOdd(2))
//    val list = nums.filter { a: Int -> a % 2 != 0 }
    val list = nums.filter { it % 2 != 0 }
//    val list = nums.filter(fun (a:Int):Boolean{
//        return a%2 != 0
//    })
    println(list)

    val userList = listOf(
        User(1,"A"),
        User(2,"B"),
        User(3,"C"),
        User(4,"D"),
    )
    println(userList.filter { it.id == 2 })

    val list2 = nums.map { it*it }
    println(list2)

    val PaidUserList = userList.map {
        PaidUser(it.id,it.name,"paid")
    }
    println(PaidUserList)

    nums.forEach { println(it) }
}

//fun isOdd(a:Int):Boolean{
//    return a%2 != 0
//}

data class User(val id:Int,val name:String)
data class PaidUser(val id:Int,val name:String,val type:String)