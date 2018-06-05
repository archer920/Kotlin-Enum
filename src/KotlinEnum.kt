enum class FoodMenu {
    BURGER,
    CHICKEN,
    GYRO
}

interface Displayable {
    fun diplay()
}

enum class PrintableFood(val displayName : String) : Displayable {

    BURGER("Burger") {
        override fun diplay() = println(this.displayName)
    },
    CHICKEN ("Chicken Sandwich") {
        override fun diplay() = println("Printing ${this.displayName}")
    },
    GYRO ("Pork Gyro") {
        override fun diplay() = println("Getting a Greek ${this.displayName}")
    }
}

fun displayMenuItem(displayable: Displayable)
        = displayable.diplay()

fun printMenuItem(foodMenu: FoodMenu){
    when(foodMenu){
        FoodMenu.BURGER -> println("Burger")
        FoodMenu.CHICKEN -> println("Chicken")
        FoodMenu.GYRO -> println("Gyro")
    }
}

fun main(args: Array<String>){
    printMenuItem(FoodMenu.BURGER)
    printMenuItem(FoodMenu.GYRO)

    println()
    PrintableFood.values().forEach { it -> displayMenuItem(it) }
}