fun main() {
//    SharingWidget.incrementTwitterLikes()
//    SharingWidget.incrementTwitterLikes()
//    SharingWidget.incrementTwitterLikes()
//    SharingWidget.incrementFbLikes()
//    SharingWidget.display()

    //anonymous object - Singleton Pattern
//    var obj = object : Cloneablee{
//        override fun clone() {
//            println("I am clone")
//        }
//    }
//    obj.clone()

    var obj2 = object : Person2("Cheesee"){
        override fun fullName() {
            super.fullName()
            println("Anonymous - $name")
        }
    }
    obj2.fullName()
}

//object SharingWidget{
//    private var twitterLikes = 0
//    private var fbLikes = 0
//    fun incrementTwitterLikes() = twitterLikes++
//    fun incrementFbLikes() = fbLikes++
//    fun display() = println("Facebook - $fbLikes -- Twitter - $twitterLikes")
//}

interface Cloneablee{
    fun clone()
}

open class Person2(val name:String){
    open fun fullName() = println("Full Name - $name")
}