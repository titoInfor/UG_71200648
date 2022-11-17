package UG10_71200648;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println( "Selamat datang di Toko Jaya" );
        System.out.println("Silahkan daftarkan diri kamu untuk dapat mengakses menu di Tokop jaya\n");

        Scanner input=new Scanner(System.in);
        String username;
        String email;
        String password;
        String confirmPassword;

        while(true){
            try{
                System.out.print("Username: ");
                username=input.nextLine();
                if (username.equals(" ") || username.equals("")){
                    throw new UsernameException(1);
                }
                if (username.length()<7){
                    throw new UsernameException(2);
                }
                break;
            }catch (UsernameException usx) {
                System.out.println(usx.getErrMessage());
                continue;
            }
        }
        while (true){
            try{
                System.out.print("Email: ");
                email=input.nextLine();
                if (email.equals(" ") || email.equals("")){
                    throw new EmailException(1);
                }
                if (!validEmail(email)){
                    throw new EmailException(2);
                }
                break;
            }catch (EmailException ex) {
                System.out.println(ex.getErrMessage());
                continue;
            }
        }
        while (true){
            try{
                System.out.print("Password: ");
                password=input.nextLine();
                if (password.equals(" ") || password.equals("")){
                    throw new PasswordException(1);
                }
                if (password.length()<7){
                    throw new PasswordException(2);
                }
                if (!passCheck(password)){
                    throw new PasswordException(3);
                }
                if (password.equals(username)){
                    throw new PasswordException(4);
                }
                break;
            }catch (PasswordException px) {
                System.out.println(px.getErrMessage());
                continue;
            }
        }
        while(true){
            try{
                System.out.print("Konfirmasi Password: ");
                confirmPassword=input.nextLine();
                if (!password.equals(confirmPassword)){
                    throw new PasswordException(5);
                }
                break;
            }catch (PasswordException px) {
                System.out.println(px.getErrMessage());
                continue;
            }
        }
        User usr = new User(username, email, password);
        System.out.println("\nAkun kamu berhasil didaftarkan!\nSilahkan login untuk melanjutkan!\n");

        while (true){
            try{
                System.out.print("Username: ");
                String user=input.nextLine();
                System.out.print("Password: ");
                String pass=input.nextLine();
                if (user.equals("") || user.equals(" ")){
                    throw new LoginException(1);
                }else
                if (pass.equals("") || pass.equals(" ")){
                    throw new LoginException(2);
                }else
                if (!user.equals(usr.getUsername()) || !pass.equals(usr.getPassword())){
                    throw new LoginException(3);
                }
                break;
            }catch (LoginException lx) {
                System.out.println(lx.getErrMessage());
                continue;
            }
        }

        System.out.println("\nSelamat datang, "+usr.getUsername());

    }
    public static Boolean validEmail(String email){
        if (!email.contains("@")){
            return false;
        }
        int At=email.lastIndexOf("@");
        String emailNew="";
        for (int i = At; i < email.length(); i++) {
            emailNew+=email.charAt(i);
        }
        if (emailNew.equals("@ukdw.com")){
            return true;
        }
        return false;
    }

    public static boolean passCheck(String pass){
        boolean small=false;
        boolean big=false;
        boolean num=false;
        boolean sym=false;
        for (int i = 0; i < pass.length(); i++) {
            char a=pass.charAt(i);
            if (Character.isUpperCase(a)){
                big=true;
            }
            if (Character.isLowerCase(a)){
                small=true;
            }
            if (Character.isDigit(a)){
                num=true;
            }
            if (!Character.isDigit(a) && !Character.isAlphabetic(a)){
                sym=true;
            }
        }
        if (small && big && num && sym){
            return true;
        }
        return false;
    }
    }