package Module6;

import java.util.Arrays;

/**
 * Created by George on 29/03/2017.
 */
public class ArraysMain {
    public static void main(String[] args) {
        int[] data = {8, 2, 0, -5, 4, -15, 10, 33, -9, -11};

        System.out.println("\tArray of ints: " + Arrays.toString(data));

        System.out.println("\tSum of ints: " + ArraysUtils.sum(data));

        System.out.println("\tMinimal of ints: " + ArraysUtils.min(data));

        System.out.println("\tMaximal of ints: " + ArraysUtils.max(data));

        System.out.println("\n\tMaximal Positive of ints: " + ArraysUtils.maxPositive(data));

        System.out.println("\tProduct of ints: " + ArraysUtils.multiplication(data));

        System.out.println("\tModulus of ints: " + Arrays.toString(ArraysUtils.modulus(data)));

        System.out.println("\tSecond largest of ints: " + ArraysUtils.secondLargest(data));

        System.out.println("\n\tInitial order: " + Arrays.toString(data));
        ArraysUtils.reverse(data);
        System.out.println("\tReversed order: " + Arrays.toString(data));

        data = ArraysUtils.findEvenElements(data);
        System.out.println("\n\tEven numbers only: " + Arrays.toString(data));
    }
}
