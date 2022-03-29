import demo.room.Room

class TownSquare : Room("Town Square") {
    override fun load() = "당신의 참여를 주민들이 다 함께 환영합니다!"
}

fun main(args: Array<String>) {
    val town = TownSquare()
    println(town.description())
    println(town.load())
}