package HashSetDemo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetOperations
{
    public static void main(String[] args)
    {
        // 1. Create a HashSet
        Set<String> hashSet = new HashSet<>();
        System.out.println("Initial HashSet: " + hashSet);

        // 2. Add elements
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Cherry");
        System.out.println("After adding elements: " + hashSet);

        // 3. Attempt to add duplicate
        boolean duplicateAdded = hashSet.add("Apple");
        System.out.println("Attempt to add duplicate 'Apple': " + duplicateAdded);

        // 4. Remove an element
        hashSet.remove("Banana");
        System.out.println("After removing 'Banana': " + hashSet);

        // 5. Check if an element exists
        System.out.println("Contains 'Apple'? " + hashSet.contains("Apple"));
        System.out.println("Contains 'Banana'? " + hashSet.contains("Banana"));

        // 6. Size and isEmpty
        System.out.println("Size: " + hashSet.size());
        System.out.println("Is empty? " + hashSet.isEmpty());

        // 7. Iterating using enhanced for loop
        System.out.println("Iterating using enhanced for loop:");
        for (String fruit : hashSet)
        {
            System.out.println(fruit);
        }

        // 8. Iterating using iterator
        System.out.println("Iterating using iterator:");
        Iterator<String> iterator = hashSet.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }

        // 9. Converting to an Array
        String[] fruitArray = hashSet.toArray(new String[0]);
        System.out.println("Converted to array:");
        for (String fruit : fruitArray)
        {
            System.out.println(fruit);
        }

        // 10. Adding all from another collection
        Set<String> additionalFruits = new HashSet<>();
        additionalFruits.add("Mango");
        additionalFruits.add("Orange");
        hashSet.addAll(additionalFruits);
        System.out.println("After addAll: " + hashSet);

        // 11. Removing all elements in another collection
        hashSet.removeAll(additionalFruits);
        System.out.println("After removeAll: " + hashSet);

        // 12. Retaining only specific elements
        Set<String> fruitsToRetain = new HashSet<>();
        fruitsToRetain.add("Apple");
        hashSet.retainAll(fruitsToRetain);
        System.out.println("After retainAll (retain only 'Apple'): " + hashSet);

        // 13. Clear the HashSet
        hashSet.clear();
        System.out.println("After clear: " + hashSet);
    }
}
