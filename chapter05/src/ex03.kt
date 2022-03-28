fun main(args: Array<String>) {
    val greetingFunction: (String) -> String = { playerName ->
        val currentYear = 2021
        "SimVillage 방문을 환영합니다. $playerName! (copyright $currentYear)"
    }
    println(greetingFunction("김선달"))
}