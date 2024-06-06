package lecture_06;

public class Array_argument {
    public static void updates(int numbers[]){
    for(int i=0; i<numbers.length; i++){
        numbers[i] = numbers[i] + 1;

    }
}
    public static void main(String[] args) {
        int numbers[] ={98,97,99};
        updates(numbers);
        for(int i =0; i< numbers.length;i++){
            System.out.println(numbers[i] +" ");
        }
        
    }
}
