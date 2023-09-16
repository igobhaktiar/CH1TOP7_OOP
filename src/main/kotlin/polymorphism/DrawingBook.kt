package polymorphism

class DrawingBook : Book {
    override fun paper(): String {
       return "Kertas"
    }

    override fun cover(): String {
        return "Lorem"
    }

    override fun publisher(): String {
        return "lorem"
    }
}