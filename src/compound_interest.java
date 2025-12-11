import java.util.Scanner;

public class compound_interest {

    public static void main(String[] args) {
        //Hypotenuse = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
        //Compound Interest : A = P(1 + r/n)nt
        Scanner input = new Scanner(System.in);

        double totalBalance ;

        double initialBalance;//P
        double interestRate;//r
        int numberOfTime;//n
        int numberOfYear;//t

        System.out.print("Enter the pricipal Amount: ");
        initialBalance = input.nextDouble();

        System.out.print("Enter interest rate (in %): ");
        interestRate = input.nextDouble() * 0.01;

        System.out.print("Enter number of time compound per year: ");
        numberOfTime = input.nextInt();

        System.out.print("Enter number of year: ");
        numberOfYear = input.nextInt();

        totalBalance = initialBalance * (Math.pow((1 + interestRate/numberOfTime),(numberOfTime * numberOfYear))) ;

        System.out.printf("The amount after %d years is %.2f",numberOfYear,totalBalance);

        input.close();
    }
}
