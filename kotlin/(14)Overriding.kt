fun main() {
    val oneplus = Oneplus("Smart Phone")
    oneplus.display()
    val generalMobile = Mobile()
    generalMobile.display()
    println(oneplus.toString())
}

open class Mobile{
    open val name:String = ""
    open val size:Int = 5
    fun makeCall(){
        println("Making a Call")
    }
    fun powerOff(){
        println("Shutting Down")
    }
    open fun display(){
        println("Displaying Something")
    }
}

class Oneplus(typeParam:String):Mobile(){
    override val name: String = "Oneplus"
    override val size: Int = 5
    override fun display() {
        super.display()
        println("One Plus Display")
    }

    override fun toString(): String {
        return "Name-$name - Size-$size"
    }
}