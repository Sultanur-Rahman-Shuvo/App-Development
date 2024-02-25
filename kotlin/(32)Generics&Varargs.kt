fun main() {
    val obj = IntContainer(3)
    obj.getValue()
    val iContainer = Container(3)
    iContainer.getValue()
    val sContainer = StringContainer("hello")
    sContainer.getValue()

    val list:List<String> = listOf<String>()  //list and map are generic class

    add(1,2,3,4,5)
    add(1,1,1,1,1)
}

class Container<T>(var data:T){
    fun setValue(value: T){
        data = value
    }
    fun getValue(): T{
        return data
    }
}

class IntContainer(var data:Int){
    fun setValue(value: Int){
        data = value
    }
    fun getValue():Int{
        return data
    }
}

class StringContainer(var data:String){
    fun setValue(value: String){
        data = value
    }
    fun getValue():String{
        return data
    }
} //To solve this problem

fun add(vararg values:Int){
    var sum = 0
    for (i in values){
        sum+=i
    }
    println(sum)
}