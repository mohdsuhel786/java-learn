// package BasicDemo;
// import java.util.stream.Collectors;

// public class RemoveWhiteSpace {
//     public static void main(String[] args) {
//         String s = "Mansi Upadhyay";
//         String res= "";
//        res =  s.chars().filter(c -> ! Character.isWhitespace(c))
//         .mapToObj(c ->String.valueOf((char) c))
//         .collect(Collectors.joining());


//         for(int i = 0; i< s.length();i++){
//             if(s.charAt(i) == ' '){
//                 continue;
//             }
//                 res+=s.charAt(i); 
//         }
//         System.out.println(res);
//     }
// }
