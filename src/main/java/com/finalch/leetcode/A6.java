package com.finalch.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liufan
 * @date 2021/3/6 18:12
 * 将一个给定字符串 s 根据给定的行数 numRows ，以从上往下、从左到右进行 Z 字形排列。
 * <p>
 * 比如输入字符串为 "PAYPALISHIRING" 行数为 3 时，排列如下：
 * <p>
 * P   A   H   N
 * A P L S I I G
 * Y   I   R
 * <p>
 * <p>
 * 输入：s = "PAYPALISHIRING", numRows = 4
 * 输出："PINALSIGYAHRPI"
 * 解释：
 * P     I    N
 * A   L S  I G
 * Y A   H R
 * P     I
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/zigzag-conversion
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/zigzag-conversion
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 **/
public class A6 {
    public static void main(String[] args) {
        System.out.println(new A6().convert("PAYPALISHIRING", 3));
    }

    public String convert(String s, int numRows) {
        if (s.length() == 1 || numRows == 1) {
            return s;
        }
        List<StringBuilder> stringBuilderList = new ArrayList<>();
        for (int i = 0; i < Math.min(numRows, s.length()); i++) {
            stringBuilderList.add(new StringBuilder());
        }
        int p = 0;
        boolean down = false;
        for (char c : s.toCharArray()) {
            stringBuilderList.get(p).append(c);
            if (p == 0 || p == numRows - 1) {
                down = !down;
            }
            p = down ? p + 1 : p - 1;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilderList.forEach(stringBuilder::append);
        return stringBuilder.toString();
    }
}
