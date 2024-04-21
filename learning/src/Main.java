import java.text.NumberFormat;
import java.util.Date;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.print("Requested Loan Amount: ");
        int Loan = scanner.nextInt();

        System.out.print("Requested Loan Interest Rate: ");
        float interestRate = scanner.nextFloat();
        float monthlyInterest = interestRate / 100 / 12;

        System.out.print("Time For Loan Amount: ");
        byte years = scanner.nextByte();
        int numberOfPayment = years * 12;

        double mortage = Loan * (monthlyInterest * Math.pow(1+monthlyInterest,numberOfPayment)
                /(Math.pow(1+monthlyInterest,numberOfPayment)-1) );

        String mortageFormated = NumberFormat.getCurrencyInstance().format(mortage);
        System.out.println("Mortage: "+ mortageFormated);






    }


}