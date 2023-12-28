package bu.edu.schin8.tnb.springboot.model

// Data Transfer Object

// Even though accountNumber is "public", the backing field is not public.  Only the Getter/Setter are public
// A Data class includes equals/hashCode/toString

data class Bank (
    val accountNumber: String,
    val trust: Double,
    val transactionFee: Int
)
