public class BitsBasic {
    public static void main(String[] args) {
        int a = 5, b = 6;
        int c = 5, d = 2;
        int bitAnd = a & b;
        int bitOr = a | b;
        int bitXor = a ^ b;
        int bitOnesComp = ~a;
        int leftShift = c<<d;
        int rightShift = c>>d;
        
        System.out.println("Bitwise AND: " + bitAnd);
        System.out.println("Bitwise OR: " + bitOr);
        System.out.println("Bitwise XOR: " + bitXor);
        System.out.println("Bitwise AND: " + bitOnesComp);
        System.out.println("Bitwise Left Shift: " + leftShift);
        System.out.println("Bitwise Right Shift: " + rightShift);
    }
}
