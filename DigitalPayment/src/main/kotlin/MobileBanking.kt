open class MobileBanking (nama : String, saldo : Long, noRekening : String):DigitalPayment(nama, saldo) {
    override var nama : String = nama
    override var saldo :Long = saldo

    open var noRekening :String = noRekening
    var checkFee : Boolean = false
    var feeAntarBank : Int = 6000

    override fun transfer(dp: DigitalPayment, nominal: Long) {
        if (saldo < 0){
            print("Tidak valid")
        }else if (saldo < nominal){
            print("gagal")
        }else if (saldo > nominal){
            dp.saldo += nominal
            checkFee = true
            saldo -= feeAntarBank
            printBuktiTransfer(penerima = dp,nominal)

        }else print("tidak valid")
    }

    override fun printBuktiTransfer(penerima: DigitalPayment, nominal: Long) {
        super.printBuktiTransfer(penerima, nominal)
    }


}