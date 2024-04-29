package miu.cs489.ads.lab11;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ArrayFlattenerTest {
    @Test
    public void testFlattenArrayWithLegitInput() {
        ArrayFlattener flattener = new ArrayFlattener();
        int[][] inputArray = {{1, 3}, {0}, {4, 5, 9}};
        int[] expectedOutput = {1, 3, 0, 4, 5, 9};
        assertArrayEquals(expectedOutput, flattener.flattenArray(inputArray));
    }

    @Test
    public void testFlattenArrayWithNullInput() {
        ArrayFlattener flattener = new ArrayFlattener();
        int[][] inputArray = null;
        int[] expectedOutput = {};
        assertArrayEquals(expectedOutput, flattener.flattenArray(inputArray));
    }
}
