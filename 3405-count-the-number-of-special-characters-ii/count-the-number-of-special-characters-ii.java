// class Solution {
//     public int numberOfSpecialChars(String word) {
//         Set<Character> lowerCase = new HashSet<>();
//         Set<Character> upperCase = new HashSet<>();

//         for (char c : word.toCharArray()) {
//             if (Character.isLowerCase(c)) {
//                 lowerCase.add(c);
//             } else if (Character.isUpperCase(c)) {
//                 upperCase.add(Character.toLowerCase(c));
//             }
//         }

//         int count = 0;

//         for (char c : lowerCase) {
//             if (upperCase.contains(c)) {
//                 count++;
//             }
//         }

//         return count;
//     }
// }

class Solution {
    public int numberOfSpecialChars(String word) {
        int[] lastLower = new int[26];
        int[] firstUpper = new int[26];

        Arrays.fill(lastLower, -1);
        Arrays.fill(firstUpper, Integer.MAX_VALUE);

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);

            if (Character.isLowerCase(c)) {
                int index = c - 'a';
                lastLower[index] = i;
            } 
            else if (Character.isUpperCase(c)) {
                int index = c - 'A';
                firstUpper[index] = Math.min(firstUpper[index], i);
            }
        }

        int count = 0;

        for (int i = 0; i < 26; i++) {
            if (
                lastLower[i] != -1 &&
                firstUpper[i] != Integer.MAX_VALUE &&
                lastLower[i] < firstUpper[i]
            ) {
                count++;
            }
        }

        return count;
    }
}
