package demo.room

open class Room(val name: String){
    fun description() = "Room: $name"

    open fun load() = "아무도 여기에 오지 않았습니다."
}

fun main(args: Array<String>) {
    var currentRoom = Room("Foyer")

    println(currentRoom.description())
    println(currentRoom.load())
}