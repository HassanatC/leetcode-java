class Solution {
    public int[] twoSum(int[] nums, int target) {


        int[] arrReturn = new int[2];

        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) // index the next element in array hence nested loop
            {

                if (nums[i] + nums[j] == target) {

                    arrReturn[0] = i;
                    arrReturn[1] = j;

                }
            }
        }



        return arrReturn;
    }
}