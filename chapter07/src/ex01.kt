const val TAVERN_NAME = "Taernly's Folly"

fun main(args: Array<String>) {
    placeOrder()
}

private fun placeOrder(){
    val indexofApostrophe = TAVERN_NAME.indexOf('\'')
    val tarvernMaster = TAVERN_NAME.substring(0 until indexofApostrophe)
    println("마드리갈은 $tarvernMaster 에서 주문한다.")

}