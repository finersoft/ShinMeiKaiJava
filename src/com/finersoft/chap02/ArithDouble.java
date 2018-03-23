package com.finersoft.chap02;

import java.util.Scanner;

/**
 * 名称：小数算术 <br />
 * 说明：读入两个实数值，并显示加减乘除运算的结果
 * @author Finersoft
 * @date 2018年3月22日
 */
class ArithDouble {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		try {
			System.out.println("对x和y进行加减乘除运算（需要人机交互输入两个数）。");
			// 提示输入x的值
			System.out.print("请输入x的值：");
			// 读入x的实数值
			double x = stdIn.nextDouble();
			// 提示输入y的值
			System.out.print("请输入y的值：");
			// 读入y的实数值
			double y = stdIn.nextDouble();
			// 显示x + y的值
			System.out.println("x + y = " + (x + y));
			// 显示x - y的值
			System.out.println("x - y = " + (x - y));
			// 显示x * y的值
			System.out.println("x * y = " + (x * y));
			// 显示x / y的值（商）
			System.out.println("x / y = " + (x / y));
			// 显示x % y的值（余数）
			System.out.println("x % y = " + (x % y));
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (stdIn != null) {
				stdIn.close();
			}
		}
	}
}
