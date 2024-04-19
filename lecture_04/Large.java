package lecture_04;
import java.util.Scanner;
public class Large {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int max =a;

        if(a>max){ 
            max = b;
        }
        if(c>max){
            max = c;
        }
        System.out.println(max);
    }
}
