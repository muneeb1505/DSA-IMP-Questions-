public class BitPrbmls {
    public static void EvenOddNum(int n){
        int bitMask = 1;
        if((n & bitMask) == 0){
            System.out.println("Even number");
        }else{
            System.out.println("Odd Number");
        }
    }
    //Get ith bit
    public static int getIthBit(int n, int i){
        int bitMask = 1<<i;
        if((n & bitMask) == 0){
            return 0;
        }else{
            return 1;
        }
    }
    //Set ith bit
    public static int SetIthBit(int n, int i){
        int bitMask = 1<<i;
        return n | bitMask;
    }

    //Clear bits
    public static int ClearBit(int n, int i){
        int bitMask = ~(1<<i);
        return n & bitMask;
    }
    //Update bit
    public static int UpdateIthBit(int n, int i, int newBit){
        //simple and easy way to update ith bit
        // if(newBit == 0){
        //     return ClearBit(n, i);
        // }else{
        //     return SetIthBit(n, i);
        // }

        //Another approach to do without using these functions 
        n = ClearBit(n, i);
        int bitMask = newBit<<i;
        return n | bitMask;
    }

    //Clear i bits
    public static int ClearIBits(int n, int i){
        int bitMask = (~0)<<i;
        return n & bitMask;

    }
    //clear bits in range
    public static int clearBitsInRange(int n, int i, int j){
        int a = ((~0)<<(j+1));
        int b = (1<<i)-1;
        int bitMask = a | b;
        return n & bitMask; 
    }
    public static void main(String[] args) {
        // EvenOddNum(2);
        // EvenOddNum(5);
        // EvenOddNum(11); 
        // System.out.println(getIthBit(10, 2)); 
        // System.out.println(SetIthBit(10,2));
        // System.out.println(ClearBit(10, 1));  
        // System.out.println(UpdateIthBit(10, 2, 1));
        // System.out.println(ClearIBits(15, 2));
        System.out.println(clearBitsInRange(10,2, 4));
    }
}
