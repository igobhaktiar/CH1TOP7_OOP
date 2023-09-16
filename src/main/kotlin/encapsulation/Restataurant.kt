package encapsulation// contoh case kali ini adalah
// ketika mas sadri dan mas dhani mau makan di restoran
// di dalam restoran terdapat tempat yang tidak bisa di masuki
// dan masing masing restaurant juga memiliki menu makanan masing masing
// 

open class Restaurant {
    constructor(foods: List<String>) {
        this.foods.clear()
        this.foods.addAll(foods)
    }

    constructor(foods: List<String>, accessableKitchen: Boolean) {
        this.foods.clear()
        this.foods.addAll(foods)
        this.accessableKitchen = accessableKitchen
    }

    private val foods: MutableList<String> = mutableListOf()
    private var accessableKitchen: Boolean = false
    val staff: MutableList<String> = mutableListOf()

    fun dineIn(): MutableList<String> {
        return foods
    }

    fun takeAway(): MutableList<String> {
        return foods
    }
}