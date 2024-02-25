fun main() {
    val mustang = Car(name = "Mustang", type = "Petrol", kmRan = 100)
    val beetle = Car(name = "Beetle", type = "Diesel", kmRan = 200)

    println(mustang.name)
    println(mustang.type)
    println(mustang.kmRan)
    println(beetle.name)
    println(beetle.type)
    println(beetle.kmRan)
    mustang.driveCar()
    beetle.driveCar()
    mustang.applyBrakes()
    beetle.applyBrakes()
}

class Car (val name: String,val type: String,val kmRan: Int){
    fun driveCar(){
        println("Car $name is Driving")
    }
    fun applyBrakes(){
        println("$name Applied Brakes")
    }
}