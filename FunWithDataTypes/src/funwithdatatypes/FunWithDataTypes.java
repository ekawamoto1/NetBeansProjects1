
package funwithdatatypes;

/**
 *
 * @author EricKawamoto
 */
public class FunWithDataTypes 
{

    public static void main(String[] args) 
    {
 
    /*
	// FunWithDataTypes 1.0
	int i = 2;
	int j = 3;
	int k = i + j;
	System.out.println("The value of k is " + k);
    */

    /*
    int i = 100;
    long j = i;	// 4-byte int i -> 8-byte long j
    float x = j;	// 8-byte long j -> 4-byte float x
    System.out.println("Int value is " + i);    // int i converted to String
    System.out.println("Long value is " + j);   // long j converted to String
    System.out.println("Float value is " + x);  // float x converted to String
    */
    
    /*
    double x = 100.04;	// double is 8 bytes wide
    // the following conversion truncates the fractional part of x
    long j = (long) x;	// 8-byte double x -> 8-byte long j
    int k = (int) j;		// 8-byte long j -> 4-byte int k
    System.out.println("Double value is " + x);  // double x converted to String
    System.out.println("Long value is " + j);    // long j converted to String
    System.out.println("Int value is " + k);     // int k converted to String
    */
        
    /*
	// explicit conversions to String from primitive types (slide 14)
        int i = 3;
	String s1 = Integer.toString(i);
        
	double x = 3.1415926;
	String s2 = Double.toString(x);

	long j = 1234567890123456789L;
	String s3 = Long.toString(j);

	System.out.println("Int to string: " + s1);
        System.out.println("Double to string: " + s2);
        System.out.println("Long to string: " + s3);
    */

    /*
	// wrapping and unwrapping (slide 16)
        Integer wrap = 10;
        System.out.println("wrapped Integer value: " + wrap);

        int prim = wrap;
        System.out.println("primitive int value: " + prim);
    */

    /*
	// conversions from String to primitive types (slide 17)
        int x = Integer.parseInt("100");

        String sPi = "3.1415926";
	double dPi = Double.parseDouble(sPi);

	String sLong = "1234567890123456789";
	long j = Long.parseLong(sLong);

	System.out.println("String to int: " + x);
        System.out.println("String to double: " + dPi);
        System.out.println("String to long: " + j);
    */

    /*
	// FunWithDataTypes 1.1
	int i = 3;
	double x = 3.1415926;
	double y = i + x;

	System.out.println("Int + double: " + y);
    */

    /*
	// why won't this work? (slides 21, 22)
	int i = 3.2;
	double x = 3.1415926;
	double y = i + x;

      	System.out.println("Int + double: " + y);
    */

    /*
	// why won't this work? (slides 23, 24)
	int i = 3;
	double x = 3.1415926;
	int j = i + x;

      	System.out.println("Int + double: " + j);
    */

    /*
	// why won't this work, either? (slides 25, 26)
	int i = 3;
	double x = 3.1415926;
	long j = i + x;

      	System.out.println("Int + double: " + j);
    */

    /*
        // why the heck won't this work? (slides 27, 28)
	int i = 3;
	float x = 3.1415926;
	double y = i + x;

      	System.out.println("Int + float: " + y);
    */

    /*
	// now this works! (slides 29, 30)
        int i = 3;
	float x = (float) 3.1415926;
	double y = i + x;

      	System.out.println("Int + float: " + y);
    */

    /*
	// this sort-of works (slides 31, 32)
	long i = 3L;
	float x = 3.1415926F;
	double y = i + x;

      	System.out.println("Int + float: " + y);
    */
    /*
    // exercise 1
    System.out.println("Hello" + "World");
   
    run:
    HelloWorld
    BUILD SUCCESSFUL (total time: 0 seconds)
    */
        
    // exercise 2
    	int i = 2;
	int j = 3;
	int k = i + j;
	System.out.println("The value of 2 + 3 is " + k);
        
        
        
        
    }
    
}
