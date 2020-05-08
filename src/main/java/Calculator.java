import java.util.Scanner;

import static java.lang.Math.pow;

public class Calculator {
    public double evaluate(double a,double b,String op){
        double ans=0;
        switch (op){
            case "+":
                ans =  a+b;
                break;
            case "-":
                ans= a-b;
                break;
            case "*":
                ans= a*b;
                break;
            case "/":
                ans= a/b;
                break;
            case "^":
                ans = pow(a,b);
                break;
            default:
                ans = -11111;
                break;
        }
        return  ans;
    }

    public static void main(String[] args){
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[2]);
        String op = args[1];
        //Scanner sc= new Scanner(System.in);
        //double a = Double.parseDouble("1");
        //double b = Double.parseDouble("2");

        //double a = Double.parseDouble(sc.nextLine());
        //double b = Double.parseDouble(sc.nextLine());

        Calculator calculator = new Calculator();
        System.out.println("result is  " + calculator.evaluate(a,b,op));
    }
}
