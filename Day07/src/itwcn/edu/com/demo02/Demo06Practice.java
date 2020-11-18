package itwcn.edu.com.demo02;

/**
 * @program: Demo06Practice
 * @description:
 * @author: OriginalCoder
 * @createtime:2020/11/18 12:12
 **/

/**
 * 题目：
 * 定义一个方法，把数组{1,2,3}按照指定格式拼接成一个字符串，格式如下：[word1#word2#word3]
 * 分析：
 * 1.首先准备int[] 数组 ，内容是1,2,3
 * 2.定义一个方法，用来将数组变成字符串
 * 三要素：
 * 返回值类型：String
 * 方法名称:fromArrayToString
 * 参数列表：int[]
 * 3.格式：[word1#word2#word3]
 * 用到：for循环、字符串拼接，每个数组元素之前都有一个word字样，分隔使用的是#、区分一下是不是最后一个
 * 4.调用方法：得到返回值，并打印结果字符串
 *
 *
 * @author 王佳涵
 */
public class Demo06Practice {
    public static void main(String[] args) {
        int[] array = {1,2,3};
        String result = fromArrayToString(array);
        System.out.println(result);
    }

    public static String fromArrayToString(int[] array) {
        String str = "[";
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                str += "word" + array[i] + "]";
            } else {
                str += "word" + array[i] + "#";
            }
        }
        return str;
    }

}
