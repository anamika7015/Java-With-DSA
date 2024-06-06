package lecture_10;

public class CreateString {
    public static void main(String[] args) {
        // String str = new String();
        // str = "anamika pandey";
        
        String firstname = "anamika ";
        String lastname= "pandey";
        String fullname =firstname +" "+ lastname;

        for(int i = 0; i< fullname.length(); i++){
            System.out.println(fullname.charAt(i) + " ");
        }
        System.out.println(fullname);
    }
}
