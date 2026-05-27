//so here it is working but it is showing wrong output
// class Solution {
//     public int passwordStrength(String password) {
//         int point = 0;
//         for(char c : password.toCharArray()) {
//             if(Character.isLowerCase(c)) point++;
//             else if(Character.isUpperCase(c)) point += 2;
//             else if(Character.isDigit(c)) point += 3;
//             else {
//                 point+= 5;
//             }
//         }
//         return point;
//     }
// }

// class Solution {
//     public int passwordStrength(String password) {
//         if (password == null || password.isEmpty()) {
//             return 0;
//         }

//         int point = 0;

//         for (char c : password.toCharArray()) {
//             if (Character.isLowerCase(c)) {
//                 point++;
//             } else if (Character.isUpperCase(c)) {
//                 point += 2;
//             } else if (Character.isDigit(c)) {
//                 point += 3;
//             } else {
//                 point += 5;
//             }
//         }

//         return point;
//     }
// }


import java.util.*;

class Solution {
    public int passwordStrength(String password) {
        Set<Character> seen = new HashSet<>();
        int point = 0;

        for (char c : password.toCharArray()) {
            if (seen.contains(c)) {
                continue;
            }

            seen.add(c);

            if (c >= 'a' && c <= 'z') {
                point += 1;
            } else if (c >= 'A' && c <= 'Z') {
                point += 2;
            } else if (c >= '0' && c <= '9') {
                point += 3;
            } else if (c == '!' || c == '@' || c == '#' || c == '$') {
                point += 5;
            }
        }

        return point;
    }
}