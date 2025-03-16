package DataStructureCode.HashMapDemo;

public class RansomNote
{
    public static void main(String[] args)
    {
        String ransomNote = "bg", magazine = "efjbdfbdgfjhhaiigfhbaejahgfbbgbjagbddfgdiaigdadhcfcj";
        System.out.println(canConstruct(ransomNote, magazine));
    }

//    public static boolean canConstruct(String ransomNote, String magazine) {
//
//        Map<Character, Long> magMap = magazine.chars().mapToObj(c -> (char) c)
//                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
//        Map<Character, Long> ranMap = ransomNote.chars().mapToObj(c -> (char) c)
//                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
//for(Map.Entry<Character,Long> entry: ranMap.entrySet()){
//    if(magMap.containsKey(entry.getKey())){
//        if(!(entry.getValue() <= magMap.get(entry.getKey()))){
//            return false;
//        }
//    }
//    else{
//        return false;
//    }
//}
//        return true;
//    }


    public static boolean canConstruct(String ransomNote, String magazine)
    {
        int[] alphabet = new int[26];

        for (char c : ransomNote.toCharArray())
        {
            int i = magazine.indexOf(c, alphabet[c - 'a']);
            if (i == -1)
            {
                return false;
            }
            alphabet[c - 'a'] = i + 1;
        }

        return true;
    }

//    public static boolean canConstruct(String ransomNote, String magazine) {
//
//        Map<Character, Integer> magazineCount = new HashMap<>();
//
//        // Count frequency of each character in magazine
//        for (char c : magazine.toCharArray()) {
//            magazineCount.put(c, magazineCount.getOrDefault(c, 0) + 1);
//        }
//
//        // Check if ransomNote can be formed
//        for (char c : ransomNote.toCharArray()) {
//            if (!magazineCount.containsKey(c) || magazineCount.get(c) == 0) {
//                return false;
//            }
//            magazineCount.put(c, magazineCount.get(c) - 1);
//        }
//
//        return true;
//    }
}
