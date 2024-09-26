public class MaxSubarray {
    public static void MaxSubSum(int nums[]){
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for(int i=0; i<nums.length; i++){
            currSum += nums[i];
            maxSum = Math.max(currSum, maxSum);
            if(currSum < 0){
                currSum = 0;
            }
        }
        System.out.println("Maximum subarray sum: " + maxSum);
    }
    public static int repeatArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    return 1;
                }
            } 
        }
        return 0;
    }
 public static void main(String[] args) {
    int nums[] = {1,-2,6,-1,3};
    int arr[] = {1,2,1,1};
    int res = repeatArr(arr);
    System.out.println(res);
    // MaxSubSum(nums);
 }   
}
