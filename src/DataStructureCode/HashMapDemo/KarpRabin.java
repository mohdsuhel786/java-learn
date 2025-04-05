package DataStructureCode.HashMapDemo;

public class KarpRabin
{


    private final static int PRIME = 101;

    public static void main(String[] args)
    {
        KarpRabin algo = new KarpRabin();
        karpRabin("ApoorvKunalRahul", "Kunal");
    }

    public static void karpRabin(String text, String pattern)
    {
        if (text.isEmpty() || pattern.isEmpty())
        {
            return;
        }
        int patternLength = pattern.length();
        double patternHash = calculateHash(pattern);
        double textHash = calculateHash(text.substring(0, patternLength));

        for (int i = 0; i <= text.length() - patternLength; i++)
        {
            if (patternHash == textHash)
            {
                if (text.substring(i, i + patternLength).equals(pattern))
                {
                    System.out.println("pattern fount at index " + i);
                }
            }

            if (i < text.length() - patternLength)
            {
                textHash = updateHash(textHash, text.charAt(i), text.charAt(i + patternLength), patternLength);
            }
        }

    }

    private static double calculateHash(String str)
    {
        double hash = 0;
        for (int i = 0; i < str.length(); i++)
        {
            hash += str.charAt(i) * Math.pow(PRIME, i);
        }

        return hash;
    }

    private static double updateHash(double prevHash, char oldChar, char newChar, int patternLength)
    {
        double newHash = (prevHash - oldChar) / PRIME;
        newHash = newHash + newChar * Math.pow(PRIME, patternLength - 1);
        return newHash;
    }

}
