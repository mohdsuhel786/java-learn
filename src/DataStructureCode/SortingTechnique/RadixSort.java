package DataStructureCode.SortingTechnique;

import java.util.Arrays;

public class RadixSort
{
    public static void main(String[] args)
    {
        int[] arr = {29, 83, 471, 36, 91, 8};

        System.out.println("Origin array: " + Arrays.toString(arr));
        radixSort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }

    public static void radixSort(int[] arr)
    {
    }
}
