import java.util.*;
public class LargestArr {
    public static int largestElem(int nums[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for(int i=0; i<nums.length; i++){
            if(largest < nums[i]){
                largest = nums[i];
            }
            if(smallest > nums[i]){
                smallest = nums[i];
            }
        }
        System.out.println("Smallest element is: " + smallest);
        return largest;
    }
    public static void main(String[] args) {
        int nums[] = {2,5,6,1,4};
        int large = largestElem(nums);
        System.out.println("Largest element is: " + large);
    }   
}
