package Module2;


import java.util.Arrays;

/**
 * Revised by George on 20/02/2017.
 */

public class Assignment1{
    public static void main(String[] args) {
        int[] intArray = {5, 2, -5, 10, -11, 9, 6, -3, 4, -1};
        double[] doubleArray = {1.44, 7.62, 5.45, 5.56, 6.2, -5.15, -6.66, -2.34, -4.43, 8.88};

        System.out.println("Array of integers: " + Arrays.toString(intArray));
        System.out.println("Array of doubles: " + Arrays.toString(doubleArray));

        //sum output
        System.out.println("\n\tSum of integers: " + sum(intArray));
        System.out.println("\n\tSum of doubles: " + sum(doubleArray));

        //min output
        System.out.println("\n\tMinimal of integers: " + min(intArray));
        System.out.println("\n\tMinimal of doubles :" + min(doubleArray));

        //max output
        if (secondMax(intArray) != 0) {

            System.out.println("\n\tMaximal of integers: " + max(intArray));
        } else  if (secondMax(intArray) ==0){
            System.out.println("\n\tNo positive values found");
        }
        if (secondMax(doubleArray) != 0){
            System.out.println("\n\tMaximal of doubles: " + max(doubleArray));
        }   else if (secondMax(doubleArray)==0) {
            System.out.println("\n\tNo positive values found");
        }


        //max positive output
        if (maxPositive(intArray) <0){
            System.out.println("No positive values found");
        }
        else {
            System.out.println("\n\tMaximal positive of integers: " + maxPositive(intArray));
        }
        if (maxPositive(doubleArray)<0){
            System.out.println("No positive values found");
        }
        else    {
            System.out.println("\n\tMaximal positive of doubles: " +maxPositive(doubleArray));
        }

        //multiplication output
        System.out.println("\n\tProduct of integers: "+multiplication(intArray));
        System.out.println("\n\tProduct of doubles: "+multiplication(doubleArray));

        //modulus output
        System.out.println("\n\tModulus of integers: " +modulus(intArray));
        System.out.println("\n\tModulus of doubles: " +modulus(doubleArray));

        //second largest element output
        if (secondMax(intArray) !=0) {
            System.out.println("\n\tSecond largest of integers: " + secondMax(intArray));
        }
        else {
            System.out.println(intArray[0]);
        }
        if (secondMax(doubleArray)!=0) {
            System.out.println("\n\tSecond largest of doubles: " + secondMax(doubleArray));
        }
        else {
            System.out.println(doubleArray[0]);
        }
    }
    //sum from integers
    private static int sum (int [] intArray){
        int sum = 0;
        for (int currentArray:intArray){
            sum +=currentArray;
        }
        return sum;
    }
    //sum from doubles
    private static double sum(double[]doubleArray){
        double sum = 0;
        for (double currentArray:doubleArray){
            sum+=currentArray;
        }
        return sum;
    }
    //min from integers
    private static int min(int[]intArray) {
        int min = intArray[0];
        for (int i = 0; i < intArray.length; i++) {
            min = min > intArray[i] ? intArray[i] : min;
        }
        return min;
    }
    private static double min(double[]doubleArray){
        double min = doubleArray[0];
        for (int i=0; i<doubleArray.length; i++){
            min=min>doubleArray[i]? doubleArray[i]:min;
        }
        return min;
    }
    //max from integers
    private static int max(int[]intArray){
        int max = intArray[0];
        for (int i=0; i<intArray.length; i++){
            max = max<intArray[i] ? intArray [i]:max;
        }
        return max;
    }
    //max from doubles
    private static double max(double [] doubleArray){
        double max = doubleArray[0];
        for (int i=0; i<doubleArray.length; i++){
            max = max<doubleArray[i] ? doubleArray [i]:max;
        }
        return max;
    }
    //Maximal positive integer
    private static int maxPositive(int[]intArray){
        int maxFromArray=max(intArray);
        if (maxFromArray<0){
            maxFromArray=0;
        }
        return maxFromArray;
    }
    //Maximal positive double
    private static double maxPositive(double[]doubleArray){
        double maxFromArray=max(doubleArray);
        if (maxFromArray<0){
            maxFromArray=0;
        }
        return maxFromArray;
    }
    //multiplication of integers
    private static int multiplication(int[]intArray) {
        int multiplication = intArray[0];
        for (int i = 0; i < intArray.length; i++) {
            multiplication *= intArray[i];
        }
        return multiplication;
    }
    private static double multiplication(double[]doubleArray){
        double multiplication = doubleArray[0];
        for (int i=0; i<doubleArray.length; i++){
            multiplication *=doubleArray[i];
        }
        return multiplication;
    }
    //modulus of integers
    private static int[] modulus (int[]intArray){
        int[]result= new int[2];
        result[0] = Math.abs(intArray[0]);
        result[1] = Math.abs(intArray[intArray.length -1]);
        return result;
    }
    //modulus of doubles
    private static double[] modulus (double[]doubleArray){
        double[] result = new double[2];
        result[0] = Math.abs(doubleArray[0]);
        result[1] = Math.abs(doubleArray[doubleArray.length -1]);
        return result;
    }

    //second maximal from integers
    private static int secondMax(int[]intArray){
        int maxValue=max (intArray);
        int secondMax=Integer.MIN_VALUE;
        for (int i=0; i<intArray.length; i++){
            if (secondMax < intArray[i] && intArray[i] < maxValue) {
                secondMax = intArray[i];
            }
        }
        return secondMax;
    }
    private static double secondMax(double[]doubleArray){
        double maxValue = max(doubleArray);
        double secondMax= Double.MIN_VALUE;
        for (int i=0; i<doubleArray.length; i++){
            if (secondMax <doubleArray[i] && doubleArray[i] < maxValue){
                secondMax=doubleArray[i];
            }
        }
        return secondMax;
    }
}

