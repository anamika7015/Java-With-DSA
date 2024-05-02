package lecture_06;

public class Trapping_rain_water {
    public static void TrappingRainWater(int height[]){
        int n = height.length;
        // calculate left max boundary - array
        int leftMax = new int[n];
         leftMax[0] = height[0];
         for(int i= 1; i<n;i++){
            leftMax[i] = Math.max(height[i],leftMax[i-1]);

         }
         int rightMax = new int[n];
         rightMax[n-1] = height[n-1];
         for(int i= n; i>=0;i--){
            leftMax[i] = Math.max(height[i],leftMax[i-1]);



    }
    
    public static void main(String[] args) {
        int height[] = {4,2,0,6,3,2,5};

    }
}
