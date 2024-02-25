fun main() {
    val obB = B()
    val obC = C()
    val p1 = Person1()
    p1.age = -1
}

open class B{
    public var p = 20
    private var q = 10
    internal var r = 5
    protected var s = 6
}

class C : A(){
    fun test(){
//        println(p)
//        println(q)
//        println(r)
//        println(s)
    }
}

class Person1{
    var age: Int = 10
}

