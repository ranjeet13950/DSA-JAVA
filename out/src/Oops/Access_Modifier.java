package Oops;

public class Access_Modifier {
    public static void main(String[] args) {
        BankAcc b1 = new BankAcc();
        b1.setusername("Ranjeet");
        b1.setpassword("xyz");

        System.out.println("username: "+b1.getusername());
        System.out.println("pass: "+b1.getpassword());
    }
}

class BankAcc{
    public String username;
    private String password;

    String getusername(){
        return this.username;
    }
    String getpassword(){
        return this.password;
    }

    public void setusername(String username){
        this.username = username;
    }

    public void setpassword(String password){
        this.password = password;
    }

}
