package com.finersoft.chap02;

/**
 * 名称：示例类<br />
 * 说明：显示变量x和y的合计值与平均值
 * 
 * @author Finersoft
 * @date 2018年3月23日
 */
class SumAve1 {

	public static void main(String[] args) {
		// x是int型变量
		int x;
		// y是int型变量
		int y;
		// 把63赋给x
		x = 63;
		// 把18赋给y
		y = 18;
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
