fun main() {
    //val nums = listOf(1,2,3)  immutable list
    val nums = mutableListOf(1,2,3)
    println(nums.indexOf(3))
    println(nums.contains(4))
    //nums[1] = 6   cannot do this because immutable list doesn't support modification in an array element
    nums[1] = 6
    nums.add(5)
    nums.remove(1)
    println(nums)

    val list2 = listOf(11,12)
    nums.addAll(list2)
    println(nums)


    val students = mutableMapOf<Int,String>()
    students.put(1,"Reyna")
    students.put(2,"Jett")
    students.put(3,"Killjoy")
    students.put(4,"Brim")
    println(students.get(3))
    println(students.get(9))

    for ((key,value ) in students){
        println("$key = $value")
    }

    students[3] = "Deadlock"
    println(students[3])

    val map = mapOf<Int,String>(1 to "Sage",2 to "Astra")
    println(map)
}