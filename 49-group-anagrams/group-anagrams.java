class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //"eat","tea","tan","ate","nat","bat"
        //eat,tea,ate
        //nat,tan
        //bat
        //[bat],[nat tan][ate,eat,tea];
        Map<String,List<String>> map = new HashMap<>();

        for(String str : strs) {
            int [] freq = new int[26];

            for(char c : str.toCharArray()) {
                freq[c-'a']++;
            }

            String key = Arrays.toString(freq);
            // String str = new String(key);
            if(!map.containsKey(key)) {
                map.put(key,new ArrayList<>());
            }

            map.get(key).add(str);
        }
        return new ArrayList<>(map.values());
    }
}


















// class Solution {
//     public List<List<String>> groupAnagrams(String[] strs) {
//         List<List<String>> list = new ArrayList<>();
//         for(int i=0;i<strs.length();i++) {
//             if(valid(i,strs)) {
//                 list.add(valid);
//             }
//         }
//         return list;
//     }
//     private List<String> valid(int n, String s[]) {
//         List<String> list = new ArrayList<>();
//         int freq[] = new int[26];
//         for(char c : s[n].toCharArray()) {
//             freq[c-'a']++;
//         }
//         int[] arr = freq.clone();

//         for(int i = n ;i<s.length();i++) {
//             arr[c-'a']--;
//             isZero(arr);
//             list.add(arr);
//         }
//         return list;
//     }
//       boolean isAnagram(String a,String b) {

//         if (a.length() != b.length()) return false;

//         int [] arr = new int[26];
//         for(char c : a.toCharArray())
//             arr[c - 'a']++;
//         }
//         for(char c : b.toCharArray()) {
//             arr[c- 'c']--;
//         }
//         return isZero(arr);
//     }
//     private boolean isZero(int arr[]) {
//         for(int n : arr) {
//             if(n != 0) return false;
//         }
//         return true;
//     }
// }



//this logic dosent work here

// class Solution {
//     public List<List<String>> groupAnagrams(String[] strs) {
//         Map<Integer,List<String>> map = new HashMap<>();

//         for(int i = 0;i<strs.length;i++) {
//             if(isAnagram(i,i+1)) {
//                 map.add(i,map.getOrDefault(i,0)+1);
//             }
//         }

//     }

//     boolean isAnagram(String a,String b) {

//         if (a.length() != b.length()) return false;

//         int [] arr = new int[26];
//         for(char c : a.toCharArray())
//             arr[c - 'a']++;
//         }
//         for(char c : b.toCharArray()) {
//             arr[c- 'c']--;
//         }
//         return isZero(arr);
//     }
//     boolean isZero(int arr []) {
//         for(int i : arr){
//             if(i != 0) return false;
//         }
//         return true;
//     }
// }


//chatgpt suggested that make an list<String> then check it with using map

// class Solution {
//     public List<List<String>> groupAnagrams(String[] strs) {

//         Map<String, List<String>> map = new HashMap<>();

//         for(String s : strs) {
//             char [] c = s.toCharArray();
//             Arrays.sort(c);

//             String str = new String(c);
//             if(!map.containsKey(str)) {
//                 map.put(str,new ArrayList<>());
//             }
//             map.get(str).add(s);
//         }
//         return new ArrayList<>(map.values());
//     }
// }

// class Solution {
//     public List<List<String>> groupAnagrams(String[] strs) {
//         Map<String, List<String>> map = new HashMap<>();

//         for (String word : strs) {
//             int[] freq = new int[26];

//             for (char c : word.toCharArray()) {
//                 freq[c - 'a']++;
//             }

//             String key = Arrays.toString(freq);

//             if (!map.containsKey(key)) {
//                 map.put(key, new ArrayList<>());
//             }

//             map.get(key).add(word);
//         }

//         return new ArrayList<>(map.values());
//     }
// }


















