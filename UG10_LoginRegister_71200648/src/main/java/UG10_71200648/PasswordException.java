package UG10_71200648;

public class PasswordException extends Exception{
    private int errCode;
    private String errMessage;

    public  PasswordException(int errCode){
        super();
        this.errCode = errCode;
        if (errCode ==1){
            errMessage ="maaf,password tidak boleh kosong";
        } else if (errCode == 2) {
            errMessage = "maaf,password minimal harus terdiri dari 7 karakter";
        } else if (errCode ==3) {
            errMessage = "maaf,password harus mengandung huruf besar,huruf kecil,simbol,dan angka";

        } else if (errCode == 4) {
            errMessage = "maaf,password tidak boleh sama dengan username";

        } else if (errCode == 5) {
            errMessage = " maaf,password harus sama dengan konfirmasi password";
        }
    }

    public String getErrMessage() {
        return errMessage;
    }

    public int getErrCode() {
        return errCode;
    }
}
