fun main(args: Array<String>) {
    var beverage = readLine()
    if( beverage != null){
        beverage = beverage.capitalize()
    }else{
        print("beverage가 null입니다1")
    }
    beverage = null

    val beverageServed: String = beverage ?: "맥주"
    println(beverageServed)
}