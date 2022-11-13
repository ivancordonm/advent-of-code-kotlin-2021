fun main() {
    fun part1(input: List<String>) = input.map { it.toInt() }
        .let { array ->
            array.drop(1).foldIndexed(0) { index, acc, value ->
                if (array[index] < value) acc + 1 else acc
            }
        }

    fun part2(input: List<String>) = input.map { it.toInt() }
        .let { array ->
            array.drop(3).foldIndexed(0) { index, acc, value ->
                if (array[index] + array[index + 1] + array[index + 2]
                    < array[index + 1] + array[index + 2] + value
                )
                    acc + 1 else acc
            }
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
