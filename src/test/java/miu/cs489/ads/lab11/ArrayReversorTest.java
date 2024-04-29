package miu.cs489.ads.lab11;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.*;

public class ArrayReversorTest {
    private ArrayFlattenerService serviceMock;
    private ArrayReversor reversor;

    @BeforeEach
    public void setUp() {
        serviceMock = mock(ArrayFlattenerService.class);
        reversor = new ArrayReversor(serviceMock);
    }

    @Test
    public void testReverseArray_ValidInput() {
        int[][] input = {{1, 3}, {0}, {4, 5, 9}};
        int[] expectedOutput = {9, 5, 4, 0, 3, 1};
        when(serviceMock.flattenArray(input)).thenReturn(new int[]{1, 3, 0, 4, 5, 9});

        int[] result = reversor.reverseArray(input);
        assertArrayEquals(expectedOutput, result);

        verify(serviceMock).flattenArray(input);
    }

    @Test
    public void testReverseArray_NullInput() {
        int[] result = reversor.reverseArray(null);
        assertNull(result);
        verify(serviceMock, never()).flattenArray(null);

    }
}

