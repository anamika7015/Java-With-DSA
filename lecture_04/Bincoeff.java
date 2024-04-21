package lecture_04;
import java.util.Scanner;


public static void factorial(int n){
int f=1;
for( int i=1;i<=n;i++){
    f= f*i;

}
return f;
}
public static void bincoeff(int n, int r){
    int fact_n = factorial(n);
    int fact_r = factorial(r);
    int fact_nmr = factorial(n-r);
    int Bincoeff = fact_n/(fact_r*fact_nmr);
    return bincoeff;
}

public class Bincoeff {
    public static void main(String[] args) {
       System.out.println(facorial(4));
     System.out.println(bincoeff(5,2));
    }
}
