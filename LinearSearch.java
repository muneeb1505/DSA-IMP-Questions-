public class LinearSearch {
    //Linear Search code
    public static int linearSrch(int arr[], int key){
        for(int i=0;i<arr.length; i++){
            if (arr[i] == key){
                return i;
            }
        }
        return -1;
    }
    //Linear search on menu
    public static int menuSrch(String foods[], String foodItem){
        for(int i=0; i<foods.length; i++){
            if(foods[i] == foodItem){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10,12,14,16,18,20};
        int key = 10;

        int index = linearSrch(arr, key);
        if(index == -1){
            System.out.println("Element not found");
        }else{
            System.out.println("Element is at index: " + index);
        }

        // String foods[] = {"Dosa", "Noodles", "Samosa", "Coke", "Tea"};
        // String foodItem = "Lassi";

        // int res = menuSrch(foods, foodItem);
        // if(res == -1){
        //     System.out.println("Food Item not available");
        // }else{
        //     System.out.println("Food item found at: " + res);
        // }
    }
}
