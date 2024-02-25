fun main() {
//    val num = 10
//    val res = num in 1..5
//    print(res)  //false
    // *****
//    val num = 5
//    val res = num in 1..5 //1,2,3,4,5
//    print(res)  //true
    //*****
//    val num = 5
//    val res = num in 1 until 5 //1,2,3,4
//    print(res)  //false

    //When Example
//    val animal = "Dog"
//    val res = when(animal){
//        "Horse" -> "Animal is Horse"
//        "Cat" -> "Animal is Cat"
//        "Dog" -> "Animal is Dog"
//        else -> "Animal Not Found"
//    }
//    print(res)

    val num = 13
    val res = when(num){
        11 -> "Eleven"
        12 -> "Twelve"
        in 13..19 -> "Teen"
        else -> "Not in range"
    }
    print(res)
}