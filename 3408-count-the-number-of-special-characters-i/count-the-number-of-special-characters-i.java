// class Solution {
//     //i know it is not efficient but its easy problem and 
//     //after this ill look innto a better solution
//     public int numberOfSpecialChars(String word) {
//             Set<Character> lowerCase = new HashSet<>();
//             Set<Character> upperCase = new HashSet<>();
//             int counter = 0;

//        for (int i = 0; i < word.length(); i++) {
//             char c = word.charAt(i);

//             if (Character.isLowerCase(c)) {
//                 lowerCase.add(c);
//             } else if (Character.isUpperCase(c)) {
//                 upperCase.add(c);
//             }
//         }

//         for (char ch : lowerCase) {
//             char upper = Character.toUpperCase(ch);

//             if (upperCase.contains(upper)) {
//                 counter++;
//             }
//         }

//         return counter;
//     }
// }

class Solution { 
    // the better solution that i can think  of is
    //by using the table of the characters
    public int numberOfSpecialChars(String word) {
        int [] upperCase = new int[26];
        int [] lowerCase = new int[26];
        for(char c : word.toCharArray()) {
            if(Character.isUpperCase(c)) {
                upperCase[c - 'A']++;
            }
            else if(Character.isLowerCase(c)) {
                lowerCase[c - 'a']++;
            }
        }
        int counter =0 ;
        
        for(int i =0;i<26;i++) {
            if (lowerCase[i] > 0 && upperCase[i] > 0) {
                counter++;
            }
        }
        return counter;
    }
}