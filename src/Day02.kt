fun main() {
    fun part1(input: List<String>) = input.map { it.split(' ').let { array -> Pair(array[0], array[1].toInt()) } }
        .let { array -> (array.foldMove("down") - array.foldMove("up")) * array.foldMove("forward") }

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

private fun List<Pair<String, Int>>.foldMove(direction: String) =
    fold(0) { acc, pair -> if (pair.first == direction) acc + pair.second else acc }
