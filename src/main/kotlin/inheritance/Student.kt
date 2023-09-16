package inheritance

class Student : Teacher() {
    override fun knowledge(): List<String> {
        return super.knowledge() + listOf("Olahraga")
    }

    // apakah bisa student bisa punya smiley dan anger????
    // bisa dengan catatan modifier pada teacher harus dalam private
    fun  lazy(){}
    fun smiley(){}
    fun anger(){}
}