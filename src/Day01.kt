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
        return input.size
    }

    // test if implementation meets criteria from the description, like:
    val testInput = readInput("Day01_test")
    check(part1(testInput) == 7)

    val input = readInput("Day01")
    println(part1(input))
    println(part2(input))
}
