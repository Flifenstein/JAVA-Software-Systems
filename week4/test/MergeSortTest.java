package ss.week4.test;

import org.junit.Test;
import ss.week4.MergeSort;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

import static org.junit.Assert.assertEquals;

public class MergeSortTest {
    @Test
    public void testMergesortEmptyList() {
        LinkedList<Integer> sequence = new LinkedList<>(Collections.emptyList());
        MergeSort.mergeSort(sequence);
        assertEquals(sequence, Collections.emptyList());
    }

    @Test
    public void testMergesortSingleItem() {
        LinkedList<Integer> sequence = new LinkedList<>(Arrays.asList(1));
        MergeSort.mergeSort(sequence);
        assertEquals(sequence, Arrays.asList(1));
    }

    @Test
    public void testMergesortSortedList() {
        LinkedList<Integer> sequence = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));
        MergeSort.mergeSort(sequence);
        assertEquals(sequence, Arrays.asList(1, 2, 3, 4, 5));

        sequence = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        MergeSort.mergeSort(sequence);
        assertEquals(sequence, Arrays.asList(1, 2, 3, 4, 5, 6));
    }

    @Test
    public void testMergesortUnsortedList() {
        LinkedList<Integer> sequence = new LinkedList<>(Arrays.asList(3, 2, 1, 5, 4));
        MergeSort.mergeSort(sequence);
        assertEquals(sequence, Arrays.asList(1, 2, 3, 4, 5));

        sequence = new LinkedList<>(Arrays.asList(3, 2, 1, 6, 5, 4));
        MergeSort.mergeSort(sequence);
        assertEquals(sequence, Arrays.asList(1, 2, 3, 4, 5, 6));
    }
}
