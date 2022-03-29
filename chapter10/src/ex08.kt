fun main(args: Array<String>) {
    val array = ArrayList<String>()  // 초기 데이터를 주지 못한다. (비어 있는 상태에서 시ㅣ작)

    array.apply {
        add("Kim")
        add("Lee")
        add("Park")

        // return this가 생략 되어있음.
    }

    print(array)


}