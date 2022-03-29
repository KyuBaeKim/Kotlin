class players{
    var name = "mardrigal"
    get() = field.capitalize()
    set(value){
        field = value.trim()
    }

    fun castFireball(numFireballs: Int = 2) =
        println("힌 덩어리의 파이어볼이 나타난다. (x$numFireballs)")
}

fun main(args: Array<String>) {
    val players = players()
    players.name = "estragon"
    println(players.name + "TheBrave")
}
