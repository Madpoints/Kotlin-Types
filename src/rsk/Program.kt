package rsk

fun main(args: Array<String>) {
    var james = Player(1, "James")
    var sam = Player(1, "James")

    println(james)

    if(sam == james) {
        println("Equal")
    } else {
        println("Not equal")
    }

    var newJames = james.copy(name = "Paul")

    println(newJames)
}

data class Player(val id: Int, val name: String) {

}