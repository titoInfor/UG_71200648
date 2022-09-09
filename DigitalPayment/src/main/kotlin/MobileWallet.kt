open class MobileWallet (nama : String, saldo : Long, noHp : String) : DigitalPayment(nama, saldo){

    override var nama : String = nama
    override var saldo : Long = saldo
    var noHp :String =noHp
    var feeTransferBank :Int = 0

    override fun transfer(dp: DigitalPayment, nominal: Long) {
        if (saldo < 0){
            print("tidak valid")
        }else if (saldo < nominal){
            print("gagal")
        }
    }

}