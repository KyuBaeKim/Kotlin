data class User(var name:String, var email:String, var phone:String)

class User2(var name:String, var email:String, var phone:String) {
    override fun toString(): String = "User2[name=$name, email=$email, phone,$phone]"
    override fun equals(other: Any?): Boolean {
        // this --> user3 , other --> user4

        val o = other as User2 // 타입을 바꾸는 표현(타입 캐스팅) , o의 타입: User2

        return name == other.name && email == other.email && phone == other.phone
        return super.equals(other)
    }
}

fun main(args: Array<String>) {
    val user1 = User("Kim", "Kim@email.com", "010-1234-1234")
    val user2 = User("Kim", "Kim@email.com", "010-1234-1234")
    println(user1.toString())
    println("user1: $user1") // 내부적으로 toString 호출됨
    println(user1 == user2) // 내부적으로 equals() 호출됨

    val user3 = User2("Kim", "Kim@email.com", "010-1234-1234")
    val user4 = User2("Kim", "Kim@email.com", "010-1234-1234")
    println(user3.toString())
    println(user3)  // 내부적으로 toString 호출됨
    println(user3 == user4) // 내부적으로 equals 호출됨
}