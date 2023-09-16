package abstraction

abstract class Account {
    abstract fun deposit(amount: Long)
    abstract fun withdraw(amount: Long)
    abstract fun getBalance(): Long
}