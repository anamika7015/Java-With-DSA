package oops_13;
class Pen{
    String color;
    int tip;
    void setcolor(String newColor){
        color = newColor;
    }
    void setTip(int newTip){
         tip = newTip;
    }

}
public class solution01 {
    public static void main(String[] args) {
        Pen P1 = new Pen();
        P1.setcolor("blue");
        System.out.println(P1.color);
        P1.setTip(5);
        System.out.println(P1.tip);
    }
}
