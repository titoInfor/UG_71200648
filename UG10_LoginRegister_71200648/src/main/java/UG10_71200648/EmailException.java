package UG10_71200648;

public class EmailException extends Exception{
    private int errCode;
    private String errMessage;

    public EmailException(int errCode){
        super();
        this.errCode = errCode;
        if (errCode == 1){
            errMessage ="maaf,email tidak boleh kosong";
        } else if (errCode == 2) {
            errMessage = "maaf,Email tidak valid";
        }

    }

    public String getErrMessage() {
        return errMessage;
    }

    public int getErrCode() {
        return errCode;
    }
}
