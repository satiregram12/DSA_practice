// Title: Sort Colors
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/sort-colors/

            else {

                swap(nums, mid, high);

                high--;
            }
        }
    }

    private void swap(int[] nums,
                      int i,
                      int j) {

        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
