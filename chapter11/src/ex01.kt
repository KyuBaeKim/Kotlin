fun main(args: Array<String>) {
//    val map = mapOf<String, Double>(
//        "Eli" to 10.5,
//        "Sophie" to 5.5
//    )
//    println(map)

    val map = mutableMapOf<String, Double>(
        Pair("Eli", 10.5),
        Pair("Sophie", 5.5)
    )

    var value: Double

    map += "Sophie" to 6.0
    println(map)
    map["Eli"] = 12.3
    println(map["Eli"])
    map["Kim"] = 12.6
    println(map["Kim"])
    println(map["Choi"])

    // map[] --> 리턴 타입이 Double?
    value = map["Kim"] ?: 0.0
    println(value)
    value = map["Lee"] ?: 0.0
    println(value)


    // map 순회하면서 key, value 출력
    map.forEach { key, value ->
        println("key: $key, value: $value")
    }

    for((key,value) in map){
        println("key: $key , value : $value")
    }
}