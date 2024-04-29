package miu.cs489.ads.lab11;

import java.util.ArrayList;
import java.util.List;

public class ArrayFlattener {

    public int[] flattenArray(int[][] inputArray) {
        if (inputArray == null) {
            return new int[0];
        }

        List<Integer> flattenedList = new ArrayList<>();
        for (int[] subArray : inputArray) {
            for (int num : subArray) {
                flattenedList.add(num);
            }
        }

        int[] flattenedArray = new int[flattenedList.size()];
        for (int i = 0; i < flattenedList.size(); i++) {
            flattenedArray[i] = flattenedList.get(i);
        }

        return flattenedArray;
    }

    public static void main(String[] args) {
        //declare a 2D array
        int[][] inputArray = {{1, 3}, {0}, {4, 5, 9}};
        ArrayFlattener flattener = new ArrayFlattener();
        int[] flattenedArray = flattener.flattenArray(inputArray);
        for (int num : flattenedArray) {
            System.out.print(num + " ");
        }

    }
}
