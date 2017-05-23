package Module7.Offline.Hausafgaben;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import static java.lang.System.currentTimeMillis;

/**
 * Created by Georgii Tarasenko
 * on 23/05/2017
 */
public class TimeMeasurement {
    public static void main(String[] args) {
        List<Integer> integerArrayList = new ArrayList<>();
        List<Integer> integerTreeSet = new LinkedList<>();
        List<String> stringArrayList = new ArrayList<>();
        List<String> stringLinkedList = new LinkedList<>();
        final int NUMBER_OF_ELEMENTS1000 = 1000;
        final int NUMBER_OF_ELEMENTS10000 = 10000;

        System.out.println("Time of execution for the add, set, get, and remove from the top of the list:");
        System.out.println("\tInteger");
        long[] integerArrayList1000 = runTimeInteger(integerArrayList, NUMBER_OF_ELEMENTS1000);
        System.out.println("Array list 1000: " + Arrays.toString(integerArrayList1000));
        long[] integerLinkedList1000 = runTimeInteger(integerArrayList, NUMBER_OF_ELEMENTS1000);
        System.out.println("Array list 1000: " + Arrays.toString(integerLinkedList1000));
        long[] integerArrayList10000 = runTimeInteger(integerArrayList, NUMBER_OF_ELEMENTS10000);
        System.out.println("Array list 10000: " + Arrays.toString(integerArrayList10000));
        long[] integerLinkedList10000 = runTimeInteger(integerArrayList, NUMBER_OF_ELEMENTS10000);
        System.out.println("Array list 10000: " + Arrays.toString(integerLinkedList10000));

        System.out.println("\tString");
        long[] stringArrayList1000 = runTimeString(stringArrayList, NUMBER_OF_ELEMENTS1000);
        System.out.println("Array list 1000: " + Arrays.toString(stringArrayList1000));
        long[] stringLinkedList1000 = runTimeString(stringLinkedList, NUMBER_OF_ELEMENTS1000);
        System.out.println("Linked list 1000: " + Arrays.toString(stringLinkedList1000));
        long[] stringArrayList10000 = runTimeString(stringArrayList, NUMBER_OF_ELEMENTS10000);
        System.out.println("Array list 10000: " + Arrays.toString(stringArrayList10000));
        long[] stringLinkedList10000 = runTimeString(stringLinkedList, NUMBER_OF_ELEMENTS10000);
        System.out.println("Linked list 10000: " + Arrays.toString(stringLinkedList10000));
    }

    private static long[] runTimeInteger(List<Integer> list, int numberOfElements) {
        long startTime;
        long endTime;
        long[] time = new long[4];
        startTime = currentTimeMillis();

        for (int i = 0; i < numberOfElements; i++) {
            list.add(0, new Integer(i));
        }
        endTime = currentTimeMillis();
        time[0] = endTime - startTime;

        startTime = currentTimeMillis();
        for (int i = 0; i < numberOfElements; i++) {
            list.set(0, i);
        }
        endTime = currentTimeMillis();
        time[1] = endTime - startTime;

        startTime = currentTimeMillis();
        for (int i = 0; i <numberOfElements; i++) {
            list.get(0);
        }
        endTime = currentTimeMillis();
        time[2] = endTime - startTime;

        startTime = currentTimeMillis();
        for (int i = 0; i <list.size(); i++) {
            list.remove(0);
        }
        endTime = currentTimeMillis();
        time[3] = endTime - startTime;
        return time;
    }

    private static long[] runTimeString(List<String> list, int numberOfElements) {
        long startTime;
        long endTime;
        long[] time = new long[4];
        startTime = currentTimeMillis();

        for (int i = 0; i < numberOfElements; i++) {
            list.add(0, new String(" " + i));
        }
        endTime = currentTimeMillis();
        time[0] = endTime - startTime;

        startTime = currentTimeMillis();
        for (int i = 0; i < numberOfElements; i++) {
            list.set(0, "" + i);
        }
        endTime = currentTimeMillis();
        time[1] = endTime - startTime;

        startTime = currentTimeMillis();
        for (int i = 0; i <numberOfElements; i++) {
            list.get(0);
        }
        endTime = currentTimeMillis();
        time[2] = endTime - startTime;

        startTime = currentTimeMillis();
        for (int i = 0; i <list.size(); i++) {
            list.remove(0);
        }
        endTime = currentTimeMillis();
        time[3] = endTime - startTime;
        return time;
    }
}
