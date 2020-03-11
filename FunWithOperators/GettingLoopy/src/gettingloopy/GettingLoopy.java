/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gettingloopy;
import java.util.*;                 // be sure to cut-and-paste this line

/**
 *
 * @author EricKawamoto
 */
public class GettingLoopy 
{

    /**
     * @param args the command line arguments
     */
     public static String makeHelloWorldString()
    {
        return "Hello again, world!";
    }
    
    static Scanner sc = new Scanner(System.in);     // as well as this line
    public static void main(String[] args) 
    {
        
    /*
        // GettingLoopy 1.0 (slide 10)
        System.out.print("Enter boarding zone: ");
        byte zone = sc.nextByte();
        //int zone = sc.nextInt();
        //long zone = sc.nextLong();
        //double zone = sc.nextDouble();
        switch (zone)
        {
            case 1:
                System.out.println("First class");
                break;
            case 2:
                System.out.println("Business class");
                break;	
            case 3:
                System.out.println("Economy plus");
                break;
            case 4:                    
                System.out.println("Basic economy");
                break;
            default:  // catches everything not handled by other cases
                System.out.println("Cargo hold");
                break;
        }
    */
    
    
    /*
        // GettingLoopy 1.0.1 (slide 12)
        System.out.print("Enter boarding zone: ");
        String zStr = sc.next();
        char zone = zStr.charAt(0);
        if (zone == '1')
        {
            System.out.println("First class");            
        }
        else
        {
            if (zone == '2')
            {
                System.out.println("Business class");
            }
            else
            {
                if (zone == '3')
                {
                    System.out.println("Economy plus");
                }
                else
                {
                    if (zone == '4')
                    {
                        System.out.println("Basic economy");
                    }
                    else
                    {
                        System.out.println("Cargo hold");
                    } // end of fourth else block
                } // end of third else block
            } // end of second else block
        } // end of first (outermost) else block
    */    

        
   /*
        // GettingLoopy 1.0.2 (slide 13)
        System.out.print("Enter boarding zone: ");
        String zStr = sc.next();
        char zone = zStr.charAt(0);
        if (zone == '1')
        {
            System.out.println("First class");
        }
        else if (zone == '2')
        {
            System.out.println("Business class");
        }
        else if (zone == '3')
        {
            System.out.println("Economy plus");
        }
        else if (zone == '4')
        {
            System.out.println("Basic economy");
        }
        else  // catches everything not handled by above else-if's
        {
            System.out.println("Cargo hold");
        }
    */
    
    
    /*
        // GettingLoopy 1.0.3 (slide 14)
        System.out.print("Enter boarding zone: ");
        String zStr = sc.next();
        //System.out.println(zStr + " has length " + zStr.length());
        char zone = zStr.charAt(0);
        switch (zone)
        {
            case '1':
                System.out.println("First class");
                break;
            case '2':
                System.out.println("Business class");
                break;	
            case '3':
                System.out.println("Economy plus");
                break;
            case '4':
                System.out.println("Basic economy");
                break;
            default: // catches everything not handled by other cases
                System.out.println("Cargo hold");
                break;
        }
    */

        
    /*
        // GettingLoopy 1.1 (slide 15)
        System.out.println("Welcome to the Baxter Car Wash Fundraiser!");
        System.out.println("Package A: The basic - wash, vacuum, hand-dry (9.98)");
        System.out.println("Package B: Package A + wax (add 4.00)");
        System.out.println("Package C: Package B + wheels and undercarriage (add 7.00)");
        System.out.println("Package D: Package C + Rain-X (add 5.00)");
        System.out.println("Package E: The works - Package D + detailing (add 10.00)");
        System.out.print("\nWhat kind of car wash package would you like? ");
        String myStr = sc.next();
        char pkg = myStr.toLowerCase().charAt(0);
        System.out.println("myStr = " + myStr + "; myStr.toLowerCase() = " + myStr.toLowerCase());

        String details = "";
        double price = 0.0;
        switch (pkg)
        {
            //case 'E':
            case 'e':
                details += "detailing + ";
                price += 10.00;
            //case 'D':
            case 'd':
                details += "Rain-X + ";
                price += 5.00;
            //case 'C':
            case 'c':
                details += "wheels and undercarriage + ";
                price += 7.00;
            //case 'B':
            case 'b':
                details += "wax + ";
                price += 4.00;
            //case 'A':
            case 'a':
                details += "wash, vacuum, and hand-dry";
                price += 9.98;
                break;
            default:
                details += "invalid option!";
        }
        System.out.println("You chose " + pkg + ": " + details);
        System.out.println("The total price is " + price);
    */

        
    /*
        //printHelloWorld();  // this is a callable function within our application class
        String s = makeHelloWorldString();  // this is a callable function within our application class
        System.out.println(s);
    */
        
    
    /*
        // GettingLoopy 1.1.1 (slide 20)
        System.out.println("Welcome to the Baxter Car Wash Fundraiser!");
        System.out.println("Package A: The basic - wash, vacuum, hand-dry (9.98)");
        System.out.println("Package B: Package A + wax (add 4.00)");
        System.out.println("Package C: Package B + wheels and undercarriage (add 7.00)");
        System.out.println("Package D: Package C + Rain-X (add 5.00)");
        System.out.println("Package E: The works - Package D + detailing (add 10.00)");
        System.out.print("\nWhat kind of car wash package would you like? ");
        String myStr = sc.next();
        char pkg = myStr.charAt(0);

        String details = "";
        double price = 0.0;
        switch (pkg)
        {
            case 'E':
            case 'e':
                details = pkgA() + pkgB() + pkgC() + pkgD() + pkgE();
                price = 9.98 + 4.00 + 7.00 + 5.00 + 10.00;
                break;
            case 'D':
            case 'd':
                details = pkgA() + pkgB() + pkgC() + pkgD();
                price = 9.98 + 4.00 + 7.00 + 5.00;
                break;
            case 'C':
            case 'c':
                details = pkgA() + pkgB() + pkgC();
                price = 9.98 + 4.00 + 7.00;
                break;
            case 'B':
            case 'b':
                details = pkgA() + pkgB();
                price = 9.98 + 4.00;
                break;
            case 'A':
            case 'a':
                details = pkgA();
                price = 9.98;
                break;
            default:
                details += "invalid option!";
        }
        System.out.println("You chose " + pkg + ": " + details);
        System.out.println("The total price is " + price);        
    */

        
    /*
        // User-defined functions (slides 21, 22)
        //double x = Math.random();
        //int i = (int) Math.floor((6.0 * x) + 1.0);
        System.out.print("Enter a number between 1 and 6: ");
        int j = sc.nextInt();
        int i = generateRandomInteger(1, 6);
        System.out.println("You guessed " + j + ", and I rolled " + i);
        if (i == j)
        {
            System.out.println("You guessed the correct number!");
        }
    */
    

    /*    
        // a simple while loop (slide 24)
        int num = 2;
        // while (num <= 20)
        // while (num > 20)
        //while (num != 20)
        while (num != 21)
        {
            System.out.print(num + " ");
            num += 2;
        }
        System.out.println();    
    */
    
    
    /*
        // the break statement (slide 25)
        int num = 2;
        //while (num <= 20)
        while (num != 21)
        {
            System.out.print(num + " ");
            num += 2;
            if (num > 100)  // this ensures that the while loop will terminate when num exceeds 100
            {
                break;
            }
        }
        System.out.println();
    */
    
    
    /*
        // the continue statement (slide 26)
        int num = 0;
        // while (num <= 20)
        while (true)
        {
            num += 2;
            // if (num == 12)  // this ensures that the while loop will skip printing the number 12
            // if (num > 12)
            if (num == 22)
            {
                // continue;
                break;
            }
            System.out.print(num + " ");
        }
        System.out.println();
    */
        

    /*
        // GettingLoopy 1.2 (slides 27, 28)
        boolean bCalculate = true;
        double x, y, z;
	while (bCalculate)
	{
            System.out.print("Enter a number x: ");
            x = sc.nextDouble();
            System.out.print("Enter another number y: ");
            y = sc.nextDouble();
            System.out.print("Enter + to add, - to subtract, ");
            System.out.print("* to multiply, / to divide, or q to quit: ");
            String strOp = sc.next();
            char chrOp = strOp.charAt(0);
            switch (chrOp)
            {
                case '+':
                    z = x + y;
                    printOperationString(x, y, z, chrOp);
                    break;                    
                case '-':
                    z = x - y;
                    printOperationString(x, y, z, chrOp);
                    break;                    
                case '*':
                    z = x * y;
                    printOperationString(x, y, z, chrOp);
                    break;
                case '/':
                    if (y != 0)
                    {
                        z = x / y;
                        printOperationString(x, y, z, chrOp);
                    }
                    else
                    {
                        System.out.println("Division by zero is not allowed!");
                    }
                    break;
                default:
                    bCalculate = false;
            }  // end of switch block
        }  // end of while block
    */

        
    /*
        // GettingLoopy 1.2.1 (slides 29, 30)
        boolean bCalculate = true;
        double x, y, z;
	while (true)
	{
            System.out.print("Enter a number x: ");
            x = sc.nextDouble();
            System.out.print("Enter another number y: ");
            y = sc.nextDouble();
            System.out.print("Enter + to add, - to subtract, ");
            System.out.print("* to multiply, / to divide, or q to quit: ");
            String strOp = sc.next();
            char chrOp = strOp.charAt(0);
            switch (chrOp)
            {
                case '+':
                    z = x + y;
                    printOperationString(x, y, z, chrOp);
                    break;                    
                case '-':
                    z = x - y;
                    printOperationString(x, y, z, chrOp);
                    break;                    
                case '*':
                    z = x * y;
                    printOperationString(x, y, z, chrOp);
                    break;
                case '/':
                    if (y != 0)
                    {
                        z = x / y;
                        printOperationString(x, y, z, chrOp);
                    }
                    else
                    {
                        System.out.println("Division by zero is not allowed!");
                    }
                    break;
                default:
                    bCalculate = false;
            }  // end of switch block
            
            if (!bCalculate)
            {
                break;  // this break statement terminates the enclosing while loop
            }
            
        }  // end of while block   
    */
        
        
    /*
        // example of a do-while loop (slide 32)
        // int num = 2;
        int num = 20;
        do
        {
            System.out.print(num + " ");
            num += 2;
        } while (num <= 20) ;
        //while (num != 21);
        System.out.println();
    */
    
        
    /*
        // GettingLoopy 1.2.2 (slides 33, 34)
        boolean bCalculate = true;
        double x, y, z;
	do
	{
            System.out.print("Enter a number x: ");
            x = sc.nextDouble();
            System.out.print("Enter another number y: ");
            y = sc.nextDouble();
            System.out.print("Enter + to add, - to subtract, ");
            System.out.print("* to multiply, / to divide, or q to quit: ");
            String strOp = sc.next();
            char chrOp = strOp.charAt(0);
            switch (chrOp)
            {
                case '+':
                    z = x + y;
                    printOperationString(x, y, z, chrOp);
                    break;                    
                case '-':
                    z = x - y;
                    printOperationString(x, y, z, chrOp);
                    break;                    
                case '*':
                    z = x * y;
                    printOperationString(x, y, z, chrOp);
                    break;
                case '/':
                    if (y != 0)
                    {
                        z = x / y;
                        printOperationString(x, y, z, chrOp);
                    }
                    else
                    {
                        System.out.println("Division by zero is not allowed!");
                    }
                    break;
                default:
                    bCalculate = false;
            }  // end of switch block
            
            if (!bCalculate)
            {
                break;  // this break statement terminates the enclosing while loop
            }
            
        } while (bCalculate);
    */

        
    /*
        // Debug-It 1.3 exercises (slide 35) go here
    */         
        
        
    /*
        // example of a simple for loop (slide 37)
        int sum = 0;
        for (int i = 1; i <= 10; i++)
        {
            sum += i;
            System.out.print("the sum of the first ");
            System.out.println(i + " integers is " + sum);
        }
    */    

        
    /*    
        // GettingLoopy 1.4 (slide 38)
        System.out.println("You get 10 chances to guess my random number.");
        int rand = generateRandomInteger(1, 100);
        //int i;
        for (int i = 1; i <= 10; i += 2)
        // for (int i = 10; i >= 1; i--)
        {            
            System.out.print("Enter an integer between 1 and 100: ");
            int guess = sc.nextInt();
            if (guess < rand)
            {
                System.out.println(i + ": your guess (" + guess + ") is too low.");
            }
            else if (guess > rand)
            {
                System.out.println(i + ": your guess (" + guess + ") is too high.");
            }
            else
            {
                System.out.println(i + ": your guess (" + guess + ") is correct!");
                break;
            }
        }
        // System.out.println("the final value of i is " + i);
    */
        
        
    /*
        // GettingLoopy 1.5 (slide 39)
        System.out.println("Roll a die until we get three of the same numbers in a row.");
        int a1 = 0;
        int a2 = 0;
        for (int i = 1; ; i++)
        {            
            int a0 = generateRandomInteger(1, 6);
            System.out.print(a0 + " ");
            if (a0 == a1 && a1 == a2)
            {
                System.out.println("\nWe got three " + a0 + "'s in a row after " + i + " rolls.");
                break;
            }
            a2 = a1;
            a1 = a0;
        }
    */

        
    /*
        // nested for loops (slide 40)
        System.out.println("This prints the algebraic notation for the squares of a chessboard: ");
        for (int row = 8; row >= 1; row--)
        {
            for (int col = 1; col <= 8; col++)
            {
                char c = (char)('a' + col - 1);
                System.out.print(c);
                System.out.print(row);                
                System.out.print(" ");
            }
            System.out.println();
        }
    */

        
    /*
        // Introduction to arrays (slides 41, 42)
        int[] iArr = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55};
        String[] sDays = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        for (int i = 0; i < 10; i++)
        {
            System.out.println("F[" + i + "] = " + iArr[i]);
        }
        System.out.println("length of iArr is " + iArr.length);
        System.out.println("length of sDays is " + sDays.length);
        System.out.println("length of sDays[1] is " + sDays[1].length());
    */
        
        
    /*
        // GettingLoopy 1.5.1 (slide 43)
        System.out.println("Roll a die until we get three of the same numbers in a row.");
        int[] a = {0, 0, 0, 0};
        for (int i = 1; ; i++)
        {            
            //a[0] = generateRandomInteger(1, 6);
            a[0] = generateRandomInteger(1, 20);
            System.out.print(a[0] + " ");
            //if (a[0] == a[1] && a[1] == a[2])
            //if (a[0] == a[1] && a[1] == a[2] && a[2] == a[3])
            if (a[0] == a[1])
            {
                //System.out.println("\nWe got three " + a[0] + "'s in a row after " + i + " rolls.");
                //System.out.println("\nWe got four " + a[0] + "'s in a row after " + i + " rolls.");
                System.out.println("\nWe got two " + a[0] + "'s in a row after " + i + " rolls.");
                break;
            }
            //a[3] = a[2];
            //a[2] = a[1];
            a[1] = a[0];
        }
    */

        
    ///*
        // GettingLoopy 1.6 (slide 44)
        int nPeople = 10;
        System.out.println("Enter height values (in inches) for " + nPeople + " students.");
        int[] hArr = new int[nPeople];
        int hMax = 0, hMin = 1200;
        int hSum = 0, hAvg = 0;
        for (int i = 0; i < nPeople; i++)
        {
            System.out.print("height of student " + (i + 1) + ": ");
            hArr[i] = sc.nextInt();
            hSum += hArr[i];
            if (hArr[i] > hMax)
            {
                hMax = hArr[i];
            }
            if (hArr[i] < hMin)
            {
                hMin = hArr[i];
            }
        }
        hAvg = hSum / nPeople;
        System.out.println("\nFor " + nPeople + " students: ");
        System.out.println("the minimum height is " + hMin + " inches,");
        System.out.println("the maximum height is " + hMax + " inches,");
        System.out.println("and the average height is " + hAvg + " inches.");
    //*/
    
    }  // end of main()
    
    // user-defined functions in scope of application's public class
    // this function simply prints a string, returns nothing
    public static void printHelloWorld()  
    {
        System.out.println("Hello, world!");
    }    
    // this function just returns a string
    /*
    public static String makeHelloWorldString()
    {
        return "Hello again, world!";
    }
    */
    
    // these next five functions just return a string
    public static String pkgA()
    {
        return "wash, vacuum, and hand-dry";
    }
    public static String pkgB()
    {
        return " + wax";
    }
    public static String pkgC()
    {
        return " + wheels and undercarriage";
    }
    public static String pkgD()
    {
        return " + Rain-X";
    }
    public static String pkgE()
    {
        return " + detailing";
    }

    // note the two input parameters, or arguments
    // this function returns an int
    public static int generateRandomInteger(int minVal, int maxVal)  
    {
        double x = Math.random();
        int n = (int)(Math.floor(x * (double) maxVal + (double) minVal));
        return n;
    }
    
    // note the four input parameters, or arguments
    // this function simply prints a string, returns nothing
    public static void printOperationString(double x, double y, double z, char c)
    { 
        System.out.println(x + " " + c + " " + y + " = " + z);
    }    
    
    
}  // end of public class GettingLoopy
