class Solution {
    //i know it is not efficient but its easy problem and 
    //after this ill look innto a better solution
    public int numberOfSpecialChars(String word) {
            Set<Character> lowerCase = new HashSet<>();
            Set<Character> upperCase = new HashSet<>();
            int counter = 0;

       for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);

            if (Character.isLowerCase(c)) {
                lowerCase.add(c);
            } else if (Character.isUpperCase(c)) {
                upperCase.add(c);
            }
        }

        for (char ch : lowerCase) {
            char upper = Character.toUpperCase(ch);

            if (upperCase.contains(upper)) {
                counter++;
            }
        }

        return counter;
    }
}