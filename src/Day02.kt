fun main() {
    fun part1(input: List<String>): Int {
        var horizontal = 0
        var depth = 0
        for (line in input) {
            val (type, value) = line.split(" ")
            when (type) {
                "up" -> depth -= value.toInt()
                "down" -> depth += value.toInt()
                "forward" -> horizontal += value.toInt()
            }
        }
        return depth * horizontal
    }

    fun part2(input: List<String>): Int {
        var aim = 0
        var horizontal = 0
        var depth = 0
        for (line in input) {
            val (type, value) = line.split(" ")
            when (type) {
                "up" -> aim -= value.toInt()
                "down" -> aim += value.toInt()
                "forward" -> {
                    horizontal += value.toInt()
                    depth += value.toInt() * aim
                }
            }
        }

        return depth * horizontal
    }

    // test if implementation meets criteria from the description, like:
    val testInput = readInput("Day02_test")
    println(part1(testInput))
    check(part1(testInput) == 150)
    println(part2(testInput))
    check(part2(testInput) == 900)

    val input = readInput("Day02")
    println(part1(input))
    println(part2(input))
}
