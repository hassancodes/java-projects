// three in one problem
public class threeprob{

//  convert number function
public int convertNumber ( int integerInput){
    int saveNumber;

    if (integerInput != -integerInput) {
        saveNumber = integerInput;
    } else {
        saveNumber = integerInput + (2 * integerInput);
    }
    return saveNumber;
}


//    countTotal
public int CountTotal(int number) {
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
    public int oddFinder ( int number){
        String newStr = Integer.toString(number);
        int oddNumber = 0;

        for (int i = 0; i < newStr.length(); i++) {
            if (newStr.charAt(i) == 1 || newStr.charAt(i) % 2 == 1) {
                oddNumber += 1;
            }
        }
        return oddNumber;

    }
    public int countDigit ( int number){
        int count = 0;
        while (number != 0) { 
            number = number / 10;
            ++count;
        }
        return count;
    }


}