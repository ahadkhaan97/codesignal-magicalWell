fun main() {
    print(solution(1, 2, 2))
}

@Suppress("NAME_SHADOWING")
fun solution(a: Int, b: Int, n: Int): Int {
    var a = a
    var b = b
    var sum = 0
    for (i in 0 until n) {
        sum += (a * b)
        a++
        b++
    }
    return sum
}
