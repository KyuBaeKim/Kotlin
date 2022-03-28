val patronList = mutableListOf<String>("Eli", "Mordoc", "Sophie")

fun main(args: Array<String>) {
    println(patronList)
    patronList.remove("Eli")
    patronList.add("Alex")
    patronList.add(0,"Alex")
    println(patronList)
}