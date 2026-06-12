// Title: Subarray Sum Equals K
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/subarray-sum-equals-k/


        int sum = 0;
        int count = 0;

        for(int num : nums) {

            sum += num;

            if(map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }

            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return count;
    }
}
