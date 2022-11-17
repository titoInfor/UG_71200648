package UG10_71200648;

public class UsernameException extends Exception {

    private int errCode;
    private String errMessage;

    public UsernameException(int errCode){
        super();
        this.errCode = errCode;
        if (errCode == 1){
            errMessage ="maaf,username tidak boleh kosong";
        } else if (errCode == 2) {
            errMessage = "maaf,username minimal harus terdiri dari 6 karakter";
        }

    }

    public int getErrCode() {
        return errCode;
    }

    public String getErrMessage() {
        return errMessage;
    }
}
