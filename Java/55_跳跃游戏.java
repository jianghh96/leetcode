// 给定一个非负整数数组，你最初位于数组的第一个位置。

// 数组中的每个元素代表你在该位置可以跳跃的最大长度。

// 判断你是否能够到达最后一个位置。

// 示例:

// 输入: [2,3,1,1,4]
// 输出: true
// 解释: 我们可以先跳 1 步，从位置 0 到达 位置 1, 然后再从位置 1 跳 3 步到达最后一个位置。

// 贪心算法

// 只要存在一个位置 x，它本身可以到达，并且它跳跃的最大长度为 x+nums[x]，这个值大于等于 y，即 x+nums[x]≥y，那么位置 y 也可以到达。

class Solution {
    public boolean canJump(int[] nums) {
        if(nums.length == 0 || nums.length == 1) return true;
        // 初始化当前能到达最远的位置
        int max_dist = 0;
        for(int i = 0; i < nums.length; i++){
            // 如果当前位置能到达，并且当前位置+跳数>最远位置
            if(max_dist >= i && nums[i] + i > max_dist)
                max_dist = nums[i] + i;
                if(max_dist >= nums.length-1)
                    return true;
        }
        return false;
    }
}
