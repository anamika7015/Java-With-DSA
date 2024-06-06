package lecture_12;
public class solution_01 {
public static void main(String[] args) {
    pen s1 = new pen();
    s1.setColor("blue");
    System.out.println(s1.color);
}
class pen{
    String color;
    int tip;
    void setColor(String newColor){
        color = newColor;
    }
    void setTip(int newTip){
        tip = newTip;
    }
}
    
}