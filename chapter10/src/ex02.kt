

fun main(args: Array<String>) {
    println(patronList[0])

    patronList.getOrElse(4) {"Unknown patron"}

    val fifthpatron = patronList.getOrNull (4) ?: "Unknown patron"


}


