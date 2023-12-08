package other/*
data class YourDataClass(val id: Int, val name: String, val types: List<YourEnumType>)

enum class YourEnumType {
    RUC,
    DNI,
    BOTH
}


// Example usage
fun gap.inline.other.main() {
    val dataList = listOf(
        YourDataClass(1, "Item1", listOf(YourEnumType.RUC, YourEnumType.DNI)),
        YourDataClass(2, "Item2", listOf(YourEnumType.DNI)),
        YourDataClass(3, "Item3", listOf(YourEnumType.BOTH, YourEnumType.RUC)),
        YourDataClass(4, "Item4", listOf(YourEnumType.RUC)),
        YourDataClass(5, "Item5", listOf(YourEnumType.DNI))
    )

    val filteredList = filterByEnumType(dataList, YourEnumType.RUC)

    filteredList.forEach { println(it) }
}
*/
/*

inline fun <reified T, E : Enum<E>> filterByEnumType(dataList: List<T>, enumType: E): List<T> {
    return dataList.filter { item ->
        try {
            val enumList = T::class.java.getDeclaredField("types").apply {
                isAccessible = true
            }.get(item) as List<YourEnumType>

            enumType in enumList
        } catch (e: NoSuchFieldException) {
            // Handle the case where the field is not found
            false
        }
    }
}*/
