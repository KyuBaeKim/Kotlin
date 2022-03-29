data class User(var name:String, var email:String, var phone:String)

class User2(var name:String, var email:String, var phone:String)

fun main(args: Array<String>) {
    val user1 = User("Kim", "Kim@email.com", "010-1234-1234")
    val user2 = User("Kim", "Kim@email.com", "010-1234-1234")
    println(user1.toString())
    println("user1: $user1") // 내부적으로 toString 호출됨
    println(user1 == user2) // 내부적으로 equals() 호출됨

    val user3 = User2("Kim", "Kim@email.com", "010-1234-1234")
    val user4 = User2("Kim", "Kim@email.com", "010-1234-1234")
    println(user3)  // 내부적으로 toString 호출됨
    println(user3 == user4) // 내부적으로 equals 호출됨
}