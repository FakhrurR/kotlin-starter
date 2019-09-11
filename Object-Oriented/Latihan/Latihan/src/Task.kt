// TODO 1
class Cat(private val name: String) {
    var sleep: Boolean = false

    fun getter(){
        println("Fungsi getter dipanggil")
    }

    fun setter(){
        println("Fungsi setter dipanggil")
    }

    fun toSleep() {
        if (sleep) println("$name, sleep!")
        else println("$name, let's play!")
    }
}

fun main() {

    // TODO 2
    val gippy = Cat("Gippy")

    gippy.getter()
    gippy.toSleep()
    gippy.setter()
    gippy.getter()
    gippy.sleep = true
    gippy.toSleep()
}