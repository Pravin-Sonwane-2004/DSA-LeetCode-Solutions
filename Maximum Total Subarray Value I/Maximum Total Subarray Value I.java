// class Solution {
//     public long maxTotalValue(int[] nums, int k) {
//         int min = 0;
//         int max = 0;
//         int res = 0;

//         for(int i=0;i<nums.length;i++) {
//             for(int j = i+1;j<nums.length;j++) {
//                 int mv = Math.min(nums[i],nums[j]);
//                 min = Math.min(min,mv);
//                 int lv = Math.max(nums[i],nums[j]);
//                 max = Math.max(max,lv);
//                 res+=max-min;
//             }
//         }
//         return res;
//     }
// }


// class Solution {
//     public long maxTotalValue(int[] nums, int k) {
//         // int min = nums[0];
//         // int max = nums[0];
//         int res = 0;

//         // for(int i=0;i<k;i++) {
//         //     min = Math.min(min,nums[i]);
//         //     max = Math.max(max,nums[i]);
//         // }
//         // res += max-min;

//         //  for(int i =k;i<nums.length;i++) {
//         //     min = Math.min(min,nums[i]);
//         //     max = Math.max(max,nums[i]);
//         //     res += max-min;
//         // }
//             // return res;
//     for(int start = 0; start <= nums.length - k; start++) {

//         int min = nums[start];
//         int max = nums[start];

//         for(int j = start; j < start + k; j++) {
//             min = Math.min(min, nums[j]);
//             max = Math.max(max, nums[j]);
//         }
//         res += (max - min);
//     }
//         return res;
//     }
// }

class Solution {
    public long maxTotalValue(int[] nums, int k) {
        int min = nums[0];
        int max = nums[0];

        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        return 1L * k * (max - min);
    }
}