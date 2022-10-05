//Importing scanner so i can get user input
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //creating a variable so its easier to write the code to add user input
        Scanner input = new Scanner(System.in);

        // Code to take user input and store in variables
        System.out.println("Please enter the amount you'd like to calculate: ");
        double originalBill = input.nextDouble();
        System.out.println("Please enter the tip percent: ");
        double tipPercent = input.nextDouble();
        System.out.println("Please enter the number of people: ");
        int numPeople = input.nextInt();

        //calculations
        double totalTip = originalBill * (tipPercent/100.0);
        double totalBill = originalBill + totalTip;
        double tipEach = totalTip / (double)numPeople;
        double billEach = totalBill / (double) numPeople;

        //rounding
        totalTip = Math.round(totalTip * 100.0) / 100.0;
        totalBill = Math.round(totalBill * 100.0) / 100.0;
        tipEach = Math.round(tipEach * 100.0) / 100.0;
        billEach = Math.round(billEach * 100.0) / 100.0;

        //printing everything out in the right format!

        System.out.println("The total tip is: " + totalTip + " dollars");
        System.out.println("The total bill including the tip is: " + totalBill + " dollars");
        System.out.println("Each person needs to pay " + tipEach + " dollars in tips");
        System.out.println("Each person will need to pay " + billEach + " dollars");



        }

    }