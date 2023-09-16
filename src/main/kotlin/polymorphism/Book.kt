package polymorphism

interface Book {
    open fun cover(): String
    open fun paper(): String
    open fun publisher(): String
}