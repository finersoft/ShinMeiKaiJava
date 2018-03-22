package com.finersoft.chap02;

import java.util.Random;

import java.util.Scanner;

/**
 * 名称： 变量定义
 * 说明：常用变量的定义
 * 
 * @author Finersoft
 * @date 2018年3月22日
 */
public class Abc {
	/**
	 * 无法改写值的变量（给常量赋予名称）
	 */
	public static final double PI = 3.14;

	public static void main(String[] args) {

		Random rand = new Random();

		Scanner stdIn = new Scanner(System.in);

		try {
			// a是int型变量
			int a;
			// 赋值（将值赋给创建好的变量）
			a = 2;
			// 初始化（创建变量时赋入值）
			int b = -1;
			double x = 1.5 * 2;

			System.out.println("b的值:" + b);

			x = rand.nextDouble();
			System.out.println("半径为" + x + "的圆的面积是" + (PI * x * x) + "。");
			System.out.print("请输入整数a的值：");
			a = stdIn.nextInt();
			System.out.println("a / 2 = " + a / 2);
			System.out.println("a % 2 = " + a % 2);
			// 字符串类型
			String s = "ABC";
			System.out.println("字符串s是" + s + "。");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (stdIn != null) {
				stdIn.close();
			}
		}
	}
}