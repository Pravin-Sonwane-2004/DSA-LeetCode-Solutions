// class Solution {
//     public String processStr(String s) {
//         StringBuilder sb = new StringBuilder();
//         for(int i =0;i<s.length();i++) {
//             char c = s.charAt(i);
//             if(c=='#') {
//                 sb = retIfHash(sb.toString());
//             }
//             else if(c=='*') {
//                 sb = retIfStar(sb.substring(0,sb.length()-1));
//             }
//             else if(c=='%') {
//                 sb.reverse(sb);
//             }
//             else {
//                 sb.append(c);
//             }
//         }
//         return sb.toString();
//     }
//     private String retIfStar(String str) {
//     return str.substring(0, str.length() - 1);
//     }
//     private String retIfHash(String str) { 
//         if (str.length() == 0) { 
//             return ""; 
//         } 
        
//         String sk = str; 
//         return sk + str; 
//     }
// }

class Solution {
    public String processStr(String s) {
        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {

            if (c == '#') {
                sb.append(sb.toString());
            }

            else if (c == '*') {
                if (sb.length() > 0) {
                    sb.deleteCharAt(sb.length() - 1);
                }
            }

            else if (c == '%') {
                sb.reverse();
            }

            else {
                sb.append(c);
            }
        }

        return sb.toString();
    }
}