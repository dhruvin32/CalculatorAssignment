import java.util.Scanner;

public class Calculator {
    public double evaluate(double a,double b){
        return  a+b;
    }

    public static void main(String[] args){
        //double a = Double.parseDouble(args[0]);
        //double b = Double.parseDouble(args[1]);
        Scanner sc= new Scanner(System.in);
        //double a = Double.parseDouble("1");
        //double b = Double.parseDouble("2");

        double a = Double.parseDouble(sc.nextLine());
        double b = Double.parseDouble(sc.nextLine());

        Calculator calculator = new Calculator();
        System.out.println("Sum of two number " + a + " and " + b +" is " + calculator.evaluate(a,b));
    }
}
