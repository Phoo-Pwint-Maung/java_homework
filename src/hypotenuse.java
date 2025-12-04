import java.util.Scanner;

public class hypotenuse {

    public static void main(String[] args) {
        //Hypotenuse = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
        Scanner input = new Scanner(System.in);

        double hypo;
        double a;
        double b;
        double radius;
        double circumference;
        double area;
        double volume;

        System.out.println("Searching for hypotenuse value");

        System.out.print("Enter the length of side A: ");
        a = input.nextDouble();

        System.out.print("Enter the length of side B: ");
        b = input.nextDouble();

        hypo = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));

        System.out.println("Hypotenuse value: " + hypo + "\n");

        System.out.println("Searching for circumference , area , volume of circle");
        System.out.print("Enter radius value: ");
        radius = input.nextDouble();

        //circumference  C = Math.PI * 2 * radius
        circumference = Math.PI * 2 * radius;
        //Circle area  A = Math.PI * Math.pow(radius,2)
        area = Math.PI * Math.pow(radius,2);
        //Volume  V = (4/3) * Math.PI * Math.pow(radius,3);
        volume = (4/3) * Math.PI * Math.pow(radius,3);

        System.out.println("Circumference value: " + circumference);
        System.out.println("Area value: " + area);
        System.out.println("Volume value: " + volume);

        input.close();
    }
}
