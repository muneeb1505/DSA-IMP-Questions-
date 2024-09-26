public class CheckPower {
    public static boolean CheckPowOfTwo(int n){
        return (n & (n-1)) == 0;
    }
    public static void main(String[] args) {
        System.out.println(CheckPowOfTwo(8));
    }
}
