package RoughDemo.Work;

import java.util.ArrayList;
import java.util.List;

public class FlattenArray {
    public static void main(String[] args) {
        // Example multi-dimensional array
        Object[] multiDimArray = {
            1, 
            new Object[]{2, 3}, 
            new Object[]{new Object[]{4, 5}, 6}, 
            7, 
            new Object[]{8, new Object[]{9, 10}}
        };

        // Flatten the multi-dimensional array
        Object[] flattenedArray = flattenArray(multiDimArray);

        // Print the flattened array
        for (Object element : flattenedArray) {
            System.out.print(element + " ");
        }
    }

    public static Object[] flattenArray(Object[] array) {
        List<Object> resultList = new ArrayList<>();
        flatten(array, resultList);
        return resultList.toArray();
    }

    private static void flatten(Object[] array, List<Object> resultList) {
        for (Object element : array) {
            if (element instanceof Object[]) {
                flatten((Object[]) element, resultList); // Recursive call for nested arrays
            } else {
                resultList.add(element); // Add non-array elements directly
            }
        }
    }
}

