package abstraction

class SavingAccount : Account() {
    private var balance = 0L
    override fun deposit(amount: Long) {
        balance += amount
    }

    override fun withdraw(amount: Long) {
        balance -= amount
    }

    override fun getBalance(): Long {
        return balance
    }
}