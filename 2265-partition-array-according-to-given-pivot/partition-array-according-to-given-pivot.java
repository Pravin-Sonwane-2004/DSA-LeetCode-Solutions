class Solution {
    // im thinking unnecessary stuff dont need to think that much 
    // public int findPivot(int nums[],int  pivot) {
    //     int found =0;
    //     for(int i =0;i<nums.length;i++) {
    //         if(nums[i] == pivot) {
    //             found = i;
    //         }
    //     }
    //     return found;
    // }
    // public int[] pivotArray(int[] nums, int pivot) {
    //     int start = 0;
    //     int end = nums.length-1;
    //     int mid = findPivot(nums,pivot);

    //     while(start <= end) {
    //        if(nums[end]>nums[mid] && nums[start]<nums[mid]) {
    //         int temp = nums[start];
    //         nums[start] = nums[end];
    //         nums[end] = temp;
    //         start++;
    //         end--;
    //         }
    //        else if(nums[start] < nums[mid]) {
    //         start++;
    //        }
    //         else if(nums[end] > nums[mid]) {
    //         end--;
    //        }
    //        else {

    //        }
    //     }   
    //     return nums;
    // }
// really im complecating things dont need to do this much
        public int [] pivotArray(int[] nums, int pivot) {
            int newArr [] = new int[nums.length];
            int index = 0;
            for(int num : nums) {
                if(num < pivot) {
                    newArr[index++] = num;
                }
            }
             for(int num : nums) {
                if(num == pivot) {
                    newArr[index++] = num;
                }
            }
              for(int num : nums) {
                if(num > pivot) {
                    newArr[index++] = num;
                }
            }
            return newArr;
        }
}