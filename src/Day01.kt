fun main() {
    fun part1(input: List<String>): Int {
        var counter = 0
        var last = Int.MAX_VALUE
        for (depth in input.map(String::toInt)) {
            if (depth > last) counter++
            last = depth
        }
        return counter
    }

    fun part2(input: List<String>): Int {
        var counter = 0
        var last = Int.MAX_VALUE
        var sum = 0
        for (idx in 0..input.size - 3) {
            sum += input[idx].toInt() + input[idx + 1].toInt() + input[idx + 2].toInt()
            if (sum > last) {
                counter++
            }
            last = sum
            sum = 0
        }

        return counter
    }

    // test if implementation meets criteria from the description, like:
    val testInput = readInput("Day01_test")
    println(part1(testInput))
    check(part1(testInput) == 7)
    println(part2(testInput))
    check(part2(testInput) == 5)


    val input = readInput("Day01")
    println(part1(input))
    println(part2(input))
}
