package lecture_12;


class Pen{
    public String color;
    public int tip;

    void setColor(String color){
        this.color = color;
    }

    void setTip(int tip){
        this.tip = tip;
    }

    void getTip(){
        System.out.println(this.tip);
    }

    void getColor(){
        System.out.println(this.color);
    }

}

public class Main{
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("Blue");
        p1.setTip(5);
        p1.getColor();
        p1.getTip();
    }
}