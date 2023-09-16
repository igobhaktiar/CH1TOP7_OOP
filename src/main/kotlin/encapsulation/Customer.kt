package encapsulation

class Customer {
    fun dineIn(restaurant: Restaurant): MutableList<String> {
        return restaurant.dineIn()
    }

    fun takeAway(restaurant: Restaurant): MutableList<String> {
        return restaurant.takeAway()
    }
}

fun main() {
    val mcD = Restaurant(
        foods = listOf("Burger", "Chicken", "Fries")
    )

    val solaria = Restaurant(
        foods = listOf("Nasi Goreng Seafood", "Mie Goreng", "Sapo Tahu"),
        accessableKitchen = true
    )

    // mas sadri mau makan burger mcd
    val sadri = Customer()
    sadri.dineIn(mcD).first()

    // mas dhani mau pesen take away mie goreng solaria
    val dhani = Customer()
    dhani.takeAway(solaria)[1]

}