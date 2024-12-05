package Assignment1;

class SwapTwo {
    public static void main(String[] arg) {
        int a = 10;
        int b = 5;

        int temp;
        temp = a;
        a = b;
        b = temp;

        System.out.print("a is " + a);
        System.out.print("b is " + b);
    }
}