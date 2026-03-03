fun main() {
    sumOfPositiveNumbers()
}

fun sumOfPositiveNumbers() {
    val numbers = listOf(-5, 10, -3, 7, 0, 8)
    var sum = 0
    for (num in numbers) {
        if (num > 0) sum += num
    }
    println("Sum of positive numbers: $sum")
}
