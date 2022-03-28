fun main(args: Array<String>) {
    val patronList = mutableListOf<String>("Eli", "Mordoc", "Sophie")
    patronList.apply {
        println(this)
        remove("Eli")
        add("Alex")
        add(0, "Alex")
        this[0] = "Alexis"
        println(this)
    }

    patronList.let{
        println(it)
        it.remove("Eli")
        it.add("Alex")
        it.add(0, "Alex")
        it[0] = "Alexis"
        println(it)
    }


}