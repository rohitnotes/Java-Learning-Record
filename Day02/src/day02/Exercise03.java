package day02;

/**
 * @program: Day02
 * @description: 学习continue语句
 * @author: OriginalCoder
 * @create: 2020-09-12 11:48
 **/
public class Exercise03 {
    public static void main(String[] args){
        int sum = 0;            //定义变量sum,用于记住和
        for (int i = 1; i < 100; i++) {
            if(i % 2 ==0) {     //i是一个偶数，不累加
                continue;       //结束本次循环，进入下一次循环
            }
            sum += i;
        }
        System.out.println("sum="+sum);
    }
}