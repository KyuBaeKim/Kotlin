fun main(args: Array<String>) {
    runSimulation("김선달",  { playerName: String, numBuildings: Int ->
        val currentYear = 2021
        println("$numBuildings 채의 건물이 추가됨")
        "SimVillage 방문을 환영합니다. $playerName!(copyright $currentYear)"
    })
}

fun runSimulation(playerName: String,
greetingFunction: (String, Int) -> String ) {
    val numBuildings = (1..3).shuffled().last() // 1, 2, 3 중 무작위로 선택
    println(greetingFunction(playerName, numBuildings))
}