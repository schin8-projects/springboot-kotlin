package bu.edu.schin8.tnb.springboot.model

// Data Transfer Object

class Bank {

    private var accountNumber: String
    private var trust: Double
    private var transactionFee: Int

    constructor(accountNumber: String, trust: Double, transactionFee: Int) {

        this.accountNumber = accountNumber
        this.trust = trust
        this.transactionFee= transactionFee
    }

    fun getAccoountNumbrer(): String = accountNumber

    fun setAccountNumber(accountNumber: String) {
        this.accountNumber = accountNumber
    }

    // Use Code > Override Methods or ^O... here to generate code

    override fun equals(other: Any?): Boolean {
        return super.equals(other)
    }

    override fun hashCode(): Int {
        return super.hashCode()
    }

    override fun toString(): String {
        return super.toString()
    }
}