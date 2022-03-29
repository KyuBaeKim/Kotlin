interface Animal {
    fun walk()
    fun eat()



}

class Dog: Animal{  // Animal뒤에 생성자가 없기 때문에 interface이다.
    override fun walk() {
        TODO("Not yet implemented")
    }

    override fun eat() {
        TODO("Not yet implemented")
    }

}

class Cat: Animal{
    override fun walk() {
        TODO("Not yet implemented")
    }

    override fun eat() {
        TODO("Not yet implemented")
    }

}