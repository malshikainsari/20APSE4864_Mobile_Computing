fun main() {
    maximumInList()
}

fun maximumInList() {
    val numbers = listOf(10, 25, 3, 99, 42)
    var max = numbers[0]

    for (num in numbers) {
        if (num > max) {
            max = num
        }
    }

    println("Largest number: $max")
}
