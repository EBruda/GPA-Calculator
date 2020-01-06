import java.util.Scanner;
import java.util.ArrayList;
import java.text.DecimalFormat;
public class Main
{
    public static void main(String [] args)
    {
        DecimalFormat fmt = new DecimalFormat("0.00");
        ArrayList<Double> grades = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        Scanner scanNum = new Scanner(System.in);
        System.out.println("Hello! Welcome to the GPA Calculator. Please input your grades.");

        System.out.println("-----------------------------------------------");

        System.out.println("How many classes do you have?");
        int numClasses = scanNum.nextInt();

        for(int i = 0; i < numClasses; i++)
        {
            System.out.print("What is the name of the class?: ");
            String className = scan.nextLine();

            System.out.println("Input your grade in " + className);
            double grade = scanNum.nextDouble();

            grades.add(grade);

            grade  = 0.0;
        }

        Calculator calc = new Calculator(grades);
        System.out.println("");
        System.out.println("Your GPA is: " + fmt.format(calc.calcGPA()));

        System.out.println(calc.message(calc.calcGPA()));
    }

}
