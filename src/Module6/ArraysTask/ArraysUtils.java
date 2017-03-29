package Module6.ArraysTask;

import java.util.Arrays;

/**
 * Created by George on 22/03/2017.
 */
public final class ArraysUtils {

    private ArraysUtils(){}


    static int sum (int [] array){
        int sum = 0;
        for (int currentData : array) {
            sum += currentData;
        }
        return sum;
    }

    static int min (int [] array){
        int min = array[0];
        for (int i=0; i<array.length - 1; i++){
            min = min > array[i] ? array[i]:min;
         }
        return min;
    }

    static int max (int [] array) {
        int max = array[0];
        for (int i = 0; i<array.length; i++){
            max = max < array[i] ? array[i]:max;
        }
        return max;
    }
    static int maxPositive (int [] array) {
        int maxFromArray = array[0];
        if (maxFromArray < 0){
            maxFromArray = 0;
        }
        return maxFromArray;
    }
    static int multiplication (int [] array){
        int multiplication = array[0];
        for (int i = 0; i < array.length; i++){
            multiplication *= array[i];
        }
        return multiplication;
    }
    static int[] modulus (int [] array){
        int[] res = new int[2];
        res[0] = Math.abs(array[0]);
        res[1] = Math.abs(array[array.length - 1]);
        return res;
    }
    static int secondLargest (int[] array){
        int maxVal = max(array);
        int secondMaxV = Integer.MIN_VALUE;
        for (int i = 0; i<array.length; i++) {
            if (secondMaxV < array[i] && array[i] < maxVal) {
                secondMaxV = array[i];
            }
        }
        return secondMaxV;
    }
    static int[] reverse(int[] array) {
        for (int i = 0; i < array.length/2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        return array;
    }
    static int[] findEvenElements(int[] array){
        int[] result = new int[array.length];
        int i =  0;
        for (int value : array){
            if (value %2 == 0) {
                result[i++] = value;
            }
        }
        result = Arrays.copyOf(result, i);
        return result;
    }
}
