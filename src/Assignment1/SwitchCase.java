package Assignment1;

class SwitchCase {
    public static void main(String[] arg) {
        int a = 1;
        int num1 = 3;
        int num2 = 4;
        int num3;
        switch (a) {
            case 1: {
                num3 = num1 + num2;
                System.out.println(num3);
                break;

            }
            case 2: {
                num3 = num1 - num2;
                System.out.println(num3);
                break;

            }
            case 3: {
                num3 = num1 * num2;
                System.out.print(num3);
                break;

            }
            default: {
                System.out.print("default case run");
            }
        }


    }
}