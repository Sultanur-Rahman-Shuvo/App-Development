fun main() {
    val day = Day.SUNDAY
    println(day)
    println(day.number)
    for (i in Day.values()){
        println(i)
    }
    day.printFormattedDay()

//    example-1 for sealed class
    val tile = Red("Mashroom",25)
    val tile2 = Red("Fire",30)
    println("${tile.points} - ${tile.type}")
//    example-2 for sealed class
//    val tile:Tile = Red("Mashroom",25)
//    val points10 = when(tile){
//        is Red -> tile.points * 2
//        is Blue -> tile.points * 5
//    }
//    println(points10)

}

enum class Day(val number:Int){
    SUNDAY(1),
    MONDAY(2),
    TUESDAY(3),
    WEDNESDAY(4),
    THURSDAY(5),
    FRIDAY(6),
    SATURDAY(7);
    fun printFormattedDay(){
        println("Day is $this")
    }
}

sealed class Tile
class Red(val type:String,val points:Int):Tile()
class Blue(val points:Int):Tile()