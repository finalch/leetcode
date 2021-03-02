package com.finalch.leetcode;

import java.util.Arrays;

/**
 * @author liufan
 * @date 2021/2/28 17:25
 * 给你一个数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元素，并返回移除后数组的新长度。
 * <p>
 * 不要使用额外的数组空间，你必须仅使用 O(1) 额外空间并 原地 修改输入数组。
 * <p>
 * 元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
 * <p>
 * <p>
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/remove-element
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * 输入：nums = [3,2,2,3], val = 3
 * 输出：2, nums = [2,2]
 * <p>
 * 输入：nums = [0,1,2,2,3,0,4,2], val = 2
 * 输出：5, nums = [0,1,4,0,3]
 **/
public class A27RemoveElement {
    public static void main(String[] args) {
        System.out.println(new A27RemoveElement().removeElement(new int[]{3,2,2,3}, 2));
    }

    public int removeElement(int[] nums, int val) {
        if (nums.length == 0) {
            return 0;
        }
        /*if (nums.length == 1) {
            return nums[0] == val ? 0 : 1;
        }*/
        int i = 0, j = 0;
        for (; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        Arrays.stream(nums).forEach(System.out::print);
        return i;
    }
}
