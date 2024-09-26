public class ReverseArray {
    //reverse array
    public static void reverseArr(int nums[]){
        int first = 0, last = nums.length - 1;
        while (first < last) {
            int temp = nums[last];
            nums[last] = nums[first];
            nums[first] = temp;

            first++;
            last--;
        }
    }

    //pairs in array
    public static void pairArr(int arr[], int n){
        int tp = 0;         //tp - variable for couting pairs
        for(int i=0; i<n; i++){
            int curr = arr[i];
            for(int j=i+1; j<n; j++){
                System.out.print("(" + curr + "," + arr[j] + ")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total pairs: " + tp);
    }
    public static void main(String[] args) {
        int nums[] = {2,4,6,8,10};
        reverseArr(nums);

        //printing reversed array
        for(int i=0; i<nums.length; i++){
            System.out.print(nums[i] + " ");
        }
        System.out.println();

        // int arr[] = {2,4,6,8,10};
        // int n = arr.length;
        // pairArr(arr, n);
    }
}
