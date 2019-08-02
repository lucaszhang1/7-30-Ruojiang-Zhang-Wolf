class Cat(var name: String? = null){
    fun Meow(){println("Meow!")}
}

fun main(args: Array<String>){
    var myCats = arrayOf(Cat("Misty"),
                         null,
                         Cat("Socks"))
    for (cat in myCats){
        print("${cat?.name}:")
        cat?.Meow()
    }
}