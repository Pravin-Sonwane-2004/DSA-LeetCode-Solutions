class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder ans = new StringBuilder();
        
        for (String w : words) {
            int totalWeight = 0;
            
            // Sum the weight of each character in the current word
            for (char c : w.toCharArray()) {
                totalWeight = (totalWeight + weights[c - 'a']) % 26;
            }
            
            // Map the calculated remainder to a character from 'z' downwards
            char mappedChar = (char) ('a' + (25 - totalWeight));
            ans.append(mappedChar);
        }
        
        return ans.toString();
    }
}
