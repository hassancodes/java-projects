import java.util.Scanner;
import java.util.*;

public class creditCardLOL {
    public void cardcheck() {
        Scanner inp = new Scanner(System.in);
        StringBuilder input1 = new StringBuilder();
        int counter1 = 0;
        int counter2 =0;
        int firstDigit = 0;
        int secDigit =0;

        System.out.println("Enter you credit card NUmber:");

        long cardNumber = inp.nextLong();
        int lengthcard = String.valueOf(cardNumber).length();

        if (lengthcard == 16) {
            System.out.println("your card is eight digit");
//            functionality

           String stringCardNum = String.valueOf(cardNumber);
           input1.append(stringCardNum);
           input1.reverse();
            System.out.println(input1);


            for(int i =0; i<stringCardNum.length();i++){
                if (i==0 || i%2==0){
                   counter1 += Integer.parseInt(String.valueOf(input1.charAt(i)));

                }else if(i!=0 || i%2!=0){
                    firstDigit +=(2 * Integer.parseInt(String.valueOf(input1.charAt(i))))/10;
                    secDigit +=(2 * Integer.parseInt(String.valueOf(input1.charAt(i))))%10;
                }

            }
            counter2 += firstDigit+secDigit;
            int counter = counter1 + counter2;

            System.out.println(counter);
            if (counter%10 ==0){
                System.out.println("your credit card number is valid!");
            }else if(counter%10 !=0){
                System.out.println("your credit card number is not valid!");
            }



        }else if(lengthcard != 8){
            System.out.println("you credit card is not eight digits");
        }


    }
}