import java.util.Scanner;

public class allpurpose {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter an integer: 👇");
        int integerInput = inp.nextInt();
//        the return number is stored here.
        int checkNumberVar = convertNumber(integerInput);
        System.out.println("Number converted from " + integerInput + " to " + checkNumberVar);
//      extra functions
//      calling digit cout function
        System.out.println("total digits are:-- " + countDigit(integerInput));
        System.out.println("Total number of odds are:--- " + oddFinder(integerInput));
        System.out.println("Total count of digits is:--- " + CountTotal(integerInput));
//        handshakes hello = new handshakes();
//        System.out.println(hello.count_Handshakes());

    }

    //    countTotal
    static int CountTotal(int number) {
        String newStr = Integer.toString(number);
        int totalcount = 0;

        for (int i = 0; i < newStr.length(); i++) {
//            if (newStr.charAt(i) == 1 || newStr.charAt(i) % 2 == 1) {
            if(newStr.charAt(i) == '-'){
                totalcount+=0;
            }else
                totalcount += Integer.parseInt(String.valueOf(newStr.charAt(i)));
            }
            return totalcount;
        }


//    odd finder
        static int oddFinder ( int number){
            String newStr = Integer.toString(number);
            int oddNumber = 0;

            for (int i = 0; i < newStr.length(); i++) {
                if (newStr.charAt(i) == 1 || newStr.charAt(i) % 2 == 1) {
                    oddNumber += 1;
                }
            }
            return oddNumber;

        }
        static int countDigit ( int number){
            int count = 0;
            while (number != 0) {
                number = number / 10;
                ++count;
            }
            return count;
        }

//  convert number function
        public static int convertNumber ( int integerInput){
            int saveNumber;

            if (integerInput != -integerInput) {
                saveNumber = integerInput  - (2 * integerInput);
            } else {
                saveNumber = integerInput + (2 * integerInput);
            }
            return saveNumber;
        }
    }