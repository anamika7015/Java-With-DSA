package lecture_10;
// string comparision
public class solution_05 {

    public static void main(String[] args) {
        String str1 = "pandey";
        String str2 = "pandey";
        String str3 = new String("pandey");
        if (str1 == str2) {
            System.out.println("string are equal");
        }
        else{
            System.out.println("string are not equal");

        }
        if (str1.equals(str3)) {
            System.out.println("string are equals");
        }
        else{
            System.out.println("string are not equal");
        }
    }
}
