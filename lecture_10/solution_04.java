package lecture_10;
// sub String
public class solution_04 {
    public static String subString(String str,int Si, int ei){
        String subStr = "";
        for(int i = Si ; i < ei;i++){
            subStr += str.charAt(i);
        }
        return subStr;
    }
    public static void main(String[] args) {
        String str = "Helloworld";
        System.out.println(subString(str, 0, 5));
    }
}
