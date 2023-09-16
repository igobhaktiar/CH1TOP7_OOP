package abstraction

class CurrentAccount : Account() {
    private var balance = 0L
    override fun deposit(amount: Long) {
        balance += amount
    }

    override fun withdraw(amount: Long) {
        if (balance - amount < 0) throw RuntimeException()
        balance -= amount
    }

    override fun getBalance(): Long {
        return balance
    }
}
