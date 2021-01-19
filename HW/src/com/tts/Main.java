package com.tts;
import java.util.*;
import static java.lang.Double.valueOf;
public class Main {


//    public static void main(String[] args) {

//        int i;
//        int number = 0;
//        int sum = 0;
//
//        System.out.println("Please print 5 numbers: ");
//
//        for( i=0; i<5; i++) {
//        Scanner input = new Scanner(System.in);
//        number = input.nextInt();
//        sum += number;
//
//        }
//    }

//        int[] sumArray = {2, 4, 6, 8, 10, 20};
//        int sum = 0;
//        for (int i : sumArray) {
//            sum += i;
//        }
//        System.out.println("The sum of the array is: " + sum);
//    }

//    public static void main(String[] args) {
//	// write your code here
//
//        double[ ] exampleArray = {1,5,6,5,4,1};
//        double maximum = exampleArray[0];
//        int index = 0;
//        for (int i = 1; i<exampleArray.length; i++){
//            if (exampleArray[i] > maximum) {
//                maximum = exampleArray[i];
//                index = i;
//            }
//        }
//
//        // What is the output?
//        System.out.println("The index position is [" + index + "] and the value is " + maximum + ".");
//        // the index position is 2, the value is 6
//
//    }

    // Write a public static method called "toPower" that takes in as parameters two integers called size and power.
    // The method should return an array of size "size" with each array index raised to the value of "power."
    // So, for example, if we passed in "size = 4" and "power = 2" to the "toPower,"
    // the method should return the following result: [0,1,4,9].



//    public static void main(String[] args) {
//
//        double sizeArray = toPower(4, 2);
//        System.out.println(sizeArray);
//    }
//
//        public static double toPower(int size, int power) {
////            System.out.println(Math.pow(size, power));
//            return Math.pow(size, power);
//
////            double[] sizeArray = new double[size];
////            for(int i=0; i<size; i++) {
////                sizeArray[i] = Math.pow( (i), (power));
////            }
//        }
//}


    public static void main(String[] args) {
        int size = 4;
        int power = 2;
        double[] result = toPower(size, power);
        System.out.print("Your Size array: "+ Arrays.toString(result));
    }       public static double[] toPower(int size, int power){
        double[] output = new double[size];
        for(int i=0; i<size; i++){
            output[i] = Math.pow(valueOf(i), valueOf(power));
        }
        return output;
    }
}


