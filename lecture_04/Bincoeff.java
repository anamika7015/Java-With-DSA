package lecture_04;
import java.util.Scanner;






public class Bincoeff {
    public static int bincoeff(int n, int r){
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n-r);
        int Bincoeff = fact_n/(fact_r*fact_nmr);
        return Bincoeff;
    }
    public static int factorial(int num) {
        if (num == 0) {
            return 1;
        } else {
            return num * factorial(num - 1);
        }
    }
    
    public static void main(String[] args) {
       
     System.out.println(bincoeff(5,2));
    }
}
