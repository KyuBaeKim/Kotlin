class Player2(_name: String,
              var healthPoints:Int,
              var isBlessed: Boolean,
              private val isImmortal: Boolean ) {
    val hometown by lazy {
        println("hometown init")
        "Seoul" // 리턴 값
    }
    var name = _name
    get() = field.capitalize()
    set(value){
        field = value.trim()
    }

    constructor(name:String) :
            this(name, healthPoints = 100, isBlessed = true, isImmortal = false)
    {
        println("constructor...")
        if(name.toLowerCase() == "kim") healthPoints = 45

    }
    init
    {
        println("init Block...")
        require(healthPoints >0, {"helathpoints는 0보다 커야 합니다."})
        require(_name.isNotBlank(),{"플레이어는 이름이 있어야 합니다."})
    }

    fun castFireball(numFireballs: Int = 2) =
        println("힌 덩어리의 파이어볼이 나타난다. (x$numFireballs)")
}

fun main(args: Array<String>) {
//    val players = players()
//    val player1 = Player2(_name ="Hong", healthPoints = 90, isBlessed = true, isImmortal = false)
    val player2 = Player2("KIM")
    println(player2.hometown)
    println(player2.name + player2.healthPoints)
    println(player2.hometown)

}
