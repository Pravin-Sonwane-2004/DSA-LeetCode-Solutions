// class Solution {
//     public int findClosestNumber(int[] nums) {
//         int maxCount = 0;
//         for(int i=0;i<nums.length;i++) {
//             int count = 0;
//             if(nums[i]>=0) {
//                 for(int j=nums[i];i>=0;i--) {
//                     if(i == 0) {
//                         maxCount= Math.min(maxCount, count);
//                         break;   
//                     }
//                     count++;
//                 }
//             }
//             else {
//                  for(int j=nums[i];i<=0;i++) {
//                      if(i == 0) {
//                         maxCount  = count;
//                         break;   
//                     }
//                     count++;
//                 }
//             }
//         }
//     }
// }


class Solution {
    public int findClosestNumber(int[] nums) {
        int closest = nums[0];

        for (int num : nums) {
            if (Math.abs(num) < Math.abs(closest)) {
                closest = num;
            } 
            else if (Math.abs(num) == Math.abs(closest) && num > closest) {
                closest = num;
            }
        }

        return closest;
    }
}