//fun main(args: Array<String>) ({
//    val numLetters = "Mississippi".count {letter ->
//        println("check: $letter")
//        letter == 's'}
//    println(numLetters)
//})


fun main(args: Array<String>) {
    val numLetters = "Mississippi".count {letter ->
        println("check: $letter")
        letter == 's'}
    println(numLetters)
}