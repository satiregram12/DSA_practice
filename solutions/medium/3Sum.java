// Title: 3Sum
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/3sum/


                    while(left < right &&
                          nums[right] == nums[right - 1]) {
                        right--;
                    }

                    left++;
                    right--;
                }

                else if(sum < 0) {
                    left++;
                }

                else {
                    right--;
                }
            }
        }

        return ans;
    }
}
