package com.itwcn;
/**
 * 使用final修饰的类不能被继承
 * @author Administrator
 *
 */
public final class Ball extends Circle{
	public Ball() {
		super();		//调用父类的无参构造方法
	}
	public Ball(double r) {
		super();		//调用父类的有参构造方法
	}
	
	public double getTiJi (double r) {
		return PI * (double)4/3 * Math.pow(this.radius, 3) ;
	}
	
	
}
