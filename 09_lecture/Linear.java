package lecture_08;
public class Linear {
    public static int linearSearch(int arr[],int key){
     for(int i=0; i<arr.length;i++){
        if(arr[i]== key){
            return i;
        }
     }
     return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,6,8,9};
        int key = 3;
        System.out.println(linearSearch(arr, key));

    }
}
