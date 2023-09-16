package inheritance

open class Teacher {
    open fun knowledge() : List<String> {
        return listOf("Bahasa", "Sejarah")
    }
    private fun smiley (){}
    private fun anger (){}
}