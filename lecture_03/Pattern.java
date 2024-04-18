package lecture_03;
import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        System.out.println("enter a number");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){

                System.out.print("*");
            }
            System.out.println();
        }
    }
}
