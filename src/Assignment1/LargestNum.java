package Assignment1;

//FOR TWO NUMBERS

// class LargestNum{
//     public static void main(String arg[]){
//         int num1 = 4;
//         int num2 = 5;

//         if(num1 > num2){
//             System.out.print("largest num is:" + num1);
//         }else{
//             System.out.print("largest num is:" + num1);
//         }

//     }
// }

//FOR THREE NUMBERS

class LargestNum {
    public static void main(String[] arg) {
        int num1 = 4;
        int num2 = 9;
        int num3 = 9;

        if (num1 > num2 && num1 > num3) {
            System.out.print("largest num is:" + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.print("largest num is:" + num2);
        } else {
            System.out.print("largest num is:" + num3);
        }

    }
}