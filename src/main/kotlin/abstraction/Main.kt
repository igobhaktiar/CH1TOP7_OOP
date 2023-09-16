package abstraction

class Main {
}

fun checkBalance(account: Account) {
    val type = when (account) {
        is SavingAccount -> "Saving Account"
        is CurrentAccount -> "Current Account"
        else -> "Lainnya"
    }
    println("My Balance on $type is ${account.getBalance()}")
}

fun main() {
    val bankDbs = SavingAccount()
    checkBalance(bankDbs)
    bankDbs.deposit(2_000_000_000)
    checkBalance(bankDbs)

    val bankBCA = CurrentAccount()
    checkBalance(bankBCA)
    bankBCA.withdraw(1000)
}