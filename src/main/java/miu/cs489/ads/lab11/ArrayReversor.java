package miu.cs489.ads.lab11;

public class ArrayReversor {

    private ArrayFlattenerService flattenerService;

    public ArrayReversor(ArrayFlattenerService service) {
        this.flattenerService = service;
    }

    public int[] reverseArray(int[][] inputArray) {
        if (inputArray == null) {
            return null;
        }
        int[] flattened = flattenerService.flattenArray(inputArray);
        if (flattened == null) {
            return null;
        }
        int length = flattened.length;
        int[] reversed = new int[length];
        for (int i = 0; i < length; i++) {
            reversed[i] = flattened[length - 1 - i];
        }
        return reversed;
    }
}
