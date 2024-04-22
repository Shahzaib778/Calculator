import javax.swing.*;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int Loan = 0;
        float interestRate = 0;
        int numberOfPayment = 0;
        float monthlyInterest = 0;
        System.out.println("Requested Loan Amount $1000 - $1M:");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter: ");
            Loan = scanner.nextInt();
            if (Loan >= 1000 && Loan <= 1000000)
                break;
            System.out.println("Enter Valid Value");

        }


        System.out.println("Requested Loan Interest Rate:");
        while (true) {
            System.out.print("Enter: ");
            interestRate = scanner.nextFloat();
                monthlyInterest = interestRate / 100 / 12;
            if (interestRate >= 1 && interestRate <= 30)
                break;
            System.out.println("Enter Valid Value");
        }


        System.out.println("Time For Loan Amount: ");
        while (true) {
            System.out.print("Enter: ");
            byte years = scanner.nextByte();
            numberOfPayment = years * 12;
            if (numberOfPayment >= 1 && numberOfPayment <= 360)
                break;
            System.out.println("Enter Valid Value");
        }

        double mortage = Loan * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayment)
                / (Math.pow(1 + monthlyInterest, numberOfPayment) - 1));

        String mortageFormated = NumberFormat.getCurrencyInstance().format(mortage);
        System.out.println("Mortage: " + mortageFormated);


    }
}