package other

import java.lang.Exception

fun main() {
    var myData = Hello.hi
    println(myData)
}

data class Person(val name: String? = null)

data class MyData(
    val id: Int? = null,
    val data: String? = "",
    val error: Exception? = null
) {
    operator fun invoke() {
        println("${"\u001B[31m"}[DEBUG my $${this::class.java.simpleName}]" + "${"\u001B[32m"}$this")
    }
}


class Hello() {

    companion object {
        val hi = "Hola"
    }
}