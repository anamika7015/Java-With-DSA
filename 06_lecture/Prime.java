package lecture_05;

public class Prime {

    public static boolean isPrime(int n) {
        boolean isPrime = true;
        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 2) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    // public static boolean primeInRange(int n){
    //     for(int i=1; i<=n;i++){
    //        (isPrime(i+" ")){
    //        System.out.println();
    //        }
     
    public static void main(String[] args) {
        // System.out.println(isPrime(3));
      //  primeInRange(100);
    }
}
