package other

fun main() {

    //println(999.other.transformMultiple(50))

    val enum: MyEnum = MyEnum.Tres
    val sealed: MySealed = MySealed.Dos

    when(enum) {
        MyEnum.Uno -> println("Uno ${enum.value}")
        MyEnum.Dos -> println("Dos ${enum.value}")
        MyEnum.Tres -> println("Tres ${enum.value}")
        else -> Unit
    }

    when(sealed) {
        MySealed.Uno -> println("Uno ${sealed.value}")
        MySealed.Dos -> println("Dos ${sealed.value}")
        is MySealed.Tres -> println("Tres ${sealed.value}")
        else -> Unit
    }
}

fun String.hello() = "Hi $this"

fun Int.transformMultiple(multiple: Int): Int {
    val quotient = this / multiple
    val rounding = quotient * multiple

    return if (this - rounding >= multiple / 2) {
        rounding + multiple
    } else {
        rounding
    }
}

enum class MyEnum(val value: Int) {
    Uno(1),
    Dos(2),
    Tres(3)
}
sealed class MySealed(val value: Int) {
    object Uno: MySealed(1)
    object Dos: MySealed(2)
    data class Tres(val num: Int): MySealed(num)
}