import java.util.Scanner;

public class payCheck {
    public void createPayCheck(){
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = inp.nextLine();
        System.out.println("Enter your hourly wage: ");
        double hourlyWage = inp.nextDouble();
        System.out.println("Enter the total number of work hours: ");
        double workHours = inp.nextDouble();

        if(workHours>40){
            double ExceededworkHours = workHours - 40;
            double exceedhourlyWage = (double)(hourlyWage/100) * 150;
            System.out.println(name);
            System.out.println("Your wage for total "+workHours +" is: "+ ((40 * hourlyWage)+(ExceededworkHours * exceedhourlyWage)));

        }else{
            System.out.println("Name: " + name);
            System.out.println("Your Wage for total "+workHours+" is: " + workHours * hourlyWage);

        }




    }
}
