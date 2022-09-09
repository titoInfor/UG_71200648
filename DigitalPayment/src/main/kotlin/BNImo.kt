class BNImo (nama : String,saldo : Long,noRekening : String) : MobileBanking(nama, saldo, noRekening) {
    override var nama : String = nama
    override var saldo : Long = saldo
    override var noRekening : String = noRekening

    override fun transfer(dp: DigitalPayment, nominal: Long) {
        super.transfer(dp, nominal)
    }


}