fun main(args: Array<String>) {
    val greetingFunction = { playerName: String, numBuildings: Int ->
        val currentYear = 2021
        println("$numBuildings 채의 건물이 추가됨")
        "Simvillage 방문을 환영합니다. $playerName!(copyright $currentYear)"
    }
    println(greetingFunction("김선달", 2))
}