import java.util.Scanner;

public class allpurpose {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        threeprob thrpro = new threeprob();
        System.out.println("Enter an integer: 👇");
        int integerInput = inp.nextInt();

        int checkNumberVar = thrpro.convertNumber(integerInput);
        System.out.println("Number is " +  checkNumberVar);

        
        System.out.println("Total Number of digits " + thrpro.countDigit(checkNumberVar));
        System.out.println("Total Number of odd digits "+thrpro.oddFinder(checkNumberVar));
        System.out.println("Total count " + thrpro.CountTotal(checkNumberVar));




// secondary functions

// ========================================================================================

//        handshakes hello = new handshakes();
//        System.out.println(hello.count_Handshakes());
        //  bittodecimal obj = new bittodecimal();
        //  obj.bitToDec("1100");
        //  bittodecimal.bitToDec("1111111");




    }

    
    }