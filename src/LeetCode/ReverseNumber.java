package LeetCode;

public class ReverseNumber {

    public static int reverse(int x) {

        int revN = 0;
        while (x != 0) {
            int ld = x % 10;
            revN = (revN * 10) + ld;
            x = x / 10;
        }
        return revN;
    }

    public static void main(String[] args) {
        int r = reverse(-123);
        System.out.println(r);
    }
}
