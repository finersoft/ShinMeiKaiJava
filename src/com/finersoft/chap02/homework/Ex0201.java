package com.finersoft.chap02.homework;

/**
 * 名称：作业2-1<br />
 * 说明：对SumAve1中的整型变量赋浮点型会发生什么？
 * @author Finersoft
 * @date 2018年3月23日
 */
public class Ex0201 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
			// x是int型变量
			int x;
			// y是int型变量
			int y;
			//定义一个浮点型变量z
			double z;
			
			// 把63赋给x
			x = 63;
			// 把18赋给y
			y = 18;
			
			//错误说明
			// 把63.0赋给x:Type mismatch: cannot convert from double to int
			//x = 63.0;
			// 把18.1赋给y:Type mismatch: cannot convert from double to int
			//y = 18.1;
			
			//解决办法：加强制转换或修改参数定义类型
			// 把63.0赋给x:Add cast to 'int'
			x =(int) 63.0;
			// 把18.1赋给y:Change type of 'y' to 'double'
			//y = 18.1;
			z=18.0;
			
			// 显示x的值
			System.out.println("x的值是" + x + "。");
			// 显示y的值
			System.out.println("y的值是" + y + "。");
			// 显示z的值
			System.out.println("z的值是" + z + "。");
			// 显示合计值
			System.out.println("合计值是" + (x + y) + "。");
			// 显示平均值
			System.out.println("平均值是" + (x + y) / 2 + "。");

	}

}
