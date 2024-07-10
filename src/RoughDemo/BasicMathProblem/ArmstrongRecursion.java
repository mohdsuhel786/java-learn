public class ArmstrongRecursion {

    public static Boolean checkPalindrome(int i,String s){
         s =    s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        
      
        int l = s.length();
        if(i>= l/2) return true;
        if( s.charAt(i) != s.charAt(l-i-1)){
                return false;
            }
        
        
            return checkPalindrome(i+1,s);
        
        
    }



    public static void main(String[] args){
        String s = "A man, a plan, a canal: Panama";
        System.out.println(checkPalindrome(0,s));
    }

}
