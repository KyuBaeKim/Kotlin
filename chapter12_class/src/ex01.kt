class player{
    val name = "hong gil dong"
    fun castFireball(numFireballs: Int = 2) =
        println("힌 덩어리의 파이어볼이 나타난다. (x$numFireballs)")
}

fun main(args: Array<String>) {
    val player = player()
    player.castFireball()
}