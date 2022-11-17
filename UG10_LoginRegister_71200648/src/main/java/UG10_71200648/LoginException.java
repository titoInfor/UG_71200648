package UG10_71200648;

public class LoginException extends Exception{
    private int errCode;
    private String errMessage;

    public LoginException(int errCode){
        super();
        this.errCode = errCode;
        if (errCode == 1){
            errMessage ="maaf,username tidak boleh kosong";
        } else if (errCode == 2) {
            errMessage = "maaf,password tidak boleh kosong";
        } else if (errCode == 3) {
            errMessage = "maaf,username dan password salah! Silahkan coba lagi!";

        }
    }

    public String getErrMessage() {
        return errMessage;
    }

    public int getErrCode() {
        return errCode;
    }
}
