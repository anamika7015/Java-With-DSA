package lecture_03;
 import java.util.Scanner;

public class PatternTwo {
    public static void main(String[] args) {
        
    System.out.print("Enter the number");
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    char ch ='A';
    for(int i=1; i<=n;i++){
        for(int j=1;j<=i;j++){
            // System.out.print("*");
            // System.out.print(i);
            System.out.print(ch);
        }
        ch++;
        System.out.println();
    }
    }
}
