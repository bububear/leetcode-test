/*
 * 文件名：question_1.java
 * 版权：Copyright 2018-2019 Love. Co. Ltd. All Rights Reserved.
 * 描述：sunshine
 * 修改人：sunshine
 * 修改时间：2020年06月27日
 * 系统名称：leetcode-test
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * <1. 两数之和>
 * <给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
 * <p>
 * 示例:
 * <p>
 * 给定 nums = [2, 7, 11, 15], target = 9
 * <p>
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/two-sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。>
 *
 * @author sunshine
 * @version 1.0 2020年06月27日
 * @see question_1
 * @since 1.0
 */
public class question_1 {

    public static void main(String[] args) {
        int[] nums = {3, 2, 4};
        int target = 6;
        int[] result = twoSum(nums, target);
        System.out.println(Arrays.toString(result));
    }

    /**
     * No.1
     *
     * @param nums
     * @param target
     * @return
     */
    private static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        //设置跳出多重循环的标志
        ko:
        for (int i = 0; i < nums.length; i++) {
            int currentNum = nums[i];
            int z = i + 1;
            for (; z < nums.length; z++) {
                if (target == nums[z] + currentNum) {
                    result[0] = i;
                    result[1] = z;
                    break ko;
                }
            }
        }
        return result;
    }


    //以下为官方解法

    /**
     * 暴力解法
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum1(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[] { i, j };
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    /**
     * 两遍哈希表
     */
    public int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }


    /**
     * 一遍哈希表
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum3(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }

}