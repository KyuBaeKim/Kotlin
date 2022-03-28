fun main(args: Array<String>) {
    val score = 88
    // score에 따라 학점을 결정하세요.
    val grade = when(score){
        100 -> 'A'
        in 90..99  -> 'B'
        in 80..89  -> 'C'
        in 70..79  -> 'D'
        else -> 'F'
    }

    // 너의 학점은 무엇이다
    // pass/Fail


    println("규배 : $grade\n" + "합격 여부: ${if(score>=0) "Pass" else "Fail"}")
    
}