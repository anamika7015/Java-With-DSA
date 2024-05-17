package lecture_10;

public class solution_01 {
    public static void printLetter(String str){
        for(int i = 0; i< str.length(); i++){
            System.out.println(str.charAt(i) +" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        String firstname = "Anamika";
        String lastname = "pandey";
        String fullname = firstname +" "+ lastname;
        printLetter(fullname);
    }
}
