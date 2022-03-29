import java.awt.GridBagConstraints.NORTHWEST

enum class Direction(private  val str: String) {
    NORTH("북"),
    EAST("동"),
    SOUTH("남"),
    WEST("서");

    val value: String = str
}



// 회원 레벨: Admin: 0 , gold: 1 , silver: 2 , normal: 3 ...  --> enum class USER_LEVEL { ADMIN, GOLD, SILVER, NORMAL}

fun main(args: Array<String>) {
    var direction = Direction.NORTH

    println(direction.value)

    direction = Direction.SOUTH
    println(direction.value)

    // 잘못된 값은 컴파일 에러
    //    direction = 100 // 숫자는 넣지 못한다.
    //    direction = Direction.NORTHWEST
}