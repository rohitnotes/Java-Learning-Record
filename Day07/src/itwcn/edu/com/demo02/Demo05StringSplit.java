package itwcn.edu.com.demo02;

/**
 * @program: Demo05StringSplit
 * @description:
 * @author: OriginalCoder
 * @createtime:2020/11/18 11:43
 **/

/**
 * 分割字符串的方法：
 * public String[] split(String regex):按照参数的规则，将字符串切割成为若干部分
 * 注意事项：
 * split方法的参数其实是一个正则表达式；
 * 如果按照英文句点“.”进行切分，必须写“\\.”，转义字符
 * @author 王佳涵
 */
public class Demo05StringSplit {
    public static void main(String[] args) {
        String str1 = "aaa,bb,c";
        String[] array1 = str1.split(",");
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }

        System.out.println("==============");

        String str2 = "aaa bbb ccc";
        String[] array2 = str2.split(" ");
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }

        System.out.println("==============");

        String str3 = "XXX.yyy.zzz";
        String[] array3 = str3.split("\\.");
        for (int i = 0; i < array3.length; i++) {
            System.out.println(array3[i]);
        }
    }
}
