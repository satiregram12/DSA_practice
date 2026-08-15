// Title: Find All Numbers Disappeared in an Array
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/

                nums[position] = -nums[position];
            }
        }
        for (int i= 0 ;i<n;i++){
            if(nums[i]>0){
                int valueIndex = i+1;
                ans.add(valueIndex);
            }
        }
        return ans;
        
    }
}
