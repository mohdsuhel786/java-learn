package DataStructureCode.StringDemo;

public class StringPalindromeDemo
{

    public static void main(String[] args){
        String word  = "aba";
        int n = word.length();

        System.out.println(checkPalindrome(word,n));
    }

    public static boolean checkPalindrome(String word, int l){
            if(l<=0){
                return true;
            }
        for(int i = 0 ;i<=l/2;i++){
            if(word.charAt(i) != word.charAt(l-1-i)){
                return false;
            }
        }
        return true;
    }
}
