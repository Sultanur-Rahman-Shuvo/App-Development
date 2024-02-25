import java.lang.IllegalArgumentException

fun main() {
    createUserList(5)
    createUserList(-1)
    createUserList(1)  //it won't be executed because we got error in the previous line of code
    val arr = arrayOf(1,2,3)
    try {
        println(arr[5])
    }
    catch (ex: ArrayIndexOutOfBoundsException){
        println(ex)
    }
    catch (e:Exception){
        println("Please check the array index")
    }
    finally {
        println("I will be executed no matter what happens")
    }

//    try cannot be used alone
//    try {
//
//    }


}

fun createUserList(count:Int){
    if (count<0){
        throw IllegalArgumentException("Count must be greater than 0")
    }
    else{
        println("User list created using $count users")
    }
}

