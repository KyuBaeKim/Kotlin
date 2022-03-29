// MutableList에 대응하는 Java 콜렉션
// ArrayList<T>

// MutableMap에 대응하는 Java 콜렉션
// HashMap<K, V>

// 기존 Java로 작성된 라이브러리에서는 이 타입을 쓰기 때문에.. 처음부터 위 콜렉션을 쓰기도 한다.

fun main(args: Array<String>) {
    val map = HashMap<String, Double>().apply{
        this["kim"] = 0.0
        put("Lee", 1.1)
        put("choi", 5.1)
    }


}