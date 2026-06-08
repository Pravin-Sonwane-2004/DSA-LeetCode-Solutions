class Solution {
    //tthis is thid time and no chatgpt
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();

        for(int i= 0;i<nums.length;i++) {

            if(map.containsKey(target-nums[i])) {
                return new int[]{map.get(target-nums[i]),i};
            }
            map.put(nums[i],i);

        }
        return new int[]{-1,-1};
    }
}
    //this is basic approach but for 
    // public int[] twoSum(int[] nums, int target) {
    //     for(int i = 0;i<nums.length-1; i++) {
    //        for(int j=i+1; j<nums.length;j++){
    //         if(nums[j] + nums[i] == target) {
    //             return new int []{i,j};
    //         }
    //        }
    //      }
    //      return new int [] {-1,-1};
    // }

    //now i learnt Hashmap
        // public int[] twoSum(int[] nums, int target) {
        //     Map<Integer,Integer> map = new HashMap<>();
        //     for(int i=0;i<nums.length;i++) {
        //         int element = target - nums[i];
        //         if(map.containsKey(element)) {
        //             return new int[] {map.get(element),i};
        //         }
        //         map.put(nums[i],i);
        //     }
        //     return new int[]{};
        // }
// }