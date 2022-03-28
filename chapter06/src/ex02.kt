fun main(args: Array<String>) {
    var beverage = readLine() // readLine = 문자열 하나 입력 받음
    println(beverage)
    beverage = null // 에러가 아님
    println(beverage)
}