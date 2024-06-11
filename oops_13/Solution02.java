package oops_13;
class BankAccount{
    public String username;
    private String password;
    public String setPassword;
    public void setPassword(String pwd){
        password = pwd;
    }
}
public class Solution02 {
    public static void main(String[] args) {
        myAcc myAcc = new myAcc();
        myAcc.username= "pandey";
        myAcc.setPassword("abcd$%#@%");
        System.out.println();
        
    }
}
// finding error in this program