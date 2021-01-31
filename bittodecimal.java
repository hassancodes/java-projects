public class bittodecimal{
    public static void bitToDec(String bits){

        int decimal=0;

        for(int i =0; i<bits.length(); ++i){
             int a = Integer.parseInt(String.valueOf(bits.charAt(i)));
            decimal += a  *  (int)Math.pow(2,bits.length()-(i+1));
            
        }
        System.out.println(decimal);

    }

}