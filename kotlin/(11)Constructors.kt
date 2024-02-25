fun main() {
    var car = AutoMobile("Car","small")
    var car2 = AutoMobile("Car2","big")
    car.drive()
    car.applyBrakes()
//    var person = Personn("A",20)
//    println(person.name)
//    println(person.age)
//    var person2 = Personn("B",18)
//    println(person2.name)
//    println(person2.age)
}

class AutoMobile(val name:String,val tyres:Int,val maxSeating:Int,hasAirBags:Boolean,val engineType:String){
//    init {
//        println("$name is created")
//    }
//    var airBags = hasAirBags
//    init {
//        println("2nd initializer block")
//    }
    constructor(nameParam:String,engineParam:String):
            this(nameParam,4,5,true,"small")
    fun drive(){
        println("$name is being driven")
    }
    fun applyBrakes(){
        println("$name has been applied brake")
    }
}

//class Empty{}
//
//class Personn(nameParam:String,ageParam:Int){
//    val name:String = "$nameParam - Clan"
//    var age:Int = ageParam
//}