/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funwithoperators;
import java.util.*;		// import java.util.Scanner; would also work for now
/**
 *
 * @author EricKawamoto
 */
public class FunWithOperators {

    /**
     * @param args the command line arguments
     */
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) 
    {
    /*
        // FunWithOperators 1.0
        System.out.print("Enter a double: ");
        double x = sc.nextDouble();
        System.out.print("Enter another double: ");
        double y = sc.nextDouble();
        double sum = x + y;
        double diff = x - y;
        double prod = x * y;
        double quot = x / y;
        double rem = x % y;
        String s1 = x + " + " + y + " = " + sum;
        String s2 = x + " - " + y + " = " + diff;
        String s3 = x + " * " + y + " = " + prod;
        String s4 = x + " / " + y + " = " + quot;
        String s5 = x + " % " + y + " = " + rem;
        System.out.println(s1 + "\n" + s2 + "\n" + s3 + "\n" + s4 + "\n" + s5);
    */
    
    /*
        // FunWithOperators 1.1
        System.out.print("Enter an integer: ");
        int i = sc.nextInt();
        System.out.print("Enter another integer: ");
        int j = sc.nextInt();
        int sum = i + j;
        int diff = i - j;
        int prod = i * j;
        int quot = i / j;
        int rem = i % j;
        String s1 = i + " + " + j + " = " + sum;
        //System.out.println(s1);
        String s2 = i + " - " + j + " = " + diff;
        //System.out.println(s2);
        String s3 = i + " * " + j + " = " + prod;
        //System.out.println(s3);
        String s4 = i + " / " + j + " = " + quot;
        String s5 = i + " % " + j + " = " + rem;
        System.out.println(s1 + "\n" + s2 + "\n" + s3 + "\n" + s4 + "\n" + s5);
    */

    /*
        // FunWithOperators 1.2
        System.out.print("Enter a number: ");
        double x = sc.nextDouble();
        double xp = +x;
        double xn = -x;
        String s1 = "+(" + x + ") = " + xp + " but -(" + x + ") = " + xn;
        //String s1 = "";
        //s1 = s1 + "+(";
        //s1 = s1 + x;
        //s1 = s1 + ") = ";
        //s1 = s1 + xp;
        System.out.println(s1);
        System.out.print("Enter another number: ");
        double y = sc.nextDouble();
        String s2 = "You entered y = " + y; 
        double ypost = y--;
        String s3 = "ypost = " + ypost + " but y now equals " + y;
        double ypre = --y;
        String s4 = "ypre = " + ypre + " but y now equals " + y; 
        System.out.println(s2 + "\n" + s3 + "\n" + s4);
    */

    /*
        // Debug-It 1.2.1
        double x = 3.4;
        double y = 2.3;
        double z = x - y;
    
        System.out.println(x + " - " + y + " = " + z);
    */

    /*
        // Debug-It 1.2.2
        double x = 3.4;
        double y = 2.3;
        double z = x - y;
    
        System.out.println(x + " - " + y + " = " + z);
    */

    
    /*
        // Debug-It 1.2.3
        double x = 3.4;
        double y = 2;
        double z = x - y;
    
        System.out.println(x + " - " + y + " = " + z);
    */
    
    /*
        // Debug-It 1.2.4
        double x = 3.4;
        double y = 5.7;
        double z = x + 2 * y - 3;
    
        System.out.println(x + " + 2 * " + y + " - 3 = " + z);
    */
    
    /*
        // Debug-It 1.2.5
        double x = 3.4;
        double y = 5.7;
        double z = x - y;
    
        System.out.println(x + " - " + y + " = " + z);
    */
    
    /*
        // Debug-It 1.2.6
        double X = 3.4;
        double Y = 5.7;
        double Z = X - Y;
    
        System.out.println(X + " - " + Y + " = " + Z);
    */

    /*
        // Debug-It 1.2.7
        double X = 3.4;
        double Y = 5.7;
        double Z = X - Y;
    
        System.out.println(X + " - " + Y + " = " + Z);
    */
    
    /*
        // Debug-It 1.2.8
        double x = +3.4;
        double y = -5.7;
        double z = -x + y;
        System.out.println("-" + x + " + " + y + " = " + z);
        z = +x - y;
        System.out.println("+" + x + " - " + y + " = " + z);
    */
    
    /*
        // Debug-It 1.2.9
        double x = 3.4;
        double y = 5.7;
        double z = x + y;
        System.out.println(x + " + " + y + " = " + z);
    */
    
    /*
        // Debug-It 1.2.10
        System.out.print("Enter a number: ");
        //double x = sc.nextLine();
        String s1 = sc.nextLine();
        double x = Double.parseDouble(s1);
        //double x = sc.nextDouble();
        System.out.print("Enter another number: ");
        //double y = sc.nextLine();
        String s2 = sc.nextLine();
        double y = Double.parseDouble(s2);
        //double y = sc.nextDouble();
        double z = x * y;
        System.out.println(x + " * " + y + " = " + z);
    */

    /*
        // Debug-It 1.2.11
        System.out.print("Enter a number: ");
        String s1 = sc.nextLine();
        double x = Double.parseDouble(s1);
        System.out.print("Enter another number: ");
        String s2 = sc.nextLine();
        double y = Double.parseDouble(s2);
        //String s3 = s1 + s2;
        double z = x + y;
        //System.out.println(s1 + " + " + s2 + " = " + s3);
        System.out.println(x + " + " + y + " = " + z);
    */
    
    /*
        // Debug-It 1.2.12
        System.out.print("Enter a name: ");
        String nStr = sc.nextLine();
        System.out.print("Enter this person's grade: ");
        int y = sc.nextInt();
        //String gStr = sc.nextLine();
        //int y = Integer.parseInt(gStr);
        int z = (12 - y) + 2020;
        nStr = nStr + " is in the class of " + z;
        System.out.println(nStr + ".");
    */
    
    /*
        // FunWithOperators 1.3
        //double x1 = 2.0;
        System.out.print("Enter a number:");
        double x1 = sc.nextDouble();
        //double x2 = 3.5;
        System.out.println("Enter a second number:");
        double x2 = sc.nextDouble();
        //double x3 = -4.0;
        System.out.print("Enter a third number: ");
        double x3 = sc.nextDouble();
        double y1 = x1 * x2 + x3;
        double y2 = x1 * (x2 + x3);
        System.out.println("x1 * x2 + x3 = " + y1);
        System.out.println("x1 * (x2 + x3) = " + y2);
        double z1 = x1 - x2 / x3;
        double z2 = (x1 - x2) / x3;
        System.out.println("x1 - x2 / x3 = " + z1);
        System.out.println("(x1 - x2) / x3 = " + z2);
        double w1 = x1 + x2 % x3;
        double w2 = (x1 + x2) % x3;
        System.out.println("x1 + x2 % x3 = " + w1);
        System.out.println("(x1 + x2) % x3 = " + w2);
    */

    /*
        // FunWithOperators 1.4
        int a = 1;
        System.out.println("a = " + a);
        int b = a++;
        System.out.println("a = " + a + ", b = " + b);
        int c = ++a;
        System.out.println("a = " + a + ", c = " + c);
        a /= 3;
        int d = (c * 5) % 4;
        System.out.println("a = " + a + ", d = " + d);
        double x = 3.0;
        System.out.println("x = " + x);
        double y = x--;
        System.out.println("x = " + x + ", y = " + y);
        x *= 2.75;
        double z = (x * 3.0) % 4.0;
        System.out.println("x = " + x + ", z = " + z);
    */
    
    /*
        // FunWithOperators 1.5
        //double x1 = 4.0;
        System.out.print("Enter a number: ");
        double x1 = sc.nextDouble();
        //double x2 = -3.5;
        System.out.print("Enter another number: ");
        double x2 = sc.nextDouble();
        double y1 = Math.abs(x1);
        double y2 = Math.signum(x1);
        System.out.println("abs(" + x1 + ") = " + y1);
        System.out.println("sgn(" + x1 + ") = " + y2);
        double z1 = Math.max(x1, x2);
        double z2 = Math.min(x1, x2);
        System.out.println("max(" + x1 + ", " + x2 + ") = " + z1);
        System.out.println("min(" + x1 + ", " + x2 + ") = " + z2);
        //double w1 = Math.sqrt(Math.abs(x1));
        double w1 = Math.sqrt(x1);
        double w2 = Math.random();
        //System.out.println("sqrt(" + Math.abs(x1) + ") = " + w1);
        System.out.println("sqrt(" + x1 + ") = " + w1);
        System.out.println("random() = " + w2);
        int dice = (int)(1.0 + 6.0 * w2);
        System.out.println("dice = " + dice);
    */
    
    
    /*
        // FunWithOperators 1.6
        //double x1 = 2.9999;
        System.out.print("Enter a number: ");
        double x1 = sc.nextDouble();
        //double x2 = -3.0001;
        System.out.print("Enter another number: ");
        double x2 = sc.nextDouble();
        //double x3 = 2.5;
        System.out.print("Enter yet another number: ");
        double x3 = sc.nextDouble();
        double y1 = Math.floor(x1);
        double y2 = Math.ceil(x2);
        System.out.println("floor(" + x1 + ") = " + y1);
        System.out.println("ceil(" + x2 + ") = " + y2);
        double z1 = Math.rint(x3);
        double z2 = Math.rint(x3 + 1.0);
        System.out.println("rint(" + x3 + ") = " + z1);
        System.out.println("rint(" + (x3 + 1.0) + ") = " + z2);
        int w1 = Math.round((float) x1);
        long w2 = Math.round(x2);
        System.out.println("round(" + x1 + ") = " + w1);
        System.out.println("round(" + x2 + ") = " + w2);        
        long u1 = Math.round(x3);
        long u2 = Math.round(x3 + 1.0);        
        System.out.println("round(" + x3 + ") = " + u1);
        System.out.println("round(" + (x3 + 1.0) + ") = " + u2); 
    */
        
    // two worked examples
    // 1. USD to CAD converter
    // 2. how long does an object take to fall h meters?
        
    /* 
        // exercise 0a: USD to CAN converter
        System.out.print("Enter amount in US dollars: ");
        double amtUSD = sc.nextDouble();
        //System.out.println("the amount you entered was " + amtUSD);
        double amtCAD = 1.33 * amtUSD;
        System.out.println(amtUSD + " US dollars is equivalent to " + amtCAD + " Canadian dollars.");
        System.out.print("Now enter amount in Canadian dollars: ");
        amtCAD = sc.nextDouble();
        amtUSD = amtCAD / 1.33;
        System.out.println(amtCAD + " Canadian dollars is equivalent to " + amtUSD + " US dollars.");
    
        run:
        Enter amount in US dollars: 10.00
        10.0 US dollars is equivalent to 13.3 Canadian dollars.
        Now enter amount in Canadian dollars: 13.3
        13.3 Canadian dollars is equivalent to 10.0 US dollars.
        BUILD SUCCESSFUL (total time: 13 seconds)
    */
        
    /*
        // exercise 0b: how long does an object take to fall?
        System.out.print("Enter height in meters: ");
        double mHgt = sc.nextDouble();
        //System.out.println("You entered " + mHgt + " meters.");
        double sTime = Math.sqrt(2.0 * mHgt / 9.8);
        System.out.println("It will take " + sTime + " sec to fall " + mHgt + " meters.");
    
        run:
        Enter height in meters: 100
        It will take 4.5175395145262565 sec to fall 100.0 meters.
        BUILD SUCCESSFUL (total time: 2 seconds)
    */
    /*
        // exercise 1: mph to fps converter
        System.out.print("Enter speed in mph: ");
        double mphSpeed = sc.nextDouble();
        System.out.println("speed == 5: " + (mphSpeed == 5));
        boolean speed_gte_5 = mphSpeed >= 5;
        System.out.println("speed >= 5: " + speed_gte_5);
    */
    /*
    double x = 5.0, y = 7.5;	
    double z = 12.3;	
    int i = 5, j = 10, k = 15;

    System.out.println(i + " == 5: " + (i == 5));
    System.out.println(i + " > " + j + ": " + (i > j));
    System.out.println(j + " == " + i + " * " + 2 + ": " + (j == i * 2));
    boolean b4 = k < z;
    System.out.println(k + " < " + z + ": " + b4);
    boolean b5 = x + y > z;
    System.out.println(x + " + " + y + " > " + z + ": " + b5);
    boolean b6 = i + j != k;
    System.out.println(i + " + " + j + " != " + k + ": " + b6);
    */
    /*
    double price = 10.00;
    System.out.print("Enter age: ");
    int age = sc.nextInt();
    if (age < 12)
	if (age < 3)
		price = 0.00;
    else
	if (age > 65)
            price = 5.00;
    System.out.println("For age " + age + ", the ticket price is " + price);        
    */
    double price = -1.0;
    System.out.print("Enter age: ");
    int age = sc.nextInt();
    if (age > 65)
    {
        price = 5.00;
    }
    else if (age > 12)
    {
        price = 10.00;
    }
    else if (age > 3)
    {
        price = 3.00;
    }
    /*
    else
    {
        price = 0.00;
    }
    */
    System.out.println("For age " + age + ", the ticket price is " + price);
    if (age > 0)
    {
        price = 0.00;
    }
    else if (age > 3)
    {
        price = 3.00;
    }
    else if (age > 12)
    {
        price = 10.00;
    }
    else if (age > 65)
    {
        price = 5.00;
    }
    System.out.println("For age " + age + ", the ticket price is " + price + " with reverse ladder."); 
        
    /*
        // some helpful prompts for exercises in 1.7

        System.out.print("Enter speed in mph: ");
        double mphSpeed = sc.nextDouble();
    
        System.out.print("Enter total pre-tax amount of bill: ");
        double ptAmt = sc.nextDouble();
        System.out.print("Now enter total number in party: ");
        int num = sc.nextInt();
    
        System.out.print("Enter distance in meters: ");
        double mDist = sc.nextDouble();
    
        System.out.print("Enter temperature in degrees F: ");
        double fTemp = sc.nextDouble();

        System.out.print("Enter present value (principal) in dollars: ");
        double dPV = sc.nextDouble();
        System.out.print("Now enter term in years: ");
        double yTerm = sc.nextDouble();
    
    */
        
        
        
        
    }
    
}
