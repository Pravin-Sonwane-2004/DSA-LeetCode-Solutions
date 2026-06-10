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
        int minCount = Integer.MAX_VALUE;
        int answer = nums[0];

        for (int i = 0; i < nums.length; i++) {

            int count = 0;

            if (nums[i] >= 0) {
                for (int j = nums[i]; j > 0; j--) {
                    count++;
                }
            } else {
                for (int j = nums[i]; j < 0; j++) {
                    count++;
                }
            }

            if (count < minCount) {
                minCount = count;
                answer = nums[i];
            } else if (count == minCount && nums[i] > answer) {
                answer = nums[i];
            }
        }

        return answer;
    }
}