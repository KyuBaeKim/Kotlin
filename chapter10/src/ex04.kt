fun main(args: Array<String>) {
    val list = (1..10).toMutableList()
    list.removeIf{it % 2 == 1}
    println(list)
}