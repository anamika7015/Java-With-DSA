package lecture_06;

public class Largest_number {
    public static int getLargestNumber(int number[]) {
        int largest = Integer.MIN_VALUE;//-infinite
        for (int i = 0; i < number.length; i++) {
            if (largest < number[i]) {
                largest = number[i];
            }

        }
        return largest;
    }

    public static void main(String[] args) {
        int number[] = { 1, 3, 6, 2, 5 ,12};
        System.out.println("largest number=" + getLargestNumber(number));

    }

}
