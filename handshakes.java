import java.util.Scanner;
public class handshakes {
    public static int count_Handshakes(){

        Scanner a = new Scanner(System.in);
        int numPeople = a.nextInt();
        int numberofPeopleinRoom = 0;
        int numberofhandshakes = 0;

        for(int i=1; i<numPeople; i++){
            numberofPeopleinRoom+=1;
            numberofhandshakes += numberofPeopleinRoom;

        }

//return numberofhandshakes;
        return numberofhandshakes;

    }

}

