fun main() {
println("Bitte gib eine Zahl ein und drücke anschließend Enter um ein Ergebnis zu erhalten")

    val eingegebeneZahl = readln().toInt()
    println("Das Ergebnis lautet:")
    println(fibonacci(eingegebeneZahl))

}

fun fibonacci(x: Int): Int {
    if (x <= 0) return 0
    if (x == 1) return 1
    var fibu1 = 0
    var fibu2 = 1
    var ergebnis = 0
    for (i in 3..x) {
        ergebnis = fibu1 + fibu2
        fibu1 = fibu2
        fibu2 = ergebnis
    }
    return ergebnis
}