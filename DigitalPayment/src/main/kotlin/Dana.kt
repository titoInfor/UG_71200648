class Dana (nama : String ,saldo: Long,noHP:String): MobileWallet(nama,saldo,noHP) {
    override var nama : String = nama
    override var saldo : Long = saldo
    var noHP : String =noHP
    val danaFeeTransferBank : Int = 1000

    override fun transfer(dp: DigitalPayment, nominal: Long) {
        super.transfer(dp, nominal)
    }
}