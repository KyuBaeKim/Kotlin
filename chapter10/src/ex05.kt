fun main(args: Array<String>) {
    val patronList = mutableListOf<String>("Eli", "Mordoc", "Sophie")

    for(patron in patronList){
    //patron = "new" + patron // error
        println("좋은 밤입니다. $patron 님")
    }
}