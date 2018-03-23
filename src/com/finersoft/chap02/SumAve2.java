package com.finersoft.chap02;

/**
 * 名称：示例类 <br />
 * 说明：显示变量x和y的合计值与平均值（错误） 
 * 
 * @author Finersoft
 * @date 2018年3月21日
 */
class SumAve2 {

	public static void main(String[] args) {
		// x是int型变量
		int x;
		// y是int型变量
		int y;

		// 把下面两句注释后会报错 by finersoft 2018-03-21
		x = 1;
		y = 3;
		// 显示x的值
		System.out.println("x的值是" + x + "。");
		// 显示y的值
		System.out.println("y的值是" + y + "。");
		// 显示合计值
		System.out.println("合计值是" + (x + y) + "。");
		// 显示平均值
		System.out.println("平均值是" + (x + y) / 2 + "。");
	}
}
